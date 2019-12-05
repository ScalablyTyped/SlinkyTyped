package typingsSlinky.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Subdocument")
@js.native
class Subdocument protected () extends js.Object {
  val Application: typingsSlinky.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val HasFile: Boolean = js.native
  val Level: Double = js.native
  var Locked: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val Range: typingsSlinky.activexDashWord.Word.Range = js.native
  var `Word.Subdocument_typekey`: Subdocument = js.native
  def Delete(): Unit = js.native
  def Open(): Document = js.native
  def Split(Range: typingsSlinky.activexDashWord.Word.Range): Unit = js.native
}

