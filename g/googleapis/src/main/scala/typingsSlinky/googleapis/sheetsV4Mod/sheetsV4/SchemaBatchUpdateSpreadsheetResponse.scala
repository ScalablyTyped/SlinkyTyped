package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reply for batch updating a spreadsheet.
  */
@js.native
trait SchemaBatchUpdateSpreadsheetResponse extends StObject {
  
  /**
    * The reply of the updates.  This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[SchemaResponse]] = js.native
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  
  /**
    * The spreadsheet after updates were applied. This is only set if
    * [BatchUpdateSpreadsheetRequest.include_spreadsheet_in_response] is
    * `true`.
    */
  var updatedSpreadsheet: js.UndefOr[SchemaSpreadsheet] = js.native
}
object SchemaBatchUpdateSpreadsheetResponse {
  
  @scala.inline
  def apply(): SchemaBatchUpdateSpreadsheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdateSpreadsheetResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdateSpreadsheetResponseMutableBuilder[Self <: SchemaBatchUpdateSpreadsheetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplies(value: js.Array[SchemaResponse]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
    
    @scala.inline
    def setRepliesVarargs(value: SchemaResponse*): Self = StObject.set(x, "replies", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setUpdatedSpreadsheet(value: SchemaSpreadsheet): Self = StObject.set(x, "updatedSpreadsheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedSpreadsheetUndefined: Self = StObject.set(x, "updatedSpreadsheet", js.undefined)
  }
}
