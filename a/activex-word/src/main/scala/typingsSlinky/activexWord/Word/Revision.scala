package typingsSlinky.activexWord.Word

import typingsSlinky.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Revision")
@js.native
class Revision protected () extends js.Object {
  val Application: typingsSlinky.activexWord.Word.Application = js.native
  val Author: String = js.native
  val Cells: typingsSlinky.activexWord.Word.Cells = js.native
  val Creator: Double = js.native
  val Date: VarDate = js.native
  val FormatDescription: String = js.native
  val Index: Double = js.native
  val MovedRange: typingsSlinky.activexWord.Word.Range = js.native
  val Parent: js.Any = js.native
  val Range: typingsSlinky.activexWord.Word.Range = js.native
  val Style: typingsSlinky.activexWord.Word.Style = js.native
  val Type: WdRevisionType = js.native
  @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision = js.native
  def Accept(): Unit = js.native
  def Reject(): Unit = js.native
}

