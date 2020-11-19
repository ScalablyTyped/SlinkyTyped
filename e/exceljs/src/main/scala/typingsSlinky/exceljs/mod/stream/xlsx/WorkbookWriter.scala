package typingsSlinky.exceljs.mod.stream.xlsx

import typingsSlinky.exceljs.anon.PartialWorkbookStreamWrit
import typingsSlinky.exceljs.mod.Workbook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exceljs", "stream.xlsx.WorkbookWriter")
@js.native
class WorkbookWriter protected () extends Workbook {
  def this(options: PartialWorkbookStreamWrit) = this()
  
  def addApp(): js.Promise[Unit] = js.native
  
  def addContentTypes(): js.Promise[Unit] = js.native
  
  def addCore(): js.Promise[Unit] = js.native
  
  def addOfficeRels(): js.Promise[Unit] = js.native
  
  def addSharedStrings(): js.Promise[Unit] = js.native
  
  def addStyles(): js.Promise[Unit] = js.native
  
  def addThemes(): js.Promise[Unit] = js.native
  
  def addWorkbook(): js.Promise[Unit] = js.native
  
  def addWorkbookRels(): js.Promise[Unit] = js.native
  
  // commit all worksheets, then add suplimentary files
  def commit(): js.Promise[Unit] = js.native
}
