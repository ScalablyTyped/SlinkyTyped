package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.interfacesMod.Connection
import typingsSlinky.angularHttp.interfacesMod.ConnectionBackend
import typingsSlinky.angularHttp.staticRequestMod.Request
import typingsSlinky.angularHttp.staticResponseMod.Response
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/backends/jsonp_backend", JSImport.Namespace)
@js.native
object jsonpBackendMod extends js.Object {
  
  @js.native
  class JSONPBackend () extends ConnectionBackend {
    
    var _baseResponseOptions: js.Any = js.native
    
    var _browserJSONP: js.Any = js.native
    
    def createConnection(request: Request): JSONPConnection = js.native
  }
  
  @js.native
  class JSONPConnection () extends Connection {
    
    var _dom: js.Any = js.native
    
    var _finished: js.Any = js.native
    
    var _id: js.Any = js.native
    
    var _responseData: js.Any = js.native
    
    var _script: js.Any = js.native
    
    var baseResponseOptions: js.Any = js.native
    
    /**
      * Callback called when the JSONP request completes, to notify the application
      * of the new data.
      */
    def finished(): Unit = js.native
    def finished(data: js.Any): Unit = js.native
    
    /**
      * An observable that completes with the response, when the request is finished.
      */
    @JSName("response")
    var response_JSONPConnection: Observable_[Response] = js.native
  }
}
