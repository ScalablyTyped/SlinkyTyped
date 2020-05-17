package typingsSlinky.gapiClientDfareporting.anon

import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activities extends js.Object {
  /** Activity group. */
  var activities: js.UndefOr[typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.Activities] = js.native
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[
    typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
  ] = js.native
  /** The date range for which this report should be run. */
  var dateRange: js.UndefOr[typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of standard dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
}

object Activities {
  @scala.inline
  def apply(): Activities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activities]
  }
  @scala.inline
  implicit class ActivitiesOps[Self <: Activities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivities(value: typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.Activities): Self = {
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
    def withCustomRichMediaEvents(value: typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents): Self = {
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
    def withDateRange(value: typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DateRange): Self = {
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

