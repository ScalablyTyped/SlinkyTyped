package typingsSlinky.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCore.mod.Version
import typingsSlinky.angularHttp.bodyMod.Body
import typingsSlinky.angularHttp.browserJsonpMod.BrowserJsonp
import typingsSlinky.angularHttp.interfacesMod.RequestArgs
import typingsSlinky.angularHttp.interfacesMod.RequestOptionsArgs
import typingsSlinky.angularHttp.interfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/http", "BaseRequestOptions")
  @js.native
  class BaseRequestOptions ()
    extends typingsSlinky.angularHttp.publicApiMod.BaseRequestOptions
  
  @JSImport("@angular/http", "BaseResponseOptions")
  @js.native
  class BaseResponseOptions ()
    extends typingsSlinky.angularHttp.publicApiMod.BaseResponseOptions
  
  @JSImport("@angular/http", "BrowserXhr")
  @js.native
  class BrowserXhr ()
    extends typingsSlinky.angularHttp.publicApiMod.BrowserXhr
  
  @JSImport("@angular/http", "Connection")
  @js.native
  abstract class Connection ()
    extends typingsSlinky.angularHttp.publicApiMod.Connection
  
  @JSImport("@angular/http", "ConnectionBackend")
  @js.native
  abstract class ConnectionBackend ()
    extends typingsSlinky.angularHttp.publicApiMod.ConnectionBackend
  
  @JSImport("@angular/http", "CookieXSRFStrategy")
  @js.native
  class CookieXSRFStrategy ()
    extends typingsSlinky.angularHttp.publicApiMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: js.UndefOr[scala.Nothing], _headerName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
  }
  
  @JSImport("@angular/http", "Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.angularHttp.publicApiMod.Headers {
    def this(headers: StringDictionary[js.Any]) = this()
    def this(headers: typingsSlinky.angularHttp.headersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    @JSImport("@angular/http", "Headers.fromResponseHeaderString")
    @js.native
    def fromResponseHeaderString(headersString: String): typingsSlinky.angularHttp.headersMod.Headers = js.native
  }
  
  @JSImport("@angular/http", "Http")
  @js.native
  class Http protected ()
    extends typingsSlinky.angularHttp.publicApiMod.Http {
    def this(
      _backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      _defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "HttpModule")
  @js.native
  class HttpModule ()
    extends typingsSlinky.angularHttp.publicApiMod.HttpModule
  
  @JSImport("@angular/http", "JSONPBackend")
  @js.native
  class JSONPBackend ()
    extends typingsSlinky.angularHttp.publicApiMod.JSONPBackend
  
  @JSImport("@angular/http", "JSONPConnection")
  @js.native
  class JSONPConnection ()
    extends typingsSlinky.angularHttp.publicApiMod.JSONPConnection
  
  @JSImport("@angular/http", "Jsonp")
  @js.native
  class Jsonp protected ()
    extends typingsSlinky.angularHttp.publicApiMod.Jsonp {
    def this(
      backend: typingsSlinky.angularHttp.interfacesMod.ConnectionBackend,
      defaultOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "JsonpModule")
  @js.native
  class JsonpModule ()
    extends typingsSlinky.angularHttp.publicApiMod.JsonpModule
  
  @JSImport("@angular/http", "QueryEncoder")
  @js.native
  class QueryEncoder ()
    extends typingsSlinky.angularHttp.publicApiMod.QueryEncoder
  
  @JSImport("@angular/http", "ReadyState")
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
  
  @JSImport("@angular/http", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.angularHttp.publicApiMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http", "RequestMethod")
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
  
  @JSImport("@angular/http", "RequestOptions")
  @js.native
  class RequestOptions ()
    extends typingsSlinky.angularHttp.publicApiMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "Response")
  @js.native
  class Response protected ()
    extends typingsSlinky.angularHttp.publicApiMod.Response {
    def this(responseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularHttp.enumsMod.ResponseContentType with Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsSlinky.angularHttp.enumsMod.ResponseContentType.ArrayBuffer with Double = js.native
    
    /* 3 */ val Blob: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Blob with Double = js.native
    
    /* 1 */ val Json: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Json with Double = js.native
    
    /* 0 */ val Text: typingsSlinky.angularHttp.enumsMod.ResponseContentType.Text with Double = js.native
  }
  
  @JSImport("@angular/http", "ResponseOptions")
  @js.native
  class ResponseOptions ()
    extends typingsSlinky.angularHttp.publicApiMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "ResponseType")
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
  
  @JSImport("@angular/http", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.angularHttp.publicApiMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(
      rawParams: js.UndefOr[scala.Nothing],
      queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder
    ) = this()
    def this(rawParams: String, queryEncoder: typingsSlinky.angularHttp.urlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http", "XHRBackend")
  @js.native
  class XHRBackend protected ()
    extends typingsSlinky.angularHttp.publicApiMod.XHRBackend {
    def this(
      _browserXHR: typingsSlinky.angularHttp.browserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsSlinky.angularHttp.baseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsSlinky.angularHttp.interfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http", "XHRConnection")
  @js.native
  class XHRConnection protected ()
    extends typingsSlinky.angularHttp.publicApiMod.XHRConnection {
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
  
  @JSImport("@angular/http", "XSRFStrategy")
  @js.native
  abstract class XSRFStrategy ()
    extends typingsSlinky.angularHttp.publicApiMod.XSRFStrategy
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_a")
  @js.native
  def ɵangularPackagesHttpHttpA(): typingsSlinky.angularHttp.xhrBackendMod.CookieXSRFStrategy = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_b")
  @js.native
  def ɵangularPackagesHttpHttpB(
    xhrBackend: typingsSlinky.angularHttp.xhrBackendMod.XHRBackend,
    requestOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
  ): typingsSlinky.angularHttp.httpMod.Http = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_c")
  @js.native
  def ɵangularPackagesHttpHttpC(
    jsonpBackend: typingsSlinky.angularHttp.jsonpBackendMod.JSONPBackend,
    requestOptions: typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
  ): typingsSlinky.angularHttp.httpMod.Jsonp = js.native
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_e")
  @js.native
  class ɵangularPackagesHttpHttpE () extends BrowserJsonp
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_f")
  @js.native
  abstract class ɵangularPackagesHttpHttpF () extends Body
}
