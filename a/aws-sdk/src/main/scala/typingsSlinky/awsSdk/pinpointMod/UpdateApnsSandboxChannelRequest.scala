package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsSandboxChannelRequest extends js.Object {
  var APNSSandboxChannelRequest: typingsSlinky.awsSdk.pinpointMod.APNSSandboxChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateApnsSandboxChannelRequest {
  @scala.inline
  def apply(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: string): UpdateApnsSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
  }
  @scala.inline
  implicit class UpdateApnsSandboxChannelRequestOps[Self <: UpdateApnsSandboxChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPNSSandboxChannelRequest(value: APNSSandboxChannelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSSandboxChannelRequest")(value.asInstanceOf[js.Any])
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

