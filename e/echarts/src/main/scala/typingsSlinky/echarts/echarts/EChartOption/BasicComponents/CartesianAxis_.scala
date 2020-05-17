package typingsSlinky.echarts.echarts.EChartOption.BasicComponents

import typingsSlinky.echarts.anon.Max
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.DataObject
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Label
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorSplitLine
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorTick
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitArea
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitLine
import typingsSlinky.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Tick
import typingsSlinky.echarts.echarts.EChartOption.TextStyleWithRich
import typingsSlinky.echarts.echartsStrings.center
import typingsSlinky.echarts.echartsStrings.end
import typingsSlinky.echarts.echartsStrings.middle
import typingsSlinky.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CartesianAxis_ extends js.Object {
  /**
    * Settings related to axis label.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisLabel
    */
  var axisLabel: js.UndefOr[Label] = js.native
  /**
    * Settings related to axis line.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisLine
    */
  var axisLine: js.UndefOr[Line] = js.native
  /**
    * axisPointer settings on the axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisPointer
    */
  var axisPointer: js.UndefOr[Pointer] = js.native
  /**
    * Settings related to axis tick.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisTick
    */
  var axisTick: js.UndefOr[Tick] = js.native
  /**
    * The boundary gap on both sides of a coordinate axis.
    * The setting and behavior of category axes and non-category axes are
    * different. The `boundaryGap` of category axis can be set to either
    * `true` or `false`. Default value is set to be `true`, in which case
    * `axisTick` is served only as a separation line, and labels and data
    * appear only in the center part of two axis ticks, which is called
    * band. For non-category axis, including time, numerical value, and
    * log axes, `boundaryGap` is an array of two values, representing the
    * spanning range between minimum and maximum value.
    * The value can be set in numeric value or relative percentage,
    * which becomes invalid after setting `min` and `max`.
    *
    * @example
    * boundaryGap: ['20%', '20%']
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.boundaryGap
    */
  var boundaryGap: js.UndefOr[Boolean | (js.Array[String | Double])] = js.native
  /**
    * Category data, available in type: `'category'` axis.
    * If `type` is not specified, but `axis.data` is specified,
    * the `type` is auto set as `'category'`.
    * If type is specified as `'category'`,
    * but axis.data is not specified, `axis.data` will be
    * auto collected from `series.data`.
    * It brings convenience, but we should notice that
    * `axis.data` provides then value range of the `'category'` axis.
    * If it is auto collected from `series.data`,
    * Only the values appearing in series.data can be collected.
    * For example, if series.data is empty, nothing will be collected.
    *
    * @example
    *  // Name list of all categories
    *  data: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    *  // Each item could also be a specific configuration item.
    *  // In this case, `value` is used as the category name.
    *  data: [{
    *      value: 'Monday',
    *      // Highlight Monday
    *      textStyle: {
    *          fontSize: 20,
    *          color: 'red'
    *      }
    *  }, 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.data
    */
  var data: js.UndefOr[js.Array[String | Double | DataObject]] = js.native
  /**
    * The index of grid which this axis belongs to.
    * Defaults to be in the first grid.
    *
    * @default 0
    */
  var gridIndex: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Compulsively set segmentation interval for axis.
    * As splitNumber is a recommendation value,
    * the calculated tick may not be the same as expected.
    * In this case, interval should be used along with min and max
    * to compulsively set tickings.
    * But in most cases, we do not suggest using this,
    * out automatic calculation is enough for most situations.
    * This is unavailable for category axis.
    * Timestamp should be passed for type: `'time'` axis.
    * Logged value should be passed for type: `'log'` axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.interval
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * Whether axis is inversed. New option from ECharts 3.
    *
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.native
  /**
    * Base of logarithm, which is valid only for numeric axes with type:
    * `'log'`.
    *
    * @default 10
    * @see https://echarts.apache.org/en/option.html#yAxis.logBase
    */
  var logBase: js.UndefOr[Double] = js.native
  /**
    * The maximum value of axis.
    * It can be set to a special value `'dataMax'` so that
    * the minimum value on this axis is set to be the maximum label.
    * It will be automatically computed to make sure axis tick is equally
    * distributed when not set.
    * In category axis, it can also be set as the ordinal number.
    * For example, if a catergory axis has
    * `data: ['categoryA', 'categoryB', 'categoryC']`
    * , and the ordinal `2` represents `'categoryC'`.
    * Moreover, it can be set as negative number, like `-3`.
    *
    * @default null
    * @see https://echarts.apache.org/option.html#yAxis.max
    */
  var max: js.UndefOr[Double | String | (js.Function1[/* value */ Max, Double])] = js.native
  /**
    * The minimun value of axis.
    * It can be set to a special value `'dataMin'` so that
    * the minimum value on this axis is set to be the minimum label.
    * It will be automatically computed to make sure axis tick is equally
    * distributed when not set. In category axis, it can also be set
    * as the ordinal number.
    * For example, if a catergory axis has
    * `data: ['categoryA', 'categoryB', 'categoryC']`
    * , and the ordinal `2` represents `'categoryC'`.
    * Moreover, it can be set as negative number, like `-3`.
    *
    * @default null
    * @see https://echarts.apache.org/option.html#yAxis.min
    */
  var min: js.UndefOr[Double | String | (js.Function1[/* value */ Max, Double])] = js.native
  /**
    * Maximum gap between split lines.
    * For example, in time axis (type is `'time'`),
    * it can be set to be `3600 * 24 * 1000` to make sure
    * that the gap between axis labels is less than or equal to one day.
    * @example
    * {
    *     maxInterval: 3600 * 1000 * 24
    * }
    * It is available only for axis of type `'value'` or `'time'`.
    * @see https://echarts.apache.org/en/option.html#yAxis.minInterval
    */
  var minInterval: js.UndefOr[js.Any] = js.native
  /**
    * Minor SplitLine of axis in grid area.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.minorSplitLine
    */
  var minorSplitLine: js.UndefOr[MinorSplitLine] = js.native
  /**
    * Settings related to axis minor tick.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.minorTick
    */
  var minorTick: js.UndefOr[MinorTick] = js.native
  /**
    * Name of axis.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Gap between axis name and axis line.
    *
    * @default 15
    */
  var nameGap: js.UndefOr[Double] = js.native
  /**
    * Location of axis name.
    *
    * @default 'start'
    */
  var nameLocation: js.UndefOr[start | middle | center | end] = js.native
  /**
    * Rotation of axis name.
    *
    * @default null
    */
  var nameRotate: js.UndefOr[Double] = js.native
  /**
    * Text style of axis name.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.nameTextStyle
    */
  var nameTextStyle: js.UndefOr[TextStyleWithRich] = js.native
  /**
    * Offset of this axis relative to default position.
    * Useful when multiple axis of this type has same position value.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#yAxis.offset
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * It is available only in numerical axis, i.e., type: `'value'`.
    * It specifies whether not to contain zero position
    * of axis compulsively.
    * When it is set to be `true`, the axis may not contain zero position,
    * which is useful in the scatter chart for both value axes.
    * This configuration item is unavailable when the `min` and `max`
    * are set.
    *
    * @default false
    * @see https://echarts.apache.org/en/option.html#yAxis.scale
    */
  var scale: js.UndefOr[Boolean] = js.native
  /**
    * If show this axis.
    *
    * @default 'true'
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * True for axis that cannot be interacted with.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Split area of axis in grid area, not shown by default.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.splitArea
    */
  var splitArea: js.UndefOr[SplitArea] = js.native
  /**
    * SplitLine of axis in grid area.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.splitLine
    */
  var splitLine: js.UndefOr[SplitLine] = js.native
  /**
    * Number of segments that the axis is split into.
    * Note that this number serves only as a recommendation,
    * and the true segments may be adjusted based on readability.
    * This is unavailable for category axis.
    *
    * @default 5
    * @see https://echarts.apache.org/en/option.html#yAxis.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
  /**
    * Whether the labels of axis triggers and reacts to mouse events.
    * Parameters of event includes:
    *
    * @example
    * {
    *     // Component type: xAxis, yAxis, radiusAxis, angleAxis
    *     // Each of which has an attribute for index, e.g., xAxisIndex for xAxis
    *     componentType: string,
    *     // Value on axis before being formatted.
    *     // Click on value label to trigger event.
    *     value: '',
    *     // Name of axis.
    *     // Click on laben name to trigger event.
    *     name: ''
    * }
    *
    * @default false
    */
  var triggerEvent: js.UndefOr[Boolean] = js.native
  /**
    * z value of all graghical elements in this axis,
    * which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those
    * with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in this axis.
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements
    * (like those with animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost,
    * and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger `zlevel` will be placed on Canvases
    * with smaller `zlevel`.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#yAxis.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object CartesianAxis_ {
  @scala.inline
  def apply(): CartesianAxis_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CartesianAxis_]
  }
  @scala.inline
  implicit class CartesianAxis_Ops[Self <: CartesianAxis_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisLabel(value: Label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLine(value: Line): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisLine")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisPointer(value: Pointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisPointer")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisTick(value: Tick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisTick")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundaryGap(value: Boolean | (js.Array[String | Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundaryGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryGap")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[String | Double | DataObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withGridIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridIndex")(js.undefined)
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
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withLogBase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logBase")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFunction1(value: /* value */ Max => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: Double | String | (js.Function1[/* value */ Max, Double])): Self = {
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
    def withMinFunction1(value: /* value */ Max => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: Double | String | (js.Function1[/* value */ Max, Double])): Self = {
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
    def withMinInterval(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorSplitLine(value: MinorSplitLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSplitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorSplitLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorSplitLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTick(value: MinorTick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTick")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameGap")(js.undefined)
        ret
    }
    @scala.inline
    def withNameLocation(value: start | middle | center | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withNameRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withNameTextStyle(value: TextStyleWithRich): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameTextStyle")(js.undefined)
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
    def withScale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitArea(value: SplitArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitArea")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitLine(value: SplitLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
    @scala.inline
    def withZlevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZlevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zlevel")(js.undefined)
        ret
    }
  }
  
}

