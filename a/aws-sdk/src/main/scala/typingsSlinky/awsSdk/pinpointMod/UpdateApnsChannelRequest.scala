package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsChannelRequest extends js.Object {
  var APNSChannelRequest: typingsSlinky.awsSdk.pinpointMod.APNSChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateApnsChannelRequest {
  @scala.inline
  def apply(APNSChannelRequest: APNSChannelRequest, ApplicationId: string): UpdateApnsChannelRequest = {
    val __obj = js.Dynamic.literal(APNSChannelRequest = APNSChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelRequest]
  }
  @scala.inline
  implicit class UpdateApnsChannelRequestOps[Self <: UpdateApnsChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPNSChannelRequest(value: APNSChannelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APNSChannelRequest")(value.asInstanceOf[js.Any])
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

