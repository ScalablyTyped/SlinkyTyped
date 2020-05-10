package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSmsChannelResponse extends js.Object {
  var SMSChannelResponse: typingsSlinky.awsSdk.pinpointMod.SMSChannelResponse = js.native
}

object DeleteSmsChannelResponse {
  @scala.inline
  def apply(SMSChannelResponse: SMSChannelResponse): DeleteSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsChannelResponse]
  }
  @scala.inline
  implicit class DeleteSmsChannelResponseOps[Self <: DeleteSmsChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSMSChannelResponse(value: SMSChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

