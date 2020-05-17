package typingsSlinky.gapiClientSheets.gapi.client.sheets

import typingsSlinky.gapiClientSheets.anon.Fields
import typingsSlinky.gapiClientSheets.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: Fields): typingsSlinky.gapiClient.gapi.client.Request[SheetProperties] = js.native
  def copyTo(request: Key, body: CopySheetToAnotherSpreadsheetRequest): typingsSlinky.gapiClient.gapi.client.Request[SheetProperties] = js.native
}

