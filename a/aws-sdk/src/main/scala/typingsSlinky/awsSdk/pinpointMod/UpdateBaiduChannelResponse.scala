package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBaiduChannelResponse extends js.Object {
  var BaiduChannelResponse: typingsSlinky.awsSdk.pinpointMod.BaiduChannelResponse = js.native
}

object UpdateBaiduChannelResponse {
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): UpdateBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBaiduChannelResponse]
  }
  @scala.inline
  implicit class UpdateBaiduChannelResponseOps[Self <: UpdateBaiduChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaiduChannelResponse(value: BaiduChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaiduChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

