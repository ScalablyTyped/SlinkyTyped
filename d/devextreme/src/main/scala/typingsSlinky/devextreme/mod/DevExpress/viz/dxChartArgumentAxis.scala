package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorOpacity
import typingsSlinky.devextreme.AnonLength
import typingsSlinky.devextreme.AnonLine
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.betweenLabels
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.crossLabels
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.shift
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartArgumentAxis extends dxChartCommonAxisSettings {
  /** Aggregates series points that fall into the same category. */
  var aggregateByCategory: js.UndefOr[Boolean] = js.undefined
  /** Specifies the length of aggregation intervals in pixels. Does not apply if aggregateByCategory is true. May be ignored in favor of the aggregationInterval option. */
  var aggregationGroupWidth: js.UndefOr[Double] = js.undefined
  /** Specifies the length of aggregation intervals in axis units. Applies only to axes of continuous and logarithmic types. */
  var aggregationInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Casts arguments to a specified data type. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** Declares a scale break collection. Applies only if the axis' type is "continuous" or "logarithmic". */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.undefined
  /** Specifies the order of categories on an axis of the "discrete" type. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  /** Specifies the appearance of those constant lines that belong to the argument axis. */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisConstantLineStyle] = js.undefined
  /** Declares a collection of constant lines belonging to the argument axis. */
  var constantLines: js.UndefOr[js.Array[dxChartArgumentAxisConstantLines]] = js.undefined
  /** Dates to be excluded from the axis when workdaysOnly is true. */
  var holidays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  /** Specifies chart elements to be highlighted when a user points to an axis label. */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.undefined
  /** Configures the labels of the argument axis. */
  @JSName("label")
  var label_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisLabel] = js.undefined
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** Specifies the value to be raised to a power when generating ticks for an axis of the "logarithmic" type. */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** @deprecated Use the argumentAxis.visualRange option instead. */
  /** Coupled with the min option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var max: js.UndefOr[Double | js.Date | String] = js.undefined
  /** @deprecated Use the argumentAxis.visualRange option instead. */
  /** Coupled with the max option, focuses the widget on a specific chart segment. Applies only to the axes of the "continuous" and "logarithmic" type. */
  var min: js.UndefOr[Double | js.Date | String] = js.undefined
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Specifies how many minor ticks to place between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** Specifies the interval between minor ticks. Applies only to the axes of the "continuous" type. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Relocates the argument axis. */
  var position: js.UndefOr[bottom | left | right | top] = js.undefined
  /** Dates to be included on the axis when workdaysOnly is true. */
  var singleWorkdays: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  /** Declares a collection of strips belonging to the argument axis. */
  var strips: js.UndefOr[js.Array[dxChartArgumentAxisStrips]] = js.undefined
  /** Specifies the interval between major ticks. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Configures the axis title. */
  @JSName("title")
  var title_dxChartArgumentAxis: js.UndefOr[dxChartArgumentAxisTitle] = js.undefined
  /** Specifies the type of the argument axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  /** Specifies how the axis's visual range should behave when chart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.undefined
  /** Defines the range where the axis can be zoomed and panned. */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  /** Specifies which days are workdays. The array can contain values from 0 (Sunday) to 6 (Saturday). Applies only if workdaysOnly is true. */
  var workWeek: js.UndefOr[js.Array[Double]] = js.undefined
  /** Leaves only workdays on the axis: the work week days plus single workdays minus holidays. Applies only if the axis' argumentType is "datetime". */
  var workdaysOnly: js.UndefOr[Boolean] = js.undefined
}

object dxChartArgumentAxis {
  @scala.inline
  def apply(
    aggregateByCategory: js.UndefOr[Boolean] = js.undefined,
    aggregationGroupWidth: Int | Double = null,
    aggregationInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    argumentType: datetime | numeric | string_ = null,
    axisDivisionFactor: Int | Double = null,
    breakStyle: AnonLine = null,
    breaks: js.Array[ScaleBreak] = null,
    categories: js.Array[Double | String | js.Date] = null,
    color: String = null,
    constantLineStyle: dxChartArgumentAxisConstantLineStyle = null,
    constantLines: js.Array[dxChartArgumentAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    holidays: js.Array[js.Date | Double | String] = null,
    hoverMode: allArgumentPoints | none = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxChartArgumentAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    max: Double | js.Date | String = null,
    maxValueMargin: Int | Double = null,
    min: Double | js.Date | String = null,
    minValueMargin: Int | Double = null,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: AnonLength = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: Int | Double = null,
    placeholderSize: Int | Double = null,
    position: bottom | left | right | top = null,
    singleWorkdays: js.Array[js.Date | Double | String] = null,
    stripStyle: dxChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxChartArgumentAxisStrips] = null,
    tick: AnonLength = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    title: dxChartArgumentAxisTitle = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | js.Date]) = null,
    visualRangeUpdateMode: auto | keep | reset | shift = null,
    wholeRange: VizRange | (js.Array[Double | String | js.Date]) = null,
    width: Int | Double = null,
    workWeek: js.Array[Double] = null,
    workdaysOnly: js.UndefOr[Boolean] = js.undefined
  ): dxChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aggregateByCategory)) __obj.updateDynamic("aggregateByCategory")(aggregateByCategory.asInstanceOf[js.Any])
    if (aggregationGroupWidth != null) __obj.updateDynamic("aggregationGroupWidth")(aggregationGroupWidth.asInstanceOf[js.Any])
    if (aggregationInterval != null) __obj.updateDynamic("aggregationInterval")(aggregationInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (argumentType != null) __obj.updateDynamic("argumentType")(argumentType.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (breakStyle != null) __obj.updateDynamic("breakStyle")(breakStyle.asInstanceOf[js.Any])
    if (breaks != null) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (holidays != null) __obj.updateDynamic("holidays")(holidays.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (placeholderSize != null) __obj.updateDynamic("placeholderSize")(placeholderSize.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (singleWorkdays != null) __obj.updateDynamic("singleWorkdays")(singleWorkdays.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(workdaysOnly)) __obj.updateDynamic("workdaysOnly")(workdaysOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartArgumentAxis]
  }
}

