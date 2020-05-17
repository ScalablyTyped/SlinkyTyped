package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.AnimationDurationUpdate
import typingsSlinky.echarts.anon.AnimationEasing
import typingsSlinky.echarts.anon.AnimationEasingUpdate
import typingsSlinky.echarts.anon.DictunknownPropertyBorderColor
import typingsSlinky.echarts.anon.ExtraCssText
import typingsSlinky.echarts.anon.LabelFontWeight
import typingsSlinky.echarts.anon.Length2
import typingsSlinky.echarts.anon.TextBorderWidth
import typingsSlinky.echarts.echarts.EChartOption.SeriesPie.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **pie chart**
  *
  * The pie chart is mainly used for showing proportion of different
  * categories.
  * Each arc length represents the proportion of data quantity.
  *
  * **Tip:** The pie chart is more suitable for illustrating the numerical
  * proportion.
  * If you just to present the numerical differences of various categories,
  * the
  * [bar graph](https://echarts.apache.org/en/option.htmlbar)
  * chart is more suggested.
  * Because compared to tiny length difference, people is less sensitive
  * to the minor radian difference.
  * Otherwise, it can also be shown as Nightingale chart by using the
  * [roseType](https://echarts.apache.org/en/option.html#series-pie.roseType)
  * to distinguish different data through radius.
  *
  * **The below example shows a customized Nightingale chart:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-pie)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-pie
  */
@js.native
trait SeriesPie_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-pie.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-pie.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pie.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-pie.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Initial animation type.
    *
    * + `'expansion'` Default expansion animation.
    * + `'scale'` Scale animation.
    * You can use it with `animationEasing='elasticOut'` to have popup
    * effect.
    *
    *
    * @default
    * "expansion"
    * @see https://echarts.apache.org/en/option.html#series-pie.animationType
    */
  var animationType: js.UndefOr[String] = js.native
  /**
    * Whether to enable the strategy to avoid labels overlap.
    * Defaults to be enabled, which will move the label positions in
    * the case of labels overlapping
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.avoidLabelOverlap
    */
  var avoidLabelOverlap: js.UndefOr[Boolean] = js.native
  /**
    * Center position of Pie chart, the first of which is the horizontal
    * position, and the second is the vertical position.
    *
    * Percentage is supported.
    * When set in percentage, the item is relative to the container
    * width, and the second item to the height.
    *
    * **Example:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @default
    * ['50%', '50%']
    * @see https://echarts.apache.org/en/option.html#series-pie.center
    */
  var center: js.UndefOr[js.Array[_]] = js.native
  /**
    * Whether the layout of sectors of pie chart is clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.native
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-pie.cursor
    */
  var cursor: js.UndefOr[String] = js.native
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
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    * Each data item can be further custerized:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.data
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
    * @see https://echarts.apache.org/en/option.html#series-pie.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-pie.emphasis
    */
  var emphasis: js.UndefOr[LabelFontWeight] = js.native
  /**
    * Whether to enable the zoom animation effects when hovering sectors.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * The offset distance of hovered sector.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-pie.hoverOffset
    */
  var hoverOffset: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle
    */
  var itemStyle: js.UndefOr[DictunknownPropertyBorderColor] = js.native
  /**
    * Text label of pie chart, to explain some data information about
    * graphic item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.label
    */
  var label: js.UndefOr[TextBorderWidth] = js.native
  /**
    * The style of visual guide line. Will show when
    * [label position](https://echarts.apache.org/en/option.html#series-pie.label.position)
    * is set as `'outside'`.
    *
    * The style of visual guide line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.labelLine
    */
  var labelLine: js.UndefOr[Length2] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markArea
    */
  var markArea: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markLine
    */
  var markLine: js.UndefOr[AnimationEasing] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint
    */
  var markPoint: js.UndefOr[AnimationDurationUpdate] = js.native
  /**
    * The minimum angle of sector (0 ~ 360).
    * It prevents some sector from being too small when value is small,
    * which will affect user interaction.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.minAngle
    */
  var minAngle: js.UndefOr[Double] = js.native
  /**
    * If a sector is less than this angle (0 ~ 360), label and labelLine will not be displayed.
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.minShowLabelAngle
    */
  var minShowLabelAngle: js.UndefOr[Double] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Radius of Pie chart. Value can be:
    *
    * + `number`: Specify outside radius directly.
    * + `string`: For example, `'20%'`, means that the outside radius
    * is 20% of the viewport size (the little one between width and
    * height of the chart container).
    * + `Array.<number|string>`:
    * The first item specifies the inside radius, and the second item
    * specifies the outside radius.
    * Each item follows the definitions above.
    *
    * You can set a large inner radius for a Donut chart.
    *
    *
    * @default
    * [0, '75%']
    * @see https://echarts.apache.org/en/option.html#series-pie.radius
    */
  var radius: js.UndefOr[js.Array[_] | Double | String] = js.native
  /**
    * Whether to show as Nightingale chart, which distinguishs data
    * through radius. There are 2 optional modes:
    *
    * + `'radius'` Use central angle to show the percentage of data,
    * radius to show data size.
    * + `'area'` All the sectors will share the same central angle,
    * the data size is shown only through radiuses.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.roseType
    */
  var roseType: js.UndefOr[Boolean | String] = js.native
  /**
    * Selected mode of pie.
    * It is enabled by default, and you may set it to be `false` to
    * disabled it.
    *
    * Besides, it can be set to `'single'` or `'multiple'`, for single
    * selection and multiple selection.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.selectedMode
    */
  var selectedMode: js.UndefOr[Boolean | String] = js.native
  /**
    * The offset distance of selected sector.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-pie.selectedOffset
    */
  var selectedOffset: js.UndefOr[Double] = js.native
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
    * @see https://echarts.apache.org/en/option.html#series-pie.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * The start angle, which range is \[0, 360\].
    *
    *
    * @default
    * 90
    * @see https://echarts.apache.org/en/option.html#series-pie.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * Whether to show sector when all data are zero.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.stillShowZeroSum
    */
  var stillShowZeroSum: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.native
  /**
    * @default
    * "pie"
    * @see https://echarts.apache.org/en/option.html#series-pie.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-pie.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesPie_ {
  @scala.inline
  def apply(): SeriesPie_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesPie_]
  }
  @scala.inline
  implicit class SeriesPie_Ops[Self <: SeriesPie_] (val x: Self) extends AnyVal {
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
    def withAnimationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationType")(js.undefined)
        ret
    }
    @scala.inline
    def withAvoidLabelOverlap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidLabelOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoidLabelOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidLabelOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
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
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
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
    def withEmphasis(value: LabelFontWeight): Self = {
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
    def withHoverAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOffset")(js.undefined)
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
    def withItemStyle(value: DictunknownPropertyBorderColor): Self = {
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
    def withLabel(value: TextBorderWidth): Self = {
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
    def withLabelLine(value: Length2): Self = {
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
    def withMinAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withMinShowLabelAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minShowLabelAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinShowLabelAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minShowLabelAngle")(js.undefined)
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
    def withRadius(value: js.Array[_] | Double | String): Self = {
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
    def withRoseType(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roseType")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedMode(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOffset")(js.undefined)
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
    def withStillShowZeroSum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stillShowZeroSum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStillShowZeroSum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stillShowZeroSum")(js.undefined)
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

