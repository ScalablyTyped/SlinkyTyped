package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetFilter extends js.Object {
  
  var columns: js.UndefOr[js.Array[SpreadsheetSheetFilterColumn]] = js.native
  
  var ref: js.UndefOr[String] = js.native
}
object SpreadsheetSheetFilter {
  
  @scala.inline
  def apply(): SpreadsheetSheetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetFilter]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetFilterOps[Self <: SpreadsheetSheetFilter] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: SpreadsheetSheetFilterColumn*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[SpreadsheetSheetFilterColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
