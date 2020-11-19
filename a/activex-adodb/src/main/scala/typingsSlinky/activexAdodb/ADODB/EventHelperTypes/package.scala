package typingsSlinky.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object EventHelperTypes {
  
  type ConnectionExecuteCompleteArgNames = js.Tuple6[
    typingsSlinky.activexAdodb.activexAdodbStrings.RecordsAffected, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pError, 
    typingsSlinky.activexAdodb.activexAdodbStrings.adStatus, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pCommand, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pRecordset, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pConnection
  ]
  
  type ConnectionWillConnectArgNames = js.Tuple6[
    typingsSlinky.activexAdodb.activexAdodbStrings.ConnectionString, 
    typingsSlinky.activexAdodb.activexAdodbStrings.UserID, 
    typingsSlinky.activexAdodb.activexAdodbStrings.Password, 
    typingsSlinky.activexAdodb.activexAdodbStrings.Options, 
    typingsSlinky.activexAdodb.activexAdodbStrings.adStatus, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pConnection
  ]
  
  type ConnectionWillExecuteArgNames = js.Tuple8[
    typingsSlinky.activexAdodb.activexAdodbStrings.Source, 
    typingsSlinky.activexAdodb.activexAdodbStrings.CursorType, 
    typingsSlinky.activexAdodb.activexAdodbStrings.LockType, 
    typingsSlinky.activexAdodb.activexAdodbStrings.Options, 
    typingsSlinky.activexAdodb.activexAdodbStrings.adStatus, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pCommand, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pRecordset, 
    typingsSlinky.activexAdodb.activexAdodbStrings.pConnection
  ]
}
