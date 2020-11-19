package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emphasis extends js.Object {
  
  /**
    * border color, whose format is similar to that
    * of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    * Border type, which can be `'solid'`, `'dashed'`,
    * or `'dotted'`. `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.native
  
  /**
    * border width.
    * No border when it is set to be 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[BorderType] = js.native
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markArea.data.1.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markArea.data.1.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}
object Emphasis {
  
  @scala.inline
  def apply(): Emphasis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emphasis]
  }
  
  @scala.inline
  implicit class EmphasisOps[Self <: Emphasis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderType(value: String): Self = this.set("borderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderType: Self = this.set("borderType", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEmphasis(value: BorderType): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
  }
}
