package typingsSlinky.activexAdodb

import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexAdodb.ADODB.Field
import typingsSlinky.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxProgress extends js.Object {
  val MaxProgress: Double = js.native
  val Progress: Double = js.native
  var adStatus: EventStatusEnum = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

