package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Filter Clause to be used in a segment definition, can be wither a metric or
  * a dimension filter.
  */
@js.native
trait SchemaSegmentFilterClause extends js.Object {
  /**
    * Dimension Filter for the segment definition.
    */
  var dimensionFilter: js.UndefOr[SchemaSegmentDimensionFilter] = js.native
  /**
    * Metric Filter for the segment definition.
    */
  var metricFilter: js.UndefOr[SchemaSegmentMetricFilter] = js.native
  /**
    * Matches the complement (`!`) of the filter.
    */
  var not: js.UndefOr[Boolean] = js.native
}

object SchemaSegmentFilterClause {
  @scala.inline
  def apply(): SchemaSegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentFilterClause]
  }
  @scala.inline
  implicit class SchemaSegmentFilterClauseOps[Self <: SchemaSegmentFilterClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFilter(value: SchemaSegmentDimensionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricFilter(value: SchemaSegmentMetricFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilter")(js.undefined)
        ret
    }
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
  }
  
}

