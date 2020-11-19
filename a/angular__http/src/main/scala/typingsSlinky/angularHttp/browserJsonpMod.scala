package typingsSlinky.angularHttp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/backends/browser_jsonp", JSImport.Namespace)
@js.native
object browserJsonpMod extends js.Object {
  
  val JSONP_HOME: /* "__ng_jsonp__" */ String = js.native
  
  @js.native
  class BrowserJsonp () extends js.Object {
    
    def build(url: String): js.Any = js.native
    
    def cleanup(node: js.Any): Unit = js.native
    
    def exposeConnection(id: String, connection: js.Any): Unit = js.native
    
    def nextRequestID(): String = js.native
    
    def removeConnection(id: String): Unit = js.native
    
    def requestCallback(id: String): String = js.native
    
    def send(node: js.Any): Unit = js.native
  }
}
