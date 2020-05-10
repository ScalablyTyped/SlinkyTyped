package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceChannelResponse extends js.Object {
  var VoiceChannelResponse: typingsSlinky.awsSdk.pinpointMod.VoiceChannelResponse = js.native
}

object GetVoiceChannelResponse {
  @scala.inline
  def apply(VoiceChannelResponse: VoiceChannelResponse): GetVoiceChannelResponse = {
    val __obj = js.Dynamic.literal(VoiceChannelResponse = VoiceChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceChannelResponse]
  }
  @scala.inline
  implicit class GetVoiceChannelResponseOps[Self <: GetVoiceChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceChannelResponse(value: VoiceChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

