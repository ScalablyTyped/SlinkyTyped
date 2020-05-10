package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceSegment extends js.Object {
  /**
    * If set, first step condition must match the first hit of the visitor (in
    * the date range).
    */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
  /** The list of steps in the sequence. */
  var segmentSequenceSteps: js.UndefOr[js.Array[SegmentSequenceStep]] = js.native
}

object SequenceSegment {
  @scala.inline
  def apply(): SequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceSegment]
  }
  @scala.inline
  implicit class SequenceSegmentOps[Self <: SequenceSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstStepShouldMatchFirstHit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstStepShouldMatchFirstHit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstStepShouldMatchFirstHit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstStepShouldMatchFirstHit")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentSequenceSteps(value: js.Array[SegmentSequenceStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSequenceSteps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentSequenceSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentSequenceSteps")(js.undefined)
        ret
    }
  }
  
}

