package typingsSlinky.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportRequest extends js.Object {
  /**
    * Cohort group associated with this request. If there is a cohort group
    * in the request the `ga:cohort` dimension must be present.
    * Every [ReportRequest](#ReportRequest) within a `batchGet` method must
    * contain the same `cohortGroup` definition.
    */
  var cohortGroup: js.UndefOr[CohortGroup] = js.native
  /**
    * Date ranges in the request. The request can have a maximum of 2 date
    * ranges. The response will contain a set of metric values for each
    * combination of the dimensions for each date range in the request. So, if
    * there are two date ranges, there will be two set of metric values, one for
    * the original date range and one for the second date range.
    * The `reportRequest.dateRanges` field should not be specified for cohorts
    * or Lifetime value requests.
    * If a date range is not provided, the default date range is (startDate:
    * current date - 7 days, endDate: current date - 1 day). Every
    * [ReportRequest](#ReportRequest) within a `batchGet` method must
    * contain the same `dateRanges` definition.
    */
  var dateRanges: js.UndefOr[js.Array[DateRange]] = js.native
  /**
    * The dimension filter clauses for filtering Dimension Values. They are
    * logically combined with the `AND` operator. Note that filtering occurs
    * before any dimensions are aggregated, so that the returned metrics
    * represent the total for only the relevant dimensions.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  /**
    * The dimensions requested.
    * Requests can have a total of 7 dimensions.
    */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  /**
    * Dimension or metric filters that restrict the data returned for your
    * request. To use the `filtersExpression`, supply a dimension or metric on
    * which to filter, followed by the filter expression. For example, the
    * following expression selects `ga:browser` dimension which starts with
    * Firefox; `ga:browser=~^Firefox`. For more information on dimensions
    * and metric filters, see
    * [Filters reference](https://developers.google.com/analytics/devguides/reporting/core/v3/reference#filters).
    */
  var filtersExpression: js.UndefOr[String] = js.native
  /**
    * If set to true, hides the total of all metrics for all the matching rows,
    * for every date range. The default false and will return the totals.
    */
  var hideTotals: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, hides the minimum and maximum across all matching rows.
    * The default is false and the value ranges are returned.
    */
  var hideValueRanges: js.UndefOr[Boolean] = js.native
  /**
    * If set to false, the response does not include rows if all the retrieved
    * metrics are equal to zero. The default is false which will exclude these
    * rows.
    */
  var includeEmptyRows: js.UndefOr[Boolean] = js.native
  /**
    * The metric filter clauses. They are logically combined with the `AND`
    * operator.  Metric filters look at only the first date range and not the
    * comparing date range. Note that filtering on metrics occurs after the
    * metrics are aggregated.
    */
  var metricFilterClauses: js.UndefOr[js.Array[MetricFilterClause]] = js.native
  /**
    * The metrics requested.
    * Requests must specify at least one metric. Requests can have a
    * total of 10 metrics.
    */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  /**
    * Sort order on output rows. To compare two rows, the elements of the
    * following are applied in order until a difference is found.  All date
    * ranges in the output get the same row order.
    */
  var orderBys: js.UndefOr[js.Array[OrderBy]] = js.native
  /**
    * Page size is for paging and specifies the maximum number of returned rows.
    * Page size should be >= 0. A query returns the default of 1,000 rows.
    * The Analytics Core Reporting API returns a maximum of 10,000 rows per
    * request, no matter how many you ask for. It can also return fewer rows
    * than requested, if there aren't as many dimension segments as you expect.
    * For instance, there are fewer than 300 possible values for `ga:country`,
    * so when segmenting only by country, you can't get more than 300 rows,
    * even if you set `pageSize` to a higher value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request will return the rows after the pageToken. The pageToken should
    * be the value returned in the nextPageToken parameter in the response to
    * the GetReports request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** The pivot definitions. Requests can have a maximum of 2 pivots. */
  var pivots: js.UndefOr[js.Array[Pivot]] = js.native
  /**
    * The desired report
    * [sample](https://support.google.com/analytics/answer/2637192) size.
    * If the the `samplingLevel` field is unspecified the `DEFAULT` sampling
    * level is used. Every [ReportRequest](#ReportRequest) within a
    * `batchGet` method must contain the same `samplingLevel` definition. See
    * [developer guide](/analytics/devguides/reporting/core/v4/basics#sampling)
    * for details.
    */
  var samplingLevel: js.UndefOr[String] = js.native
  /**
    * Segment the data returned for the request. A segment definition helps look
    * at a subset of the segment request. A request can contain up to four
    * segments. Every [ReportRequest](#ReportRequest) within a
    * `batchGet` method must contain the same `segments` definition. Requests
    * with segments must have the `ga:segment` dimension.
    */
  var segments: js.UndefOr[js.Array[Segment]] = js.native
  /**
    * The Analytics
    * [view ID](https://support.google.com/analytics/answer/1009618)
    * from which to retrieve data. Every [ReportRequest](#ReportRequest)
    * within a `batchGet` method must contain the same `viewId`.
    */
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

