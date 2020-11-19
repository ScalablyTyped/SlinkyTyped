package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions
import typingsSlinky.angularHttp.browserXhrMod.BrowserXhr
import typingsSlinky.angularHttp.interfacesMod.Connection
import typingsSlinky.angularHttp.interfacesMod.ConnectionBackend
import typingsSlinky.angularHttp.interfacesMod.XSRFStrategy
import typingsSlinky.angularHttp.staticRequestMod.Request
import typingsSlinky.angularHttp.staticResponseMod.Response
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/src/backends/xhr_backend", JSImport.Namespace)
@js.native
object xhrBackendMod extends js.Object {
  
  @js.native
  class CookieXSRFStrategy () extends XSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    
    var _cookieName: js.Any = js.native
    
    var _headerName: js.Any = js.native
  }
  
  @js.native
  class XHRBackend protected () extends ConnectionBackend {
    def this(_browserXHR: BrowserXhr, _baseResponseOptions: ResponseOptions, _xsrfStrategy: XSRFStrategy) = this()
    
    var _baseResponseOptions: js.Any = js.native
    
    var _browserXHR: js.Any = js.native
    
    var _xsrfStrategy: js.Any = js.native
    
    def createConnection(request: Request): XHRConnection = js.native
  }
  
  @js.native
  class XHRConnection protected () extends Connection {
    def this(req: Request, browserXHR: BrowserXhr) = this()
    def this(req: Request, browserXHR: BrowserXhr, baseResponseOptions: ResponseOptions) = this()
    
    /**
      * Response {@link EventEmitter} which emits a single {@link Response} value on load event of
      * `XMLHttpRequest`.
      */
    @JSName("response")
    var response_XHRConnection: Observable_[Response] = js.native
    
    def setDetectedContentType(req: js.Any, _xhr: js.Any): Unit = js.native
  }
}
