package typingsSlinky.activexAdodb

import typingsSlinky.activexAdodb.ADODB.Connection
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteArgNames
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteParameter
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectArgNames
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectParameter
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteArgNames
import typingsSlinky.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteParameter
import typingsSlinky.activexAdodb.ADODB.Recordset
import typingsSlinky.activexAdodb.activexAdodbStrings.BeginTransComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.Collect
import typingsSlinky.activexAdodb.activexAdodbStrings.CommitTransComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.ConnectComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.Disconnect
import typingsSlinky.activexAdodb.activexAdodbStrings.EndOfRecordset
import typingsSlinky.activexAdodb.activexAdodbStrings.ExecuteComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.FetchComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.FetchProgress
import typingsSlinky.activexAdodb.activexAdodbStrings.FieldChangeComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.Fields
import typingsSlinky.activexAdodb.activexAdodbStrings.InfoMessage
import typingsSlinky.activexAdodb.activexAdodbStrings.MaxProgress
import typingsSlinky.activexAdodb.activexAdodbStrings.MoveComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.Progress
import typingsSlinky.activexAdodb.activexAdodbStrings.RecordChangeComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.RecordsetChangeComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.RollbackTransComplete
import typingsSlinky.activexAdodb.activexAdodbStrings.TransactionLevel
import typingsSlinky.activexAdodb.activexAdodbStrings.WillChangeField
import typingsSlinky.activexAdodb.activexAdodbStrings.WillChangeRecord
import typingsSlinky.activexAdodb.activexAdodbStrings.WillChangeRecordset
import typingsSlinky.activexAdodb.activexAdodbStrings.WillConnect
import typingsSlinky.activexAdodb.activexAdodbStrings.WillExecute
import typingsSlinky.activexAdodb.activexAdodbStrings.WillMove
import typingsSlinky.activexAdodb.activexAdodbStrings.adReason
import typingsSlinky.activexAdodb.activexAdodbStrings.adStatus
import typingsSlinky.activexAdodb.activexAdodbStrings.cFields
import typingsSlinky.activexAdodb.activexAdodbStrings.cRecords
import typingsSlinky.activexAdodb.activexAdodbStrings.fMoreData
import typingsSlinky.activexAdodb.activexAdodbStrings.pConnection
import typingsSlinky.activexAdodb.activexAdodbStrings.pError
import typingsSlinky.activexAdodb.activexAdodbStrings.pRecordset
import typingsSlinky.activexAdodb.anon.AdReason
import typingsSlinky.activexAdodb.anon.AdReasonAdStatus
import typingsSlinky.activexAdodb.anon.AdStatus
import typingsSlinky.activexAdodb.anon.AdStatusPConnection
import typingsSlinky.activexAdodb.anon.CFields
import typingsSlinky.activexAdodb.anon.CRecords
import typingsSlinky.activexAdodb.anon.FMoreData
import typingsSlinky.activexAdodb.anon.PConnection
import typingsSlinky.activexAdodb.anon.PError
import typingsSlinky.activexAdodb.anon.PRecordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Connection,
    event: BeginTransComplete,
    argNames: js.Tuple4[TransactionLevel, pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: CommitTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: ConnectComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: Disconnect,
    argNames: js.Tuple2[adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: InfoMessage,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: RollbackTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: EndOfRecordset,
    argNames: js.Tuple3[fMoreData, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ FMoreData, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchComplete,
    argNames: js.Tuple3[pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ PError, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchProgress,
    argNames: js.Tuple4[Progress, MaxProgress, adStatus, pRecordset],
    handler: js.ThisFunction1[
      /* this */ Recordset, 
      /* parameter */ typingsSlinky.activexAdodb.anon.MaxProgress, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FieldChangeComplete,
    argNames: js.Tuple5[cFields, Fields, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ CFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: MoveComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordChangeComplete,
    argNames: js.Tuple5[adReason, cRecords, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ CRecords, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordsetChangeComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeField,
    argNames: js.Tuple4[cFields, Fields, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ typingsSlinky.activexAdodb.anon.Fields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecord,
    argNames: js.Tuple4[adReason, cRecords, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ PRecordset, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecordset,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReasonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillMove,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReasonAdStatus, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: Connection,
    event: ExecuteComplete,
    argNames: ConnectionExecuteCompleteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionExecuteCompleteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: Connection,
    event: WillConnect,
    argNames: ConnectionWillConnectArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillConnectParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: Connection,
    event: WillExecute,
    argNames: ConnectionWillExecuteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillExecuteParameter, Unit]
  ): Unit = js.native
  
  @JSName("set")
  def set_Collect(obj: Recordset, propertyName: Collect, parameterTypes: js.Array[_], newValue: js.Any): Unit = js.native
}
