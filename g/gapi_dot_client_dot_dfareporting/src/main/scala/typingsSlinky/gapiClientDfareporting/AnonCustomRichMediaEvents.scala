package typingsSlinky.gapiClientDfareporting

import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DateRange
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomRichMediaEvents extends js.Object {
  /** The list of custom rich media events to include. */
  var customRichMediaEvents: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[DateRange] = js.native
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /**
    * The floodlight ID for which to show data in this report. All advertisers associated with that ID will automatically be added. The dimension of the
    * value needs to be 'dfa:floodlightConfigId'.
    */
  var floodlightConfigId: js.UndefOr[DimensionValue] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  /** The properties of the report. */
  var reportProperties: js.UndefOr[AnonIncludeAttributedIPConversions] = js.native
}

object AnonCustomRichMediaEvents {
  @scala.inline
  def apply(): AnonCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCustomRichMediaEvents]
  }
  @scala.inline
  implicit class AnonCustomRichMediaEventsOps[Self <: AnonCustomRichMediaEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReportProperties(value: AnonIncludeAttributedIPConversions): Self = {
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

