package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.ReportsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection.UserActivityCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Cohort
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.CohortGroup
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DateRange
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Dimension
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DimensionFilterClause
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.DynamicSegment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Metric
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.MetricFilterClause
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrFiltersForSegment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.OrderBy
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Pivot
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.ReportRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SearchUserActivityRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.Segment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDefinition
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentDimensionFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentFilterClause
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentMetricFilter
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SegmentSequenceStep
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SequenceSegment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.SimpleSegment
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analyticsreporting_ extends js.Object {
  var Reports: js.UndefOr[ReportsCollection] = js.native
  var UserActivity: js.UndefOr[UserActivityCollection] = js.native
  // Create a new instance of Cohort
  def newCohort(): Cohort = js.native
  // Create a new instance of CohortGroup
  def newCohortGroup(): CohortGroup = js.native
  // Create a new instance of DateRange
  def newDateRange(): DateRange = js.native
  // Create a new instance of Dimension
  def newDimension(): Dimension = js.native
  // Create a new instance of DimensionFilter
  def newDimensionFilter(): DimensionFilter = js.native
  // Create a new instance of DimensionFilterClause
  def newDimensionFilterClause(): DimensionFilterClause = js.native
  // Create a new instance of DynamicSegment
  def newDynamicSegment(): DynamicSegment = js.native
  // Create a new instance of GetReportsRequest
  def newGetReportsRequest(): GetReportsRequest = js.native
  // Create a new instance of Metric
  def newMetric(): Metric = js.native
  // Create a new instance of MetricFilter
  def newMetricFilter(): MetricFilter = js.native
  // Create a new instance of MetricFilterClause
  def newMetricFilterClause(): MetricFilterClause = js.native
  // Create a new instance of OrFiltersForSegment
  def newOrFiltersForSegment(): OrFiltersForSegment = js.native
  // Create a new instance of OrderBy
  def newOrderBy(): OrderBy = js.native
  // Create a new instance of Pivot
  def newPivot(): Pivot = js.native
  // Create a new instance of ReportRequest
  def newReportRequest(): ReportRequest = js.native
  // Create a new instance of SearchUserActivityRequest
  def newSearchUserActivityRequest(): SearchUserActivityRequest = js.native
  // Create a new instance of Segment
  def newSegment(): Segment = js.native
  // Create a new instance of SegmentDefinition
  def newSegmentDefinition(): SegmentDefinition = js.native
  // Create a new instance of SegmentDimensionFilter
  def newSegmentDimensionFilter(): SegmentDimensionFilter = js.native
  // Create a new instance of SegmentFilter
  def newSegmentFilter(): SegmentFilter = js.native
  // Create a new instance of SegmentFilterClause
  def newSegmentFilterClause(): SegmentFilterClause = js.native
  // Create a new instance of SegmentMetricFilter
  def newSegmentMetricFilter(): SegmentMetricFilter = js.native
  // Create a new instance of SegmentSequenceStep
  def newSegmentSequenceStep(): SegmentSequenceStep = js.native
  // Create a new instance of SequenceSegment
  def newSequenceSegment(): SequenceSegment = js.native
  // Create a new instance of SimpleSegment
  def newSimpleSegment(): SimpleSegment = js.native
  // Create a new instance of User
  def newUser(): User = js.native
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
    newUser: () => User
  ): Analyticsreporting_ = {
    val __obj = js.Dynamic.literal(newCohort = js.Any.fromFunction0(newCohort), newCohortGroup = js.Any.fromFunction0(newCohortGroup), newDateRange = js.Any.fromFunction0(newDateRange), newDimension = js.Any.fromFunction0(newDimension), newDimensionFilter = js.Any.fromFunction0(newDimensionFilter), newDimensionFilterClause = js.Any.fromFunction0(newDimensionFilterClause), newDynamicSegment = js.Any.fromFunction0(newDynamicSegment), newGetReportsRequest = js.Any.fromFunction0(newGetReportsRequest), newMetric = js.Any.fromFunction0(newMetric), newMetricFilter = js.Any.fromFunction0(newMetricFilter), newMetricFilterClause = js.Any.fromFunction0(newMetricFilterClause), newOrFiltersForSegment = js.Any.fromFunction0(newOrFiltersForSegment), newOrderBy = js.Any.fromFunction0(newOrderBy), newPivot = js.Any.fromFunction0(newPivot), newReportRequest = js.Any.fromFunction0(newReportRequest), newSearchUserActivityRequest = js.Any.fromFunction0(newSearchUserActivityRequest), newSegment = js.Any.fromFunction0(newSegment), newSegmentDefinition = js.Any.fromFunction0(newSegmentDefinition), newSegmentDimensionFilter = js.Any.fromFunction0(newSegmentDimensionFilter), newSegmentFilter = js.Any.fromFunction0(newSegmentFilter), newSegmentFilterClause = js.Any.fromFunction0(newSegmentFilterClause), newSegmentMetricFilter = js.Any.fromFunction0(newSegmentMetricFilter), newSegmentSequenceStep = js.Any.fromFunction0(newSegmentSequenceStep), newSequenceSegment = js.Any.fromFunction0(newSequenceSegment), newSimpleSegment = js.Any.fromFunction0(newSimpleSegment), newUser = js.Any.fromFunction0(newUser))
    __obj.asInstanceOf[Analyticsreporting_]
  }
  @scala.inline
  implicit class Analyticsreporting_Ops[Self <: Analyticsreporting_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewCohort(value: () => Cohort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCohort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewCohortGroup(value: () => CohortGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newCohortGroup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDateRange(value: () => DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDateRange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimension(value: () => Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimensionFilter(value: () => DimensionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensionFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDimensionFilterClause(value: () => DimensionFilterClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensionFilterClause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewDynamicSegment(value: () => DynamicSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDynamicSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewGetReportsRequest(value: () => GetReportsRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newGetReportsRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMetric(value: () => Metric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMetric")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMetricFilter(value: () => MetricFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMetricFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewMetricFilterClause(value: () => MetricFilterClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMetricFilterClause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrFiltersForSegment(value: () => OrFiltersForSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrFiltersForSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewOrderBy(value: () => OrderBy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOrderBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewPivot(value: () => Pivot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPivot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewReportRequest(value: () => ReportRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newReportRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSearchUserActivityRequest(value: () => SearchUserActivityRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSearchUserActivityRequest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegment(value: () => Segment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentDefinition(value: () => SegmentDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentDefinition")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentDimensionFilter(value: () => SegmentDimensionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentDimensionFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentFilter(value: () => SegmentFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentFilterClause(value: () => SegmentFilterClause): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentFilterClause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentMetricFilter(value: () => SegmentMetricFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentMetricFilter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSegmentSequenceStep(value: () => SegmentSequenceStep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSegmentSequenceStep")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSequenceSegment(value: () => SequenceSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSequenceSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewSimpleSegment(value: () => SimpleSegment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSimpleSegment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewUser(value: () => User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newUser")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReports(value: ReportsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reports")(js.undefined)
        ret
    }
    @scala.inline
    def withUserActivity(value: UserActivityCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserActivity")(js.undefined)
        ret
    }
  }
  
}

