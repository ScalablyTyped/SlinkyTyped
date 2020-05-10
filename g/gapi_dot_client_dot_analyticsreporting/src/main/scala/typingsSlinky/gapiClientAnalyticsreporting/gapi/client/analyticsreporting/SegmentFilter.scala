package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentFilter extends js.Object {
  /**
    * If true, match the complement of simple or sequence segment.
    * For example, to match all visits not from "New York", we can define the
    * segment as follows:
    *
    * "sessionSegment": {
    * "segmentFilters": [{
    * "simpleSegment" :{
    * "orFiltersForSegment": [{
    * "segmentFilterClauses":[{
    * "dimensionFilter": {
    * "dimensionName": "ga:city",
    * "expressions": ["New York"]
    * }
    * }]
    * }]
    * },
    * "not": "True"
    * }]
    * },
    */
  var not: js.UndefOr[Boolean] = js.native
  /**
    * Sequence conditions consist of one or more steps, where each step is
    * defined by one or more dimension/metric conditions. Multiple steps can
    * be combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SequenceSegment] = js.native
  /**
    * A Simple segment conditions consist of one or more dimension/metric
    * conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SimpleSegment] = js.native
}

object SegmentFilter {
  @scala.inline
  def apply(): SegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilter]
  }
  @scala.inline
  implicit class SegmentFilterOps[Self <: SegmentFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.undefined)
        ret
    }
    @scala.inline
    def withSequenceSegment(value: SequenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequenceSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceSegment")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSegment(value: SimpleSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSegment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSegment")(js.undefined)
        ret
    }
  }
  
}

