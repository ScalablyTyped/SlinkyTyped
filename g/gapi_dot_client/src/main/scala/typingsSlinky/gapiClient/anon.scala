package typingsSlinky.gapiClient

import typingsSlinky.gapiClient.gapi.client.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    /**
      * The HTTP request body (applies to PUT or POST).
      */
    var body: js.UndefOr[js.Any] = js.native
    
    /**
      * Additional HTTP request headers
      */
    var headers: js.UndefOr[js.Any] = js.native
    
    /**
      * The HTTP request method to use. Default is GET
      */
    var method: js.UndefOr[String] = js.native
    
    /**
      * URL params in key-value pair form
      */
    var params: js.UndefOr[js.Any] = js.native
    
    /**
      * The URL to handle the request
      */
    var path: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(path: String): Body = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Callback[T] extends StObject {
    
    def callback(
      /**
      * is the response for this request only. Its format is defined by the API method being called.
      */
    individualResponse: Response[T],
      /**
      * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
      */
    rawBatchResponse: String
    ): js.Any = js.native
    
    /**
      * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
      */
    var id: String = js.native
  }
  object Callback {
    
    @scala.inline
    def apply[T](callback: (Response[T], String) => js.Any, id: String): Callback[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[T]]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback[_], T] (val x: Self with Callback[T]) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (Response[T], String) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Clientid extends StObject {
    
    /**
      * The application's client ID. Visit the Google Developers Console to get an OAuth 2.0 client ID.
      */
    var client_id: js.UndefOr[String] = js.native
    
    /**
      * If true, then login uses "immediate mode", which means that the token is refreshed behind the scenes, and no UI is shown to the user.
      */
    var immediate: js.UndefOr[Boolean] = js.native
    
    /**
      * The OAuth 2.0 response type property. Default: token
      */
    var response_type: js.UndefOr[String] = js.native
    
    /**
      * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
      */
    var scope: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Clientid {
    
    @scala.inline
    def apply(): Clientid = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Clientid]
    }
    
    @scala.inline
    implicit class ClientidMutableBuilder[Self <: Clientid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
}
