package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.anon.AnimationDurationUpdate
import typingsSlinky.echarts.anon.AnimationEasing
import typingsSlinky.echarts.anon.AnimationEasingUpdate
import typingsSlinky.echarts.anon.ConstantSpeed
import typingsSlinky.echarts.anon.FontStyle
import typingsSlinky.echarts.anon.LabelFontStyle
import typingsSlinky.echarts.anon.ShadowColor
import typingsSlinky.echarts.echarts.EChartOption.SeriesLines.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Lines graph**
  *
  * It is used to draw the line data with the information about "from"
  * and "to"; and it is applied fot drawing the air routes on map, which
  * visualizes these routes.
  *
  * ECharts 2.x
  * uses the `markLine` to draw the migrating effect, while in ECharts
  * 3, the `lines` graph is recommended to be used.
  *
  * **Migrating example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-lines)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-lines
  */
@js.native
trait SeriesLines_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-lines.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-lines.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-lines.animationEasingUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-lines.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-lines.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-lines.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-lines.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "geo"
    * @see https://echarts.apache.org/en/option.html#series-lines.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * The data set of lines.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.native
  /**
    * The setting about special effect of lines.
    *
    * **Tips:** All the graphs with trail effect should be put on a
    * individual layer, which means that
    * [zlevel](https://echarts.apache.org/en/option.html#series-lines.zlevel)
    * need to be different with others. And the animation (
    * [animation](https://echarts.apache.org/en/option.html#series-lines.animation)
    * : false) of this layer is suggested to be turned off at the meanwhile.
    * Otherwise, other graphic elements in other series and the
    * [label](https://echarts.apache.org/en/option.html#series-lines.label)
    * of animation would produce unnecessary ghosts.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect
    */
  var effect: js.UndefOr[ConstantSpeed] = js.native
  /**
    * Emphasis style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis
    */
  var emphasis: js.UndefOr[LabelFontStyle] = js.native
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Label settings. Does not work when
    * [polyline](https://echarts.apache.org/en/option.html#series-lines.polyline)
    * is `true`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.label
    */
  var label: js.UndefOr[FontStyle] = js.native
  /**
    * Whether to enable the optimization of large-scale lines graph.
    * It could be enabled when there is a particularly large number
    * of data(>=5k) .
    *
    * After being enabled,
    * [largeThreshold](https://echarts.apache.org/en/option.html#series-lines.largeThreshold)
    * can be used to indicate the minimum number for turning on the
    * optimization.
    *
    * The style of a single data item can't be customized
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.large
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-lines.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowColor] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markArea
    */
  var markArea: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markLine
    */
  var markLine: js.UndefOr[AnimationEasing] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.markPoint
    */
  var markPoint: js.UndefOr[AnimationDurationUpdate] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * If draw as polyline.
    *
    * Default to be `false`. Can only draw a two end straight line.
    *
    * If it is set true,
    * [data.coords](https://echarts.apache.org/en/option.html#series-lines.data.coords)
    * can have more than two coord to draw a polyline.
    * It is useful when visualizing GPS track data. See example
    * [lines-bus](https://echarts.apache.org/examples/en/editor.html?c=lines-bmap-bus)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.polyline
    */
  var polyline: js.UndefOr[Boolean] = js.native
  /**
    * `progressive` specifies the amount of graphic elements that can
    * be rendered within a frame (about 16ms) if "progressive rendering"
    * enabled.
    *
    * When data amount is from thousand to more than 10 million, it
    * will take too long time to render all of the graphic elements.
    * Since ECharts 4, "progressive rendering" is supported in its
    * workflow, which processes and renders data chunk by chunk alone
    * with each frame, avoiding to block the UI thread of the browser.
    *
    *
    * @default
    * 400
    * @see https://echarts.apache.org/en/option.html#series-lines.progressive
    */
  var progressive: js.UndefOr[Double] = js.native
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 3000
    * @see https://echarts.apache.org/en/option.html#series-lines.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Symbol type at the two ends of the line.
    * It can be an array for two ends, or assigned seperately. See
    * [data.symbol](https://echarts.apache.org/en/option.html#series-line.markLine.data.0.symbol)
    * for more format information.
    *
    *
    * @default
    * "none"
    * @see https://echarts.apache.org/en/option.html#series-lines.symbol
    */
  var symbol: js.UndefOr[js.Array[_] | String] = js.native
  /**
    * Symbol size at the two ends of the line.
    * It can be an array for two ends, or assigned seperately.
    *
    * **Attention:** You cannot assgin width and height seperately
    * as normal `symbolSize`.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-lines.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * @default
    * "lines"
    * @see https://echarts.apache.org/en/option.html#series-lines.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  /**
    * `z` value of all graghical elements in lines graph, which controls
    * order of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-lines.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in lines graph.
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
    * @see https://echarts.apache.org/en/option.html#series-lines.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesLines_ {
  @scala.inline
  def apply(): SeriesLines_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLines_]
  }
  @scala.inline
  implicit class SeriesLines_Ops[Self <: SeriesLines_] (val x: Self) extends AnyVal {
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
    def withCoordinateSystem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinateSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[DataObject]): Self = {
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
    def withEffect(value: ConstantSpeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: LabelFontStyle): Self = {
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
    def withGeoIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoIndex")(js.undefined)
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
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withLargeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withLineStyle(value: ShadowColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(js.undefined)
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
    def withPolyline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressive")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressiveThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveThreshold")(js.undefined)
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
    def withSymbol(value: js.Array[_] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbolSize(value: js.Array[_] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbolSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(js.undefined)
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
    def withXAxisIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxisIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withYAxisIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYAxisIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxisIndex")(js.undefined)
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

