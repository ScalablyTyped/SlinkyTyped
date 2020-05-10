package typingsSlinky.gapiClientDfareporting

import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DateRange
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivityFilters extends js.Object {
  /** The list of 'dfa:activity' values to filter on. */
  var activityFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of conversion dimensions the report should include. */
  var conversionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The list of custom floodlight variables the report should include. */
  var customFloodlightVariables: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[DateRange] = js.native
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  /** The list of per interaction dimensions the report should include. */
  var perInteractionDimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The properties of the report. */
  var reportProperties: js.UndefOr[AnonClicksLookbackWindow] = js.native
}

object AnonActivityFilters {
  @scala.inline
  def apply(): AnonActivityFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonActivityFilters]
  }
  @scala.inline
  implicit class AnonActivityFiltersOps[Self <: AnonActivityFilters] (val x: Self) extends AnyVal {
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
    def withReportProperties(value: AnonClicksLookbackWindow): Self = {
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

