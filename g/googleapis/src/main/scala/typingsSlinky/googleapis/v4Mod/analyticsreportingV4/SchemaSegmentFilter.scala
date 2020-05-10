package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SegmentFilter defines the segment to be either a simple or a sequence
  * segment. A simple segment condition contains dimension and metric
  * conditions to select the sessions or users. A sequence segment condition
  * can be used to select users or sessions based on sequential conditions.
  */
@js.native
trait SchemaSegmentFilter extends js.Object {
  /**
    * If true, match the complement of simple or sequence segment. For example,
    * to match all visits not from &quot;New York&quot;, we can define the
    * segment as follows:        &quot;sessionSegment&quot;: {
    * &quot;segmentFilters&quot;: [{           &quot;simpleSegment&quot; :{
    * &quot;orFiltersForSegment&quot;: [{ &quot;segmentFilterClauses&quot;:[{
    * &quot;dimensionFilter&quot;: { &quot;dimensionName&quot;:
    * &quot;ga:city&quot;,                   &quot;expressions&quot;:
    * [&quot;New York&quot;]                 }               }]             }]
    * },           &quot;not&quot;: &quot;True&quot;         }]       },
    */
  var not: js.UndefOr[Boolean] = js.native
  /**
    * Sequence conditions consist of one or more steps, where each step is
    * defined by one or more dimension/metric conditions. Multiple steps can be
    * combined with special sequence operators.
    */
  var sequenceSegment: js.UndefOr[SchemaSequenceSegment] = js.native
  /**
    * A Simple segment conditions consist of one or more dimension/metric
    * conditions that can be combined
    */
  var simpleSegment: js.UndefOr[SchemaSimpleSegment] = js.native
}

object SchemaSegmentFilter {
  @scala.inline
  def apply(): SchemaSegmentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilter]
  }
  @scala.inline
  implicit class SchemaSegmentFilterOps[Self <: SchemaSegmentFilter] (val x: Self) extends AnyVal {
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
    def withSequenceSegment(value: SchemaSequenceSegment): Self = {
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
    def withSimpleSegment(value: SchemaSimpleSegment): Self = {
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

