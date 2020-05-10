package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  /**
    * The zero-based index number of the segment. For example, if the total number of segments is 4, SegmentNumber values range from 0 through 3.
    */
  var SegmentNumber: NonNegativeInteger = js.native
  /**
    * The total number of segments.
    */
  var TotalSegments: TotalSegmentsInteger = js.native
}

object Segment {
  @scala.inline
  def apply(SegmentNumber: NonNegativeInteger, TotalSegments: TotalSegmentsInteger): Segment = {
    val __obj = js.Dynamic.literal(SegmentNumber = SegmentNumber.asInstanceOf[js.Any], TotalSegments = TotalSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSegmentNumber(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SegmentNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalSegments(value: TotalSegmentsInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSegments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

