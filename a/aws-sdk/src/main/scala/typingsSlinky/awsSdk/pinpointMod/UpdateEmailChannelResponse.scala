package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEmailChannelResponse extends js.Object {
  var EmailChannelResponse: typingsSlinky.awsSdk.pinpointMod.EmailChannelResponse = js.native
}

object UpdateEmailChannelResponse {
  @scala.inline
  def apply(EmailChannelResponse: EmailChannelResponse): UpdateEmailChannelResponse = {
    val __obj = js.Dynamic.literal(EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEmailChannelResponse]
  }
  @scala.inline
  implicit class UpdateEmailChannelResponseOps[Self <: UpdateEmailChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailChannelResponse(value: EmailChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

