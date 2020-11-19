package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
import typingsSlinky.angularHttp.httpMod.Http
import typingsSlinky.angularHttp.httpMod.Jsonp
import typingsSlinky.angularHttp.jsonpBackendMod.JSONPBackend
import typingsSlinky.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typingsSlinky.angularHttp.xhrBackendMod.XHRBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/http_module", JSImport.Namespace)
@js.native
object httpModuleMod extends js.Object {
  
  @JSName("_createDefaultCookieXSRFStrategy")
  def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
  
  @js.native
  class HttpModule () extends js.Object
  
  @js.native
  class JsonpModule () extends js.Object
}
