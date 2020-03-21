package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorOpacity
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.betweenLabels
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.crossLabels
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.keep
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.reset
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxis extends dxPolarChartCommonAxisSettings {
  /** Specifies a coefficient for dividing the value axis. */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** Specifies the order in which discrete values are arranged on the value axis. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  /** Defines an array of the value axis constant lines. */
  var constantLines: js.UndefOr[js.Array[dxPolarChartValueAxisConstantLines]] = js.undefined
  /** Specifies options for value axis labels. */
  @JSName("label")
  var label_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisLabel] = js.undefined
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** Specifies the value to be raised to a power when generating ticks for a logarithmic axis. */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** Specifies a coefficient that determines the spacing between the maximum series point and the axis. */
  var maxValueMargin: js.UndefOr[Double] = js.undefined
  /** Specifies a coefficient that determines the spacing between the minimum series point and the axis. */
  var minValueMargin: js.UndefOr[Double] = js.undefined
  /** Specifies the minimum length of the visual range. */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Specifies the number of minor ticks between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** Specifies the interval between minor ticks. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Specifies whether or not to indicate a zero value on the value axis. */
  var showZero: js.UndefOr[Boolean] = js.undefined
  /** Specifies options for value axis strips. */
  var strips: js.UndefOr[js.Array[dxPolarChartValueAxisStrips]] = js.undefined
  /** Specifies an interval between axis ticks/grid lines. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** An object defining the configuration options for axis ticks. */
  @JSName("tick")
  var tick_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisTick] = js.undefined
  /** Specifies the required type of the value axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
  /** Indicates whether to display series with indents from axis boundaries. */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the desired type of axis values. */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** Defines the axis' displayed range. Cannot be wider than the wholeRange. */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
  /** Specifies how the axis's visual range should behave when the PolarChart data is updated. */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset] = js.undefined
  /** Defines the range where the axis can be zoomed. */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | js.Date])] = js.undefined
}

object dxPolarChartValueAxis {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    axisDivisionFactor: Int | Double = null,
    categories: js.Array[Double | String | js.Date] = null,
    color: String = null,
    constantLineStyle: dxPolarChartCommonAxisSettingsConstantLineStyle = null,
    constantLines: js.Array[dxPolarChartValueAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartValueAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    maxValueMargin: Int | Double = null,
    minValueMargin: Int | Double = null,
    minVisualRangeLength: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: dxPolarChartCommonAxisSettingsMinorTick = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: Int | Double = null,
    showZero: js.UndefOr[Boolean] = js.undefined,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxPolarChartValueAxisStrips] = null,
    tick: dxPolarChartValueAxisTick = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    `type`: continuous | discrete | logarithmic = null,
    valueMarginsEnabled: js.UndefOr[Boolean] = js.undefined,
    valueType: datetime | numeric | string_ = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visualRange: VizRange | (js.Array[Double | String | js.Date]) = null,
    visualRangeUpdateMode: auto | keep | reset = null,
    wholeRange: VizRange | (js.Array[Double | String | js.Date]) = null,
    width: Int | Double = null
  ): dxPolarChartValueAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (maxValueMargin != null) __obj.updateDynamic("maxValueMargin")(maxValueMargin.asInstanceOf[js.Any])
    if (minValueMargin != null) __obj.updateDynamic("minValueMargin")(minValueMargin.asInstanceOf[js.Any])
    if (minVisualRangeLength != null) __obj.updateDynamic("minVisualRangeLength")(minVisualRangeLength.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueMarginsEnabled)) __obj.updateDynamic("valueMarginsEnabled")(valueMarginsEnabled.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visualRange != null) __obj.updateDynamic("visualRange")(visualRange.asInstanceOf[js.Any])
    if (visualRangeUpdateMode != null) __obj.updateDynamic("visualRangeUpdateMode")(visualRangeUpdateMode.asInstanceOf[js.Any])
    if (wholeRange != null) __obj.updateDynamic("wholeRange")(wholeRange.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxis]
  }
}

