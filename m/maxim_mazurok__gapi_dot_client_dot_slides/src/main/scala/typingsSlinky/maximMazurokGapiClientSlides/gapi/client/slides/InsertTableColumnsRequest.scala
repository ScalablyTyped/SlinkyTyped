package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertTableColumnsRequest extends StObject {
  
  /**
    * The reference table cell location from which columns will be inserted. A new column will be inserted to the left (or right) of the column where the reference cell is. If the
    * reference cell is a merged cell, a new column will be inserted to the left (or right) of the merged cell.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  /** Whether to insert new columns to the right of the reference cell location. - `True`: insert to the right. - `False`: insert to the left. */
  var insertRight: js.UndefOr[Boolean] = js.native
  
  /** The number of columns to be inserted. Maximum 20 per request. */
  var number: js.UndefOr[Double] = js.native
  
  /** The table to insert columns into. */
  var tableObjectId: js.UndefOr[String] = js.native
}
object InsertTableColumnsRequest {
  
  @scala.inline
  def apply(): InsertTableColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableColumnsRequest]
  }
  
  @scala.inline
  implicit class InsertTableColumnsRequestMutableBuilder[Self <: InsertTableColumnsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setInsertRight(value: Boolean): Self = StObject.set(x, "insertRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRightUndefined: Self = StObject.set(x, "insertRight", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setTableObjectId(value: String): Self = StObject.set(x, "tableObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableObjectIdUndefined: Self = StObject.set(x, "tableObjectId", js.undefined)
  }
}
