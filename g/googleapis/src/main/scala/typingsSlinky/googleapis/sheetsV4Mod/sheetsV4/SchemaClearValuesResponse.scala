package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response when clearing a range of values in a spreadsheet.
  */
@js.native
trait SchemaClearValuesResponse extends StObject {
  
  /**
    * The range (in A1 notation) that was cleared. (If the request was for an
    * unbounded range or a ranger larger  than the bounds of the sheet, this
    * will be the actual range  that was cleared, bounded to the sheet&#39;s
    * limits.)
    */
  var clearedRange: js.UndefOr[String] = js.native
  
  /**
    * The spreadsheet the updates were applied to.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SchemaClearValuesResponse {
  
  @scala.inline
  def apply(): SchemaClearValuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClearValuesResponse]
  }
  
  @scala.inline
  implicit class SchemaClearValuesResponseMutableBuilder[Self <: SchemaClearValuesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearedRange(value: String): Self = StObject.set(x, "clearedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearedRangeUndefined: Self = StObject.set(x, "clearedRange", js.undefined)
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
