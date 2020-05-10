package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotWindbarbDataGroupingOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Approximation function for the data grouping. The
    * default returns an average of wind speed and a vector average direction
    * weighted by wind speed.
    */
  var approximation: js.UndefOr[String | js.Function] = js.native
  /**
    * (Highstock) Datetime formats for the header of the tooltip in a stock
    * chart. The format can vary within a chart depending on the currently
    * selected time range and the current data grouping.
    *
    * The default formats are:
    *
    *  (see online documentation for example)
    *
    * For each of these array definitions, the first item is the format used
    * when the active time span is one unit. For instance, if the current data
    * applies to one week, the first item of the week array is used. The second
    * and third items are used when the active time span is more than two
    * units. For instance, if the current data applies to two weeks, the second
    * and third item of the week array are used, and applied to the start and
    * end date of the time span.
    */
  var dateTimeLabelFormats: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts, Highstock) Whether to enable data grouping.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) When data grouping is forced, it runs no matter how small the
    * intervals are. This can be handy for example when the sum should be
    * calculated for values appearing at random times within each hour.
    */
  var forced: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) By default only points within the visible range are grouped.
    * Enabling this option will force data grouping to calculate all grouped
    * points for a given dataset. That option prevents for example a column
    * series from calculating a grouped point partially. The effect is similar
    * to Series.getExtremesFromAll but does not affect yAxis extremes.
    */
  var groupAll: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) The approximate data group width.
    */
  var groupPixelWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Normally, a group is indexed by the start of that group, so
    * for example when 30 daily values are grouped into one month, that month's
    * x value will be the 1st of the month. This apparently shifts the data to
    * the left. When the smoothed option is true, this is compensated for. The
    * data is shifted to the middle of the group, and min and max values are
    * preserved. Internally, this is used in the Navigator series.
    */
  var smoothed: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) An array determining what time intervals the data is allowed
    * to be grouped to. Each array item is an array where the first value is
    * the time unit and the second value another array of allowed multiples.
    * Defaults to:
    *
    *  (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.native
}

object PlotWindbarbDataGroupingOptions {
  @scala.inline
  def apply(): PlotWindbarbDataGroupingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWindbarbDataGroupingOptions]
  }
  @scala.inline
  implicit class PlotWindbarbDataGroupingOptionsOps[Self <: PlotWindbarbDataGroupingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximation(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproximation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approximation")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeLabelFormats(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeLabelFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeLabelFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeLabelFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withForced(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forced")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupAll")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPixelWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPixelWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPixelWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPixelWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothed")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: js.Array[js.Tuple2[String, js.Array[Double] | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
  }
  
}

