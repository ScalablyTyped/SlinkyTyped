package typingsSlinky.gapiClientDfareporting.anon

import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breakdown extends js.Object {
  /** The list of dimensions the report should include. */
  var breakdown: js.UndefOr[js.Array[SortedDimension]] = js.native
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting.DateRange] = js.native
  /** The dimension option. */
  var dimension: js.UndefOr[String] = js.native
  /** The list of filters on which dimensions are filtered. */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  /** The list of names of overlap metrics the report should include. */
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  /** Whether the report is pivoted or not. Defaults to true. */
  var pivoted: js.UndefOr[Boolean] = js.native
}

object Breakdown {
  @scala.inline
  def apply(): Breakdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Breakdown]
  }
  @scala.inline
  implicit class BreakdownOps[Self <: Breakdown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakdown(value: js.Array[SortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(js.undefined)
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
    def withDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
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
    def withOverlapMetricNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetricNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapMetricNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetricNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPivoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivoted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivoted")(js.undefined)
        ret
    }
  }
  
}

