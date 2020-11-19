package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartCategoryAxisItemLine extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var dashType: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object StockChartCategoryAxisItemLine {
  
  @scala.inline
  def apply(): StockChartCategoryAxisItemLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemLine]
  }
  
  @scala.inline
  implicit class StockChartCategoryAxisItemLineOps[Self <: StockChartCategoryAxisItemLine] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashType(value: String): Self = this.set("dashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashType: Self = this.set("dashType", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
