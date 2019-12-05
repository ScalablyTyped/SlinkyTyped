package typingsSlinky.activexDashAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.ConnectionString
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.CursorType
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.LockType
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Options
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Password
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.RecordsAffected
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Source
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.UserID
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.adStatus
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pCommand
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pConnection
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pError
  import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pRecordset

  type Connection_ExecuteComplete_ArgNames = js.Tuple6[RecordsAffected, pError, adStatus, pCommand, pRecordset, pConnection]
  type Connection_WillConnect_ArgNames = js.Tuple6[ConnectionString, UserID, Password, Options, adStatus, pConnection]
  type Connection_WillExecute_ArgNames = js.Tuple8[Source, CursorType, LockType, Options, adStatus, pCommand, pRecordset, pConnection]
}
