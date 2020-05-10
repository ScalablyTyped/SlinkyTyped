package typingsSlinky.echarts.echarts.EChartOption

import typingsSlinky.echarts.AnonAnimationDelay
import typingsSlinky.echarts.AnonAnimationDelayUpdate
import typingsSlinky.echarts.AnonAnimationDuration
import typingsSlinky.echarts.AnonBorderColor0
import typingsSlinky.echarts.AnonExtraCssText
import typingsSlinky.echarts.AnonItemStyleAnonBorderColor0
import typingsSlinky.echarts.echarts.EChartOption.SeriesCandlestick.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A
  * [candlestick](https://en.wikipedia.org/wiki/Candlestick_chart)
  * chart (also called Japanese candlestick chart) is a style of financial
  * chart used to describe price movements of a security, derivative,
  * or currency.
  *
  * ECharts3 supports both `'candlestick'` and `'k'` in
  * [series.type](https://echarts.apache.org/en/option.html#(series.type)
  * (`'k'` would automatically turns into `'candlestick'`).
  *
  * **An example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-candlestick)
  *
  * **About color of increase and decrease**
  *
  * Different countries or regions have different implications on the
  * color of candle stick chart.
  * It may use red to imply increasing with red and decreasing with blue
  * (in China mainland, Taiwan, Japan, Koera, and so on), or to imply
  * increasing with green and decreasing with red (in Europ, North America,
  * Hong Kong, Singapore, and so on).
  * Besides color, the increase and decrease of stock may also be represented
  * with candle stick with or without filling colors.
  *
  * We use red to represent increasing and blue decreasing by default.
  * If you want to change the configuration, you may change the following
  * parameters.
  *
  * + [series-candlestick.itemStyle.color](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.color)
  * : fill color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.color0](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.color0)
  * : fill color for bearish candle stick (namely, decrease)
  * + [series-candlestick.itemStyle.borderColor](https://echarts.apache.org/en/option.html#series-candlestick.itemStyle.borderColor)
  * : border color for bullish candle stick (namely, increase)
  * + [series-candlestick.itemStyle.borderColor0](https://echarts.apache.org/en/option.htmlseries-candlestick.itemStyle.borderColor0)
  * : border color for bearish candle stick (namely, decrease)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-candlestick
  */
@js.native
trait SeriesCandlestick_ extends js.Object {
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "linear"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Specify bar max width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMaxWidth
    */
  var barMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Specify bar min width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barMinWidth
    */
  var barMinWidth: js.UndefOr[Double] = js.native
  /**
    * Specify bar width.
    * Absolute value (like `10`) or percentage (like `'20%'`, according
    * to band width) can be used. Auto adapt by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.barWidth
    */
  var barWidth: js.UndefOr[Double] = js.native
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-cartesian2d.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-cartesian2d.yAxisIndex)
    * to assign the corresponding axis component.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.native
  /**
    * Data should be the two-dimensional array shown as follow.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Every data item (each line in the example above) represents a
    * box, which contains 4 values. They are:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data
    */
  var data: js.UndefOr[js.Array[js.Array[Double | DataObject]]] = js.native
  /**
    * `dimensions` can be used to define dimension info for `series.data`
    * or `dataset.source`.
    *
    * Notice: if
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, we can provide dimension names in the first column/row
    * of
    * [dataset.source](https://echarts.apache.org/en/option.html#dataset.source)
    * , and not need to specify `dimensions` here.
    * But if `dimensions` is specified here, echarts will not retrieve
    * dimension names from the first row/column of `dataset.source`
    * any more.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Each data item of `dimensions` can be:
    *
    * + `string`, for example, `'someName'`, which equals to `{name:
    * 'someName'}`.
    * + `Object`, where the attributes can be:
    * + name: `string`.
    * + type: `string`, supports:
    * + `number`
    * + `float`, that is,
    * [Float64Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array)
    *
    * + `int`, that is,
    * [Int32Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array)
    *
    * + `ordinal`, discrete value, which represents string generally.
    * + `time`, time value, see
    * [data](https://echarts.apache.org/en/option.html#series.data)
    * to check the format of time value.
    * + displayName: `string`, generally used in tooltip for dimension
    * display. If not specified, use `name` by default.
    *
    * When `dimensions` is specified, the default `tooltip` will be
    * displayed vertically, which is better to show diemsion names.
    * Otherwise, `tooltip` will displayed only value horizontally.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.native
  /**
    * Emphasis style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderColor0] = js.native
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Attributes of encode are different according to the type of coordinate
    * systtems. For
    * [cartesian2d](https://echarts.apache.org/en/option.html#grid)
    * , `x` and `y` can be defined. For
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * , `radius` and `angle` can be defined. For
    * [geo](https://echarts.apache.org/en/option.html#geo)
    * , `lng` and `lat` can be defined.
    * Attribute `tooltip` and `itemName` (data item name in tooltip)
    * are always able to be defined.
    *
    * When
    * [dimensions](https://echarts.apache.org/en/option.html#series.dimensions)
    * is used to defined name for a certain dimension, `encode` can
    * refer the name directly. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.encode
    */
  var encode: js.UndefOr[js.Object] = js.native
  /**
    * Whether to enable animitation when hovering on box.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Item style of candlestick.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColor0] = js.native
  /**
    * Whether to enable the optimization of large-scale data.
    * It could be set when large data causes performance problem.
    *
    * After being enabled, `largeThreshold` can be used to indicate
    * the minimum number for turning on the optimization.
    *
    * But when the optimization enabled, the style of single data item
    * can't be customized any more.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.large
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * The threshold enabling the drawing optimization.
    *
    *
    * @default
    * 600
    * @see https://echarts.apache.org/en/option.html#series-candlestick.largeThreshold
    */
  var largeThreshold: js.UndefOr[Double] = js.native
  /**
    * Layout method, whose values may be:
    *
    * + `'horizontal'`: horizontally layout all boxs.
    *
    * + `'vertical'`: vertically layout all boxs.
    *
    * The default value is decided by:
    *
    * + if there is a `category` axis:
    * + if it is horizontal, use `'horizontal'`;
    * + otherwise use `'vertical'`;
    * + otherwise use `'horizontal'`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.layout
    */
  var layout: js.UndefOr[String] = js.native
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markArea
    */
  var markArea: js.UndefOr[AnonAnimationDelayUpdate] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markLine
    */
  var markLine: js.UndefOr[AnonAnimationDelay] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.markPoint
    */
  var markPoint: js.UndefOr[AnonAnimationDuration] = js.native
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.name
    */
  var name: js.UndefOr[String] = js.native
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
    * 5000
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressive
    */
  var progressive: js.UndefOr[Double] = js.native
  /**
    * Chunk approach, optional values:
    *
    * + `'sequential'`: slice data by data index.
    * + `'mod'`: slice data by mod, which make the data items of each
    * chunk coming from all over the data, bringing better visual effect
    * while progressive rendering.
    *
    *
    * @default
    * "mod"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveChunkMode
    */
  var progressiveChunkMode: js.UndefOr[String] = js.native
  /**
    * If current data amount is over the threshold, "progressive rendering"
    * is enabled.
    *
    *
    * @default
    * 10000
    * @see https://echarts.apache.org/en/option.html#series-candlestick.progressiveThreshold
    */
  var progressiveThreshold: js.UndefOr[Double] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.native
  /**
    * @default
    * "candlestick"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.type
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.native
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.native
  /**
    * `z` value of all graghical elements in candlestick, which controls
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.z
    */
  var z: js.UndefOr[Double] = js.native
  /**
    * `zlevel` value of all graghical elements in candlestick.
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
    * @see https://echarts.apache.org/en/option.html#series-candlestick.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}

object SeriesCandlestick_ {
  @scala.inline
  def apply(): SeriesCandlestick_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesCandlestick_]
  }
  @scala.inline
  implicit class SeriesCandlestick_Ops[Self <: SeriesCandlestick_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withBarMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBarMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMinWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barMinWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(js.undefined)
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
    def withData(value: js.Array[js.Array[Double | DataObject]]): Self = {
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
    def withDimensions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasis(value: AnonItemStyleAnonBorderColor0): Self = {
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
    def withEncode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.undefined)
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
    def withItemStyle(value: AnonBorderColor0): Self = {
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
    def withMarkArea(value: AnonAnimationDelayUpdate): Self = {
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
    def withMarkLine(value: AnonAnimationDelay): Self = {
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
    def withMarkPoint(value: AnonAnimationDuration): Self = {
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
    def withProgressiveChunkMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveChunkMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressiveChunkMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressiveChunkMode")(js.undefined)
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
    def withTooltip(value: AnonExtraCssText): Self = {
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

