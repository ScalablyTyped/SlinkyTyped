package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript

import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Collection.ReportsCollection
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Collection.UserActivityCollection
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.Cohort
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.CohortGroup
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.DateRange
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.Dimension
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilter
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilterClause
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.DynamicSegment
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.Metric
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilter
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilterClause
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.OrFiltersForSegment
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.OrderBy
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.Pivot
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.ReportRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.Segment
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDefinition
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDimensionFilter
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilter
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilterClause
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentMetricFilter
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentSequenceStep
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SequenceSegment
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.SimpleSegment
import typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Analyticsreporting")
trait Analyticsreporting_ extends js.Object {
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  var UserActivity: js.UndefOr[UserActivityCollection] = js.undefined
  // Create a new instance of Cohort
  def newCohort(): Cohort
  // Create a new instance of CohortGroup
  def newCohortGroup(): CohortGroup
  // Create a new instance of DateRange
  def newDateRange(): DateRange
  // Create a new instance of Dimension
  def newDimension(): Dimension
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): DimensionFilter
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): DimensionFilterClause
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): DynamicSegment
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): GetReportsRequest
  // Create a new instance of Metric
  def newMetric(): Metric
  // Create a new instance of MetricFilter
  def newMetricFilter(): MetricFilter
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): MetricFilterClause
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): OrFiltersForSegment
  // Create a new instance of OrderBy
  def newOrderBy(): OrderBy
  // Create a new instance of Pivot
  def newPivot(): Pivot
  // Create a new instance of ReportRequest
  def newReportRequest(): ReportRequest
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): SearchUserActivityRequest
  // Create a new instance of Segment
  def newSegment(): Segment
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): SegmentDefinition
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): SegmentDimensionFilter
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): SegmentFilter
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): SegmentFilterClause
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): SegmentMetricFilter
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): SegmentSequenceStep
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): SequenceSegment
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): SimpleSegment
  // Create a new instance of User
  def newUser(): User
}

object Analyticsreporting_ {
  @scala.inline
  def apply(
    newCohort: () => Cohort,
    newCohortGroup: () => CohortGroup,
    newDateRange: () => DateRange,
    newDimension: () => Dimension,
    newDimensionFilter: () => DimensionFilter,
    newDimensionFilterClause: () => DimensionFilterClause,
    newDynamicSegment: () => DynamicSegment,
    newGetReportsRequest: () => GetReportsRequest,
    newMetric: () => Metric,
    newMetricFilter: () => MetricFilter,
    newMetricFilterClause: () => MetricFilterClause,
    newOrFiltersForSegment: () => OrFiltersForSegment,
    newOrderBy: () => OrderBy,
    newPivot: () => Pivot,
    newReportRequest: () => ReportRequest,
    newSearchUserActivityRequest: () => SearchUserActivityRequest,
    newSegment: () => Segment,
    newSegmentDefinition: () => SegmentDefinition,
    newSegmentDimensionFilter: () => SegmentDimensionFilter,
    newSegmentFilter: () => SegmentFilter,
    newSegmentFilterClause: () => SegmentFilterClause,
    newSegmentMetricFilter: () => SegmentMetricFilter,
    newSegmentSequenceStep: () => SegmentSequenceStep,
    newSequenceSegment: () => SequenceSegment,
    newSimpleSegment: () => SimpleSegment,
    newUser: () => User,
    Reports: ReportsCollection = null,
    UserActivity: UserActivityCollection = null
  ): Analyticsreporting_ = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    if (Reports != null) __obj.updateDynamic("Reports")(Reports.asInstanceOf[js.Any])
    if (UserActivity != null) __obj.updateDynamic("UserActivity")(UserActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyticsreporting_]
  }
}

