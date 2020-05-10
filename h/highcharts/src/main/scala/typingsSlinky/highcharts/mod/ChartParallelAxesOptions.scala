package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartParallelAxesOptions extends js.Object {
  /**
    * (Highcharts) Accessibility options for an axis. Requires the
    * accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | ChartParallelAxesAccessibilityOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) When using multiple axis, the ticks of two
    * or more opposite axes will automatically be aligned by adding ticks to
    * the axis or axes with the least ticks, as if `tickAmount` were specified.
    *
    * This can be prevented by setting `alignTicks` to false. If the grid lines
    * look messy, it's a good idea to hide them for the secondary axis by
    * setting `gridLineWidth` to 0.
    *
    * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
    * the `alignTicks ` will be disabled for the Axis.
    *
    * Disabled for logarithmic axes.
    */
  var alignTicks: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to allow decimals in this axis' ticks. When counting
    * integers, like persons or hits on a web page, decimals should be avoided
    * in the labels.
    */
  var allowDecimals: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Gantt) If categories are present for the xAxis, names are
    * used instead of numbers for that axis. Since Highcharts 3.0, categories
    * can also be extracted by giving each point a name and setting axis type
    * to `category`. However, if you have multiple series, best practice
    * remains defining the `categories` array.
    *
    * Example:
    *
    *  (see online documentation for example)
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The highest allowed value for
    * automatically computed axis extremes.
    */
  var ceiling: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) A class name that opens for styling the axis by CSS,
    * especially in Highcharts styled mode. The class name is applied to group
    * elements for the grid, axis elements and labels.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Configure a crosshair that follows either the mouse pointer
    * or the hovered point.
    *
    * In styled mode, the crosshairs are styled in the `.highcharts-crosshair`,
    * `.highcharts-crosshair-thin` or `.highcharts-xaxis-category` classes.
    */
  var crosshair: js.UndefOr[Boolean | ChartParallelAxesCrosshairOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For a datetime axis, the scale will
    * automatically adjust to the appropriate unit. This member gives the
    * default string representations used for each unit. For intermediate
    * values, different units may be used, for example the `day` unit can be
    * used on midnight and `hour` unit be used for intermediate values on the
    * same axis. For an overview of the replacement codes, see dateFormat.
    * Defaults to:
    *
    *  (see online documentation for example)
    */
  var dateTimeLabelFormats: js.UndefOr[ChartParallelAxesDateTimeLabelFormatsOptions] = js.native
  /**
    * (Highcharts) Whether to force the axis to end on a tick. Use this option
    * with the `maxPadding` option to control the axis end.
    */
  var endOnTick: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Event handlers for the axis.
    */
  var events: js.UndefOr[ChartParallelAxesEventsOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The lowest allowed value for automatically
    * computed axis extremes.
    */
  var floor: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set grid options for the axis labels. Requires Highcharts Gantt.
    */
  var grid: js.UndefOr[ChartParallelAxesGridOptions] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The Z index of the grid lines.
    */
  var gridZIndex: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The height of the Y axis. If it's a number, it is interpreted
    * as pixels.
    *
    * Since Highstock 2: If it's a percentage string, it is interpreted as
    * percentages of the total plot height.
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts) The axis labels show the number or category for each tick.
    */
  var labels: js.UndefOr[ChartParallelAxesLabelsOptions] = js.native
  /**
    * (Highcharts) The color of the line marking the axis itself.
    *
    * In styled mode, the line stroke is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The width of the line marking the axis itself.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-line`
    * or `.highcharts-xaxis-line` class.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Index of another axis that this axis is
    * linked to. When an axis is linked to a master axis, it will take the same
    * extremes as the master, but as assigned by min or max or by setExtremes.
    * It can be used to show additional info, or to ease reading the chart by
    * duplicating the scales.
    */
  var linkedTo: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) If there are multiple axes on the same side of the chart,
    * the pixel margin between the axes. Defaults to 0 on vertical axes, 15 on
    * horizontal axes.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The maximum value of the axis. If `null`, the max value is
    * automatically calculated.
    *
    * If the endOnTick option is true, the `max` value might be rounded up.
    *
    * If a tickAmount is set, the axis may be extended beyond the set max in
    * order to reach the given number of ticks. The same may happen in a chart
    * with multiple axes, determined by chart. alignTicks, where a `tickAmount`
    * is applied internally.
    */
  var max: js.UndefOr[Double | Null] = js.native
  /**
    * (Highstock) Maximal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.
    */
  var maxLength: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Padding of the max value relative to the
    * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the highest data value to appear on
    * the edge of the plot area. When the axis' `max` option is set or a max
    * extreme is set using `axis.setExtremes()`, the maxPadding will be
    * ignored.
    *
    * Also the `softThreshold` option takes precedence over `maxPadding`, so if
    * the data is tangent to the threshold, `maxPadding` may not apply unless
    * `softThreshold` is set to false.
    */
  var maxPadding: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) Maximum range which can be set using the navigator's
    * handles. Opposite of xAxis.minRange.
    */
  var maxRange: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The minimum value of the axis. If `null` the min value is
    * automatically calculated.
    *
    * If the startOnTick option is true (default), the `min` value might be
    * rounded down.
    *
    * The automatically calculated minimum value is also affected by floor,
    * softMin, minPadding, minRange as well as series.threshold and
    * series.softThreshold.
    */
  var min: js.UndefOr[Double | Null] = js.native
  /**
    * (Highstock) Minimal size of a resizable axis. Could be set as a percent
    * of plot area or pixel size.
    */
  var minLength: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Padding of the min value relative to the
    * length of the axis. A padding of 0.05 will make a 100px axis 5px longer.
    * This is useful when you don't want the lowest data value to appear on the
    * edge of the plot area. When the axis' `min` option is set or a max
    * extreme is set using `axis.setExtremes()`, the maxPadding will be
    * ignored.
    *
    * Also the `softThreshold` option takes precedence over `minPadding`, so if
    * the data is tangent to the threshold, `minPadding` may not apply unless
    * `softThreshold` is set to false.
    */
  var minPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The minimum range to display on this axis. The entire axis
    * will not be allowed to span over a smaller interval than this. For
    * example, for a datetime axis the main unit is milliseconds. If minRange
    * is set to 3600000, you can't zoom in more than to one hour.
    *
    * The default minRange for the x axis is five times the smallest interval
    * between any of the data points.
    *
    * On a logarithmic axis, the unit for the minimum range is the power. So a
    * minRange of 1 means that the axis can be zoomed to 10-100, 100-1000,
    * 1000-10000 etc.
    *
    * Note that the `minPadding`, `maxPadding`, `startOnTick` and `endOnTick`
    * settings also affect how the extremes of the axis are computed.
    */
  var minRange: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The minimum tick interval allowed in axis values. For
    * example on zooming in on an axis with daily data, this can be used to
    * prevent the axis from showing hours. Defaults to the closest distance
    * between two points on the axis.
    */
  var minTickInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Color for the minor tick marks.
    */
  var minorTickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) Specific tick interval in axis units for the minor ticks. On
    * a linear axis, if `"auto"`, the minor tick interval is calculated as a
    * fifth of the tickInterval. If `null` or `undefined`, minor ticks are not
    * shown.
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
    * (Highcharts) The pixel length of the minor tick marks.
    */
  var minorTickLength: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The position of the minor tick marks relative to the axis
    * line. Can be one of `inside` and `outside`.
    */
  var minorTickPosition: js.UndefOr[OptionsMinorTickPositionValue] = js.native
  /**
    * (Highcharts) The pixel width of the minor tick mark.
    */
  var minorTickWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Enable or disable minor ticks. Unless minorTickInterval is
    * set, the tick interval is calculated as a fifth of the `tickInterval`.
    *
    * On a logarithmic axis, minor ticks are laid out based on a best guess,
    * attempting to enter approximately 5 minor ticks between each major tick.
    *
    * Prior to v6.0.0, ticks were unabled in auto layout by setting
    * `minorTickInterval` to `"auto"`.
    */
  var minorTicks: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) The distance in pixels from the plot area to the axis line.
    * A positive offset moves the axis with it's line, labels and ticks away
    * from the plot area. This is typically used when two or more axes are
    * displayed on the same side of the plot. With multiple axes the offset is
    * dynamically adjusted to avoid collision, this can be overridden by
    * setting offset explicitly.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Highcharts, Gantt) Whether to display the axis on the
    * opposite side of the normal. The normal is on the left side for vertical
    * axes and bottom for horizontal, so the opposite sides will be right and
    * top respectively. This is typically used with dual or multiple axes.
    */
  var opposite: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Refers to the index in the panes array. Used for circular
    * gauges and polar charts. When the option is not set then first pane will
    * be used.
    */
  var pane: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The zoomed range to display when only defining one or none of
    * `min` or `max`. For example, to show the latest month, a range of one
    * month can be set.
    */
  var range: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Options for axis resizing. It adds a thick line between panes
    * which the user can drag in order to resize the panes.
    */
  var resize: js.UndefOr[ChartParallelAxesResizeOptions] = js.native
  /**
    * (Highcharts) Whether to reverse the axis so that the highest number is
    * closest to the origin.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock) If `true`, the first series in a stack will be
    * drawn on top in a positive, non-reversed Y axis. If `false`, the first
    * series is in the base of the stack.
    */
  var reversedStacks: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to show the axis line and title when the axis has no
    * data.
    */
  var showEmpty: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to show the first tick label.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.native
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
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMax: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A soft minimum for the axis. If the series
    * data minimum is greater than this, the axis will stay at this minimum,
    * but if the series data minimum is lower, the axis will flex to show all
    * data.
    *
    * **Note**: The series.softThreshold option takes precedence over this
    * option.
    */
  var softMin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For datetime axes, this decides where to
    * put the tick between weeks. 0 = Sunday, 1 = Monday.
    */
  var startOfWeek: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Whether to force the axis to start on a
    * tick. Use this option with the `maxPadding` option to control the axis
    * start.
    */
  var startOnTick: js.UndefOr[Boolean] = js.native
  /**
    * (Gantt) For vertical axes only. Setting the static scale ensures that
    * each tick unit is translated into a fixed pixel height. For example,
    * setting the static scale to 24 results in each Y axis category taking up
    * 24 pixels, and the height of the chart adjusts. Adding or removing items
    * will make the chart resize.
    */
  var staticScale: js.UndefOr[Double] = js.native
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
    * (Highcharts) Color for the main tick marks.
    *
    * In styled mode, the stroke is given in the `.highcharts-tick` class.
    */
  var tickColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts) The interval of the tick marks in axis units. When
    * `undefined`, the tick interval is computed to approximately follow the
    * tickPixelInterval on linear and datetime axes. On categorized axes, a
    * `undefined` tickInterval will default to 1, one category. Note that
    * datetime axes are based on milliseconds, so for example an interval of
    * one day is expressed as `24 * 3600 * 1000`.
    *
    * On logarithmic axes, the tickInterval is based on powers, so a
    * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
    * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
    * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
    * etc.
    *
    * If the tickInterval is too dense for labels to be drawn, Highcharts may
    * remove ticks.
    *
    * If the chart has multiple axes, the alignTicks option may interfere with
    * the `tickInterval` setting.
    */
  var tickInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The pixel length of the main tick marks.
    */
  var tickLength: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) If tickInterval is `null` this option sets the approximate
    * pixel interval of the tick marks. Not applicable to categorized axis.
    *
    * The tick interval is also influenced by the minTickInterval option, that,
    * by default prevents ticks from being denser than the data points.
    */
  var tickPixelInterval: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) The position of the major tick marks relative to the axis
    * line. Can be one of `inside` and `outside`.
    */
  var tickPosition: js.UndefOr[OptionsTickPositionValue] = js.native
  /**
    * (Highcharts) A callback function returning array defining where the ticks
    * are laid out on the axis. This overrides the default behaviour of
    * tickPixelInterval and tickInterval. The automatic tick positions are
    * accessible through `this.tickPositions` and can be modified by the
    * callback.
    */
  var tickPositioner: js.UndefOr[AxisTickPositionerCallbackFunction] = js.native
  /**
    * (Highcharts) An array defining where the ticks are laid out on the axis.
    * This overrides the default behaviour of tickPixelInterval and
    * tickInterval.
    */
  var tickPositions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The pixel width of the major tick marks.
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
    * (Highcharts) Titles for yAxes are taken from xAxis.categories. All
    * options for `xAxis.labels` applies to parallel coordinates titles. For
    * example, to style categories, use xAxis.labels.style.
    */
  var title: js.UndefOr[ChartParallelAxesTitleOptions] = js.native
  /**
    * (Highcharts) Parallel coordinates only. Format that will be used for
    * point.y and available in tooltip.pointFormat as `{point.formattedValue}`.
    * If not set, `{point.formattedValue}` will use other options, in this
    * order:
    *
    * 1. yAxis.labels.format will be used if set
    *
    * 2. If yAxis is a category, then category name will be displayed
    *
    * 3. If yAxis is a datetime, then value will use the same format as yAxis
    * labels
    *
    * 4. If yAxis is linear/logarithmic type, then simple value will be used
    */
  var tooltipValueFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) The top position of the Y axis. If it's a number, it is
    * interpreted as pixel position relative to the chart.
    *
    * Since Highstock 2: If it's a percentage string, it is interpreted as
    * percentages of the plot height, offset from plot area top.
    */
  var top: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Gantt) The type of axis. Can be one of `linear`,
    * `logarithmic`, `datetime`, `category` or `treegrid`. Defaults to
    * `treegrid` for Gantt charts, `linear` for other chart types.
    *
    * In a datetime axis, the numbers are given in milliseconds, and tick marks
    * are placed on appropriate values, like full hours or days. In a category
    * or treegrid axis, the point names of the chart's series are used for
    * categories, if a categories array is not defined.
    */
  var `type`: js.UndefOr[AxisTypeValue] = js.native
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
  /**
    * (Highcharts) Whether to zoom axis. If `chart.zoomType` is set, the option
    * allows to disable zooming on an individual axis.
    */
  var zoomEnabled: js.UndefOr[Boolean] = js.native
}

