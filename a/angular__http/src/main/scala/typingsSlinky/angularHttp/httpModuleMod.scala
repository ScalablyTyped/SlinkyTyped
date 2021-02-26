package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
import typingsSlinky.angularHttp.httpMod.Http
import typingsSlinky.angularHttp.httpMod.Jsonp
import typingsSlinky.angularHttp.jsonpBackendMod.JSONPBackend
import typingsSlinky.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typingsSlinky.angularHttp.xhrBackendMod.XHRBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpModuleMod {
  
  @JSImport("@angular/http/src/http_module", "HttpModule")
  @js.native
  class HttpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "JsonpModule")
  @js.native
  class JsonpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "_createDefaultCookieXSRFStrategy")
  @js.native
  def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  
  @JSImport("@angular/http/src/http_module", "httpFactory")
  @js.native
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  
  @JSImport("@angular/http/src/http_module", "jsonpFactory")
  @js.native
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
}
