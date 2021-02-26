package typingsSlinky.requestPromiseNative

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsSlinky.requestPromiseNative.mod.FullResponse
import typingsSlinky.requestPromiseNative.mod.Options
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @js.native
  trait RequestError extends Error {
    
    var cause: js.Any = js.native
    
    var error: js.Any = js.native
    
    var options: Options = js.native
    
    var response: FullResponse = js.native
  }
  object RequestError {
    
    @JSImport("request-promise-native/errors", "RequestError")
    @js.native
    val ^ : RequestErrorConstructor = js.native
    
    @scala.inline
    implicit class RequestErrorMutableBuilder[Self <: RequestError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: js.Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "RequestError")
  @js.native
  class RequestErrorCls protected () extends RequestError {
    def this(cause: js.Any, options: Options, response: FullResponse) = this()
  }
  
  @js.native
  trait StatusCodeError extends Error {
    
    var error: js.Any = js.native
    
    var options: Options = js.native
    
    var response: FullResponse = js.native
    
    var statusCode: Double = js.native
  }
  object StatusCodeError {
    
    @JSImport("request-promise-native/errors", "StatusCodeError")
    @js.native
    val ^ : StatusCodeErrorConstructor = js.native
    
    @scala.inline
    implicit class StatusCodeErrorMutableBuilder[Self <: StatusCodeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "StatusCodeError")
  @js.native
  class StatusCodeErrorCls protected () extends StatusCodeError {
    def this(statusCode: Double, body: js.Any, options: Options, response: FullResponse) = this()
  }
  
  @js.native
  trait TransformError extends Error {
    
    var cause: js.Any = js.native
    
    var error: js.Any = js.native
    
    var options: Options = js.native
    
    var response: FullResponse = js.native
  }
  object TransformError {
    
    @JSImport("request-promise-native/errors", "TransformError")
    @js.native
    val ^ : TransformErrorConstructor = js.native
    
    @scala.inline
    implicit class TransformErrorMutableBuilder[Self <: TransformError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: js.Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "TransformError")
  @js.native
  class TransformErrorCls protected () extends TransformError {
    def this(cause: js.Any, options: Options, response: FullResponse) = this()
  }
  
  @js.native
  trait RequestErrorConstructor
    extends Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, RequestError] {
    
    def apply(cause: js.Any, options: Options, response: FullResponse): RequestError = js.native
  }
  
  @js.native
  trait StatusCodeErrorConstructor
    extends Error
       with Instantiable4[
          /* statusCode */ Double, 
          /* body */ js.Any, 
          /* options */ Options, 
          /* response */ FullResponse, 
          StatusCodeError
        ] {
    
    def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
  }
  
  @js.native
  trait TransformErrorConstructor
    extends Error
       with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
    
    def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
  }
}
