package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.AnimationDurationUpdate
import typingsSlinky.echarts.anon.AnimationEasing
import typingsSlinky.echarts.anon.AnimationEasingUpdate
import typingsSlinky.echarts.anon.ExtraCssText
import typingsSlinky.echarts.anon.FontStyle
import typingsSlinky.echarts.anon.LabelLine
import typingsSlinky.echarts.anon.Length
import typingsSlinky.echarts.anon.ShadowOffsetY
import typingsSlinky.echarts.echarts.EChartOption.SeriesFunnel.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Funnel chart**
  *
  * **sample:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-funnel)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-funnel
  */
@js.native
trait SeriesFunnel_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-funnel.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Data array of series, which can be a single data value, like:
    *
    * ```
    * [12, 34, 56, 10, 23]
    *
    * ```
    *
    * Or, if need extra dimensions for components like
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the
    * form of array. For example:
    *
    * ```
    * [[12, 14], [34, 50], [56, 30], [10, 15], [23, 10]]
    *
    * ```
    *
    * In this case, we can assgin the second value in each arrary item
    * to
    * [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * component.
    *
    * More likely, we need to assign name to each data item, in which
    * case each item should be an object:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-funnel.funnel)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.data
    */
  var data: js.UndefOr[js.Array[js.Array[Double] | DataObject | Double]] = js.native
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis
    */
  var emphasis: js.UndefOr[LabelLine] = js.native
  /**
    * Horizontal align.
    * Defaults to align center. Can be 'left', 'right', 'center'.
    *
    *
    * @default
    * "center"
    * @see https://echarts.apache.org/en/option.html#series-funnel.funnelAlign
    */
  var funnelAlign: js.UndefOr[String] = js.native
  /**
    * Gap between each trapezoid.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.gap
    */
  var gap: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.native
  /**
    * Text label of funnel chart, to explain some data information
    * about graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.label
    */
  var label: js.UndefOr[FontStyle] = js.native
  /**
    * The visual guide line style of label. When
    * [label position](https://echarts.apache.org/en/option.html#series-funnel.label.position)
    * is set as `'left'`or`'right'`, the visual guide line will show.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-funnel.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markArea
    */
  var markArea: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markLine
    */
  var markLine: js.UndefOr[AnimationEasing] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.markPoint
    */
  var markPoint: js.UndefOr[AnimationDurationUpdate] = js.native
  /**
    * The specified maximum value.
    *
    *
    * @default
    * 100
    * @see https://echarts.apache.org/en/option.html#series-funnel.max
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The mapped width from maximum data value
    * [max](https://echarts.apache.org/en/option.html#series-funnel.max)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://echarts.apache.org/en/option.html#series-funnel.width)
    * .
    *
    *
    * @default
    * '100%'
    * @see https://echarts.apache.org/en/option.html#series-funnel.maxSize
    */
  var maxSize: js.UndefOr[String] = js.native
  /**
    * The specified minimum value.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.min
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The mapped width from minimum data value
    * [min](https://echarts.apache.org/en/option.html#series-funnel.min)
    * .
    *
    * It can be absolute pixel and also the percentage of
    * [layout width](https://echarts.apache.org/en/option.html#series-funnel.width)
    *
    * If you don't want the graph of minimum value to be a triangle,
    * you can set up this property larger than 0.
    *
    *
    * @default
    * '0%'
    * @see https://echarts.apache.org/en/option.html#series-funnel.minSize
    */
  var minSize: js.UndefOr[String] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * When
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, `seriesLayoutBy` specifies whether the column or the
    * row of `dataset` is mapped to the series, namely, the series
    * is "layout" on columns or rows. Optional values:
    *
    * + 'column': by default, the columns of `dataset` are mapped the
    * series. In this case, each column represents a dimension.
    * + 'row'：the rows of `dataset` are mapped to the series.
    * In this case, each row represents a dimension.
    *
    * Check this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://echarts.apache.org/en/option.html#series-funnel.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Data sorting, which can be whether `'ascending'`, `'descending'`,
    * `'none'`(in data order) or a function, which is the same as `Array.prototype.sort(function
    * (a, b) { ... })`;
    *
    *
    * @default
    * "descending"
    * @see https://echarts.apache.org/en/option.html#series-funnel.sort
    */
  var sort: js.UndefOr[String] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-funnel.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.native
  /**
    * @default
    * "funnel"
    * @see https://echarts.apache.org/en/option.html#series-funnel.type
    */
  var `type`: js.UndefOr[String] = js.native
}

object SeriesFunnel_ {
  @scala.inline
  def apply(): SeriesFunnel_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesFunnel_]
  }
  @scala.inline
  implicit class SeriesFunnel_Ops[Self <: SeriesFunnel_] (val x: Self) extends AnyVal {
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
    def withData(value: js.Array[js.Array[Double] | DataObject | Double]): Self = {
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
    def withDatasetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: LabelLine): Self = {
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
    def withFunnelAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunnelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funnelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
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
    def withItemStyle(value: ShadowOffsetY): Self = {
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
    def withLabel(value: FontStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLine(value: Length): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLine")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendHoverLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendHoverLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendHoverLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendHoverLink")(js.undefined)
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
    def withMaxSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
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
    def withMinSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
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
    def withSeriesLayoutBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLayoutBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesLayoutBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesLayoutBy")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
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

