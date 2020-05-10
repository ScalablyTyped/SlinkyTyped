package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withMessageBody(value: MessageBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageBody")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

