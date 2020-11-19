package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetFilterColumnCriteriaItem extends js.Object {
  
  var operator: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SpreadsheetSheetFilterColumnCriteriaItem {
  
  @scala.inline
  def apply(): SpreadsheetSheetFilterColumnCriteriaItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilterColumnCriteriaItem]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetFilterColumnCriteriaItemOps[Self <: SpreadsheetSheetFilterColumnCriteriaItem] (val x: Self) extends AnyVal {
    
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
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
