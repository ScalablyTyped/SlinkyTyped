package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailTemplateResponse extends js.Object {
  var EmailTemplateResponse: typingsSlinky.awsSdk.pinpointMod.EmailTemplateResponse = js.native
}

object GetEmailTemplateResponse {
  @scala.inline
  def apply(EmailTemplateResponse: EmailTemplateResponse): GetEmailTemplateResponse = {
    val __obj = js.Dynamic.literal(EmailTemplateResponse = EmailTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailTemplateResponse]
  }
  @scala.inline
  implicit class GetEmailTemplateResponseOps[Self <: GetEmailTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmailTemplateResponse(value: EmailTemplateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailTemplateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

