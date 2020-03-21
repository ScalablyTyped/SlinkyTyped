package typingsSlinky.activexFaxcomexlib

import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeArgNames
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeParameter
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeArgNames
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeParameter
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeArgNames
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeParameter
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typingsSlinky.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.AddRef
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.GetIDsOfNames
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfo
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfoCount
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.Invoke
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnActivityLoggingConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnDeviceStatusChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnDevicesConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnEventLoggingConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnGeneralServerConfigChanged
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingArchiveConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobAdded
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobChanged
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobRemoved
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageAdded
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageRemoved
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnNewCall
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingGroupsConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingRulesConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingArchiveConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobAdded
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobChanged
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobRemoved
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageAdded
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageRemoved
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingQueueConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnQueuesStatusChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnReceiptOptionsChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnSecurityConfigChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerActivityChange
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerShutDown
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.QueryInterface
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.Release
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bIncomingQueueBlocked
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueueBlocked
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueuePaused
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bstrCallerId
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bstrJobId
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.bstrMessageId
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.cNames
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.fAddedToReceiveFolder
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.fRemovedFromReceiveFolder
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.itinfo
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lCallId
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lIncomingMessages
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lOutgoingMessages
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lQueuedMessages
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lRoutingMessages
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.lcid
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxAccount
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pJobStatus
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pctinfo
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.pptinfo
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.ppvObj
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.rgdispid
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.rgszNames
import typingsSlinky.activexFaxcomexlib.activexFaxcomexlibStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: FaxAccount,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fAddedToReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrMessageId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fRemovedFromReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonFRemovedFromReceiveFolder, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonBstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnActivityLoggingConfigChange | OnDevicesConfigChange | OnEventLoggingConfigChange | OnGeneralServerConfigChanged | OnIncomingArchiveConfigChange | OnOutboundRoutingGroupsConfigChange | OnOutboundRoutingRulesConfigChange | OnOutgoingArchiveConfigChange | OnOutgoingQueueConfigChange | OnReceiptOptionsChange | OnSecurityConfigChange | OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonPJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnNewCall,
    argNames: js.Tuple4[pFaxServer, lCallId, lDeviceId, bstrCallerId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrCallerId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonPJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnQueuesStatusChange,
    argNames: js.Tuple4[pFaxServer, bOutgoingQueueBlocked, bOutgoingQueuePaused, bIncomingQueueBlocked],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonBIncomingQueueBlocked, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnServerActivityChange,
    argNames: js.Tuple5[pFaxServer, lIncomingMessages, lRoutingMessages, lOutgoingMessages, lQueuedMessages],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonLIncomingMessages, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: FaxAccount,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: FaxServer,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxAccount,
    event: Invoke,
    argNames: FaxAccountInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FaxAccountInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxServer,
    event: Invoke,
    argNames: FaxServerInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnDeviceStatusChange(
    obj: FaxServer,
    event: OnDeviceStatusChange,
    argNames: FaxServerOnDeviceStatusChangeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerOnDeviceStatusChangeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: FaxAccount,
    event: Release,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: FaxServer,
    event: Release,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

