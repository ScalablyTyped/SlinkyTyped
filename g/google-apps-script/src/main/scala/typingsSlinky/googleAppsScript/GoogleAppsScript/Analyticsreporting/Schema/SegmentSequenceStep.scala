package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentSequenceStep extends js.Object {
  var matchType: js.UndefOr[String] = js.native
  var orFiltersForSegment: js.UndefOr[js.Array[OrFiltersForSegment]] = js.native
}

object SegmentSequenceStep {
  @scala.inline
  def apply(): SegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentSequenceStep]
  }
  @scala.inline
  implicit class SegmentSequenceStepOps[Self <: SegmentSequenceStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchType")(js.undefined)
        ret
    }
    @scala.inline
    def withOrFiltersForSegment(value: js.Array[OrFiltersForSegment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orFiltersForSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrFiltersForSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orFiltersForSegment")(js.undefined)
        ret
    }
  }
  
}

