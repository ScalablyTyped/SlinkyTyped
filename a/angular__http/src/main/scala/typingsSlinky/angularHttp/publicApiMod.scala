package typingsSlinky.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCore.mod.Version
import typingsSlinky.angularHttp.interfacesMod.RequestArgs
import typingsSlinky.angularHttp.interfacesMod.RequestOptionsArgs
import typingsSlinky.angularHttp.interfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicApiMod {
  
  @JSImport("@angular/http/public_api", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typingsSlinky.angularHttp.srcMod.BaseRequestOptions
  
  @JSImport("@angular/http/public_api", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typingsSlinky.angularHttp.srcMod.BaseResponseOptions
  
  @JSImport("@angular/http/public_api", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typingsSlinky.angularHttp.srcMod.BrowserXhr
  
  @JSImport("@angular/http/public_api", "Connection")
  @js.native
  abstract class Connection ()
    extends typingsSlinky.angularHttp.srcMod.Connection
  
  @JSImport("@angular/http/public_api", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typingsSlinky.angularHttp.srcMod.ConnectionBackend
  
  @JSImport("@angular/http/public_api", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typingsSlinky.angularHttp.srcMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/public_api", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.angularHttp.srcMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typingsSlinky.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @JSImport("@angular/http/public_api", "Headers.fromResponseHeaderString")
    @js.native
    def fromResponseHeaderString(headersString: String): typingsSlinky.angularHttp.headersMod.Headers = js.native
  }
  
  @JSImport("@angular/http/public_api", "Http")
  @js.native
  class Http protected ()
    extends typingsSlinky.angularHttp.srcMod.Http {
    def this(
      _backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "HttpModule")
  @js.native
  class HttpModule ()
    extends typingsSlinky.angularHttp.srcMod.HttpModule
  
  @JSImport("@angular/http/public_api", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typingsSlinky.angularHttp.srcMod.JSONPBackend
  
  @JSImport("@angular/http/public_api", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typingsSlinky.angularHttp.srcMod.JSONPConnection
  
  @JSImport("@angular/http/public_api", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typingsSlinky.angularHttp.srcMod.Jsonp {
    def this(
      backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typingsSlinky.angularHttp.srcMod.JsonpModule
  
  @JSImport("@angular/http/public_api", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typingsSlinky.angularHttp.srcMod.QueryEncoder
  
  @JSImport("@angular/http/public_api", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.ReadyState with Double] = js.native
    
    /* 5 */ val Cancelled: typingsSlinky.angularHttp.enumsMod.ReadyState.Cancelled with Double = js.native
    
    /* 4 */ val Done: typingsSlinky.angularHttp.enumsMod.ReadyState.Done with Double = js.native
    
    /* 2 */ val HeadersReceived: typingsSlinky.angularHttp.enumsMod.ReadyState.HeadersReceived with Double = js.native
    
    /* 3 */ val Loading: typingsSlinky.angularHttp.enumsMod.ReadyState.Loading with Double = js.native
    
    /* 1 */ val Open: typingsSlinky.angularHttp.enumsMod.ReadyState.Open with Double = js.native
    
    /* 0 */ val Unsent: typingsSlinky.angularHttp.enumsMod.ReadyState.Unsent with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.angularHttp.srcMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.RequestMethod with Double] = js.native
    
    /* 3 */ val Delete: typingsSlinky.angularHttp.enumsMod.RequestMethod.Delete with Double = js.native
    
    /* 0 */ val Get: typingsSlinky.angularHttp.enumsMod.RequestMethod.Get with Double = js.native
    
    /* 5 */ val Head: typingsSlinky.angularHttp.enumsMod.RequestMethod.Head with Double = js.native
    
    /* 4 */ val Options: typingsSlinky.angularHttp.enumsMod.RequestMethod.Options with Double = js.native
    
    /* 6 */ val Patch: typingsSlinky.angularHttp.enumsMod.RequestMethod.Patch with Double = js.native
    
    /* 1 */ val Post: typingsSlinky.angularHttp.enumsMod.RequestMethod.Post with Double = js.native
    
    /* 2 */ val Put: typingsSlinky.angularHttp.enumsMod.RequestMethod.Put with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typingsSlinky.angularHttp.srcMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "Response")
  @js.native
  class Response protected ()
    extends typingsSlinky.angularHttp.srcMod.Response {
    def this(responseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.ResponseContentType with Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsSlinky.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    /* 3 */ val Blob: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    /* 1 */ val Json: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    /* 0 */ val Text: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typingsSlinky.angularHttp.srcMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.ResponseType with Double] = js.native
    
    /* 0 */ val Basic: typingsSlinky.angularHttp.enumsMod.ResponseType.Basic with Double = js.native
    
    /* 1 */ val Cors: typingsSlinky.angularHttp.enumsMod.ResponseType.Cors with Double = js.native
    
    /* 2 */ val Default: typingsSlinky.angularHttp.enumsMod.ResponseType.Default with Double = js.native
    
    /* 3 */ val Error: typingsSlinky.angularHttp.enumsMod.ResponseType.Error with Double = js.native
    
    /* 4 */ val Opaque: typingsSlinky.angularHttp.enumsMod.ResponseType.Opaque with Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.angularHttp.srcMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(
      rawParams: js.UndefOr[scala.Nothing],
      queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder
    ) = this()
    def this(rawParams: String, queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/public_api", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/public_api", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typingsSlinky.angularHttp.srcMod.XHRBackend {
    def this(
      _browserXHR: typingsSlinky.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsSlinky.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typingsSlinky.angularHttp.srcMod.XHRConnection {
    def this(
      req: typingsSlinky.angularHttp.staticRequestMod.Request,
      browserXHR: typingsSlinky.angularHttp.browserXhrMod.BrowserXhr
    ) = this()
    def this(
      req: typingsSlinky.angularHttp.staticRequestMod.Request,
      browserXHR: typingsSlinky.angularHttp.browserXhrMod.BrowserXhr,
      baseResponseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typingsSlinky.angularHttp.srcMod.XSRFStrategy
}
