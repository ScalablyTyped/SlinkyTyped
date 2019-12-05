package typingsSlinky.activexDashAdodb

import typingsSlinky.activexDashAdodb.ADODB.Error
import typingsSlinky.activexDashAdodb.ADODB.EventReasonEnum
import typingsSlinky.activexDashAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexDashAdodb.ADODB.Field
import typingsSlinky.activexDashAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdReason extends js.Object {
  val adReason: EventReasonEnum = js.native
  var adStatus: EventStatusEnum = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

