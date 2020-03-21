package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.AnonColorOpacity
import typingsSlinky.devextreme.devextremeStrings.allArgumentPoints
import typingsSlinky.devextreme.devextremeStrings.betweenLabels
import typingsSlinky.devextreme.devextremeStrings.continuous
import typingsSlinky.devextreme.devextremeStrings.crossLabels
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.logarithmic
import typingsSlinky.devextreme.devextremeStrings.millisecond
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.numeric
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.devextremeStrings.week
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxis extends dxPolarChartCommonAxisSettings {
  /** Specifies the desired type of axis values. */
  var argumentType: js.UndefOr[datetime | numeric | string_] = js.undefined
  /** Specifies the minimum distance between two neighboring major ticks in pixels. Applies only to the axes of the "continuous" and "logarithmic" types. */
  var axisDivisionFactor: js.UndefOr[Double] = js.undefined
  /** Specifies the order in which arguments (categories) are arranged on the discrete argument axis. */
  var categories: js.UndefOr[js.Array[Double | String | js.Date]] = js.undefined
  /** Defines an array of the argument axis constant lines. */
  var constantLines: js.UndefOr[js.Array[dxPolarChartArgumentAxisConstantLines]] = js.undefined
  /** Specifies whether or not to display the first point at the angle specified by the startAngle option. */
  var firstPointOnStartAngle: js.UndefOr[Boolean] = js.undefined
  /** Specifies the elements that will be highlighted when the argument axis is hovered over. */
  var hoverMode: js.UndefOr[allArgumentPoints | none] = js.undefined
  /** Specifies options for argument axis labels. */
  @JSName("label")
  var label_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisLabel] = js.undefined
  /** Specifies a value used to calculate the range on a logarithmic axis within which the axis should be linear. Applies only if the data source contains negative values or zeroes. */
  var linearThreshold: js.UndefOr[Double] = js.undefined
  /** Specifies the value to be raised to a power when generating ticks for a logarithmic axis. */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /** Specifies the number of minor ticks between two neighboring major ticks. */
  var minorTickCount: js.UndefOr[Double] = js.undefined
  /** Specifies the interval between minor ticks. */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** Specifies the options of the minor ticks. */
  @JSName("minorTick")
  var minorTick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisMinorTick] = js.undefined
  /** Specifies the value to be used as the origin for the argument axis. */
  var originValue: js.UndefOr[Double] = js.undefined
  /** Specifies the period of the argument values in the data source. */
  var period: js.UndefOr[Double] = js.undefined
  /** Specifies the angle in arc degrees to which the argument axis should be rotated. The positive values rotate the axis clockwise. */
  var startAngle: js.UndefOr[Double] = js.undefined
  /** Specifies options for argument axis strips. */
  var strips: js.UndefOr[js.Array[dxPolarChartArgumentAxisStrips]] = js.undefined
  /** Specifies an interval between axis ticks/grid lines. */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.undefined
  /** An object defining the configuration options for axis ticks. */
  @JSName("tick")
  var tick_dxPolarChartArgumentAxis: js.UndefOr[dxPolarChartArgumentAxisTick] = js.undefined
  /** Specifies the required type of the argument axis. */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.undefined
}

object dxPolarChartArgumentAxis {
  @scala.inline
  def apply(
    allowDecimals: js.UndefOr[Boolean] = js.undefined,
    argumentType: datetime | numeric | string_ = null,
    axisDivisionFactor: Int | Double = null,
    categories: js.Array[Double | String | js.Date] = null,
    color: String = null,
    constantLineStyle: dxPolarChartCommonAxisSettingsConstantLineStyle = null,
    constantLines: js.Array[dxPolarChartArgumentAxisConstantLines] = null,
    discreteAxisDivisionMode: betweenLabels | crossLabels = null,
    endOnTick: js.UndefOr[Boolean] = js.undefined,
    firstPointOnStartAngle: js.UndefOr[Boolean] = js.undefined,
    grid: AnonColorOpacity = null,
    hoverMode: allArgumentPoints | none = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: dxPolarChartArgumentAxisLabel = null,
    linearThreshold: Int | Double = null,
    logarithmBase: Int | Double = null,
    minorGrid: AnonColorOpacity = null,
    minorTick: dxPolarChartArgumentAxisMinorTick = null,
    minorTickCount: Int | Double = null,
    minorTickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    opacity: Int | Double = null,
    originValue: Int | Double = null,
    period: Int | Double = null,
    startAngle: Int | Double = null,
    stripStyle: dxPolarChartCommonAxisSettingsStripStyle = null,
    strips: js.Array[dxPolarChartArgumentAxisStrips] = null,
    tick: dxPolarChartArgumentAxisTick = null,
    tickInterval: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year = null,
    `type`: continuous | discrete | logarithmic = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxPolarChartArgumentAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDecimals)) __obj.updateDynamic("allowDecimals")(allowDecimals.asInstanceOf[js.Any])
    if (argumentType != null) __obj.updateDynamic("argumentType")(argumentType.asInstanceOf[js.Any])
    if (axisDivisionFactor != null) __obj.updateDynamic("axisDivisionFactor")(axisDivisionFactor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (constantLineStyle != null) __obj.updateDynamic("constantLineStyle")(constantLineStyle.asInstanceOf[js.Any])
    if (constantLines != null) __obj.updateDynamic("constantLines")(constantLines.asInstanceOf[js.Any])
    if (discreteAxisDivisionMode != null) __obj.updateDynamic("discreteAxisDivisionMode")(discreteAxisDivisionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(endOnTick)) __obj.updateDynamic("endOnTick")(endOnTick.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPointOnStartAngle)) __obj.updateDynamic("firstPointOnStartAngle")(firstPointOnStartAngle.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hoverMode != null) __obj.updateDynamic("hoverMode")(hoverMode.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (linearThreshold != null) __obj.updateDynamic("linearThreshold")(linearThreshold.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (minorGrid != null) __obj.updateDynamic("minorGrid")(minorGrid.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTickInterval != null) __obj.updateDynamic("minorTickInterval")(minorTickInterval.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originValue != null) __obj.updateDynamic("originValue")(originValue.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (stripStyle != null) __obj.updateDynamic("stripStyle")(stripStyle.asInstanceOf[js.Any])
    if (strips != null) __obj.updateDynamic("strips")(strips.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(tick.asInstanceOf[js.Any])
    if (tickInterval != null) __obj.updateDynamic("tickInterval")(tickInterval.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxis]
  }
}

