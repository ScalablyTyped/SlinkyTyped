package typingsSlinky.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTableColumnRequest extends StObject {
  
  /**
    * The reference table cell location from which the column will be deleted. The column this cell spans will be deleted. If this is a merged cell that spans multiple columns, all
    * columns that the cell spans will be deleted. If no columns remain in the table after this deletion, the whole table is deleted.
    */
  var tableCellLocation: js.UndefOr[TableCellLocation] = js.native
}
object DeleteTableColumnRequest {
  
  @scala.inline
  def apply(): DeleteTableColumnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTableColumnRequest]
  }
  
  @scala.inline
  implicit class DeleteTableColumnRequestMutableBuilder[Self <: DeleteTableColumnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableCellLocation(value: TableCellLocation): Self = StObject.set(x, "tableCellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellLocationUndefined: Self = StObject.set(x, "tableCellLocation", js.undefined)
  }
}
