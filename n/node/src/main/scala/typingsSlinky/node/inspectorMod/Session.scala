package typingsSlinky.node.inspectorMod

import typingsSlinky.node.Error
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.inspectorMod.Console.MessageAddedEventDataType
import typingsSlinky.node.inspectorMod.Debugger.BreakpointResolvedEventDataType
import typingsSlinky.node.inspectorMod.Debugger.ContinueToLocationParameterType
import typingsSlinky.node.inspectorMod.Debugger.EnableReturnType
import typingsSlinky.node.inspectorMod.Debugger.EvaluateOnCallFrameParameterType
import typingsSlinky.node.inspectorMod.Debugger.EvaluateOnCallFrameReturnType
import typingsSlinky.node.inspectorMod.Debugger.GetPossibleBreakpointsParameterType
import typingsSlinky.node.inspectorMod.Debugger.GetPossibleBreakpointsReturnType
import typingsSlinky.node.inspectorMod.Debugger.GetScriptSourceParameterType
import typingsSlinky.node.inspectorMod.Debugger.GetScriptSourceReturnType
import typingsSlinky.node.inspectorMod.Debugger.GetStackTraceParameterType
import typingsSlinky.node.inspectorMod.Debugger.GetStackTraceReturnType
import typingsSlinky.node.inspectorMod.Debugger.PauseOnAsyncCallParameterType
import typingsSlinky.node.inspectorMod.Debugger.PausedEventDataType
import typingsSlinky.node.inspectorMod.Debugger.RemoveBreakpointParameterType
import typingsSlinky.node.inspectorMod.Debugger.RestartFrameParameterType
import typingsSlinky.node.inspectorMod.Debugger.RestartFrameReturnType
import typingsSlinky.node.inspectorMod.Debugger.ScriptFailedToParseEventDataType
import typingsSlinky.node.inspectorMod.Debugger.ScriptParsedEventDataType
import typingsSlinky.node.inspectorMod.Debugger.SearchInContentParameterType
import typingsSlinky.node.inspectorMod.Debugger.SearchInContentReturnType
import typingsSlinky.node.inspectorMod.Debugger.SetAsyncCallStackDepthParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetBlackboxPatternsParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetBlackboxedRangesParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetBreakpointByUrlParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetBreakpointByUrlReturnType
import typingsSlinky.node.inspectorMod.Debugger.SetBreakpointParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetBreakpointReturnType
import typingsSlinky.node.inspectorMod.Debugger.SetBreakpointsActiveParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetPauseOnExceptionsParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetReturnValueParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetScriptSourceParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetScriptSourceReturnType
import typingsSlinky.node.inspectorMod.Debugger.SetSkipAllPausesParameterType
import typingsSlinky.node.inspectorMod.Debugger.SetVariableValueParameterType
import typingsSlinky.node.inspectorMod.Debugger.StepIntoParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.AddHeapSnapshotChunkEventDataType
import typingsSlinky.node.inspectorMod.HeapProfiler.AddInspectedHeapObjectParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.GetHeapObjectIdParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.GetHeapObjectIdReturnType
import typingsSlinky.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.GetObjectByHeapObjectIdReturnType
import typingsSlinky.node.inspectorMod.HeapProfiler.GetSamplingProfileReturnType
import typingsSlinky.node.inspectorMod.HeapProfiler.HeapStatsUpdateEventDataType
import typingsSlinky.node.inspectorMod.HeapProfiler.LastSeenObjectIdEventDataType
import typingsSlinky.node.inspectorMod.HeapProfiler.ReportHeapSnapshotProgressEventDataType
import typingsSlinky.node.inspectorMod.HeapProfiler.StartSamplingParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.StartTrackingHeapObjectsParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.StopSamplingReturnType
import typingsSlinky.node.inspectorMod.HeapProfiler.StopTrackingHeapObjectsParameterType
import typingsSlinky.node.inspectorMod.HeapProfiler.TakeHeapSnapshotParameterType
import typingsSlinky.node.inspectorMod.NodeRuntime.NotifyWhenWaitingForDisconnectParameterType
import typingsSlinky.node.inspectorMod.NodeTracing.DataCollectedEventDataType
import typingsSlinky.node.inspectorMod.NodeTracing.GetCategoriesReturnType
import typingsSlinky.node.inspectorMod.NodeTracing.StartParameterType
import typingsSlinky.node.inspectorMod.NodeWorker.AttachedToWorkerEventDataType
import typingsSlinky.node.inspectorMod.NodeWorker.DetachParameterType
import typingsSlinky.node.inspectorMod.NodeWorker.DetachedFromWorkerEventDataType
import typingsSlinky.node.inspectorMod.NodeWorker.EnableParameterType
import typingsSlinky.node.inspectorMod.NodeWorker.ReceivedMessageFromWorkerEventDataType
import typingsSlinky.node.inspectorMod.NodeWorker.SendMessageToWorkerParameterType
import typingsSlinky.node.inspectorMod.Profiler.ConsoleProfileFinishedEventDataType
import typingsSlinky.node.inspectorMod.Profiler.ConsoleProfileStartedEventDataType
import typingsSlinky.node.inspectorMod.Profiler.GetBestEffortCoverageReturnType
import typingsSlinky.node.inspectorMod.Profiler.SetSamplingIntervalParameterType
import typingsSlinky.node.inspectorMod.Profiler.StartPreciseCoverageParameterType
import typingsSlinky.node.inspectorMod.Profiler.StopReturnType
import typingsSlinky.node.inspectorMod.Profiler.TakePreciseCoverageReturnType
import typingsSlinky.node.inspectorMod.Profiler.TakeTypeProfileReturnType
import typingsSlinky.node.inspectorMod.Runtime.AwaitPromiseParameterType
import typingsSlinky.node.inspectorMod.Runtime.AwaitPromiseReturnType
import typingsSlinky.node.inspectorMod.Runtime.CallFunctionOnParameterType
import typingsSlinky.node.inspectorMod.Runtime.CallFunctionOnReturnType
import typingsSlinky.node.inspectorMod.Runtime.CompileScriptParameterType
import typingsSlinky.node.inspectorMod.Runtime.CompileScriptReturnType
import typingsSlinky.node.inspectorMod.Runtime.ConsoleAPICalledEventDataType
import typingsSlinky.node.inspectorMod.Runtime.EvaluateParameterType
import typingsSlinky.node.inspectorMod.Runtime.EvaluateReturnType
import typingsSlinky.node.inspectorMod.Runtime.ExceptionRevokedEventDataType
import typingsSlinky.node.inspectorMod.Runtime.ExceptionThrownEventDataType
import typingsSlinky.node.inspectorMod.Runtime.ExecutionContextCreatedEventDataType
import typingsSlinky.node.inspectorMod.Runtime.ExecutionContextDestroyedEventDataType
import typingsSlinky.node.inspectorMod.Runtime.GetPropertiesParameterType
import typingsSlinky.node.inspectorMod.Runtime.GetPropertiesReturnType
import typingsSlinky.node.inspectorMod.Runtime.GlobalLexicalScopeNamesParameterType
import typingsSlinky.node.inspectorMod.Runtime.GlobalLexicalScopeNamesReturnType
import typingsSlinky.node.inspectorMod.Runtime.InspectRequestedEventDataType
import typingsSlinky.node.inspectorMod.Runtime.QueryObjectsParameterType
import typingsSlinky.node.inspectorMod.Runtime.QueryObjectsReturnType
import typingsSlinky.node.inspectorMod.Runtime.ReleaseObjectGroupParameterType
import typingsSlinky.node.inspectorMod.Runtime.ReleaseObjectParameterType
import typingsSlinky.node.inspectorMod.Runtime.RunScriptParameterType
import typingsSlinky.node.inspectorMod.Runtime.RunScriptReturnType
import typingsSlinky.node.inspectorMod.Runtime.SetCustomObjectFormatterEnabledParameterType
import typingsSlinky.node.inspectorMod.Schema.GetDomainsReturnType
import typingsSlinky.node.nodeStrings.ConsoleDOTclearMessages
import typingsSlinky.node.nodeStrings.ConsoleDOTdisable
import typingsSlinky.node.nodeStrings.ConsoleDOTenable
import typingsSlinky.node.nodeStrings.ConsoleDOTmessageAdded
import typingsSlinky.node.nodeStrings.DebuggerDOTbreakpointResolved
import typingsSlinky.node.nodeStrings.DebuggerDOTcontinueToLocation
import typingsSlinky.node.nodeStrings.DebuggerDOTdisable
import typingsSlinky.node.nodeStrings.DebuggerDOTenable
import typingsSlinky.node.nodeStrings.DebuggerDOTevaluateOnCallFrame
import typingsSlinky.node.nodeStrings.DebuggerDOTgetPossibleBreakpoints
import typingsSlinky.node.nodeStrings.DebuggerDOTgetScriptSource
import typingsSlinky.node.nodeStrings.DebuggerDOTgetStackTrace
import typingsSlinky.node.nodeStrings.DebuggerDOTpause
import typingsSlinky.node.nodeStrings.DebuggerDOTpauseOnAsyncCall
import typingsSlinky.node.nodeStrings.DebuggerDOTpaused
import typingsSlinky.node.nodeStrings.DebuggerDOTremoveBreakpoint
import typingsSlinky.node.nodeStrings.DebuggerDOTrestartFrame
import typingsSlinky.node.nodeStrings.DebuggerDOTresume
import typingsSlinky.node.nodeStrings.DebuggerDOTresumed
import typingsSlinky.node.nodeStrings.DebuggerDOTscheduleStepIntoAsync
import typingsSlinky.node.nodeStrings.DebuggerDOTscriptFailedToParse
import typingsSlinky.node.nodeStrings.DebuggerDOTscriptParsed
import typingsSlinky.node.nodeStrings.DebuggerDOTsearchInContent
import typingsSlinky.node.nodeStrings.DebuggerDOTsetAsyncCallStackDepth
import typingsSlinky.node.nodeStrings.DebuggerDOTsetBlackboxPatterns
import typingsSlinky.node.nodeStrings.DebuggerDOTsetBlackboxedRanges
import typingsSlinky.node.nodeStrings.DebuggerDOTsetBreakpoint
import typingsSlinky.node.nodeStrings.DebuggerDOTsetBreakpointByUrl
import typingsSlinky.node.nodeStrings.DebuggerDOTsetBreakpointsActive
import typingsSlinky.node.nodeStrings.DebuggerDOTsetPauseOnExceptions
import typingsSlinky.node.nodeStrings.DebuggerDOTsetReturnValue
import typingsSlinky.node.nodeStrings.DebuggerDOTsetScriptSource
import typingsSlinky.node.nodeStrings.DebuggerDOTsetSkipAllPauses
import typingsSlinky.node.nodeStrings.DebuggerDOTsetVariableValue
import typingsSlinky.node.nodeStrings.DebuggerDOTstepInto
import typingsSlinky.node.nodeStrings.DebuggerDOTstepOut
import typingsSlinky.node.nodeStrings.DebuggerDOTstepOver
import typingsSlinky.node.nodeStrings.HeapProfilerDOTaddHeapSnapshotChunk
import typingsSlinky.node.nodeStrings.HeapProfilerDOTaddInspectedHeapObject
import typingsSlinky.node.nodeStrings.HeapProfilerDOTcollectGarbage
import typingsSlinky.node.nodeStrings.HeapProfilerDOTdisable
import typingsSlinky.node.nodeStrings.HeapProfilerDOTenable
import typingsSlinky.node.nodeStrings.HeapProfilerDOTgetHeapObjectId
import typingsSlinky.node.nodeStrings.HeapProfilerDOTgetObjectByHeapObjectId
import typingsSlinky.node.nodeStrings.HeapProfilerDOTgetSamplingProfile
import typingsSlinky.node.nodeStrings.HeapProfilerDOTheapStatsUpdate
import typingsSlinky.node.nodeStrings.HeapProfilerDOTlastSeenObjectId
import typingsSlinky.node.nodeStrings.HeapProfilerDOTreportHeapSnapshotProgress
import typingsSlinky.node.nodeStrings.HeapProfilerDOTresetProfiles
import typingsSlinky.node.nodeStrings.HeapProfilerDOTstartSampling
import typingsSlinky.node.nodeStrings.HeapProfilerDOTstartTrackingHeapObjects
import typingsSlinky.node.nodeStrings.HeapProfilerDOTstopSampling
import typingsSlinky.node.nodeStrings.HeapProfilerDOTstopTrackingHeapObjects
import typingsSlinky.node.nodeStrings.HeapProfilerDOTtakeHeapSnapshot
import typingsSlinky.node.nodeStrings.NodeRuntimeDOTnotifyWhenWaitingForDisconnect
import typingsSlinky.node.nodeStrings.NodeRuntimeDOTwaitingForDisconnect
import typingsSlinky.node.nodeStrings.NodeTracingDOTdataCollected
import typingsSlinky.node.nodeStrings.NodeTracingDOTgetCategories
import typingsSlinky.node.nodeStrings.NodeTracingDOTstart
import typingsSlinky.node.nodeStrings.NodeTracingDOTstop
import typingsSlinky.node.nodeStrings.NodeTracingDOTtracingComplete
import typingsSlinky.node.nodeStrings.NodeWorkerDOTattachedToWorker
import typingsSlinky.node.nodeStrings.NodeWorkerDOTdetach
import typingsSlinky.node.nodeStrings.NodeWorkerDOTdetachedFromWorker
import typingsSlinky.node.nodeStrings.NodeWorkerDOTdisable
import typingsSlinky.node.nodeStrings.NodeWorkerDOTenable
import typingsSlinky.node.nodeStrings.NodeWorkerDOTreceivedMessageFromWorker
import typingsSlinky.node.nodeStrings.NodeWorkerDOTsendMessageToWorker
import typingsSlinky.node.nodeStrings.ProfilerDOTconsoleProfileFinished
import typingsSlinky.node.nodeStrings.ProfilerDOTconsoleProfileStarted
import typingsSlinky.node.nodeStrings.ProfilerDOTdisable
import typingsSlinky.node.nodeStrings.ProfilerDOTenable
import typingsSlinky.node.nodeStrings.ProfilerDOTgetBestEffortCoverage
import typingsSlinky.node.nodeStrings.ProfilerDOTsetSamplingInterval
import typingsSlinky.node.nodeStrings.ProfilerDOTstart
import typingsSlinky.node.nodeStrings.ProfilerDOTstartPreciseCoverage
import typingsSlinky.node.nodeStrings.ProfilerDOTstartTypeProfile
import typingsSlinky.node.nodeStrings.ProfilerDOTstop
import typingsSlinky.node.nodeStrings.ProfilerDOTstopPreciseCoverage
import typingsSlinky.node.nodeStrings.ProfilerDOTstopTypeProfile
import typingsSlinky.node.nodeStrings.ProfilerDOTtakePreciseCoverage
import typingsSlinky.node.nodeStrings.ProfilerDOTtakeTypeProfile
import typingsSlinky.node.nodeStrings.RuntimeDOTawaitPromise
import typingsSlinky.node.nodeStrings.RuntimeDOTcallFunctionOn
import typingsSlinky.node.nodeStrings.RuntimeDOTcompileScript
import typingsSlinky.node.nodeStrings.RuntimeDOTconsoleAPICalled
import typingsSlinky.node.nodeStrings.RuntimeDOTdisable
import typingsSlinky.node.nodeStrings.RuntimeDOTdiscardConsoleEntries
import typingsSlinky.node.nodeStrings.RuntimeDOTenable
import typingsSlinky.node.nodeStrings.RuntimeDOTevaluate
import typingsSlinky.node.nodeStrings.RuntimeDOTexceptionRevoked
import typingsSlinky.node.nodeStrings.RuntimeDOTexceptionThrown
import typingsSlinky.node.nodeStrings.RuntimeDOTexecutionContextCreated
import typingsSlinky.node.nodeStrings.RuntimeDOTexecutionContextDestroyed
import typingsSlinky.node.nodeStrings.RuntimeDOTexecutionContextsCleared
import typingsSlinky.node.nodeStrings.RuntimeDOTgetProperties
import typingsSlinky.node.nodeStrings.RuntimeDOTglobalLexicalScopeNames
import typingsSlinky.node.nodeStrings.RuntimeDOTinspectRequested
import typingsSlinky.node.nodeStrings.RuntimeDOTqueryObjects
import typingsSlinky.node.nodeStrings.RuntimeDOTreleaseObject
import typingsSlinky.node.nodeStrings.RuntimeDOTreleaseObjectGroup
import typingsSlinky.node.nodeStrings.RuntimeDOTrunIfWaitingForDebugger
import typingsSlinky.node.nodeStrings.RuntimeDOTrunScript
import typingsSlinky.node.nodeStrings.RuntimeDOTsetCustomObjectFormatterEnabled
import typingsSlinky.node.nodeStrings.SchemaDOTgetDomains
import typingsSlinky.node.nodeStrings.inspectorNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The inspector.Session is used for dispatching messages to the V8 inspector back-end and receiving message responses and notifications.
  */
