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
  @JSName("ADODB.Command")
  var ADODBDotCommand: Command = js.native
  @JSName("ADODB.Connection")
  var ADODBDotConnection: Connection = js.native
  @JSName("ADODB.Parameter")
  var ADODBDotParameter: Parameter = js.native
  @JSName("ADODB.Record")
  var ADODBDotRecord: Record = js.native
  @JSName("ADODB.Recordset")
  var ADODBDotRecordset_Original: Recordset = js.native
  @JSName("ADODB.Stream")
  var ADODBDotStream: Stream = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: String): Field = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: Double): Field = js.native
}

