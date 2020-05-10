package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotFunnel3dDataGroupingOptions extends js.Object {
  /**
    * (Highstock) The method of approximation inside a group. When for example
    * 30 days are grouped into one month, this determines what value should
    * represent the group. Possible values are "average", "averages", "open",
    * "high", "low", "close" and "sum". For OHLC and candlestick series the
    * approximation is "ohlc" by default, which finds the open, high, low and
    * close values within all the grouped data. For ranges, the approximation
    * is "range", which finds the low and high values. For multi-dimensional
    * data, like ranges and OHLC, "averages" will compute the average for each
    * dimension.
    *
    * Custom aggregate methods can be added by assigning a callback function as
    * the approximation. This function takes a numeric array as the argument
    * and should return a single numeric value or `null`. Note that the numeric
    * array will never contain null values, only true numbers. Instead, if null
    * values are present in the raw data, the numeric array will have an
    * `.hasNulls` property set to `true`. For single-value data sets the data
    * is available in the first argument of the callback function. For OHLC
    * data sets, all the open values are in the first argument, all high values
    * in the second etc.
    *
    * Since v4.2.7, grouping meta data is available in the approximation
    * callback from `this.dataGroupInfo`. It can be used to extract information
    * from the raw data.
    *
    * Defaults to `average` for line-type series, `sum` for columns, `range`
    * for range series and `ohlc` for OHLC and candlestick.
    */
  var approximation: js.UndefOr[DataGroupingApproximationValue | js.Function] = js.native
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
    * (Highstock) Enable or disable data grouping.
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
    * (Highstock) The approximate pixel width of each group. If for example a
    * series with 30 points is displayed over a 600 pixel wide plot area, no
    * grouping is performed. If however the series contains so many points that
    * the spacing is less than the groupPixelWidth, Highcharts will try to
    * group it into appropriate groups so that each is more or less two pixels
    * wide. Defaults to `10`.
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

object PlotFunnel3dDataGroupingOptions {
  @scala.inline
  def apply(): PlotFunnel3dDataGroupingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotFunnel3dDataGroupingOptions]
  }
  @scala.inline
  implicit class PlotFunnel3dDataGroupingOptionsOps[Self <: PlotFunnel3dDataGroupingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproximation(value: DataGroupingApproximationValue | js.Function): Self = {
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