object ChartParallelAxesOptions {
  @scala.inline
  def apply(): ChartParallelAxesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartParallelAxesOptions]
  }
  @scala.inline
  implicit class ChartParallelAxesOptionsOps[Self <: ChartParallelAxesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessibility(value: js.Object | ChartParallelAxesAccessibilityOptions): Self = {
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
    def withAlignTicks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTicks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignTicks")(js.undefined)
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
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
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
    def withCrosshair(value: Boolean | ChartParallelAxesCrosshairOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrosshair: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crosshair")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTimeLabelFormats(value: ChartParallelAxesDateTimeLabelFormatsOptions): Self = {
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
    def withEvents(value: ChartParallelAxesEventsOptions): Self = {
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
    def withGrid(value: ChartParallelAxesGridOptions): Self = {
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
    def withHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ChartParallelAxesLabelsOptions): Self = {
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
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedTo")(js.undefined)
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
    def withMaxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(null)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
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
    def withMinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(null)
        ret
    }
    @scala.inline
    def withMinLength(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
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
    def withMinRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRange")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTickInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTickInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTickInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTickInterval")(js.undefined)
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOpposite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opposite")(js.undefined)
        ret
    }
    @scala.inline
    def withPane(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pane")(js.undefined)
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
    def withResize(value: ChartParallelAxesResizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
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
    def withReversedStacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedStacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReversedStacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversedStacks")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEmpty")(js.undefined)
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
    def withStaticScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticScale")(js.undefined)
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
    def withTitle(value: ChartParallelAxesTitleOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipValueFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipValueFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipValueFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipValueFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: AxisTypeValue): Self = {
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
    @scala.inline
    def withZoomEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnabled")(js.undefined)
        ret
    }
  }
  
}

