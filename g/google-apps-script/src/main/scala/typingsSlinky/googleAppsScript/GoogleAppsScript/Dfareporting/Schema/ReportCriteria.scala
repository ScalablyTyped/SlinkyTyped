package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportCriteria extends js.Object {
  var activities: js.UndefOr[Activities] = js.native
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object ReportCriteria {
  @scala.inline
  def apply(): ReportCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportCriteria]
  }
  @scala.inline
  implicit class ReportCriteriaOps[Self <: ReportCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: Activities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activities")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRichMediaEvents(value: CustomRichMediaEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRichMediaEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRichMediaEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRichMediaEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: DateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionFilters(value: js.Array[DimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Array[SortedDimension]): Self = {
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
    def withMetricNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(js.undefined)
        ret
    }
  }
  
}

