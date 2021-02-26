package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.awsSdkProtocolHttp.mod.HttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HandlerProtocol extends StObject {
    
    var handlerProtocol: String = js.native
  }
  object HandlerProtocol {
    
    @scala.inline
    def apply(handlerProtocol: String): HandlerProtocol = {
      val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerProtocol]
    }
    
    @scala.inline
    implicit class HandlerProtocolMutableBuilder[Self <: HandlerProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlerProtocol(value: String): Self = StObject.set(x, "handlerProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var response: HttpResponse = js.native
  }
  object Response {
    
    @scala.inline
    def apply(response: HttpResponse): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponse(value: HttpResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
