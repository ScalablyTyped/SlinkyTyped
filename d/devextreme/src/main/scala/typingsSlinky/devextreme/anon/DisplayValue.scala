package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typingsSlinky.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayValue extends js.Object {
  
  var cellElement: js.UndefOr[dxElement] = js.native
  
  var column: js.UndefOr[dxDataGridColumn] = js.native
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxDataGrid] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var displayValue: js.UndefOr[js.Any] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var eventType: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[js.Any] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var row: js.UndefOr[dxDataGridRowObject] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
  
  var rowType: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object DisplayValue {
  
  @scala.inline
  def apply(): DisplayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayValue]
  }
  
  @scala.inline
  implicit class DisplayValueOps[Self <: DisplayValue] (val x: Self) extends AnyVal {
    
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
    def setCellElement(value: dxElement): Self = this.set("cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellElement: Self = this.set("cellElement", js.undefined)
    
    @scala.inline
    def setColumn(value: dxDataGridColumn): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisplayValue(value: js.Any): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayValue: Self = this.set("displayValue", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
    
    @scala.inline
    def setRowType(value: String): Self = this.set("rowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowType: Self = this.set("rowType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
