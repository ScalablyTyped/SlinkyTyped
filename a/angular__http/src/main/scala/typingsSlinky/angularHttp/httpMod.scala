package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.baseRequestOptionsMod.RequestOptions
import typingsSlinky.angularHttp.interfacesMod.ConnectionBackend
import typingsSlinky.angularHttp.interfacesMod.RequestOptionsArgs
import typingsSlinky.angularHttp.staticRequestMod.Request
import typingsSlinky.angularHttp.staticResponseMod.Response
import typingsSlinky.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("@angular/http/src/http", "Http")
  @js.native
  class Http protected () extends StObject {
    def this(_backend: ConnectionBackend, _defaultOptions: RequestOptions) = this()
    
    var _backend: ConnectionBackend = js.native
    
    var _defaultOptions: RequestOptions = js.native
    
    /**
      * Performs a request with `delete` http method.
      */
    def delete(url: String): Observable_[Response] = js.native
    def delete(url: String, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `get` http method.
      */
    def get(url: String): Observable_[Response] = js.native
    def get(url: String, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `head` http method.
      */
    def head(url: String): Observable_[Response] = js.native
    def head(url: String, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `options` http method.
      */
    def options(url: String): Observable_[Response] = js.native
    def options(url: String, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `patch` http method.
      */
    def patch(url: String, body: js.Any): Observable_[Response] = js.native
    def patch(url: String, body: js.Any, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `post` http method.
      */
    def post(url: String, body: js.Any): Observable_[Response] = js.native
    def post(url: String, body: js.Any, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs a request with `put` http method.
      */
    def put(url: String, body: js.Any): Observable_[Response] = js.native
    def put(url: String, body: js.Any, options: RequestOptionsArgs): Observable_[Response] = js.native
    
    /**
      * Performs any type of http request. First argument is required, and can either be a url or
      * a {@link Request} instance. If the first argument is a url, an optional {@link RequestOptions}
      * object can be provided as the 2nd argument. The options object will be merged with the values
      * of {@link BaseRequestOptions} before performing the request.
      */
    def request(url: String): Observable_[Response] = js.native
    def request(url: String, options: RequestOptionsArgs): Observable_[Response] = js.native
    def request(url: Request): Observable_[Response] = js.native
    def request(url: Request, options: RequestOptionsArgs): Observable_[Response] = js.native
  }
  
  @JSImport("@angular/http/src/http", "Jsonp")
  @js.native
  class Jsonp protected () extends Http {
    def this(backend: ConnectionBackend, defaultOptions: RequestOptions) = this()
  }
}
