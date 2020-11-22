package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.breakpointResolved
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.paused
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.resumed
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.scriptFailedToParse
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.scriptParsed
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.BreakpointResolvedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EnableRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EnableResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.GetWasmBytecodeResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.PauseOnAsyncCallRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.PausedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.RemoveBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ResumeRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ScriptFailedToParseEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.ScriptParsedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetAsyncCallStackDepthRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBlackboxPatternsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBlackboxedRangesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointByUrlResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointsActiveRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetPauseOnExceptionsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetReturnValueRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetSkipAllPausesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.SetVariableValueRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.StepIntoRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger.StepOverRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerApi extends js.Object {
  
  /**
    * Continues execution until specific location is reached.
    */
  def continueToLocation(params: ContinueToLocationRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables debugger for given page.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables debugger for the given page. Clients should not assume that the debugging has been
    * enabled until the result for this command is received.
    */
  def enable(params: EnableRequest): js.Promise[EnableResponse] = js.native
  
  /**
    * Evaluates expression on a given call frame.
    */
  def evaluateOnCallFrame(params: EvaluateOnCallFrameRequest): js.Promise[EvaluateOnCallFrameResponse] = js.native
  
  /**
    * Execute a Wasm Evaluator module on a given call frame.
    */
  def executeWasmEvaluator(params: ExecuteWasmEvaluatorRequest): js.Promise[ExecuteWasmEvaluatorResponse] = js.native
  
  /**
    * Returns possible locations for breakpoint. scriptId in start and end range locations should be
    * the same.
    */
  def getPossibleBreakpoints(params: GetPossibleBreakpointsRequest): js.Promise[GetPossibleBreakpointsResponse] = js.native
  
  /**
    * Returns source for the script with given id.
    */
  def getScriptSource(params: GetScriptSourceRequest): js.Promise[GetScriptSourceResponse] = js.native
  
  /**
    * Returns stack trace with given `stackTraceId`.
    */
  def getStackTrace(params: GetStackTraceRequest): js.Promise[GetStackTraceResponse] = js.native
  
  /**
    * This command is deprecated. Use getScriptSource instead.
    */
  def getWasmBytecode(params: GetWasmBytecodeRequest): js.Promise[GetWasmBytecodeResponse] = js.native
  
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("on")
  def on_breakpointResolved(event: breakpointResolved, listener: js.Function1[/* params */ BreakpointResolvedEvent, Unit]): Unit = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("on")
  def on_paused(event: paused, listener: js.Function1[/* params */ PausedEvent, Unit]): Unit = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("on")
  def on_resumed(event: resumed, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("on")
  def on_scriptFailedToParse(event: scriptFailedToParse, listener: js.Function1[/* params */ ScriptFailedToParseEvent, Unit]): Unit = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("on")
  def on_scriptParsed(event: scriptParsed, listener: js.Function1[/* params */ ScriptParsedEvent, Unit]): Unit = js.native
  
  /**
    * Stops on the next JavaScript statement.
    */
  def pause(): js.Promise[Unit] = js.native
  
  def pauseOnAsyncCall(params: PauseOnAsyncCallRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes JavaScript breakpoint.
    */
  def removeBreakpoint(params: RemoveBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Restarts particular call frame from the beginning.
    */
  def restartFrame(params: RestartFrameRequest): js.Promise[RestartFrameResponse] = js.native
  
  /**
    * Resumes JavaScript execution.
    */
  def resume(params: ResumeRequest): js.Promise[Unit] = js.native
  
  /**
    * Searches for given string in script content.
    */
  def searchInContent(params: SearchInContentRequest): js.Promise[SearchInContentResponse] = js.native
  
  /**
    * Enables or disables async call stacks tracking.
    */
  def setAsyncCallStackDepth(params: SetAsyncCallStackDepthRequest): js.Promise[Unit] = js.native
  
  /**
    * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
    * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
    * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    */
  def setBlackboxPatterns(params: SetBlackboxPatternsRequest): js.Promise[Unit] = js.native
  
  /**
    * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
    * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
    * Positions array contains positions where blackbox state is changed. First interval isn't
    * blackboxed. Array should be sorted.
    */
  def setBlackboxedRanges(params: SetBlackboxedRangesRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets JavaScript breakpoint at a given location.
    */
  def setBreakpoint(params: SetBreakpointRequest): js.Promise[SetBreakpointResponse] = js.native
  
  /**
    * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
    * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
    * `locations` property. Further matching script parsing will result in subsequent
    * `breakpointResolved` events issued. This logical breakpoint will survive page reloads.
    */
  def setBreakpointByUrl(params: SetBreakpointByUrlRequest): js.Promise[SetBreakpointByUrlResponse] = js.native
  
  /**
    * Sets JavaScript breakpoint before each call to the given function.
    * If another function was created from the same source as a given one,
    * calling it will also trigger the breakpoint.
    */
  def setBreakpointOnFunctionCall(params: SetBreakpointOnFunctionCallRequest): js.Promise[SetBreakpointOnFunctionCallResponse] = js.native
  
  /**
    * Activates / deactivates all breakpoints on the page.
    */
  def setBreakpointsActive(params: SetBreakpointsActiveRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets instrumentation breakpoint.
    */
  def setInstrumentationBreakpoint(params: SetInstrumentationBreakpointRequest): js.Promise[SetInstrumentationBreakpointResponse] = js.native
  
  /**
    * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
    * no exceptions. Initial pause on exceptions state is `none`.
    */
  def setPauseOnExceptions(params: SetPauseOnExceptionsRequest): js.Promise[Unit] = js.native
  
  /**
    * Changes return value in top frame. Available only at return break position.
    */
  def setReturnValue(params: SetReturnValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Edits JavaScript source live.
    */
  def setScriptSource(params: SetScriptSourceRequest): js.Promise[SetScriptSourceResponse] = js.native
  
  /**
    * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
    */
  def setSkipAllPauses(params: SetSkipAllPausesRequest): js.Promise[Unit] = js.native
  
  /**
    * Changes value of variable in a callframe. Object-based scopes are not supported and must be
    * mutated manually.
    */
  def setVariableValue(params: SetVariableValueRequest): js.Promise[Unit] = js.native
  
  /**
    * Steps into the function call.
    */
  def stepInto(params: StepIntoRequest): js.Promise[Unit] = js.native
  
  /**
    * Steps out of the function call.
    */
  def stepOut(): js.Promise[Unit] = js.native
  
  /**
    * Steps over the statement.
    */
  def stepOver(params: StepOverRequest): js.Promise[Unit] = js.native
}
