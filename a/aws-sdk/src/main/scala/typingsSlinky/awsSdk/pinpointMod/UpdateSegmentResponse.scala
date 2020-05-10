package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSegmentResponse extends js.Object {
  var SegmentResponse: typingsSlinky.awsSdk.pinpointMod.SegmentResponse = js.native
}

object UpdateSegmentResponse {
  @scala.inline
  def apply(SegmentResponse: SegmentResponse): UpdateSegmentResponse = {
    val __obj = js.Dynamic.literal(SegmentResponse = SegmentResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSegmentResponse]
  }
  @scala.inline
  implicit class UpdateSegmentResponseOps[Self <: UpdateSegmentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentResponse(value: SegmentResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

