package typingsSlinky.activexDashFaxcomexlib

import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccount_Invoke_ArgNames
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccount_Invoke_Parameter
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServer_Invoke_ArgNames
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServer_Invoke_Parameter
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServer_OnDeviceStatusChange_ArgNames
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServer_OnDeviceStatusChange_Parameter
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.FaxAccount
import typingsSlinky.activexDashFaxcomexlib.FAXCOMEXLib.FaxServer
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.AddRef
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.GetIDsOfNames
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.GetTypeInfo
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.GetTypeInfoCount
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.Invoke
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnActivityLoggingConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnDeviceStatusChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnDevicesConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnEventLoggingConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnGeneralServerConfigChanged
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingArchiveConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingJobAdded
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingJobChanged
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingJobRemoved
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingMessageAdded
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnIncomingMessageRemoved
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnNewCall
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutboundRoutingGroupsConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutboundRoutingRulesConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingArchiveConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingJobAdded
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingJobChanged
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingJobRemoved
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingMessageAdded
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingMessageRemoved
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnOutgoingQueueConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnQueuesStatusChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnReceiptOptionsChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnSecurityConfigChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnServerActivityChange
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.OnServerShutDown
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.QueryInterface
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.Release
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bIncomingQueueBlocked
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bOutgoingQueueBlocked
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bOutgoingQueuePaused
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bstrCallerId
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bstrJobId
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.bstrMessageId
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.cNames
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.fAddedToReceiveFolder
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.fRemovedFromReceiveFolder
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.itinfo
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lCallId
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lDeviceId
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lIncomingMessages
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lOutgoingMessages
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lQueuedMessages
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lRoutingMessages
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.lcid
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pFaxAccount
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pFaxServer
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pJobStatus
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pctinfo
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.pptinfo
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.ppvObj
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.rgdispid
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.rgszNames
import typingsSlinky.activexDashFaxcomexlib.activexDashFaxcomexlibStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: FaxAccount,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fAddedToReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrMessageId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fRemovedFromReceiveFolder],
    handler: js.ThisFunction1[
      /* this */ FaxAccount, 
      /* parameter */ Anon_BstrMessageIdFRemovedFromReceiveFolder, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_BstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnActivityLoggingConfigChange | OnDevicesConfigChange | OnEventLoggingConfigChange | OnGeneralServerConfigChanged | OnIncomingArchiveConfigChange | OnOutboundRoutingGroupsConfigChange | OnOutboundRoutingRulesConfigChange | OnOutgoingArchiveConfigChange | OnOutgoingQueueConfigChange | OnReceiptOptionsChange | OnSecurityConfigChange | OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServerPJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnNewCall,
    argNames: js.Tuple4[pFaxServer, lCallId, lDeviceId, bstrCallerId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrCallerId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServerPJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnQueuesStatusChange,
    argNames: js.Tuple4[pFaxServer, bOutgoingQueueBlocked, bOutgoingQueuePaused, bIncomingQueueBlocked],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_BIncomingQueueBlocked, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnServerActivityChange,
    argNames: js.Tuple5[pFaxServer, lIncomingMessages, lRoutingMessages, lOutgoingMessages, lQueuedMessages],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_LIncomingMessages, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Anon_PpvObj, Unit]
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
    argNames: FaxAccount_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FaxAccount_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxServer,
    event: Invoke,
    argNames: FaxServer_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServer_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnDeviceStatusChange(
    obj: FaxServer,
    event: OnDeviceStatusChange,
    argNames: FaxServer_OnDeviceStatusChange_ArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServer_OnDeviceStatusChange_Parameter, Unit]
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

