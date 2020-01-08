package typingsSlinky.gapiDotClientDotSheets.gapi.client.sheets

import typingsSlinky.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFields
import typingsSlinky.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: Anon_AccesstokenAltCallbackFields): typingsSlinky.gapiDotClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Anon_AccesstokenAltCallbackFieldsKey, body: CopySheetToAnotherSpreadsheetRequest): typingsSlinky.gapiDotClient.gapi.client.Request[SheetProperties] = js.native
}

