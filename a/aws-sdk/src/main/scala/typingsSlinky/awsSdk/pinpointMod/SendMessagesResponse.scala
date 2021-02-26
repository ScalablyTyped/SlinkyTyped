package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessagesResponse extends StObject {
  
  var MessageResponse: typingsSlinky.awsSdk.pinpointMod.MessageResponse = js.native
}
object SendMessagesResponse {
  
  @scala.inline
  def apply(MessageResponse: MessageResponse): SendMessagesResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesResponse]
  }
  
  @scala.inline
  implicit class SendMessagesResponseMutableBuilder[Self <: SendMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageResponse(value: MessageResponse): Self = StObject.set(x, "MessageResponse", value.asInstanceOf[js.Any])
  }
}
