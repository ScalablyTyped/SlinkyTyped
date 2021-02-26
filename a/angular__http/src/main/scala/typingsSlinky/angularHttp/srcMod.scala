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

object srcMod {
  
  @JSImport("@angular/http/src", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typingsSlinky.angularHttp.baseRequestOptionsMod.BaseRequestOptions
  
  @JSImport("@angular/http/src", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typingsSlinky.angularHttp.baseResponseOptionsMod.BaseResponseOptions
  
  @JSImport("@angular/http/src", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typingsSlinky.angularHttp.browserXhrMod.BrowserXhr
  
  @JSImport("@angular/http/src", "Connection")
  @js.native
  abstract class Connection ()
    extends typingsSlinky.angularHttp.interfacesMod.Connection
  
  @JSImport("@angular/http/src", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typingsSlinky.angularHttp.interfacesMod.ConnectionBackend
  
  @JSImport("@angular/http/src", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typingsSlinky.angularHttp.xhrBackendMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/src", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.angularHttp.headersMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typingsSlinky.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @JSImport("@angular/http/src", "Headers.fromResponseHeaderString")
    @js.native
    def fromResponseHeaderString(headersString: String): typingsSlinky.angularHttp.headersMod.Headers = js.native
  }
  
  @JSImport("@angular/http/src", "Http")
  @js.native
  class Http protected ()
    extends typingsSlinky.angularHttp.httpMod.Http {
    def this(
      _backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "HttpModule")
  @js.native
  class HttpModule ()
    extends typingsSlinky.angularHttp.httpModuleMod.HttpModule
  
  @JSImport("@angular/http/src", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typingsSlinky.angularHttp.jsonpBackendMod.JSONPBackend
  
  @JSImport("@angular/http/src", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typingsSlinky.angularHttp.jsonpBackendMod.JSONPConnection
  
  @JSImport("@angular/http/src", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typingsSlinky.angularHttp.httpMod.Jsonp {
    def this(
      backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typingsSlinky.angularHttp.httpModuleMod.JsonpModule
  
  @JSImport("@angular/http/src", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder
  
  @JSImport("@angular/http/src", "ReadyState")
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
  
  @JSImport("@angular/http/src", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.angularHttp.staticRequestMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/src", "RequestMethod")
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
  
  @JSImport("@angular/http/src", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "Response")
  @js.native
  class Response protected ()
    extends typingsSlinky.angularHttp.staticResponseMod.Response {
    def this(responseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.ResponseContentType with Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsSlinky.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    /* 3 */ val Blob: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    /* 1 */ val Json: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    /* 0 */ val Text: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @JSImport("@angular/http/src", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseType")
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
  
  @JSImport("@angular/http/src", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.angularHttp.urlSearchParamsMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(
      rawParams: js.UndefOr[scala.Nothing],
      queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder
    ) = this()
    def this(rawParams: String, queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/src", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/src", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typingsSlinky.angularHttp.xhrBackendMod.XHRBackend {
    def this(
      _browserXHR: typingsSlinky.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsSlinky.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/src", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typingsSlinky.angularHttp.xhrBackendMod.XHRConnection {
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
  
  @JSImport("@angular/http/src", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typingsSlinky.angularHttp.interfacesMod.XSRFStrategy
}
