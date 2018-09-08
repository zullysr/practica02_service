package gob.mef.cloud.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class SaludoService {

	@RequestMapping("/saludo/{name}")
	public @ResponseBody String saludo(@PathVariable String name) {
		return "Hola " + name + "...";
	}
}
