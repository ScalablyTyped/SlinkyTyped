package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApnsVoipSandboxChannelResponse extends js.Object {
  var APNSVoipSandboxChannelResponse: typingsSlinky.awsSdk.pinpointMod.APNSVoipSandboxChannelResponse = js.native
}

object GetApnsVoipSandboxChannelResponse {
  @scala.inline
  def apply(APNSVoipSandboxChannelResponse: APNSVoipSandboxChannelResponse): GetApnsVoipSandboxChannelResponse = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsVoipSandboxChannelResponse]
  }
  @scala.inline
  implicit class GetApnsVoipSandboxChannelResponseOps[Self <: GetApnsVoipSandboxChannelResponse] (val x: Self) extends AnyVal {
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

