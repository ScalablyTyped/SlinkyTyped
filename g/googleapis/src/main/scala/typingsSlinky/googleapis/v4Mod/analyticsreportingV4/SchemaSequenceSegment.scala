package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sequence conditions consist of one or more steps, where each step is
  * defined by one or more dimension/metric conditions. Multiple steps can be
  * combined with special sequence operators.
  */
@js.native
trait SchemaSequenceSegment extends js.Object {
  /**
    * If set, first step condition must match the first hit of the visitor (in
    * the date range).
    */
  var firstStepShouldMatchFirstHit: js.UndefOr[Boolean] = js.native
  /**
    * The list of steps in the sequence.
    */
  var segmentSequenceSteps: js.UndefOr[js.Array[SchemaSegmentSequenceStep]] = js.native
}

object SchemaSequenceSegment {
  @scala.inline
  def apply(): SchemaSequenceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSequenceSegment]
  }
  @scala.inline
  implicit class SchemaSequenceSegmentOps[Self <: SchemaSequenceSegment] (val x: Self) extends AnyVal {
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
    def withSegmentSequenceSteps(value: js.Array[SchemaSegmentSequenceStep]): Self = {
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

