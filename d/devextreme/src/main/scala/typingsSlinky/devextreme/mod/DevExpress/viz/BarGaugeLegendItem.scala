package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGaugeLegendItem extends BaseLegendItem {
  
  /**
    * [descr:BarGaugeLegendItem.item]
    */
  var item: js.UndefOr[BarGaugeBarInfo] = js.native
}
object BarGaugeLegendItem {
  
  @scala.inline
  def apply(): BarGaugeLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeLegendItem]
  }
  
  @scala.inline
  implicit class BarGaugeLegendItemOps[Self <: BarGaugeLegendItem] (val x: Self) extends AnyVal {
    
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
    def setItem(value: BarGaugeBarInfo): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
}
