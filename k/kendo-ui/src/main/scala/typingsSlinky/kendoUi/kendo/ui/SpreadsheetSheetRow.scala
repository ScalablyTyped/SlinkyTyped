package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetSheetRow extends js.Object {
  
  var cells: js.UndefOr[js.Array[SpreadsheetSheetRowCell]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SpreadsheetSheetRow {
  
  @scala.inline
  def apply(): SpreadsheetSheetRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetSheetRow]
  }
  
  @scala.inline
  implicit class SpreadsheetSheetRowOps[Self <: SpreadsheetSheetRow] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: SpreadsheetSheetRowCell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: js.Array[SpreadsheetSheetRowCell]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
