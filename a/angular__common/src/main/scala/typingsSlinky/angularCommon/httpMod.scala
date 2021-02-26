package typingsSlinky.angularCommon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCommon.angularCommonStrings.DELETE
import typingsSlinky.angularCommon.angularCommonStrings.GET
import typingsSlinky.angularCommon.angularCommonStrings.HEAD
import typingsSlinky.angularCommon.angularCommonStrings.JSONP
import typingsSlinky.angularCommon.angularCommonStrings.OPTIONS
import typingsSlinky.angularCommon.angularCommonStrings.PATCH
import typingsSlinky.angularCommon.angularCommonStrings.POST
import typingsSlinky.angularCommon.angularCommonStrings.PUT
import typingsSlinky.angularCommon.anon.Body
import typingsSlinky.angularCommon.anon.CookieName
import typingsSlinky.angularCommon.anon.Error
import typingsSlinky.angularCommon.anon.Headers
import typingsSlinky.angularCommon.anon.Params
import typingsSlinky.angularCommon.httpHttpMod.HttpInterceptor
import typingsSlinky.angularCommon.httpHttpMod.HttpParamsOptions
import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.ModuleWithProviders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@angular/common/http", "HTTP_INTERCEPTORS")
  @js.native
  val HTTP_INTERCEPTORS: InjectionToken[js.Array[HttpInterceptor]] = js.native
  
  @JSImport("@angular/common/http", "HttpBackend")
  @js.native
  abstract class HttpBackend ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpBackend
  
  @JSImport("@angular/common/http", "HttpClient")
  @js.native
  class HttpClient protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpClient {
    def this(handler: typingsSlinky.angularCommon.httpHttpMod.HttpHandler) = this()
  }
  
  @JSImport("@angular/common/http", "HttpClientJsonpModule")
  @js.native
  class HttpClientJsonpModule ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpClientJsonpModule
  
  @JSImport("@angular/common/http", "HttpClientModule")
  @js.native
  class HttpClientModule ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpClientModule
  
  @JSImport("@angular/common/http", "HttpClientXsrfModule")
  @js.native
  class HttpClientXsrfModule ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpClientXsrfModule
  /* static members */
  object HttpClientXsrfModule {
    
    /**
      * Disable the default XSRF protection.
      */
    @JSImport("@angular/common/http", "HttpClientXsrfModule.disable")
    @js.native
    def disable(): ModuleWithProviders[typingsSlinky.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
    
    /**
      * Configure XSRF protection.
      * @param options An object that can specify either or both
      * cookie name or header name.
      * - Cookie name default is `XSRF-TOKEN`.
      * - Header name default is `X-XSRF-TOKEN`.
      *
      */
    @JSImport("@angular/common/http", "HttpClientXsrfModule.withOptions")
    @js.native
    def withOptions(): ModuleWithProviders[typingsSlinky.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
    @JSImport("@angular/common/http", "HttpClientXsrfModule.withOptions")
    @js.native
    def withOptions(options: CookieName): ModuleWithProviders[typingsSlinky.angularCommon.httpHttpMod.HttpClientXsrfModule] = js.native
  }
  
  @JSImport("@angular/common/http", "HttpErrorResponse")
  @js.native
  class HttpErrorResponse protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpErrorResponse {
    def this(init: Error) = this()
  }
  
  @JSImport("@angular/common/http", "HttpEventType")
  @js.native
  object HttpEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.angularCommon.httpHttpMod.HttpEventType with Double] = js.native
    
    /* 3 */ val DownloadProgress: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.DownloadProgress with Double = js.native
    
    /* 4 */ val Response: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.Response with Double = js.native
    
    /* 2 */ val ResponseHeader: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.ResponseHeader with Double = js.native
    
    /* 0 */ val Sent: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.Sent with Double = js.native
    
    /* 1 */ val UploadProgress: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.UploadProgress with Double = js.native
    
    /* 5 */ val User: typingsSlinky.angularCommon.httpHttpMod.HttpEventType.User with Double = js.native
  }
  
  @JSImport("@angular/common/http", "HttpHandler")
  @js.native
  abstract class HttpHandler ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpHandler
  
  @JSImport("@angular/common/http", "HttpHeaderResponse")
  @js.native
  /**
    * Create a new `HttpHeaderResponse` with the given parameters.
    */
  class HttpHeaderResponse ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpHeaderResponse {
    def this(init: Headers) = this()
  }
  
  @JSImport("@angular/common/http", "HttpHeaders")
  @js.native
  /**  Constructs a new HTTP header object with the given values.*/
  class HttpHeaders ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpHeaders {
    def this(headers: String) = this()
    def this(headers: StringDictionary[String | js.Array[String]]) = this()
  }
  
  @JSImport("@angular/common/http", "HttpParams")
  @js.native
  class HttpParams ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpParams {
    def this(options: HttpParamsOptions) = this()
  }
  
  @JSImport("@angular/common/http", "HttpRequest")
  @js.native
  class HttpRequest[T] protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpRequest[T] {
    def this(method: String, url: String) = this()
    def this(method: DELETE, url: String) = this()
    def this(method: GET, url: String) = this()
    def this(method: HEAD, url: String) = this()
    def this(method: JSONP, url: String) = this()
    def this(method: OPTIONS, url: String) = this()
    def this(method: PATCH, url: String) = this()
    def this(method: POST, url: String) = this()
    def this(method: PUT, url: String) = this()
    def this(method: String, url: String, body: T) = this()
    def this(method: DELETE, url: String, init: Params) = this()
    def this(method: GET, url: String, init: Params) = this()
    def this(method: HEAD, url: String, init: Params) = this()
    def this(method: JSONP, url: String, init: Params) = this()
    def this(method: OPTIONS, url: String, init: Params) = this()
    def this(method: PATCH, url: String, body: T) = this()
    def this(method: POST, url: String, body: T) = this()
    def this(method: PUT, url: String, body: T) = this()
    def this(method: String, url: String, body: T, init: Params) = this()
    def this(method: String, url: String, body: Null, init: Params) = this()
    def this(method: PATCH, url: String, body: T, init: Params) = this()
    def this(method: PATCH, url: String, body: Null, init: Params) = this()
    def this(method: POST, url: String, body: T, init: Params) = this()
    def this(method: POST, url: String, body: Null, init: Params) = this()
    def this(method: PUT, url: String, body: T, init: Params) = this()
    def this(method: PUT, url: String, body: Null, init: Params) = this()
  }
  
  @JSImport("@angular/common/http", "HttpResponse")
  @js.native
  /**
    * Construct a new `HttpResponse`.
    */
  class HttpResponse[T] ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpResponse[T] {
    def this(init: Body[T]) = this()
  }
  
  @JSImport("@angular/common/http", "HttpResponseBase")
  @js.native
  abstract class HttpResponseBase protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpResponseBase {
    /**
      * Super-constructor for all responses.
      *
      * The single parameter accepted is an initialization hash. Any properties
      * of the response passed there will override the default values.
      */
    def this(init: Headers) = this()
    def this(init: Headers, defaultStatus: Double) = this()
    def this(init: Headers, defaultStatus: js.UndefOr[scala.Nothing], defaultStatusText: String) = this()
    def this(init: Headers, defaultStatus: Double, defaultStatusText: String) = this()
  }
  
  @JSImport("@angular/common/http", "HttpUrlEncodingCodec")
  @js.native
  class HttpUrlEncodingCodec ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpUrlEncodingCodec
  
  @JSImport("@angular/common/http", "HttpXhrBackend")
  @js.native
  class HttpXhrBackend protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpXhrBackend {
    def this(xhrFactory: typingsSlinky.angularCommon.httpHttpMod.XhrFactory) = this()
  }
  
  @JSImport("@angular/common/http", "HttpXsrfTokenExtractor")
  @js.native
  abstract class HttpXsrfTokenExtractor ()
    extends typingsSlinky.angularCommon.httpHttpMod.HttpXsrfTokenExtractor
  
  @JSImport("@angular/common/http", "JsonpClientBackend")
  @js.native
  class JsonpClientBackend protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.JsonpClientBackend {
    def this(
      callbackMap: typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpB,
      document: js.Any
    ) = this()
  }
  
  @JSImport("@angular/common/http", "JsonpInterceptor")
  @js.native
  class JsonpInterceptor protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.JsonpInterceptor {
    def this(jsonp: typingsSlinky.angularCommon.httpHttpMod.JsonpClientBackend) = this()
  }
  
  @JSImport("@angular/common/http", "XhrFactory")
  @js.native
  abstract class XhrFactory ()
    extends typingsSlinky.angularCommon.httpHttpMod.XhrFactory
  
  @JSImport("@angular/common/http", "\u0275HttpInterceptingHandler")
  @js.native
  class ɵHttpInterceptingHandler protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵHttpInterceptingHandler {
    def this(backend: typingsSlinky.angularCommon.httpHttpMod.HttpBackend, injector: Injector) = this()
  }
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_a")
  @js.native
  class ɵangularPackagesCommonHttpHttpA ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpA
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_b")
  @js.native
  abstract class ɵangularPackagesCommonHttpHttpB ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpB
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_c")
  @js.native
  def ɵangularPackagesCommonHttpHttpC(): js.Object = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_d")
  @js.native
  class ɵangularPackagesCommonHttpHttpD ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpD
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_e")
  @js.native
  val ɵangularPackagesCommonHttpHttpE: InjectionToken[String] = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_f")
  @js.native
  val ɵangularPackagesCommonHttpHttpF: InjectionToken[String] = js.native
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_g")
  @js.native
  class ɵangularPackagesCommonHttpHttpG protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpG {
    def this(doc: js.Any, platform: String, cookieName: String) = this()
  }
  
  @JSImport("@angular/common/http", "\u0275angular_packages_common_http_http_h")
  @js.native
  class ɵangularPackagesCommonHttpHttpH protected ()
    extends typingsSlinky.angularCommon.httpHttpMod.ɵangularPackagesCommonHttpHttpH {
    def this(tokenService: typingsSlinky.angularCommon.httpHttpMod.HttpXsrfTokenExtractor, headerName: String) = this()
  }
}
