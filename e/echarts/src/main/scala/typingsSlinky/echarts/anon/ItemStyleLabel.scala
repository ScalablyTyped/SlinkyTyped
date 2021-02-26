package typingsSlinky.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemStyleLabel extends StObject {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[ShadowOffsetY] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
}
object ItemStyleLabel {
  
  @scala.inline
  def apply(): ItemStyleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemStyleLabel]
  }
  
  @scala.inline
  implicit class ItemStyleLabelMutableBuilder[Self <: ItemStyleLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: ShadowOffsetY): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderRadius): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
