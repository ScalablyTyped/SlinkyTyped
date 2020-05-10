package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentsResponse extends js.Object {
  var SegmentsResponse: typingsSlinky.awsSdk.pinpointMod.SegmentsResponse = js.native
}

object GetSegmentsResponse {
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentsResponse]
  }
  @scala.inline
  implicit class GetSegmentsResponseOps[Self <: GetSegmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentsResponse(value: SegmentsResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentsResponse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

