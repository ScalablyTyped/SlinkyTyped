package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportPathToConversionCriteria extends js.Object {
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.native
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  var dateRange: js.UndefOr[DateRange] = js.native
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  var reportProperties: js.UndefOr[ReportPathToConversionCriteriaReportProperties] = js.native
}

object ReportPathToConversionCriteria {
  @scala.inline
  def apply(): ReportPathToConversionCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportPathToConversionCriteria]
  }
  @scala.inline
  implicit class ReportPathToConversionCriteriaOps[Self <: ReportPathToConversionCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityFilters(value: js.Array[DimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withConversionDimensions(value: js.Array[SortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversionDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversionDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFloodlightVariables(value: js.Array[SortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFloodlightVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFloodlightVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFloodlightVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomRichMediaEvents(value: js.Array[DimensionValue]): Self = {
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
    def withFloodlightConfigId(value: DimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigId")(js.undefined)
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
    @scala.inline
    def withPerInteractionDimensions(value: js.Array[SortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInteractionDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerInteractionDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perInteractionDimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withReportProperties(value: ReportPathToConversionCriteriaReportProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProperties")(js.undefined)
        ret
    }
  }
  
}

