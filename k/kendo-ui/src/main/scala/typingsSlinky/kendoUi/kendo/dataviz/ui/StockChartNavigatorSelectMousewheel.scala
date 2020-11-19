package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigatorSelectMousewheel extends js.Object {
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var zoom: js.UndefOr[String] = js.native
}
object StockChartNavigatorSelectMousewheel {
  
  @scala.inline
  def apply(): StockChartNavigatorSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSelectMousewheel]
  }
  
  @scala.inline
  implicit class StockChartNavigatorSelectMousewheelOps[Self <: StockChartNavigatorSelectMousewheel] (val x: Self) extends AnyVal {
    
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
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setZoom(value: String): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
