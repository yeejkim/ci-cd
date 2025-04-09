package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CICDController {

	// localhost/fisa1
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRes() ********");
		log.info("*** 요청 & 응답 ***");
		return "요청 응답 성공";
	}
}
