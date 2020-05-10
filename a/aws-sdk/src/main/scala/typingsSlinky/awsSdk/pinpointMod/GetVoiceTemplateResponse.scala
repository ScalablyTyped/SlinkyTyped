package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVoiceTemplateResponse extends js.Object {
  var VoiceTemplateResponse: typingsSlinky.awsSdk.pinpointMod.VoiceTemplateResponse = js.native
}

object GetVoiceTemplateResponse {
  @scala.inline
  def apply(VoiceTemplateResponse: VoiceTemplateResponse): GetVoiceTemplateResponse = {
    val __obj = js.Dynamic.literal(VoiceTemplateResponse = VoiceTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceTemplateResponse]
  }
  @scala.inline
  implicit class GetVoiceTemplateResponseOps[Self <: GetVoiceTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceTemplateResponse(value: VoiceTemplateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceTemplateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