@JSImport("inspector", "Session")
@js.native
/**
  * Create a new instance of the inspector.Session class.
  * The inspector session needs to be connected through session.connect() before the messages can be dispatched to the inspector backend.
  */
class Session () extends EventEmitter {
  /**
    * Issued when new console message is added.
    */
  @JSName("addListener")
  def addListener_ConsolemessageAdded(
    event: ConsoleDOTmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("addListener")
  def addListener_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("addListener")
  def addListener_Debuggerpaused(
    event: DebuggerDOTpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("addListener")
  def addListener_Debuggerresumed(event: DebuggerDOTresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("addListener")
  def addListener_DebuggerscriptParsed(
    event: DebuggerDOTscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("addListener")
  def addListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("addListener")
  def addListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("addListener")
  def addListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("addListener")
  def addListener_NodeTracingdataCollected(
    event: NodeTracingDOTdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("addListener")
  def addListener_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("addListener")
  def addListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("addListener")
  def addListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("addListener")
  def addListener_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("addListener")
  def addListener_RuntimeconsoleAPICalled(
    event: RuntimeDOTconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionRevoked(
    event: RuntimeDOTexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("addListener")
  def addListener_RuntimeexceptionThrown(
    event: RuntimeDOTexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("addListener")
  def addListener_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("addListener")
  def addListener_RuntimeinspectRequested(
    event: RuntimeDOTinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("addListener")
  def addListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Connects a session to the inspector back-end.
    * An exception will be thrown if there is already a connected session established either
    * through the API or by a front-end connected to the Inspector WebSocket port.
    */
  def connect(): Unit = js.native
  /**
    * Immediately close the session. All pending message callbacks will be called with an error.
    * session.connect() will need to be called to be able to send messages again.
    * Reconnected session will lose all inspector state, such as enabled agents or configured breakpoints.
    */
  def disconnect(): Unit = js.native
  @JSName("emit")
  def emit_ConsolemessageAdded(event: ConsoleDOTmessageAdded, message: InspectorNotification[MessageAddedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    message: InspectorNotification[BreakpointResolvedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerpaused(event: DebuggerDOTpaused, message: InspectorNotification[PausedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_Debuggerresumed(event: DebuggerDOTresumed): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    message: InspectorNotification[ScriptFailedToParseEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_DebuggerscriptParsed(event: DebuggerDOTscriptParsed, message: InspectorNotification[ScriptParsedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    message: InspectorNotification[AddHeapSnapshotChunkEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    message: InspectorNotification[HeapStatsUpdateEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    message: InspectorNotification[LastSeenObjectIdEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    message: InspectorNotification[ReportHeapSnapshotProgressEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles): Boolean = js.native
  @JSName("emit")
  def emit_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingdataCollected(event: NodeTracingDOTdataCollected, message: InspectorNotification[DataCollectedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    message: InspectorNotification[AttachedToWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    message: InspectorNotification[DetachedFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    message: InspectorNotification[ReceivedMessageFromWorkerEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    message: InspectorNotification[ConsoleProfileFinishedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    message: InspectorNotification[ConsoleProfileStartedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeconsoleAPICalled(event: RuntimeDOTconsoleAPICalled, message: InspectorNotification[ConsoleAPICalledEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionRevoked(event: RuntimeDOTexceptionRevoked, message: InspectorNotification[ExceptionRevokedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexceptionThrown(event: RuntimeDOTexceptionThrown, message: InspectorNotification[ExceptionThrownEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    message: InspectorNotification[ExecutionContextCreatedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    message: InspectorNotification[ExecutionContextDestroyedEventDataType]
  ): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared): Boolean = js.native
  @JSName("emit")
  def emit_RuntimeinspectRequested(event: RuntimeDOTinspectRequested, message: InspectorNotification[InspectRequestedEventDataType]): Boolean = js.native
  @JSName("emit")
  def emit_inspectorNotification(event: inspectorNotification, message: InspectorNotification[js.Object]): Boolean = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_ConsolemessageAdded(
    event: ConsoleDOTmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_Debuggerpaused(
    event: DebuggerDOTpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_Debuggerresumed(event: DebuggerDOTresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("on")
  def on_DebuggerscriptParsed(
    event: DebuggerDOTscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("on")
  def on_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("on")
  def on_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("on")
  def on_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("on")
  def on_NodeTracingdataCollected(
    event: NodeTracingDOTdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("on")
  def on_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("on")
  def on_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("on")
  def on_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("on")
  def on_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  def on_RuntimeconsoleAPICalled(
    event: RuntimeDOTconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  def on_RuntimeexceptionRevoked(
    event: RuntimeDOTexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  def on_RuntimeexceptionThrown(
    event: RuntimeDOTexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  def on_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  def on_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  def on_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("on")
  def on_RuntimeinspectRequested(
    event: RuntimeDOTinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("on")
  def on_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("once")
  def once_ConsolemessageAdded(
    event: ConsoleDOTmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("once")
  def once_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("once")
  def once_Debuggerpaused(
    event: DebuggerDOTpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("once")
  def once_Debuggerresumed(event: DebuggerDOTresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("once")
  def once_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("once")
  def once_DebuggerscriptParsed(
    event: DebuggerDOTscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("once")
  def once_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("once")
  def once_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("once")
  def once_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("once")
  def once_NodeTracingdataCollected(
    event: NodeTracingDOTdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("once")
  def once_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("once")
  def once_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("once")
  def once_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("once")
  def once_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("once")
  def once_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("once")
  def once_RuntimeconsoleAPICalled(
    event: RuntimeDOTconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("once")
  def once_RuntimeexceptionRevoked(
    event: RuntimeDOTexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("once")
  def once_RuntimeexceptionThrown(
    event: RuntimeDOTexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("once")
  def once_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("once")
  def once_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("once")
  def once_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("once")
  def once_RuntimeinspectRequested(
    event: RuntimeDOTinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("once")
  def once_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Posts a message to the inspector back-end. callback will be notified when a response is received.
    * callback is a function that accepts two optional arguments - error and message-specific result.
    */
  def post(method: java.lang.String): Unit = js.native
  def post(
    method: java.lang.String,
    callback: js.Function2[/* err */ Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def post(method: java.lang.String, params: js.Object): Unit = js.native
  def post(
    method: java.lang.String,
    params: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* params */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  /**
    * Does nothing.
    */
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDOTclearMessages): Unit = js.native
  @JSName("post")
  def post_ConsoleclearMessages(method: ConsoleDOTclearMessages, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  @JSName("post")
  def post_Consoledisable(method: ConsoleDOTdisable): Unit = js.native
  @JSName("post")
  def post_Consoledisable(method: ConsoleDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
    */
  @JSName("post")
  def post_Consoleenable(method: ConsoleDOTenable): Unit = js.native
  @JSName("post")
  def post_Consoleenable(method: ConsoleDOTenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Continues execution until specific location is reached.
    */
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDOTcontinueToLocation): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDOTcontinueToLocation, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(method: DebuggerDOTcontinueToLocation, params: ContinueToLocationParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggercontinueToLocation(
    method: DebuggerDOTcontinueToLocation,
    params: ContinueToLocationParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Disables debugger for given page.
    */
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDOTdisable): Unit = js.native
  @JSName("post")
  def post_Debuggerdisable(method: DebuggerDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
    */
  @JSName("post")
  def post_Debuggerenable(method: DebuggerDOTenable): Unit = js.native
  @JSName("post")
  def post_Debuggerenable(
    method: DebuggerDOTenable,
    callback: js.Function2[/* err */ Error | Null, /* params */ EnableReturnType, Unit]
  ): Unit = js.native
  /**
    * Evaluates expression on a given call frame.
    */
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDOTevaluateOnCallFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDOTevaluateOnCallFrame,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(method: DebuggerDOTevaluateOnCallFrame, params: EvaluateOnCallFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerevaluateOnCallFrame(
    method: DebuggerDOTevaluateOnCallFrame,
    params: EvaluateOnCallFrameParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateOnCallFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be the same.
    */
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDOTgetPossibleBreakpoints): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDOTgetPossibleBreakpoints,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(method: DebuggerDOTgetPossibleBreakpoints, params: GetPossibleBreakpointsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetPossibleBreakpoints(
    method: DebuggerDOTgetPossibleBreakpoints,
    params: GetPossibleBreakpointsParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPossibleBreakpointsReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns source for the script with given id.
    */
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDOTgetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDOTgetScriptSource,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(method: DebuggerDOTgetScriptSource, params: GetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetScriptSource(
    method: DebuggerDOTgetScriptSource,
    params: GetScriptSourceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns stack trace with given <code>stackTraceId</code>.
    * @experimental
    */
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDOTgetStackTrace): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDOTgetStackTrace,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(method: DebuggerDOTgetStackTrace, params: GetStackTraceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggergetStackTrace(
    method: DebuggerDOTgetStackTrace,
    params: GetStackTraceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetStackTraceReturnType, Unit]
  ): Unit = js.native
  /**
    * Stops on the next JavaScript statement.
    */
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDOTpause): Unit = js.native
  @JSName("post")
  def post_Debuggerpause(method: DebuggerDOTpause, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDOTpauseOnAsyncCall): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDOTpauseOnAsyncCall, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(method: DebuggerDOTpauseOnAsyncCall, params: PauseOnAsyncCallParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerpauseOnAsyncCall(
    method: DebuggerDOTpauseOnAsyncCall,
    params: PauseOnAsyncCallParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Removes JavaScript breakpoint.
    */
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDOTremoveBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDOTremoveBreakpoint, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(method: DebuggerDOTremoveBreakpoint, params: RemoveBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerremoveBreakpoint(
    method: DebuggerDOTremoveBreakpoint,
    params: RemoveBreakpointParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Restarts particular call frame from the beginning.
    */
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDOTrestartFrame): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDOTrestartFrame,
    callback: js.Function2[/* err */ Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(method: DebuggerDOTrestartFrame, params: RestartFrameParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerrestartFrame(
    method: DebuggerDOTrestartFrame,
    params: RestartFrameParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ RestartFrameReturnType, Unit]
  ): Unit = js.native
  /**
    * Resumes JavaScript execution.
    */
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDOTresume): Unit = js.native
  @JSName("post")
  def post_Debuggerresume(method: DebuggerDOTresume, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled before next pause. Returns success when async task is actually scheduled, returns error if no task were scheduled or another scheduleStepIntoAsync was called.
    * @experimental
    */
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDOTscheduleStepIntoAsync): Unit = js.native
  @JSName("post")
  def post_DebuggerscheduleStepIntoAsync(method: DebuggerDOTscheduleStepIntoAsync, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Searches for given string in script content.
    */
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDOTsearchInContent): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDOTsearchInContent,
    callback: js.Function2[/* err */ Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(method: DebuggerDOTsearchInContent, params: SearchInContentParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersearchInContent(
    method: DebuggerDOTsearchInContent,
    params: SearchInContentParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SearchInContentReturnType, Unit]
  ): Unit = js.native
  /**
    * Enables or disables async call stacks tracking.
    */
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDOTsetAsyncCallStackDepth): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDOTsetAsyncCallStackDepth, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(method: DebuggerDOTsetAsyncCallStackDepth, params: SetAsyncCallStackDepthParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetAsyncCallStackDepth(
    method: DebuggerDOTsetAsyncCallStackDepth,
    params: SetAsyncCallStackDepthParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in scripts with url matching one of the patterns. VM will try to leave blackboxed script by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDOTsetBlackboxPatterns): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDOTsetBlackboxPatterns, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(method: DebuggerDOTsetBlackboxPatterns, params: SetBlackboxPatternsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxPatterns(
    method: DebuggerDOTsetBlackboxPatterns,
    params: SetBlackboxPatternsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful. Positions array contains positions where blackbox state is changed. First interval isn't blackboxed. Array should be sorted.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDOTsetBlackboxedRanges): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDOTsetBlackboxedRanges, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(method: DebuggerDOTsetBlackboxedRanges, params: SetBlackboxedRangesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBlackboxedRanges(
    method: DebuggerDOTsetBlackboxedRanges,
    params: SetBlackboxedRangesParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDOTsetBreakpoint): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDOTsetBreakpoint,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(method: DebuggerDOTsetBreakpoint, params: SetBreakpointParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpoint(
    method: DebuggerDOTsetBreakpoint,
    params: SetBreakpointParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointReturnType, Unit]
  ): Unit = js.native
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
    */
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDOTsetBreakpointByUrl): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDOTsetBreakpointByUrl,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(method: DebuggerDOTsetBreakpointByUrl, params: SetBreakpointByUrlParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointByUrl(
    method: DebuggerDOTsetBreakpointByUrl,
    params: SetBreakpointByUrlParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetBreakpointByUrlReturnType, Unit]
  ): Unit = js.native
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDOTsetBreakpointsActive): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDOTsetBreakpointsActive, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(method: DebuggerDOTsetBreakpointsActive, params: SetBreakpointsActiveParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetBreakpointsActive(
    method: DebuggerDOTsetBreakpointsActive,
    params: SetBreakpointsActiveParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
    */
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDOTsetPauseOnExceptions): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDOTsetPauseOnExceptions, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(method: DebuggerDOTsetPauseOnExceptions, params: SetPauseOnExceptionsParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetPauseOnExceptions(
    method: DebuggerDOTsetPauseOnExceptions,
    params: SetPauseOnExceptionsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes return value in top frame. Available only at return break position.
    * @experimental
    */
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDOTsetReturnValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDOTsetReturnValue, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(method: DebuggerDOTsetReturnValue, params: SetReturnValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetReturnValue(
    method: DebuggerDOTsetReturnValue,
    params: SetReturnValueParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Edits JavaScript source live.
    */
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDOTsetScriptSource): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDOTsetScriptSource,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(method: DebuggerDOTsetScriptSource, params: SetScriptSourceParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetScriptSource(
    method: DebuggerDOTsetScriptSource,
    params: SetScriptSourceParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ SetScriptSourceReturnType, Unit]
  ): Unit = js.native
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDOTsetSkipAllPauses): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDOTsetSkipAllPauses, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(method: DebuggerDOTsetSkipAllPauses, params: SetSkipAllPausesParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetSkipAllPauses(
    method: DebuggerDOTsetSkipAllPauses,
    params: SetSkipAllPausesParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be mutated manually.
    */
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDOTsetVariableValue): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDOTsetVariableValue, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(method: DebuggerDOTsetVariableValue, params: SetVariableValueParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggersetVariableValue(
    method: DebuggerDOTsetVariableValue,
    params: SetVariableValueParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps into the function call.
    */
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDOTstepInto): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDOTstepInto, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(method: DebuggerDOTstepInto, params: StepIntoParameterType): Unit = js.native
  @JSName("post")
  def post_DebuggerstepInto(
    method: DebuggerDOTstepInto,
    params: StepIntoParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Steps out of the function call.
    */
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDOTstepOut): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOut(method: DebuggerDOTstepOut, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Steps over the statement.
    */
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDOTstepOver): Unit = js.native
  @JSName("post")
  def post_DebuggerstepOver(method: DebuggerDOTstepOver, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables console to refer to the node with given id via $x (see Command Line API for more details $x functions).
    */
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDOTaddInspectedHeapObject): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDOTaddInspectedHeapObject,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(method: HeapProfilerDOTaddInspectedHeapObject, params: AddInspectedHeapObjectParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfileraddInspectedHeapObject(
    method: HeapProfilerDOTaddInspectedHeapObject,
    params: AddInspectedHeapObjectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDOTcollectGarbage): Unit = js.native
  @JSName("post")
  def post_HeapProfilercollectGarbage(method: HeapProfilerDOTcollectGarbage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDOTdisable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerdisable(method: HeapProfilerDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDOTenable): Unit = js.native
  @JSName("post")
  def post_HeapProfilerenable(method: HeapProfilerDOTenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDOTgetHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDOTgetHeapObjectId,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(method: HeapProfilerDOTgetHeapObjectId, params: GetHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetHeapObjectId(
    method: HeapProfilerDOTgetHeapObjectId,
    params: GetHeapObjectIdParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDOTgetObjectByHeapObjectId): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDOTgetObjectByHeapObjectId,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(method: HeapProfilerDOTgetObjectByHeapObjectId, params: GetObjectByHeapObjectIdParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetObjectByHeapObjectId(
    method: HeapProfilerDOTgetObjectByHeapObjectId,
    params: GetObjectByHeapObjectIdParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetObjectByHeapObjectIdReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(method: HeapProfilerDOTgetSamplingProfile): Unit = js.native
  @JSName("post")
  def post_HeapProfilergetSamplingProfile(
    method: HeapProfilerDOTgetSamplingProfile,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetSamplingProfileReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDOTstartSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDOTstartSampling, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(method: HeapProfilerDOTstartSampling, params: StartSamplingParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartSampling(
    method: HeapProfilerDOTstartSampling,
    params: StartSamplingParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDOTstartTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDOTstartTrackingHeapObjects,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(method: HeapProfilerDOTstartTrackingHeapObjects, params: StartTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstartTrackingHeapObjects(
    method: HeapProfilerDOTstartTrackingHeapObjects,
    params: StartTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(method: HeapProfilerDOTstopSampling): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopSampling(
    method: HeapProfilerDOTstopSampling,
    callback: js.Function2[/* err */ Error | Null, /* params */ StopSamplingReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDOTstopTrackingHeapObjects): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDOTstopTrackingHeapObjects,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(method: HeapProfilerDOTstopTrackingHeapObjects, params: StopTrackingHeapObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilerstopTrackingHeapObjects(
    method: HeapProfilerDOTstopTrackingHeapObjects,
    params: StopTrackingHeapObjectsParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDOTtakeHeapSnapshot): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDOTtakeHeapSnapshot, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(method: HeapProfilerDOTtakeHeapSnapshot, params: TakeHeapSnapshotParameterType): Unit = js.native
  @JSName("post")
  def post_HeapProfilertakeHeapSnapshot(
    method: HeapProfilerDOTtakeHeapSnapshot,
    params: TakeHeapSnapshotParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable the `NodeRuntime.waitingForDisconnect`.
    */
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(method: NodeRuntimeDOTnotifyWhenWaitingForDisconnect): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDOTnotifyWhenWaitingForDisconnect,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDOTnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType
  ): Unit = js.native
  @JSName("post")
  def post_NodeRuntimenotifyWhenWaitingForDisconnect(
    method: NodeRuntimeDOTnotifyWhenWaitingForDisconnect,
    params: NotifyWhenWaitingForDisconnectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Gets supported tracing categories.
    */
  @JSName("post")
  def post_NodeTracinggetCategories(method: NodeTracingDOTgetCategories): Unit = js.native
  @JSName("post")
  def post_NodeTracinggetCategories(
    method: NodeTracingDOTgetCategories,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetCategoriesReturnType, Unit]
  ): Unit = js.native
  /**
    * Start trace events collection.
    */
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDOTstart): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDOTstart, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(method: NodeTracingDOTstart, params: StartParameterType): Unit = js.native
  @JSName("post")
  def post_NodeTracingstart(
    method: NodeTracingDOTstart,
    params: StartParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Stop trace events collection. Remaining collected events will be sent as a sequence of
    * dataCollected events followed by tracingComplete event.
    */
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDOTstop): Unit = js.native
  @JSName("post")
  def post_NodeTracingstop(method: NodeTracingDOTstop, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Detached from the worker with given sessionId.
    */
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDOTdetach): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDOTdetach, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(method: NodeWorkerDOTdetach, params: DetachParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdetach(
    method: NodeWorkerDOTdetach,
    params: DetachParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Detaches from all running workers and disables attaching to new workers as they are started.
    */
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDOTdisable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerdisable(method: NodeWorkerDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Instructs the inspector to attach to running workers. Will also attach to new workers
    * as they start
    */
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDOTenable): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDOTenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(method: NodeWorkerDOTenable, params: EnableParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkerenable(
    method: NodeWorkerDOTenable,
    params: EnableParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Sends protocol message over session with given id.
    */
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDOTsendMessageToWorker): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDOTsendMessageToWorker, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(method: NodeWorkerDOTsendMessageToWorker, params: SendMessageToWorkerParameterType): Unit = js.native
  @JSName("post")
  def post_NodeWorkersendMessageToWorker(
    method: NodeWorkerDOTsendMessageToWorker,
    params: SendMessageToWorkerParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDOTdisable): Unit = js.native
  @JSName("post")
  def post_Profilerdisable(method: ProfilerDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDOTenable): Unit = js.native
  @JSName("post")
  def post_Profilerenable(method: ProfilerDOTenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to garbage collection.
    */
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(method: ProfilerDOTgetBestEffortCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilergetBestEffortCoverage(
    method: ProfilerDOTgetBestEffortCoverage,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetBestEffortCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDOTsetSamplingInterval): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDOTsetSamplingInterval, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(method: ProfilerDOTsetSamplingInterval, params: SetSamplingIntervalParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilersetSamplingInterval(
    method: ProfilerDOTsetSamplingInterval,
    params: SetSamplingIntervalParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDOTstart): Unit = js.native
  @JSName("post")
  def post_Profilerstart(method: ProfilerDOTstart, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code coverage may be incomplete. Enabling prevents running optimized code and resets execution counters.
    */
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDOTstartPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDOTstartPreciseCoverage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(method: ProfilerDOTstartPreciseCoverage, params: StartPreciseCoverageParameterType): Unit = js.native
  @JSName("post")
  def post_ProfilerstartPreciseCoverage(
    method: ProfilerDOTstartPreciseCoverage,
    params: StartPreciseCoverageParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Enable type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDOTstartTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstartTypeProfile(method: ProfilerDOTstartTypeProfile, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_Profilerstop(method: ProfilerDOTstop): Unit = js.native
  @JSName("post")
  def post_Profilerstop(
    method: ProfilerDOTstop,
    callback: js.Function2[/* err */ Error | Null, /* params */ StopReturnType, Unit]
  ): Unit = js.native
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows executing optimized code.
    */
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDOTstopPreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilerstopPreciseCoverage(method: ProfilerDOTstopPreciseCoverage, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Disable type profile. Disabling releases type profile data collected so far.
    * @experimental
    */
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDOTstopTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilerstopTypeProfile(method: ProfilerDOTstopTypeProfile, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code coverage needs to have started.
    */
  @JSName("post")
  def post_ProfilertakePreciseCoverage(method: ProfilerDOTtakePreciseCoverage): Unit = js.native
  @JSName("post")
  def post_ProfilertakePreciseCoverage(
    method: ProfilerDOTtakePreciseCoverage,
    callback: js.Function2[/* err */ Error | Null, /* params */ TakePreciseCoverageReturnType, Unit]
  ): Unit = js.native
  /**
    * Collect type profile.
    * @experimental
    */
  @JSName("post")
  def post_ProfilertakeTypeProfile(method: ProfilerDOTtakeTypeProfile): Unit = js.native
  @JSName("post")
  def post_ProfilertakeTypeProfile(
    method: ProfilerDOTtakeTypeProfile,
    callback: js.Function2[/* err */ Error | Null, /* params */ TakeTypeProfileReturnType, Unit]
  ): Unit = js.native
  /**
    * Add handler to promise with given promise object id.
    */
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDOTawaitPromise): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDOTawaitPromise,
    callback: js.Function2[/* err */ Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(method: RuntimeDOTawaitPromise, params: AwaitPromiseParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeawaitPromise(
    method: RuntimeDOTawaitPromise,
    params: AwaitPromiseParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ AwaitPromiseReturnType, Unit]
  ): Unit = js.native
  /**
    * Calls function with given declaration on the given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDOTcallFunctionOn): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDOTcallFunctionOn,
    callback: js.Function2[/* err */ Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(method: RuntimeDOTcallFunctionOn, params: CallFunctionOnParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecallFunctionOn(
    method: RuntimeDOTcallFunctionOn,
    params: CallFunctionOnParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ CallFunctionOnReturnType, Unit]
  ): Unit = js.native
  /**
    * Compiles expression.
    */
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDOTcompileScript): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDOTcompileScript,
    callback: js.Function2[/* err */ Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(method: RuntimeDOTcompileScript, params: CompileScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimecompileScript(
    method: RuntimeDOTcompileScript,
    params: CompileScriptParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ CompileScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * Disables reporting of execution contexts creation.
    */
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDOTdisable): Unit = js.native
  @JSName("post")
  def post_Runtimedisable(method: RuntimeDOTdisable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Discards collected exceptions and console API calls.
    */
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDOTdiscardConsoleEntries): Unit = js.native
  @JSName("post")
  def post_RuntimediscardConsoleEntries(method: RuntimeDOTdiscardConsoleEntries, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
    */
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDOTenable): Unit = js.native
  @JSName("post")
  def post_Runtimeenable(method: RuntimeDOTenable, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Evaluates expression on global object.
    */
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDOTevaluate): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDOTevaluate,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(method: RuntimeDOTevaluate, params: EvaluateParameterType): Unit = js.native
  @JSName("post")
  def post_Runtimeevaluate(
    method: RuntimeDOTevaluate,
    params: EvaluateParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ EvaluateReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target object.
    */
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDOTgetProperties): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDOTgetProperties,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(method: RuntimeDOTgetProperties, params: GetPropertiesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimegetProperties(
    method: RuntimeDOTgetProperties,
    params: GetPropertiesParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetPropertiesReturnType, Unit]
  ): Unit = js.native
  /**
    * Returns all let, const and class variables from global scope.
    */
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDOTglobalLexicalScopeNames): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDOTglobalLexicalScopeNames,
    callback: js.Function2[/* err */ Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(method: RuntimeDOTglobalLexicalScopeNames, params: GlobalLexicalScopeNamesParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimeglobalLexicalScopeNames(
    method: RuntimeDOTglobalLexicalScopeNames,
    params: GlobalLexicalScopeNamesParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ GlobalLexicalScopeNamesReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDOTqueryObjects): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDOTqueryObjects,
    callback: js.Function2[/* err */ Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(method: RuntimeDOTqueryObjects, params: QueryObjectsParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimequeryObjects(
    method: RuntimeDOTqueryObjects,
    params: QueryObjectsParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ QueryObjectsReturnType, Unit]
  ): Unit = js.native
  /**
    * Releases remote object with given id.
    */
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDOTreleaseObject): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDOTreleaseObject, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(method: RuntimeDOTreleaseObject, params: ReleaseObjectParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObject(
    method: RuntimeDOTreleaseObject,
    params: ReleaseObjectParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Releases all remote objects that belong to a given group.
    */
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDOTreleaseObjectGroup): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDOTreleaseObjectGroup, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(method: RuntimeDOTreleaseObjectGroup, params: ReleaseObjectGroupParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimereleaseObjectGroup(
    method: RuntimeDOTreleaseObjectGroup,
    params: ReleaseObjectGroupParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDOTrunIfWaitingForDebugger): Unit = js.native
  @JSName("post")
  def post_RuntimerunIfWaitingForDebugger(method: RuntimeDOTrunIfWaitingForDebugger, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  /**
    * Runs script with given id in a given context.
    */
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDOTrunScript): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDOTrunScript,
    callback: js.Function2[/* err */ Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(method: RuntimeDOTrunScript, params: RunScriptParameterType): Unit = js.native
  @JSName("post")
  def post_RuntimerunScript(
    method: RuntimeDOTrunScript,
    params: RunScriptParameterType,
    callback: js.Function2[/* err */ Error | Null, /* params */ RunScriptReturnType, Unit]
  ): Unit = js.native
  /**
    * @experimental
    */
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(method: RuntimeDOTsetCustomObjectFormatterEnabled): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDOTsetCustomObjectFormatterEnabled,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDOTsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType
  ): Unit = js.native
  @JSName("post")
  def post_RuntimesetCustomObjectFormatterEnabled(
    method: RuntimeDOTsetCustomObjectFormatterEnabled,
    params: SetCustomObjectFormatterEnabledParameterType,
    callback: js.Function1[/* err */ Error | Null, Unit]
  ): Unit = js.native
  /**
    * Returns supported domains.
    */
  @JSName("post")
  def post_SchemagetDomains(method: SchemaDOTgetDomains): Unit = js.native
  @JSName("post")
  def post_SchemagetDomains(
    method: SchemaDOTgetDomains,
    callback: js.Function2[/* err */ Error | Null, /* params */ GetDomainsReturnType, Unit]
  ): Unit = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependListener")
  def prependListener_ConsolemessageAdded(
    event: ConsoleDOTmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependListener")
  def prependListener_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependListener")
  def prependListener_Debuggerpaused(
    event: DebuggerDOTpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependListener")
  def prependListener_Debuggerresumed(event: DebuggerDOTresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependListener")
  def prependListener_DebuggerscriptParsed(
    event: DebuggerDOTscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependListener")
  def prependListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependListener")
  def prependListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingdataCollected(
    event: NodeTracingDOTdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependListener")
  def prependListener_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependListener")
  def prependListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependListener")
  def prependListener_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependListener")
  def prependListener_RuntimeconsoleAPICalled(
    event: RuntimeDOTconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionRevoked(
    event: RuntimeDOTexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexceptionThrown(
    event: RuntimeDOTexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependListener")
  def prependListener_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependListener")
  def prependListener_RuntimeinspectRequested(
    event: RuntimeDOTinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependListener")
  def prependListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ConsolemessageAdded(
    event: ConsoleDOTmessageAdded,
    listener: js.Function1[/* message */ InspectorNotification[MessageAddedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerbreakpointResolved(
    event: DebuggerDOTbreakpointResolved,
    listener: js.Function1[/* message */ InspectorNotification[BreakpointResolvedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerpaused(
    event: DebuggerDOTpaused,
    listener: js.Function1[/* message */ InspectorNotification[PausedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_Debuggerresumed(event: DebuggerDOTresumed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptFailedToParse(
    event: DebuggerDOTscriptFailedToParse,
    listener: js.Function1[/* message */ InspectorNotification[ScriptFailedToParseEventDataType], Unit]
  ): this.type = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected scripts upon enabling debugger.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_DebuggerscriptParsed(
    event: DebuggerDOTscriptParsed,
    listener: js.Function1[/* message */ InspectorNotification[ScriptParsedEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfileraddHeapSnapshotChunk(
    event: HeapProfilerDOTaddHeapSnapshotChunk,
    listener: js.Function1[/* message */ InspectorNotification[AddHeapSnapshotChunkEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerheapStatsUpdate(
    event: HeapProfilerDOTheapStatsUpdate,
    listener: js.Function1[/* message */ InspectorNotification[HeapStatsUpdateEventDataType], Unit]
  ): this.type = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last seen object id and corresponding timestamp. If the were changes in the heap since last event then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerlastSeenObjectId(
    event: HeapProfilerDOTlastSeenObjectId,
    listener: js.Function1[/* message */ InspectorNotification[LastSeenObjectIdEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerreportHeapSnapshotProgress(
    event: HeapProfilerDOTreportHeapSnapshotProgress,
    listener: js.Function1[/* message */ InspectorNotification[ReportHeapSnapshotProgressEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_HeapProfilerresetProfiles(event: HeapProfilerDOTresetProfiles, listener: js.Function0[Unit]): this.type = js.native
  /**
    * This event is fired instead of `Runtime.executionContextDestroyed` when
    * enabled.
    * It is fired when the Node process finished all code execution and is
    * waiting for all frontends to disconnect.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeRuntimewaitingForDisconnect(event: NodeRuntimeDOTwaitingForDisconnect, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Contains an bucket of collected trace events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingdataCollected(
    event: NodeTracingDOTdataCollected,
    listener: js.Function1[/* message */ InspectorNotification[DataCollectedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeTracingtracingComplete(event: NodeTracingDOTtracingComplete, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when attached to a worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerattachedToWorker(
    event: NodeWorkerDOTattachedToWorker,
    listener: js.Function1[/* message */ InspectorNotification[AttachedToWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when detached from the worker.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerdetachedFromWorker(
    event: NodeWorkerDOTdetachedFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[DetachedFromWorkerEventDataType], Unit]
  ): this.type = js.native
  /**
    * Notifies about a new protocol message received from the session
    * (session ID is provided in attachedToWorker notification).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_NodeWorkerreceivedMessageFromWorker(
    event: NodeWorkerDOTreceivedMessageFromWorker,
    listener: js.Function1[/* message */ InspectorNotification[ReceivedMessageFromWorkerEventDataType], Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileFinished(
    event: ProfilerDOTconsoleProfileFinished,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileFinishedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_ProfilerconsoleProfileStarted(
    event: ProfilerDOTconsoleProfileStarted,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleProfileStartedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeconsoleAPICalled(
    event: RuntimeDOTconsoleAPICalled,
    listener: js.Function1[/* message */ InspectorNotification[ConsoleAPICalledEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionRevoked(
    event: RuntimeDOTexceptionRevoked,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionRevokedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexceptionThrown(
    event: RuntimeDOTexceptionThrown,
    listener: js.Function1[/* message */ InspectorNotification[ExceptionThrownEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextCreated(
    event: RuntimeDOTexecutionContextCreated,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextCreatedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextDestroyed(
    event: RuntimeDOTexecutionContextDestroyed,
    listener: js.Function1[/* message */ InspectorNotification[ExecutionContextDestroyedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeexecutionContextsCleared(event: RuntimeDOTexecutionContextsCleared, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API call).
    */
  @JSName("prependOnceListener")
  def prependOnceListener_RuntimeinspectRequested(
    event: RuntimeDOTinspectRequested,
    listener: js.Function1[/* message */ InspectorNotification[InspectRequestedEventDataType], Unit]
  ): this.type = js.native
  /**
    * Emitted when any notification from the V8 Inspector is received.
    */
  @JSName("prependOnceListener")
  def prependOnceListener_inspectorNotification(
    event: inspectorNotification,
    listener: js.Function1[/* message */ InspectorNotification[js.Object], Unit]
  ): this.type = js.native
}

