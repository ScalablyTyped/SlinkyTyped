package typingsSlinky.activexDashAdodb

import typingsSlinky.activexDashAdodb.ADODB.Command
import typingsSlinky.activexDashAdodb.ADODB.Connection
import typingsSlinky.activexDashAdodb.ADODB.Field
import typingsSlinky.activexDashAdodb.ADODB.Parameter
import typingsSlinky.activexDashAdodb.ADODB.Record
import typingsSlinky.activexDashAdodb.ADODB.Recordset
import typingsSlinky.activexDashAdodb.ADODB.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  var `ADODB.Command`: Command = js.native
  var `ADODB.Connection`: Connection = js.native
  var `ADODB.Parameter`: Parameter = js.native
  var `ADODB.Record`: Record = js.native
  @JSName("ADODB.Recordset")
  var `ADODB.Recordset_Original`: Recordset = js.native
  var `ADODB.Stream`: Stream = js.native
  def `ADODB.Recordset`(FieldIndex: String): Field = js.native
  def `ADODB.Recordset`(FieldIndex: Double): Field = js.native
}

