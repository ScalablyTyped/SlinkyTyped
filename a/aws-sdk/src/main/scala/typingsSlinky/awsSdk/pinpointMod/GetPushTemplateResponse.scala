package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPushTemplateResponse extends js.Object {
  var PushNotificationTemplateResponse: typingsSlinky.awsSdk.pinpointMod.PushNotificationTemplateResponse = js.native
}

object GetPushTemplateResponse {
  @scala.inline
  def apply(PushNotificationTemplateResponse: PushNotificationTemplateResponse): GetPushTemplateResponse = {
    val __obj = js.Dynamic.literal(PushNotificationTemplateResponse = PushNotificationTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPushTemplateResponse]
  }
  @scala.inline
  implicit class GetPushTemplateResponseOps[Self <: GetPushTemplateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPushNotificationTemplateResponse(value: PushNotificationTemplateResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushNotificationTemplateResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

