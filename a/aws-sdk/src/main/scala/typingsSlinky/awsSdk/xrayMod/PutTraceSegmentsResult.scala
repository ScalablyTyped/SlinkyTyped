package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTraceSegmentsResult extends js.Object {
  /**
    * Segments that failed processing.
    */
  var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.native
}

object PutTraceSegmentsResult {
  @scala.inline
  def apply(): PutTraceSegmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTraceSegmentsResult]
  }
  @scala.inline
  implicit class PutTraceSegmentsResultOps[Self <: PutTraceSegmentsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnprocessedTraceSegments(value: UnprocessedTraceSegmentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnprocessedTraceSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnprocessedTraceSegments")(js.undefined)
        ret
    }
  }
  
}

