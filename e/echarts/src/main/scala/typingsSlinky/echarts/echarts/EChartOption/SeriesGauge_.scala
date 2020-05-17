package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.AnimationDurationUpdate
import typingsSlinky.echarts.anon.AnimationEasing
import typingsSlinky.echarts.anon.AnimationEasingUpdate
import typingsSlinky.echarts.anon.BorderType
import typingsSlinky.echarts.anon.ExtraCssText
import typingsSlinky.echarts.anon.ItemStyleBorderType
import typingsSlinky.echarts.anon.LengthLineStyle
import typingsSlinky.echarts.anon.LengthShow
import typingsSlinky.echarts.anon.LineStyleShow
import typingsSlinky.echarts.anon.OffsetCenter
import typingsSlinky.echarts.anon.Rich
import typingsSlinky.echarts.anon.SplitNumber
import typingsSlinky.echarts.anon.TextBorderColor
import typingsSlinky.echarts.echarts.EChartOption.SeriesGauge.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Gauge chart**
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-gauge)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-gauge
  */
@js.native
trait SeriesGauge_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Axis tick label.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLabel
    */
  var axisLabel: js.UndefOr[Rich] = js.native
  /**
    * The related configuration about the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine
    */
  var axisLine: js.UndefOr[LineStyleShow] = js.native
  /**
    * The tick line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick
    */
  var axisTick: js.UndefOr[SplitNumber] = js.native
  /**
    * Whether the scale in gauge chart increases clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * Data array of series, which can be a single data value.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.data)
    *
    * Or, if need extra dimensions for components like [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the form of array.
    *
    * In this case, we can assigin the second value in each arrary item to [visualMap](https://echarts.apache.org/en/option.html#visualMap) component.
    * More likely, we need to assign name to each data item, in which case each item should be an object:
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.native
  /**
    * The detail about gauge chart which is used to show data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.detail
    */
  var detail: js.UndefOr[TextBorderColor] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderType] = js.native
  /**
    * The end angle of gauge chart.
    *
    *
    * @default
    * -45
    * @see https://echarts.apache.org/en/option.html#series-gauge.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The style of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markArea
    */
  var markArea: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markLine
    */
  var markLine: js.UndefOr[AnimationEasing] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markPoint
    */
  var markPoint: js.UndefOr[AnimationDurationUpdate] = js.native
  /**
    * The maximum data value which map to
    * [maxAngle](https://echarts.apache.org/en/option.html#series-gauge.maxAngle)
    * .
    *
    *
    * @default
    * 100
    * @see https://echarts.apache.org/en/option.html#series-gauge.max
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum data value which map to
    * [minAngle](https://echarts.apache.org/en/option.html#series-gauge.minAngle)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.min
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Gauge chart pointer.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer
    */
  var pointer: js.UndefOr[LengthShow] = js.native
  /**
    * The radius of gauge chart.
    * It can be a percentage value of the smaller of container half
    * width and half height, also can be an absolute value.
    *
    * {{ use partial-legend-hover-link }}
    *
    *
    * @default
    * '75%'
    * @see https://echarts.apache.org/en/option.html#series-gauge.radius
    */
  var radius: js.UndefOr[Double | String] = js.native
  /**
    * The style of split line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine
    */
  var splitLine: js.UndefOr[LengthLineStyle] = js.native
  /**
    * The number of split segments of gauge chart scale.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
  /**
    * The start angle of gauge chart. The direct right side of
    * [circle center](https://echarts.apache.org/en/option.html#series-gauge.center)
    * is `0` degree, the right above it is `90` degree, the direct
    * left side of it is `180` degree.
    *
    *
    * @default
    * 225
    * @see https://echarts.apache.org/en/option.html#series-gauge.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * The title of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.title
    */
  var title: js.UndefOr[OffsetCenter] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.native
  /**
    * @default
    * "gauge"
    * @see https://echarts.apache.org/en/option.html#series-gauge.type
    */
  var `type`: js.UndefOr[String] = js.native
}

object SeriesGauge_ {
  @scala.inline
  def apply(): SeriesGauge_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGauge_]
  }
  @scala.inline
  implicit class SeriesGauge_Ops[Self <: SeriesGauge_] (val x: Self) extends AnyVal {
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
    def withAnimationDelay(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDelayUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDelayUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDelayUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDurationUpdate(value: js.Function | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDurationUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDurationUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasingUpdate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisLabel(value: Rich): Self = {
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
    def withAxisLine(value: LineStyleShow): Self = {
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
    def withAxisTick(value: SplitNumber): Self = {
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
    def withClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(js.undefined)
        ret
    }
    @scala.inline
    def withData(
      value: js.Array[
          (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
        ]
    ): Self = {
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
    def withDetail(value: TextBorderColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: ItemStyleBorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasis")(js.undefined)
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(js.undefined)
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
    def withItemStyle(value: BorderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkArea(value: AnimationEasingUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markArea")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkLine(value: AnimationEasing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markLine")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkPoint(value: AnimationDurationUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markPoint")(js.undefined)
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
    def withPointer(value: LengthShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointer")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitLine(value: LengthLineStyle): Self = {
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
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: OffsetCenter): Self = {
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
    def withTooltip(value: ExtraCssText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
  }
  
}

