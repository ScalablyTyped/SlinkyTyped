package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBaiduChannelResponse extends js.Object {
  var BaiduChannelResponse: typingsSlinky.awsSdk.pinpointMod.BaiduChannelResponse = js.native
}

object DeleteBaiduChannelResponse {
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): DeleteBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBaiduChannelResponse]
  }
  @scala.inline
  implicit class DeleteBaiduChannelResponseOps[Self <: DeleteBaiduChannelResponse] (val x: Self) extends AnyVal {
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

