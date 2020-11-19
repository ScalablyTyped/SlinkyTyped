package typingsSlinky.exceljs.mod.stream.xlsx

import typingsSlinky.exceljs.mod.Column
import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exceljs", "stream.xlsx.WorksheetReader")
@js.native
class WorksheetReader protected () extends js.Object {
  def this(options: WorksheetReaderOptions) = this()
  
  def columns(): Double = js.native
  
  def dimensions(): Double = js.native
  
  def getColumn(c: Double): Column = js.native
  
  def parse(): AsyncIterator[js.Array[_], _, js.UndefOr[scala.Nothing]] = js.native
  
  def read(): js.Promise[Unit] = js.native
}
