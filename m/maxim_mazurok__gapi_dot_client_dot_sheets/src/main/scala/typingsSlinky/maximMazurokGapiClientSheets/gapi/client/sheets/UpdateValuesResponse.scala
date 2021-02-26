package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateValuesResponse extends StObject {
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /** The number of cells updated. */
  var updatedCells: js.UndefOr[Double] = js.native
  
  /** The number of columns where at least one cell in the column was updated. */
  var updatedColumns: js.UndefOr[Double] = js.native
  
  /** The values of the cells after updates were applied. This is only included if the request's `includeValuesInResponse` field was `true`. */
  var updatedData: js.UndefOr[ValueRange] = js.native
  
  /** The range (in A1 notation) that updates were applied to. */
  var updatedRange: js.UndefOr[String] = js.native
  
  /** The number of rows where at least one cell in the row was updated. */
  var updatedRows: js.UndefOr[Double] = js.native
}
object UpdateValuesResponse {
  
  @scala.inline
  def apply(): UpdateValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateValuesResponse]
  }
  
  @scala.inline
  implicit class UpdateValuesResponseMutableBuilder[Self <: UpdateValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setUpdatedCells(value: Double): Self = StObject.set(x, "updatedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedCellsUndefined: Self = StObject.set(x, "updatedCells", js.undefined)
    
    @scala.inline
    def setUpdatedColumns(value: Double): Self = StObject.set(x, "updatedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedColumnsUndefined: Self = StObject.set(x, "updatedColumns", js.undefined)
    
    @scala.inline
    def setUpdatedData(value: ValueRange): Self = StObject.set(x, "updatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDataUndefined: Self = StObject.set(x, "updatedData", js.undefined)
    
    @scala.inline
    def setUpdatedRange(value: String): Self = StObject.set(x, "updatedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRangeUndefined: Self = StObject.set(x, "updatedRange", js.undefined)
    
    @scala.inline
    def setUpdatedRows(value: Double): Self = StObject.set(x, "updatedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedRowsUndefined: Self = StObject.set(x, "updatedRows", js.undefined)
  }
}
