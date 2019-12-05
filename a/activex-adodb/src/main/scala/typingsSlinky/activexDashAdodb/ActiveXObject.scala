package typingsSlinky.activexDashAdodb

import typingsSlinky.activexDashAdodb.ADODB.Connection
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_ExecuteComplete_ArgNames
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_ExecuteComplete_Parameter
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_WillConnect_ArgNames
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_WillConnect_Parameter
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_WillExecute_ArgNames
import typingsSlinky.activexDashAdodb.ADODB.EventHelperTypes.Connection_WillExecute_Parameter
import typingsSlinky.activexDashAdodb.ADODB.Recordset
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.BeginTransComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Collect
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.CommitTransComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.ConnectComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Disconnect
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.EndOfRecordset
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.ExecuteComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.FetchComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.FetchProgress
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.FieldChangeComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Fields
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.InfoMessage
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.MaxProgress
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.MoveComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.Progress
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.RecordChangeComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.RecordsetChangeComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.RollbackTransComplete
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.TransactionLevel
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillChangeField
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillChangeRecord
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillChangeRecordset
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillConnect
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillExecute
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.WillMove
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.adReason
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.adStatus
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.cFields
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.cRecords
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.fMoreData
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pConnection
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pError
import typingsSlinky.activexDashAdodb.activexDashAdodbStrings.pRecordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Connection,
    event: BeginTransComplete,
    argNames: js.Tuple4[TransactionLevel, pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: CommitTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: ConnectComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: Disconnect,
    argNames: js.Tuple2[adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnectionConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: InfoMessage,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: RollbackTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: EndOfRecordset,
    argNames: js.Tuple3[fMoreData, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusFMoreData, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchComplete,
    argNames: js.Tuple3[pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusPError, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchProgress,
    argNames: js.Tuple4[Progress, MaxProgress, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusMaxProgress, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FieldChangeComplete,
    argNames: js.Tuple5[cFields, Fields, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusCFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: MoveComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordChangeComplete,
    argNames: js.Tuple5[adReason, cRecords, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordsetChangeComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeField,
    argNames: js.Tuple4[cFields, Fields, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusCFieldsFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecord,
    argNames: js.Tuple4[adReason, cRecords, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusCRecords, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecordset,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusPRecordset, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillMove,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusPRecordset, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: Connection,
    event: ExecuteComplete,
    argNames: Connection_ExecuteComplete_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_ExecuteComplete_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: Connection,
    event: WillConnect,
    argNames: Connection_WillConnect_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_WillConnect_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: Connection,
    event: WillExecute,
    argNames: Connection_WillExecute_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_WillExecute_Parameter, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Collect(obj: Recordset, propertyName: Collect, parameterTypes: js.Array[_], newValue: js.Any): Unit = js.native
}

