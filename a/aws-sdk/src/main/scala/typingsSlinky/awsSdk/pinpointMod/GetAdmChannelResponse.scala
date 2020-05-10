package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAdmChannelResponse extends js.Object {
  var ADMChannelResponse: typingsSlinky.awsSdk.pinpointMod.ADMChannelResponse = js.native
}

object GetAdmChannelResponse {
  @scala.inline
  def apply(ADMChannelResponse: ADMChannelResponse): GetAdmChannelResponse = {
    val __obj = js.Dynamic.literal(ADMChannelResponse = ADMChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAdmChannelResponse]
  }
  @scala.inline
  implicit class GetAdmChannelResponseOps[Self <: GetAdmChannelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMChannelResponse(value: ADMChannelResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADMChannelResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

