package typingsSlinky.kendoUi.kendo.ui

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.kendoUi.JQuery
import typingsSlinky.kendoUi.JQueryPromise
import typingsSlinky.kendoUi.kendo.spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spreadsheet extends Widget {
  
  def activeSheet(): Unit = js.native
  def activeSheet(sheet: Sheet): Unit = js.native
  @JSName("activeSheet")
  def activeSheet_Sheet(): Sheet = js.native
  
  def cellContextMenu(): ContextMenu = js.native
  
  def colHeaderContextMenu(): ContextMenu = js.native
  
  def defineName(name: String, value: String, hidden: Boolean): Unit = js.native
  
  def fromFile(blob: Blob): JQueryPromise[_] = js.native
  def fromFile(blob: File): JQueryPromise[_] = js.native
  
  def fromJSON(data: js.Any): Unit = js.native
  
  def insertSheet(options: js.Any): Sheet = js.native
  
  def moveSheetToIndex(sheet: Sheet, index: Double): Unit = js.native
  
  @JSName("options")
  var options_Spreadsheet: SpreadsheetOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeSheet(sheet: Sheet): Unit = js.native
  
  def renameSheet(sheet: Sheet, newSheetName: String): Sheet = js.native
  
  def rowHeaderContextMenu(): ContextMenu = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[_] = js.native
  
  def sheetByIndex(index: Double): Sheet = js.native
  
  def sheetByName(name: String): Sheet = js.native
  
  def sheetIndex(sheet: Sheet): Double = js.native
  
  def sheets(): js.Any = js.native
  
  def toJSON(): js.Any = js.native
  
  def undefineName(name: String): Unit = js.native
  
  var wrapper: JQuery = js.native
}
