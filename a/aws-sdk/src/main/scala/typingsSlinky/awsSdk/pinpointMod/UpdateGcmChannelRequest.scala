package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGcmChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var GCMChannelRequest: typingsSlinky.awsSdk.pinpointMod.GCMChannelRequest = js.native
}

object UpdateGcmChannelRequest {
  @scala.inline
  def apply(ApplicationId: string, GCMChannelRequest: GCMChannelRequest): UpdateGcmChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], GCMChannelRequest = GCMChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGcmChannelRequest]
  }
  @scala.inline
  implicit class UpdateGcmChannelRequestOps[Self <: UpdateGcmChannelRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGCMChannelRequest(value: GCMChannelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GCMChannelRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

