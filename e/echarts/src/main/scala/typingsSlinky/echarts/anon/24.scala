package typingsSlinky.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `24` extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-tree.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[CurvenessShadowBlur] = js.native
}
object `24` {
  
  @scala.inline
  def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24Ops`[Self <: `24`] (val x: Self) extends AnyVal {
    
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
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLineStyle(value: CurvenessShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
  }
}
