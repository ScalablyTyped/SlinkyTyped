package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment sequence definition.
  */
@js.native
trait SchemaSegmentSequenceStep extends js.Object {
  /**
    * Specifies if the step immediately precedes or can be any time before the
    * next step.
    */
  var matchType: js.UndefOr[String] = js.native
  /**
    * A sequence is specified with a list of Or grouped filters which are
    * combined with `AND` operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[SchemaOrFiltersForSegment]] = js.native
}

object SchemaSegmentSequenceStep {
  @scala.inline
  def apply(): SchemaSegmentSequenceStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentSequenceStep]
  }
  @scala.inline
  implicit class SchemaSegmentSequenceStepOps[Self <: SchemaSegmentSequenceStep] (val x: Self) extends AnyVal {
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
    def withOrFiltersForSegment(value: js.Array[SchemaOrFiltersForSegment]): Self = {
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

