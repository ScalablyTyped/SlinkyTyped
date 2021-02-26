package typingsSlinky.requestDebug

import typingsSlinky.request.mod.CoreOptions
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Request
import typingsSlinky.request.mod.RequestAPI
import typingsSlinky.request.mod.RequiredUriUrl
import typingsSlinky.requestDebug.requestDebugStrings.auth
import typingsSlinky.requestDebug.requestDebugStrings.redirect
import typingsSlinky.requestDebug.requestDebugStrings.request
import typingsSlinky.requestDebug.requestDebugStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("request-debug", JSImport.Namespace)
  @js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  @JSImport("request-debug", JSImport.Namespace)
  @js.native
  def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = js.native
  
  @JSImport("request-debug", "log")
  @js.native
  val log: LogCallback[Request, CoreOptions, RequiredUriUrl] = js.native
  
  @js.native
  trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends StObject {
    
    def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: redirect, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.requestDebug.mod.RequestData
    - typingsSlinky.requestDebug.mod.ResponseData
    - typingsSlinky.requestDebug.mod.RedirectData
  */
  trait LogData extends StObject
  object LogData {
    
    @scala.inline
    def RedirectData(debugId: Double, headers: Headers, statusCode: Double, uri: String): typingsSlinky.requestDebug.mod.RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.requestDebug.mod.RedirectData]
    }
    
    @scala.inline
    def RequestData(debugId: Double, headers: Headers, method: String, uri: String): typingsSlinky.requestDebug.mod.RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.requestDebug.mod.RequestData]
    }
    
    @scala.inline
    def ResponseData(debugId: Double, headers: Headers, statusCode: Double): typingsSlinky.requestDebug.mod.ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.requestDebug.mod.ResponseData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.requestDebug.requestDebugStrings.request
    - typingsSlinky.requestDebug.requestDebugStrings.response
    - typingsSlinky.requestDebug.requestDebugStrings.redirect
    - typingsSlinky.requestDebug.requestDebugStrings.auth
  */
  trait LogPhase extends StObject
  object LogPhase {
    
    @scala.inline
    def auth: typingsSlinky.requestDebug.requestDebugStrings.auth = "auth".asInstanceOf[typingsSlinky.requestDebug.requestDebugStrings.auth]
    
    @scala.inline
    def redirect: typingsSlinky.requestDebug.requestDebugStrings.redirect = "redirect".asInstanceOf[typingsSlinky.requestDebug.requestDebugStrings.redirect]
    
    @scala.inline
    def request: typingsSlinky.requestDebug.requestDebugStrings.request = "request".asInstanceOf[typingsSlinky.requestDebug.requestDebugStrings.request]
    
    @scala.inline
    def response: typingsSlinky.requestDebug.requestDebugStrings.response = "response".asInstanceOf[typingsSlinky.requestDebug.requestDebugStrings.response]
  }
  
  @js.native
  trait RedirectData extends LogData {
    
    var debugId: Double = js.native
    
    var headers: Headers = js.native
    
    var statusCode: Double = js.native
    
    var uri: String = js.native
  }
  object RedirectData {
    
    @scala.inline
    def apply(debugId: Double, headers: Headers, statusCode: Double, uri: String): RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectData]
    }
    
    @scala.inline
    implicit class RedirectDataMutableBuilder[Self <: RedirectData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestData extends LogData {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var debugId: Double = js.native
    
    var headers: Headers = js.native
    
    var method: String = js.native
    
    var uri: String = js.native
  }
  object RequestData {
    
    @scala.inline
    def apply(debugId: Double, headers: Headers, method: String, uri: String): RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    @scala.inline
    implicit class RequestDataMutableBuilder[Self <: RequestData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponseData extends LogData {
    
    var body: js.UndefOr[js.Any] = js.native
    
    var debugId: Double = js.native
    
    var headers: Headers = js.native
    
    var statusCode: Double = js.native
  }
  object ResponseData {
    
    @scala.inline
    def apply(debugId: Double, headers: Headers, statusCode: Double): ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    @scala.inline
    implicit class ResponseDataMutableBuilder[Self <: ResponseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
