package typingsSlinky.exceljs.mod.stream.xlsx

import typingsSlinky.exceljs.anon.PartialWorkbookStreamRead
import typingsSlinky.exceljs.mod.Workbook
import typingsSlinky.node.streamMod.Stream
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exceljs", "stream.xlsx.WorkbookReader")
@js.native
class WorkbookReader protected () extends Workbook {
  def this(input: String, options: PartialWorkbookStreamRead) = this()
  def this(input: Stream, options: PartialWorkbookStreamRead) = this()
  
  def parse(): AsyncIterator[_, _, js.UndefOr[scala.Nothing]] = js.native
  
  def read(): js.Promise[Unit] = js.native
}
