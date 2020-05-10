package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessagesResponse extends js.Object {
  var MessageResponse: typingsSlinky.awsSdk.pinpointMod.MessageResponse = js.native
}

object SendMessagesResponse {
  @scala.inline
  def apply(MessageResponse: MessageResponse): SendMessagesResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesResponse]
  }
  @scala.inline
  implicit class SendMessagesResponseOps[Self <: SendMessagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessageResponse(value: MessageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

