package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVoiceTemplateResponse extends js.Object {
  
  var MessageBody: typingsSlinky.awsSdk.pinpointMod.MessageBody = js.native
}
object DeleteVoiceTemplateResponse {
  
  @scala.inline
  def apply(MessageBody: MessageBody): DeleteVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceTemplateResponse]
  }
  
  @scala.inline
  implicit class DeleteVoiceTemplateResponseOps[Self <: DeleteVoiceTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessageBody(value: MessageBody): Self = this.set("MessageBody", value.asInstanceOf[js.Any])
  }
}
