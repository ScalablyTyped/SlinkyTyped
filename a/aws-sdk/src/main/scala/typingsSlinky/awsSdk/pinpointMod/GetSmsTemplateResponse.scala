package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSmsTemplateResponse extends js.Object {
  var SMSTemplateResponse: typingsSlinky.awsSdk.pinpointMod.SMSTemplateResponse = js.native
}

object GetSmsTemplateResponse {
  @scala.inline
  def apply(SMSTemplateResponse: SMSTemplateResponse): GetSmsTemplateResponse = {
    val __obj = js.Dynamic.literal(SMSTemplateResponse = SMSTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsTemplateResponse]
  }
  @scala.inline
  implicit class GetSmsTemplateResponseOps[Self <: GetSmsTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSMSTemplateResponse(value: SMSTemplateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SMSTemplateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

