package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarBorderColor
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.native
  
  /**
    * The radius of rounded corner.
    * Its unit is px.
    * And it supports use array to respectively specify the 4 corner
    * radiuses.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderRadius
    */
  var barBorderRadius: js.UndefOr[js.Array[_] | Double] = js.native
  
  /**
    * The bodrder width of bar. defaults to have no border.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.native
  
  /**
    * Bar color. defaults to acquire colors from global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * .
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.color
    */
  var color: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[typingsSlinky.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}
object BarBorderColor {
  
  @scala.inline
  def apply(): BarBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarBorderColor]
  }
  
  @scala.inline
  implicit class BarBorderColorMutableBuilder[Self <: BarBorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarBorderColor(value: String): Self = StObject.set(x, "barBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBorderColorUndefined: Self = StObject.set(x, "barBorderColor", js.undefined)
    
    @scala.inline
    def setBarBorderRadius(value: js.Array[_] | Double): Self = StObject.set(x, "barBorderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBorderRadiusUndefined: Self = StObject.set(x, "barBorderRadius", js.undefined)
    
    @scala.inline
    def setBarBorderRadiusVarargs(value: js.Any*): Self = StObject.set(x, "barBorderRadius", js.Array(value :_*))
    
    @scala.inline
    def setBarBorderWidth(value: Double): Self = StObject.set(x, "barBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarBorderWidthUndefined: Self = StObject.set(x, "barBorderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: typingsSlinky.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
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
