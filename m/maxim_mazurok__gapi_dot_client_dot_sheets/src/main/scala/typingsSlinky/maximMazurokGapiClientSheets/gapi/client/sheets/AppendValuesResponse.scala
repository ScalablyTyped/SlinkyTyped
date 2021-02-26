package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendValuesResponse extends StObject {
  
  /** The spreadsheet the updates were applied to. */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /** The range (in A1 notation) of the table that values are being appended to (before the values were appended). Empty if no table was found. */
  var tableRange: js.UndefOr[String] = js.native
  
  /** Information about the updates that were applied. */
  var updates: js.UndefOr[UpdateValuesResponse] = js.native
}
object AppendValuesResponse {
  
  @scala.inline
  def apply(): AppendValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendValuesResponse]
  }
  
  @scala.inline
  implicit class AppendValuesResponseMutableBuilder[Self <: AppendValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setTableRange(value: String): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
    
    @scala.inline
    def setUpdates(value: UpdateValuesResponse): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
  }
}
