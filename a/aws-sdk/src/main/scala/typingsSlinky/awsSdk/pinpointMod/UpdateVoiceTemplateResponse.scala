package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVoiceTemplateResponse extends StObject {
  
  var MessageBody: typingsSlinky.awsSdk.pinpointMod.MessageBody = js.native
}
object UpdateVoiceTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceTemplateResponse]
  }
  
  @scala.inline
  implicit class UpdateVoiceTemplateResponseMutableBuilder[Self <: UpdateVoiceTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
  }
}
