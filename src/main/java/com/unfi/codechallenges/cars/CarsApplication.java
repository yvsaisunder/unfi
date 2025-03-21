package com.unfi.codechallenges.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(CarsApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace(); // Print detailed error stack trace to identify the cause
		}
	}


}
