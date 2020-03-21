package typingsSlinky.activexAdodb.ADODB.EventHelperTypes

import typingsSlinky.activexAdodb.ADODB.Command
import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.CursorTypeEnum
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexAdodb.ADODB.Field
import typingsSlinky.activexAdodb.ADODB.LockTypeEnum
import typingsSlinky.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionWillExecuteParameter extends js.Object {
  var CursorType: CursorTypeEnum = js.native
  var LockType: LockTypeEnum = js.native
  var Options: Double = js.native
  var Source: String = js.native
  var adStatus: EventStatusEnum = js.native
  val pCommand: Command = js.native
  val pConnection: Connection = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

