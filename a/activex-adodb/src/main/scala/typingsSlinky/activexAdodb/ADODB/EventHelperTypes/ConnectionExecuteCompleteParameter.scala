package typingsSlinky.activexAdodb.ADODB.EventHelperTypes

import typingsSlinky.activexAdodb.ADODB.Command
import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.Error
import typingsSlinky.activexAdodb.ADODB.EventStatusEnum
import typingsSlinky.activexAdodb.ADODB.Field
import typingsSlinky.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionExecuteCompleteParameter extends js.Object {
  
  val RecordsAffected: Double = js.native
  
  var adStatus: EventStatusEnum = js.native
  
  val pCommand: Command = js.native
  
  val pConnection: Connection = js.native
  
  val pError: Error = js.native
  
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
}
