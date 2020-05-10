package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetChannelsResponse extends js.Object {
  var ChannelsResponse: typingsSlinky.awsSdk.pinpointMod.ChannelsResponse = js.native
}

object GetChannelsResponse {
  @scala.inline
  def apply(ChannelsResponse: ChannelsResponse): GetChannelsResponse = {
    val __obj = js.Dynamic.literal(ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsResponse]
  }
  @scala.inline
  implicit class GetChannelsResponseOps[Self <: GetChannelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelsResponse(value: ChannelsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

