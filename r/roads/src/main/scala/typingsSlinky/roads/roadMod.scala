package typingsSlinky.roads

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.roads.responseMod.ResponseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roadMod {
  
  @JSImport("roads/types/core/road", JSImport.Default)
  @js.native
  /**
    * Road Constructor
    *
    * Creates a new Road class. This function does not accept any parameters!
    */
  class default () extends Road
  
  @js.native
  trait Context
    extends /* x */ StringDictionary[js.Any] {
    
    var Response: ResponseConstructor = js.native
    
    var request: js.Function = js.native
  }
  object Context {
    
    @scala.inline
    def apply(Response: ResponseConstructor, request: js.Function): Context = {
      val __obj = js.Dynamic.literal(Response = Response.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: js.Function): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: ResponseConstructor): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    }
  }
  
  type Middleware = js.ThisFunction5[
    /* this */ Context, 
    /* method */ String, 
    /* path */ String, 
    /* body */ String, 
    /* headers */ StringDictionary[js.Any], 
    /* next */ ResponseMiddleware, 
    js.Promise[typingsSlinky.roads.responseMod.default]
  ]
  
  type ResponseMiddleware = js.Function0[js.Promise[typingsSlinky.roads.responseMod.default]]
  
  @js.native
  trait Road extends StObject {
    
    /* protected */ def _buildNext(
      request_method: String,
      path: String,
      request_body: js.UndefOr[scala.Nothing],
      request_headers: js.UndefOr[scala.Nothing],
      context: Context
    ): ResponseMiddleware = js.native
    /* protected */ def _buildNext(
      request_method: String,
      path: String,
      request_body: js.UndefOr[scala.Nothing],
      request_headers: js.Object,
      context: Context
    ): ResponseMiddleware = js.native
    /* protected */ def _buildNext(
      request_method: String,
      path: String,
      request_body: String,
      request_headers: js.UndefOr[scala.Nothing],
      context: Context
    ): ResponseMiddleware = js.native
    /**
      * Turn an HTTP request into an executable function with a useful request context. Will also incorporate the entire
      * request handler chain
      *
      * @param {string} request_method - HTTP request method
      * @param {string} path - HTTP request path
      * @param {string} request_body - HTTP request body
      * @param {object} request_headers - HTTP request headers
      * @param {Context} context - Request context
      * @returns {NextMiddleware} A function that will start (or continue) the request chain
      */
    /* protected */ def _buildNext(
      request_method: String,
      path: String,
      request_body: String,
      request_headers: js.Object,
      context: Context
    ): ResponseMiddleware = js.native
    
    /**
      * Execute a resource method, and ensure that a promise is always returned
      *
      * @param {Function} route
      * @returns {Promise<Response>}
      */
    /* protected */ def _executeRoute(route: ResponseMiddleware): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    
    var _request_chain: js.Array[Middleware] = js.native
    
    /**
      *
      * Execute the resource method associated with the request parameters.
      *
      * This function will locate the appropriate [resource method](#resource-method) for the provided HTTP Method and URL, execute it and return a [thenable (Promises/A compatible promise)](http://wiki.commonjs.org/wiki/Promises/A). The thenable will always resolve to a [Response](#roadsresponse) object.
      *
      * @param {string} method - HTTP request method
      * @param {string} url - HTTP request url
      * @param {string} [body] - HTTP request body
      * @param {object} [headers] - HTTP request headers
      * @returns {Promise} this promise will resolve to a Response object
      */
    def request(method: String, url: String): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    def request(method: String, url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    def request(method: String, url: String, body: String): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    def request(method: String, url: String, body: String, headers: js.Object): js.Promise[typingsSlinky.roads.responseMod.default] = js.native
    
    /**
      * Add one or many custom functions to be executed along with every request.
      *
      * The functions added will be executed in the order they were added. Each handler must execute the "next" parameter if it wants to continue executing the chain.
      *
      * name | type                                                                  | required | description
      * -----|-----------------------------------------------------------------------|----------|---------------
      * fn   | Function(*string* method, *string* url,*string* body,*object* headers,*function* next) | yes      | Will be called any time a request is made on the object.
      *
      * This will be called for every request, even for routes that do not exist. The callback will be executed with the following five parameters :
      *
      * Callback
      * **function (*string* method, *string* url, *string* body, *Object* headers, *Function* next)**
      *
      * name     | type                               | description
      * --------|------------------------------------|---------------
      * method  | string                             | The HTTP method that was provided to the request
      * url     | string                             | The URL that was provided to the request
      * body    | string                             | The body that was provided to the request
      * headers | object                             | The headers that were provided to the request
      * next    | function                           | The next step of the handler chain. If there are no more custom handlers assigned, next will resolve to the [resource method](#resource-method) that the router located. This method will always return a promise.
      *
      * If the callback does not return a [response](#roadsresponse) object, it will be wrapped in a [response](#roadsresponse) object with the default status code of 200.
      *
      * @param {Function} fn - A callback (function or async function) that will be executed every time a request is made.
      * @returns {Road} this road object. Useful for chaining use statements.
      */
    def use(fn: Middleware): Road = js.native
  }
}
