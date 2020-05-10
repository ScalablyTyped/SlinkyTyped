package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSegmentVersionsResponse extends js.Object {
  var SegmentsResponse: typingsSlinky.awsSdk.pinpointMod.SegmentsResponse = js.native
}

object GetSegmentVersionsResponse {
  @scala.inline
  def apply(SegmentsResponse: SegmentsResponse): GetSegmentVersionsResponse = {
    val __obj = js.Dynamic.literal(SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionsResponse]
  }
  @scala.inline
  implicit class GetSegmentVersionsResponseOps[Self <: GetSegmentVersionsResponse] (val x: Self) extends AnyVal {
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

