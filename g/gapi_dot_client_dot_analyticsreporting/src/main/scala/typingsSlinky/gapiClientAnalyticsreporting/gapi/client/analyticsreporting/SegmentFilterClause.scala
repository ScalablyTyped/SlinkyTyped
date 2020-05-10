package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentFilterClause extends js.Object {
  /** Dimension Filter for the segment definition. */
  var dimensionFilter: js.UndefOr[SegmentDimensionFilter] = js.native
  /** Metric Filter for the segment definition. */
  var metricFilter: js.UndefOr[SegmentMetricFilter] = js.native
  /** Matches the complement (`!`) of the filter. */
  var not: js.UndefOr[Boolean] = js.native
}

object SegmentFilterClause {
  @scala.inline
  def apply(): SegmentFilterClause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentFilterClause]
  }
  @scala.inline
  implicit class SegmentFilterClauseOps[Self <: SegmentFilterClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionFilter(value: SegmentDimensionFilter): Self = {
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
    def withMetricFilter(value: SegmentMetricFilter): Self = {
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

