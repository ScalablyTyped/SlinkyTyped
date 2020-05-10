package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  var cohortGroup: js.UndefOr[CohortGroup] = js.native
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  var filtersExpression: js.UndefOr[String] = js.native
  var hideTotals: js.UndefOr[Boolean] = js.native
  var hideValueRanges: js.UndefOr[Boolean] = js.native
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.native
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var pivots: js.UndefOr[js.Array[Pivot]] = js.native
  var samplingLevel: js.UndefOr[String] = js.native
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  var viewId: js.UndefOr[String] = js.native
}

object ReportRequest {
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  @scala.inline
  implicit class ReportRequestOps[Self <: ReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCohortGroup(value: CohortGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cohortGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCohortGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cohortGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRanges(value: js.Array[DateRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilterClauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilterClauses")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[Dimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltersExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtersExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltersExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtersExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withHideTotals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTotals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideTotals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideTotals")(js.undefined)
        ret
    }
    @scala.inline
    def withHideValueRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideValueRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideValueRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideValueRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeEmptyRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeEmptyRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeEmptyRows")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricFilterClauses(value: js.Array[MetricFilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilterClauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricFilterClauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricFilterClauses")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[Metric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBys(value: js.Array[OrderBy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBys")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPivots(value: js.Array[Pivot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivots")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSegments(value: js.Array[Segment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(js.undefined)
        ret
    }
    @scala.inline
    def withViewId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewId")(js.undefined)
        ret
    }
  }
  
}

