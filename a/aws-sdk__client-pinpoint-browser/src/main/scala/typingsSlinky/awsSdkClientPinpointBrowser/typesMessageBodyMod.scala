package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageBodyMod {
  
  @js.native
  trait MessageBody extends StObject {
    
    /**
      * The error message that's returned from the API.
      */
    var Message: js.UndefOr[String] = js.native
    
    /**
      * The unique message body ID.
      */
    var RequestID: js.UndefOr[String] = js.native
  }
  object MessageBody {
    
    @scala.inline
    def apply(): MessageBody = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBody]
    }
    
    @scala.inline
    implicit class MessageBodyMutableBuilder[Self <: MessageBody] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setRequestID(value: String): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
    }
  }
  
  type UnmarshalledMessageBody = MessageBody
}
