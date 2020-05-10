package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable animation of
    * the tooltip.
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the tooltip.
    *
    * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
    * class.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the tooltip border.
    * When `undefined`, the border takes the color of the corresponding series
    * or point.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The radius of the rounded border
    * corners.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the tooltip
    * border.
    *
    * In styled mode, the stroke width is set in the `.highcharts-tooltip-box`
    * class.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highstock) How many decimals to show for the `point.change` value when
    * the `series.compare` option is set. This is overridable in each series'
    * tooltip options object. The default is to preserve all decimals.
    */
  var changeDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name to apply to the
    * tooltip's container div, allowing unique CSS styling for each chart.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[TooltipDateTimeLabelFormatsOptions | Dictionary[String]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Distance from point to tooltip
    * in pixels.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the tooltip.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
    * follow the mouse as it moves across columns, pie slices and other point
    * types with an extent. By default it behaves this way for pie, polygon,
    * map, sankey and wordcloud series by override in the `plotOptions` for
    * those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether the tooltip should
    * update as the finger moves on a touch device. If this is `true` and
    * chart.panning is set,`followTouchMove` will take over one-finger touches,
    * so the user needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to append to the
    * tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
    * text of the tooltip from scratch. In case of single or shared tooltips, a
    * string should be returned. In case of split tooltips, it should return an
    * array where the first item is the header, and subsequent items are mapped
    * to the points. Return `false` to disable tooltip for a specific point on
    * series.
    *
    * A subset of HTML is supported. Unless `useHTML` is true, the HTML of the
    * tooltip is parsed and converted to SVG, therefore this isn't a complete
    * HTML renderer. The following tags are supported: `<b>`, `<strong>`,
    * `<i>`, `<em>`, `<br/>`, `<span>`. Spans can be styled with a `style`
    * attribute, but only text-related CSS that is shared with SVG is handled.
    *
    * The available data in the formatter differ a bit depending on whether the
    * tooltip is shared or split, or belongs to a single point. In a
    * shared/split tooltip, all properties except `x`, which is common for all
    * points, are kept in an array, `this.points`.
    *
    * Available data are:
    *
    *  (see online documentation for example)
    */
  var formatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the tooltip header
    * line. Variables are enclosed by curly brackets. Available variables are
    * `point.key`, `series.name`, `series.color` and other members from the
    * `point` and `series` objects. The `point.key` variable contains the
    * category name, x value or datetime string depending on the type of axis.
    * For datetime axes, the `point.key` date format can be set using
    * `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the tooltip header. Applies only when tooltip.split is
    * enabled.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
    * series.marker.symbol.
    */
  var headerShape: js.UndefOr[OptionsHeaderShapeValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The number of milliseconds to
    * wait until the tooltip is hidden when mouse out from a point or chart.
    */
  var hideDelay: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the null point's
    * line in the tooltip. Works analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format the
    * text of the tooltip for visible null points. Works analogously to
    * formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to allow the tooltip to
    * render outside the chart's SVG element box. By default (`false`), the
    * tooltip is rendered within the chart's SVG element, which results in the
    * tooltip being aligned inside the chart area. For small charts, this may
    * result in clipping or overlapping. When `true`, a separate SVG element is
    * created and overlaid on the page, allowing the tooltip to be aligned
    * inside the page itself.
    *
    * Defaults to `true` if `chart.scrollablePlotArea` is activated, otherwise
    * `false`.
    */
  var outside: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Padding inside the tooltip, in
    * pixels.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The HTML of the point's line in
    * the tooltip. Variables are enclosed by curly brackets. Available
    * variables are point.x, point.y, series. name and series.color and other
    * properties on the same form. Furthermore, `point.y` can be extended by
    * the `tooltip.valuePrefix` and `tooltip.valueSuffix` variables. This can
    * also be overridden for each series, which makes it a good hook for
    * displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function for
    * formatting the HTML output for a single point in the tooltip. Like the
    * `pointFormat` string, but with more flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A callback function to place the
    * tooltip in a default position. The callback receives three parameters:
    * `labelWidth`, `labelHeight` and `point`, where point contains values for
    * `plotX` and `plotY` telling where the reference point is in the plot
    * area. Add `chart.plotLeft` and `chart.plotTop` to get the full
    * coordinates.
    *
    * Since v7, when tooltip.split option is enabled, positioner is called for
    * each of the boxes separately, including xAxis header. xAxis header is not
    * a point, instead `point` argument contains info: `{ plotX: Number, plotY:
    * Number, isHeader: Boolean }`
    *
    * The return should be an object containing x and y values, for example `{
    * x: 100, y: 100 }`.
    */
  var positioner: js.UndefOr[TooltipPositionerCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the tooltip.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the tooltip. Can be one of: `"callout"`, `"circle"`, or
    * `"square"`. When tooltip.split option is enabled, shape is applied to all
    * boxes except header, which is controlled by tooltip.headerShape.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols` the same way as for
    * series.marker.symbol.
    */
  var shape: js.UndefOr[TooltipShapeValue] = js.native
  /**
    * (Highcharts, Highstock) When the tooltip is shared, the entire plot area
    * will capture mouse movement or touch events. Tooltip texts for series
    * types with ordered data (not pie, scatter, flags etc) will be shown in a
    * single bubble. This is recommended for single series charts and for
    * tablet/mobile optimized charts.
    *
    * See also tooltip.split, that is better suited for charts with many
    * series, especially line-type series. The `tooltip.split` option takes
    * precedence over `tooltip.shared`.
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) Proximity snap for graphs or single points. It
    * defaults to 10 for mouse-powered devices and 25 for touch devices.
    *
    * Note that in most cases the whole plot area captures the mouse movement,
    * and in these cases `tooltip.snap` doesn't make sense. This applies when
    * stickyTracking is `true` (default) and when the tooltip is shared or
    * split.
    */
  var snap: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock) Split the tooltip into one label per series, with
    * the header close to the axis. This is recommended over shared tooltips
    * for charts with multiple line series, generally making them easier to
    * read. This option takes precedence over `tooltip.shared`.
    */
  var split: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the tooltip. The
    * tooltip can also be styled through the CSS class `.highcharts-tooltip`.
    *
    * Note that the default `pointerEvents` style makes the tooltip ignore
    * mouse events, so in order to use clickable tooltips, this value must be
    * set to `auto`.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Use HTML to render the contents
    * of the tooltip instead of SVG. Using HTML allows advanced formatting like
    * tables and images in the tooltip. It is also recommended for rtl
    * languages as it works around rtl bugs in early Firefox.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How many decimals to show in
    * each series' y value. This is overridable in each series' tooltip options
    * object. The default is to preserve all decimals.
    */
  var valueDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to prepend to each
    * series' y value. Overridable in each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A string to append to each
    * series' y value. Overridable in each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(js.undefined)
        ret
    }
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeLabelFormats(value: TooltipDateTimeLabelFormatsOptions | Dictionary[String]): Self = {
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
    def withFormatter(value: TooltipFormatterCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
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
    def withHeaderShape(value: OptionsHeaderShapeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerShape")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(js.undefined)
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
    def withOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
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
    def withPositioner(
      value: (/* labelWidth */ Double, /* labelHeight */ Double, /* point */ TooltipPositionerPointObject) => PositionObject
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioner")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPositioner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positioner")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: Boolean | ShadowOptionsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: TooltipShapeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUseHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useHTML")(js.undefined)
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

