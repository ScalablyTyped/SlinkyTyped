package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsVoipSandboxChannelRequest extends js.Object {
  var APNSVoipSandboxChannelRequest: typingsSlinky.awsSdk.pinpointMod.APNSVoipSandboxChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateApnsVoipSandboxChannelRequest {
  @scala.inline
  def apply(APNSVoipSandboxChannelRequest: APNSVoipSandboxChannelRequest, ApplicationId: string): UpdateApnsVoipSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipSandboxChannelRequest = APNSVoipSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsVoipSandboxChannelRequest]
  }
  @scala.inline
  implicit class UpdateApnsVoipSandboxChannelRequestOps[Self <: UpdateApnsVoipSandboxChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPNSVoipSandboxChannelRequest(value: APNSVoipSandboxChannelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSVoipSandboxChannelRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

