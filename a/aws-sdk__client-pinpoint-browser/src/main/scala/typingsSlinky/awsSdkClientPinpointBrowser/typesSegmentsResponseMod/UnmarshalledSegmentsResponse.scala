package typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentsResponse extends SegmentsResponse {
  /**
    * The list of segments.
    */
  @JSName("Item")
  var Item_UnmarshalledSegmentsResponse: js.UndefOr[js.Array[UnmarshalledSegmentResponse]] = js.native
}

object UnmarshalledSegmentsResponse {
  @scala.inline
  def apply(): UnmarshalledSegmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentsResponse]
  }
  @scala.inline
  implicit class UnmarshalledSegmentsResponseOps[Self <: UnmarshalledSegmentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: js.Array[UnmarshalledSegmentResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.undefined)
        ret
    }
  }
  
}

