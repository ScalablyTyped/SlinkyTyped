package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopySheetToAnotherSpreadsheetRequest extends js.Object {
  
  /** The ID of the spreadsheet to copy the sheet to. */
  var destinationSpreadsheetId: js.UndefOr[String] = js.native
}
object CopySheetToAnotherSpreadsheetRequest {
  
  @scala.inline
  def apply(): CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
  }
  
  @scala.inline
  implicit class CopySheetToAnotherSpreadsheetRequestOps[Self <: CopySheetToAnotherSpreadsheetRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationSpreadsheetId(value: String): Self = this.set("destinationSpreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationSpreadsheetId: Self = this.set("destinationSpreadsheetId", js.undefined)
  }
}
