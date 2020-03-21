package typingsSlinky.activexAdodb

import typingsSlinky.activexAdodb.ADODB.Command
import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.Field
import typingsSlinky.activexAdodb.ADODB.Parameter
import typingsSlinky.activexAdodb.ADODB.Record
import typingsSlinky.activexAdodb.ADODB.Recordset
import typingsSlinky.activexAdodb.ADODB.Stream
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

