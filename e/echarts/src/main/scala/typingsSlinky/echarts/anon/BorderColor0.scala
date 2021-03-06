package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColor0 extends StObject {
  
  /**
    * Border color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Border color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor0
    */
  var borderColor0: js.UndefOr[String] = js.native
  
  /**
    * Border width of candlestick.
    * There is no border when it is `0`.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Fill color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Fill color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color0
    */
  var color0: js.UndefOr[String] = js.native
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}
object BorderColor0 {
  
  @scala.inline
  def apply(): BorderColor0 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColor0]
  }
  
  @scala.inline
  implicit class BorderColor0MutableBuilder[Self <: BorderColor0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: typingsSlinky.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor0(value: String): Self = StObject.set(x, "borderColor0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor0Undefined: Self = StObject.set(x, "borderColor0", js.undefined)
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor0(value: String): Self = StObject.set(x, "color0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor0Undefined: Self = StObject.set(x, "color0", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: typingsSlinky.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
  }
}
