package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotOhlcTooltipOptions extends js.Object {
  /**
    * (Highstock) How many decimals to show for the `point.change` value when
    * the `series.compare` option is set. This is overridable in each series'
    * tooltip options object. The default is to preserve all decimals.
    */
  var changeDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[PlotOhlcTooltipDateTimeLabelFormatsOptions | Dictionary[String]] = js.native
  /**
    * (Highstock) Distance from point to tooltip in pixels.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Whether the tooltip should follow the mouse as it moves
    * across columns, pie slices and other point types with an extent. By
    * default it behaves this way for pie, polygon, map, sankey and wordcloud
    * series by override in the `plotOptions` for those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether the tooltip should update as the finger moves on a
    * touch device. If this is `true` and chart.panning is
    * set,`followTouchMove` will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) A string to append to the tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) The HTML of the tooltip header line. Variables are enclosed
    * by curly brackets. Available variables are `point.key`, `series.name`,
    * `series.color` and other members from the `point` and `series` objects.
    * The `point.key` variable contains the category name, x value or datetime
    * string depending on the type of axis. For datetime axes, the `point.key`
    * date format can be set using `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) The HTML of the null point's line in the tooltip. Works
    * analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) Callback function to format the text of the tooltip for
    * visible null points. Works analogously to formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.native
  /**
    * (Highstock) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are point.x, point.y,
    * series. name and series.color and other properties on the same form.
    * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
    * `tooltip.valueSuffix` variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) A callback function for formatting the HTML output for a
    * single point in the tooltip. Like the `pointFormat` string, but with more
    * flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.native
  /**
    * (Highstock) How many decimals to show in each series' y value. This is
    * overridable in each series' tooltip options object. The default is to
    * preserve all decimals.
    */
  var valueDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A string to prepend to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.native
  /**
    * (Highstock) A string to append to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.native
}

object PlotOhlcTooltipOptions {
  @scala.inline
  def apply(): PlotOhlcTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotOhlcTooltipOptions]
  }
  @scala.inline
  implicit class PlotOhlcTooltipOptionsOps[Self <: PlotOhlcTooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeLabelFormats(value: PlotOhlcTooltipDateTimeLabelFormatsOptions | Dictionary[String]): Self = {
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
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowPointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followPointer")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowTouchMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withNullFormatter(value: TooltipFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withPointFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPointFormatter(value: FormatterCallbackFunction[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDecimals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withValueSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withXDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xDateFormat")(js.undefined)
        ret
    }
  }
  
}

