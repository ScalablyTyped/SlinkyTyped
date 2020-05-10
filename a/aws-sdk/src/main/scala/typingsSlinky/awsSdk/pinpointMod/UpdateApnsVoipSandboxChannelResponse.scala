package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsVoipSandboxChannelResponse extends js.Object {
  var APNSVoipSandboxChannelResponse: typingsSlinky.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse = js.native
}

object UpdateApnsVoipSandboxChannelResponse {
  @scala.inline
  def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): UpdateApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelResponse]
  }
  @scala.inline
  implicit class UpdateApnsVoipSandboxChannelResponseOps[Self <: UpdateApnsVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPNSVoipSandboxChannelResponse(value: APNSVoipSandboxChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSVoipSandboxChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

