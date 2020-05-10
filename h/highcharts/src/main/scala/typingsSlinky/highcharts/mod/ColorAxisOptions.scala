package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorAxisOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) Accessibility options for an axis.
    * Requires the accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | ColorAxisAccessibilityOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow decimals on the color
    * axis.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) A class name that opens for styling the
    * axis by CSS, especially in Highcharts styled mode. The class name is
    * applied to group elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Gantt) Show an indicator on the axis for the current date and time. Can
    * be a boolean or a configuration object similar to xAxis.plotLines.
    */
  var currentDateIndicator: js.UndefOr[Boolean | ColorAxisCurrentDateIndicatorOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Determines how to set each data class'
    * color if no individual color is set. The default value, `tween`, computes
    * intermediate colors between `minColor` and `maxColor`. The other possible
    * value, `category`, pulls colors from the global or chart specific colors
    * array.
    */
  var dataClassColor: js.UndefOr[OptionsDataClassColorValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An array of data classes or ranges for
    * the choropleth map. If none given, the color axis is scalar and values
    * are distributed as a gradient between the minimum and maximum colors.
    */
  var dataClasses: js.UndefOr[js.Array[ColorAxisDataClassesOptions]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to end on a
    * tick. Use this option with the maxPadding option to control the axis end.
    */
  var endOnTick: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Event handlers for the axis.
    */
  var events: js.UndefOr[ColorAxisEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[ColorAxisGridOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Color of the grid lines extending from
    * the axis across the gradient.
    */
  var gridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the grid
    * lines. For possible values, see this demonstration.
    */
  var gridLineDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The width of the grid lines extending
    * from the axis across the gradient of a scalar color axis.
    */
  var gridLineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An id for the axis. This can be used
    * after render time to get a pointer to the axis object through
    * `chart.get()`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The axis labels show the number for
    * each tick.
    *
    * For more live examples on label options, see xAxis.labels in the
    * Highcharts API.
    */
  var labels: js.UndefOr[ColorAxisLabelsOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The layout of the color axis. Can be
    * `'horizontal'` or `'vertical'`. If none given, the color axis has the
    * same layout as the legend.
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The color of the line marking the axis
    * itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) If there are multiple axes on the same
    * side of the chart, the pixel margin between the axes. Defaults to 0 on
    * vertical axes, 15 on horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The triangular marker on a scalar color
    * axis that points to the value of the hovered area. To disable the marker,
    * set `marker: null`.
    */
  var marker: js.UndefOr[ColorAxisMarkerOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The maximum value of the axis in terms
    * of map point values. If `null`, the max value is automatically
    * calculated. If the `endOnTick` option is true, the max value might be
    * rounded up.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the maximum of
    * the color axis. Unless dataClasses or stops are set, the gradient ends at
    * this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var maxColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the max value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var maxPadding: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The minimum value of the axis in terms
    * of map point values. If `null`, the min value is automatically
    * calculated. If the `startOnTick` option is true, the min value might be
    * rounded down.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The color to represent the minimum of
    * the color axis. Unless dataClasses or stops are set, the gradient starts
    * at this value.
    *
    * If dataClasses are set, the color is based on minColor and maxColor
    * unless a color is set for each data class, or the dataClassColor is set.
    */
  var minColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Padding of the min value relative to
    * the length of the axis. A padding of 0.05 will make a 100px axis 5px
    * longer.
    */
  var minPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Color of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the
    * `.highcharts-minor-grid-line` class.
    */
  var minorGridLineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The dash or dot style of the minor grid
    * lines. For possible values, see this demonstration.
    */
  var minorGridLineDashStyle: js.UndefOr[DashStyleValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Width of the minor, secondary grid
    * lines.
    *
    * In styled mode, the stroke width is given in the `.highcharts-grid-line`
    * class.
    */
  var minorGridLineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Specific tick interval in axis units
    * for the minor ticks. On a linear axis, if `"auto"`, the minor tick
    * interval is calculated as a fifth of the tickInterval. If `null` or
    * `undefined`, minor ticks are not shown.
    *
    * On logarithmic axes, the unit is the power of the value. For example,
    * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
    * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
    * and 10, 10 and 100 etc.
    *
    * If user settings dictate minor ticks to become too dense, they don't make
    * sense, and will be ignored to prevent performance problems.
    */
  var minorTickInterval: js.UndefOr[Double | String | Null] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the minor tick
    * marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The position of the minor tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable minor ticks. Unless
    * minorTickInterval is set, the tick interval is calculated as a fifth of
    * the `tickInterval`.
    *
    * On a logarithmic axis, minor ticks are laid out based on a best guess,
    * attempting to enter approximately 5 minor ticks between each major tick.
    *
    * Prior to v6.0.0, ticks were unabled in auto layout by setting
    * `minorTickInterval` to `"auto"`.
    */
  var minorTicks: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) In an ordinal axis, the points are equally spaced in the
    * chart regardless of the actual time or x distance between them. This
    * means that missing data periods (e.g. nights or weekends for a stock
    * chart) will not take up space in the chart. Having `ordinal: false` will
    * show any gaps created by the `gapSize` setting proportionate to their
    * duration.
    *
    * In stock charts the X axis is ordinal by default, unless the boost module
    * is used and at least one of the series' data length exceeds the
    * boostThreshold.
    */
  var ordinal: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Additional range on the right side of the xAxis. Works
    * similar to `xAxis.maxPadding`, but value is set in milliseconds. Can be
    * set for both main `xAxis` and the navigator's `xAxis`.
    */
  var overscroll: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to reverse the axis so that the
    * highest number is closest to the origin. Defaults to `false` in a
    * horizontal legend and `true` in a vertical legend, where the smallest
    * value starts on top.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) An optional scrollbar to display on the X axis in response to
    * limiting the minimum and maximum of the axis values.
    *
    * In styled mode, all the presentational options for the scrollbar are
    * replaced by the classes `.highcharts-scrollbar-thumb`,
    * `.highcharts-scrollbar-arrow`, `.highcharts-scrollbar-button`,
    * `.highcharts-scrollbar-rifles` and `.highcharts-scrollbar-track`.
    */
  var scrollbar: js.UndefOr[ColorAxisScrollbarOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to display the colorAxis in the
    * legend.
    */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to show the last tick label.
    * Defaults to `true` on cartesian charts, and `false` on polar charts.
    */
  var showLastLabel: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A soft maximum for the axis. If the series
    * data maximum is less than this, the axis will stay at this maximum, but
    * if the series data maximum is higher, the axis will flex to show all
    * data.
    */
  var softMax: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    */
  var softMin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    */
  var startOnTick: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Color stops for the gradient of a
    * scalar color axis. Use this in cases where a linear gradient between a
    * `minColor` and `maxColor` is not sufficient. The stops is an array of
    * tuples, where the first item is a float between 0 and 1 assigning the
    * relative position in the gradient, and the second item is the color.
    */
  var stops: js.UndefOr[js.Array[js.Tuple2[Double, ColorString]]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The amount of ticks to draw on the axis.
    * This opens up for aligning the ticks of multiple charts or panes within a
    * chart. This option overrides the `tickPixelInterval` option.
    *
    * This option only has an effect on linear axes. Datetime, logarithmic or
    * category axes are not affected.
    */
  var tickAmount: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The interval of the tick marks in axis
    * units. When `null`, the tick interval is computed to approximately follow
    * the `tickPixelInterval`.
    */
  var tickInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The pixel length of the main tick marks
    * on the color axis.
    */
  var tickLength: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) If tickInterval is `null` this option
    * sets the approximate pixel interval of the tick marks.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The position of the major tick marks
    * relative to the axis line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) A callback function returning array
    * defining where the ticks are laid out on the axis. This overrides the
    * default behaviour of tickPixelInterval and tickInterval. The automatic
    * tick positions are accessible through `this.tickPositions` and can be
    * modified by the callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) An array defining where the ticks are
    * laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The pixel width of the major tick
    * marks. Defaults to 0 on category axes, otherwise 1.
    *
    * In styled mode, the stroke width is given in the `.highcharts-tick`
    * class, but in order for the element to be generated on category axes, the
    * option must be explicitly set to 1.
    */
  var tickWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Gantt) For categorized axes only. If `on` the tick mark is
    * placed in the center of the category, if `between` the tick mark is
    * placed between categories. The default is `between` if the `tickInterval`
    * is 1, else `on`.
    */
  var tickmarkPlacement: js.UndefOr[OptionsTickmarkPlacementValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The type of interpolation to use for
    * the color axis. Can be `linear` or `logarithmic`.
    */
  var `type`: js.UndefOr[ColorAxisTypeValue] = js.native
  /**
    * (Highcharts, Gantt) Applies only when the axis `type` is `category`. When
    * `uniqueNames` is true, points are placed on the X axis according to their
    * names. If the same point name is repeated in the same or another series,
    * the point is placed on the same X position as other points of the same
    * name. When `uniqueNames` is false, the points are laid out in increasing
    * X positions regardless of their names, and the X axis category will take
    * the name of the last point in each position.
    */
  var uniqueNames: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Datetime axis only. An array determining
    * what time intervals the ticks are allowed to fall on. Each array item is
    * an array where the first value is the time unit and the second value
    * another array of allowed multiples. Defaults to:
    *
    *  (see online documentation for example)
    */
  var units: js.UndefOr[js.Array[js.Tuple2[String, js.Array[Double] | Null]]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether axis, including axis title, line,
    * ticks and labels, should be visible.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ColorAxisOptions {
  @scala.inline
  def apply(): ColorAxisOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisOptions]
  }
  @scala.inline
  implicit class ColorAxisOptionsOps[Self <: ColorAxisOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | ColorAxisAccessibilityOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDecimals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDecimals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDecimals")(js.undefined)
        ret
    }
    @scala.inline
    def withCeiling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceiling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCeiling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ceiling")(js.undefined)
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
    def withCurrentDateIndicator(value: Boolean | ColorAxisCurrentDateIndicatorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDateIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDateIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDateIndicator")(js.undefined)
        ret
    }
    @scala.inline
    def withDataClassColor(value: OptionsDataClassColorValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClassColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataClassColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClassColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDataClasses(value: js.Array[ColorAxisDataClassesOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withEndOnTick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOnTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOnTick")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: ColorAxisEventsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFloor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floor")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: ColorAxisGridOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineDashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGridLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGridZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ColorAxisLabelsOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLineColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: ColorAxisMarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLineColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLineDashStyle(value: DashStyleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineDashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLineDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineDashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorGridLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorGridLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorGridLineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickInterval(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickIntervalNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickInterval")(null)
        ret
    }
    @scala.inline
    def withMinorTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickPosition(value: OptionsMinorTickPositionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTicks")(js.undefined)
        ret
    }
    @scala.inline
    def withOrdinal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrdinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(js.undefined)
        ret
    }
    @scala.inline
    def withOverscroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: ColorAxisScrollbarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFirstLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFirstLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFirstLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInLegend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInLegend")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLastLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLastLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLastLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softMax")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softMin")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOnTick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOnTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOnTick")(js.undefined)
        ret
    }
    @scala.inline
    def withStops(value: js.Array[js.Tuple2[Double, ColorString]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(js.undefined)
        ret
    }
    @scala.inline
    def withTickAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTickColor(value: ColorString | GradientColorObject | PatternObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTickLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPixelInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPixelInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPixelInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPixelInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPosition(value: OptionsTickPositionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPositioner(value: AxisTickPositionerCallbackFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPositioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPositioner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPositioner")(js.undefined)
        ret
    }
    @scala.inline
    def withTickPositions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withTickWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTickmarkPlacement(value: OptionsTickmarkPlacementValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmarkPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickmarkPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmarkPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ColorAxisTypeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueNames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueNames")(js.undefined)
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
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

