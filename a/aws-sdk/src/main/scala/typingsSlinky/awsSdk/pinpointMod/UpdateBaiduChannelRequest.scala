package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBaiduChannelRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var BaiduChannelRequest: typingsSlinky.awsSdk.pinpointMod.BaiduChannelRequest = js.native
}

object UpdateBaiduChannelRequest {
  @scala.inline
  def apply(ApplicationId: string, BaiduChannelRequest: BaiduChannelRequest): UpdateBaiduChannelRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], BaiduChannelRequest = BaiduChannelRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelRequest]
  }
  @scala.inline
  implicit class UpdateBaiduChannelRequestOps[Self <: UpdateBaiduChannelRequest] (val x: Self) extends AnyVal {
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
    def withBaiduChannelRequest(value: BaiduChannelRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaiduChannelRequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

