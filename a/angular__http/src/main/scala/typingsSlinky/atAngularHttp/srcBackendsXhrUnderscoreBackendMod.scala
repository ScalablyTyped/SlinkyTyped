package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.srcBackendsBrowserUnderscoreXhrMod.BrowserXhr
import typingsSlinky.atAngularHttp.srcBaseUnderscoreResponseUnderscoreOptionsMod.ResponseOptions
import typingsSlinky.atAngularHttp.srcInterfacesMod.Connection
import typingsSlinky.atAngularHttp.srcInterfacesMod.ConnectionBackend
import typingsSlinky.atAngularHttp.srcInterfacesMod.XSRFStrategy
import typingsSlinky.atAngularHttp.srcStaticUnderscoreRequestMod.Request
import typingsSlinky.atAngularHttp.srcStaticUnderscoreResponseMod.Response
import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/backends/xhr_backend", JSImport.Namespace)
@js.native
object srcBackendsXhrUnderscoreBackendMod extends js.Object {
  @js.native
  class CookieXSRFStrategy () extends XSRFStrategy {
    def this(_cookieName: String) = this()
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
    var response_XHRConnection: Observable[Response] = js.native
    def setDetectedContentType(req: js.Any, _xhr: js.Any): Unit = js.native
  }
  
}

