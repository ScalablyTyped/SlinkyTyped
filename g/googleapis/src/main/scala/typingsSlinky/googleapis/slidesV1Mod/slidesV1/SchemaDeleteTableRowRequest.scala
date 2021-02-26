package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deletes a row from a table.
  */
@js.native
trait SchemaDeleteTableRowRequest extends StObject {
  
  /**
    * The reference table cell location from which a row will be deleted.  The
    * row this cell spans will be deleted. If this is a merged cell, multiple
    * rows will be deleted. If no rows remain in the table after this deletion,
    * the whole table is deleted.
    */
  var cellLocation: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The table to delete rows from.
    */
  var tableObjectId: js.UndefOr[String] = js.native
}
object SchemaDeleteTableRowRequest {
  
  @scala.inline
  def apply(): SchemaDeleteTableRowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteTableRowRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteTableRowRequestMutableBuilder[Self <: SchemaDeleteTableRowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
