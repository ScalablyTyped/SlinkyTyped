package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.anon.Dictk
import typingsSlinky.intercomClient.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intercomErrorMod {
  
  @js.native
  trait IntercomError extends StObject {
    
    var body: Errors = js.native
    
    var headers: Dictk = js.native
    
    var statusCode: Double = js.native
  }
  object IntercomError {
    
    @scala.inline
    def apply(body: Errors, headers: Dictk, statusCode: Double): IntercomError = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntercomError]
    }
    
    @scala.inline
    implicit class IntercomErrorMutableBuilder[Self <: IntercomError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Errors): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Dictk): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
