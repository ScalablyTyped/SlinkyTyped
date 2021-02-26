package typingsSlinky.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: typingsSlinky.awsSdk.sesMod.MessageId = js.native
}
object SendEmailResponse {
  
  @scala.inline
  def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailResponse]
  }
  
  @scala.inline
  implicit class SendEmailResponseMutableBuilder[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
