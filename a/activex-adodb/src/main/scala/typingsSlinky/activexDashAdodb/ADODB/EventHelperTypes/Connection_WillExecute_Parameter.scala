package typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes

import typingsSlinky.activexDashAdodb.ADODB.Command
import typingsSlinky.activexDashAdodb.ADODB.Connection
import typingsSlinky.activexDashAdodb.ADODB.CursorTypeEnum
import typingsSlinky.activexDashAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexDashAdodb.ADODB.Field
import typingsSlinky.activexDashAdodb.ADODB.LockTypeEnum
import typingsSlinky.activexDashAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection_WillExecute_Parameter extends js.Object {
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

