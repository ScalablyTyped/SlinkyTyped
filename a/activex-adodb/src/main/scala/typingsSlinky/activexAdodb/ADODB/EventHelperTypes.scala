package typingsSlinky.activexAdodb.ADODB

import typingsSlinky.activexAdodb.activexAdodbStrings.ConnectionString
import typingsSlinky.activexAdodb.activexAdodbStrings.CursorType
import typingsSlinky.activexAdodb.activexAdodbStrings.LockType
import typingsSlinky.activexAdodb.activexAdodbStrings.Options
import typingsSlinky.activexAdodb.activexAdodbStrings.Password
import typingsSlinky.activexAdodb.activexAdodbStrings.RecordsAffected
import typingsSlinky.activexAdodb.activexAdodbStrings.Source
import typingsSlinky.activexAdodb.activexAdodbStrings.UserID
import typingsSlinky.activexAdodb.activexAdodbStrings.adStatus
import typingsSlinky.activexAdodb.activexAdodbStrings.pCommand
import typingsSlinky.activexAdodb.activexAdodbStrings.pConnection
import typingsSlinky.activexAdodb.activexAdodbStrings.pError
import typingsSlinky.activexAdodb.activexAdodbStrings.pRecordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ConnectionExecuteCompleteArgNames = js.Tuple6[RecordsAffected, pError, adStatus, pCommand, pRecordset, pConnection]
  
  @js.native
  trait ConnectionExecuteCompleteParameter extends StObject {
    
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
  
  type ConnectionWillConnectArgNames = js.Tuple6[ConnectionString, UserID, Password, Options, adStatus, pConnection]
  
  @js.native
  trait ConnectionWillConnectParameter extends StObject {
    
    var ConnectionString: String = js.native
    
    var Options: Double = js.native
    
    var Password: String = js.native
    
    var UserID: String = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val pConnection: Connection = js.native
  }
  object ConnectionWillConnectParameter {
    
    @scala.inline
    def apply(
      ConnectionString: String,
      Options: Double,
      Password: String,
      UserID: String,
      adStatus: EventStatusEnum,
      pConnection: Connection
    ): ConnectionWillConnectParameter = {
      val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], adStatus = adStatus.asInstanceOf[js.Any], pConnection = pConnection.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionWillConnectParameter]
    }
    
    @scala.inline
    implicit class ConnectionWillConnectParameterMutableBuilder[Self <: ConnectionWillConnectParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdStatus(value: EventStatusEnum): Self = StObject.set(x, "adStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionString(value: String): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Double): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPConnection(value: Connection): Self = StObject.set(x, "pConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserID(value: String): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionWillExecuteArgNames = js.Tuple8[Source, CursorType, LockType, Options, adStatus, pCommand, pRecordset, pConnection]
  
  @js.native
  trait ConnectionWillExecuteParameter extends StObject {
    
    var CursorType: CursorTypeEnum = js.native
    
    var LockType: LockTypeEnum = js.native
    
    var Options: Double = js.native
    
    var Source: String = js.native
    
    var adStatus: EventStatusEnum = js.native
    
    val pCommand: Command = js.native
    
    val pConnection: Connection = js.native
    
    def pRecordset(FieldIndex: String): Field = js.native
    def pRecordset(FieldIndex: Double): Field = js.native
    @JSName("pRecordset")
    val pRecordset_Original: Recordset = js.native
  }
}
