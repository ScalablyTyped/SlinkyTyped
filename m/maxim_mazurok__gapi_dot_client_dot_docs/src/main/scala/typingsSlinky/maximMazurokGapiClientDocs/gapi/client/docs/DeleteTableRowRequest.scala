package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTableRowRequest extends js.Object {
  
  /**
    * The reference table cell location from which the row will be deleted. The row this cell spans will be deleted. If this is a merged cell that spans multiple rows, all rows that the
    * cell spans will be deleted. If no rows remain in the table after this deletion, the whole table is deleted.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}
object DeleteTableRowRequest {
  
  @scala.inline
  def apply(): DeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableRowRequest]
  }
  
  @scala.inline
  implicit class DeleteTableRowRequestOps[Self <: DeleteTableRowRequest] (val x: Self) extends AnyVal {
    
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
    def setTableCellLocation(value: TableCellLocation): Self = this.set("tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCellLocation: Self = this.set("tableCellLocation", js.undefined)
  }
}
