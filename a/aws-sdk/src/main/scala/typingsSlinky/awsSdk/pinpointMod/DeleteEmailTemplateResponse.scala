package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEmailTemplateResponse extends js.Object {
  var MessageBody: typingsSlinky.awsSdk.pinpointMod.MessageBody = js.native
}

object DeleteEmailTemplateResponse {
  @scala.inline
  def apply(MessageBody: MessageBody): DeleteEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailTemplateResponse]
  }
  @scala.inline
  implicit class DeleteEmailTemplateResponseOps[Self <: DeleteEmailTemplateResponse] (val x: Self) extends AnyVal {
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

