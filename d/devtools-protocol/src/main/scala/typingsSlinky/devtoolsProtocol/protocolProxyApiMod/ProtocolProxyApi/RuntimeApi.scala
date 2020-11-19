package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.bindingCalled
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.consoleAPICalled
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.exceptionRevoked
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.exceptionThrown
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.executionContextCreated
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.executionContextDestroyed
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.executionContextsCleared
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.inspectRequested
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AddBindingRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.BindingCalledEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CallFunctionOnResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ConsoleAPICalledEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.EvaluateRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.EvaluateResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ExceptionRevokedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ExceptionThrownEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextCreatedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDestroyedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GetHeapUsageResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GetIsolateIdResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.GlobalLexicalScopeNamesResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.InspectRequestedEvent
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ReleaseObjectGroupRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.ReleaseObjectRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RemoveBindingRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RunScriptRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.RunScriptResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.SetAsyncCallStackDepthRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.SetCustomObjectFormatterEnabledRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.SetMaxCallStackSizeToCaptureRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeApi extends js.Object {
  
  /**
    * If executionContextId is empty, adds binding with the given name on the
    * global objects of all inspected contexts, including those created later,
    * bindings survive reloads.
    * If executionContextId is specified, adds binding only on global object of
    * given execution context.
    * Binding function takes exactly one argument, this argument should be string,
    * in case of any other input, function throws an exception.
    * Each binding function call produces Runtime.bindingCalled notification.
    */
  def addBinding(params: AddBindingRequest): js.Promise[Unit] = js.native
  
  /**
    * Add handler to promise with given promise object id.
    */
  def awaitPromise(params: AwaitPromiseRequest): js.Promise[AwaitPromiseResponse] = js.native
  
  /**
    * Calls function with given declaration on the given object. Object group of the result is
    * inherited from the target object.
    */
  def callFunctionOn(params: CallFunctionOnRequest): js.Promise[CallFunctionOnResponse] = js.native
  
  /**
    * Compiles expression.
    */
  def compileScript(params: CompileScriptRequest): js.Promise[CompileScriptResponse] = js.native
  
  /**
    * Disables reporting of execution contexts creation.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Discards collected exceptions and console API calls.
    */
  def discardConsoleEntries(): js.Promise[Unit] = js.native
  
  /**
    * Enables reporting of execution contexts creation by means of `executionContextCreated` event.
    * When the reporting gets enabled the event will be sent immediately for each existing execution
    * context.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Evaluates expression on global object.
    */
  def evaluate(params: EvaluateRequest): js.Promise[EvaluateResponse] = js.native
  
  /**
    * Returns the JavaScript heap usage.
    * It is the total usage of the corresponding isolate not scoped to a particular Runtime.
    */
  def getHeapUsage(): js.Promise[GetHeapUsageResponse] = js.native
  
  /**
    * Returns the isolate id.
    */
  def getIsolateId(): js.Promise[GetIsolateIdResponse] = js.native
  
  /**
    * Returns properties of a given object. Object group of the result is inherited from the target
    * object.
    */
  def getProperties(params: GetPropertiesRequest): js.Promise[GetPropertiesResponse] = js.native
  
  /**
    * Returns all let, const and class variables from global scope.
    */
  def globalLexicalScopeNames(params: GlobalLexicalScopeNamesRequest): js.Promise[GlobalLexicalScopeNamesResponse] = js.native
  
  /**
    * Notification is issued every time when binding is called.
    */
  @JSName("on")
  def on_bindingCalled(event: bindingCalled, listener: js.Function1[/* params */ BindingCalledEvent, Unit]): Unit = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("on")
  def on_consoleAPICalled(event: consoleAPICalled, listener: js.Function1[/* params */ ConsoleAPICalledEvent, Unit]): Unit = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("on")
  def on_exceptionRevoked(event: exceptionRevoked, listener: js.Function1[/* params */ ExceptionRevokedEvent, Unit]): Unit = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("on")
  def on_exceptionThrown(event: exceptionThrown, listener: js.Function1[/* params */ ExceptionThrownEvent, Unit]): Unit = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("on")
  def on_executionContextCreated(
    event: executionContextCreated,
    listener: js.Function1[/* params */ ExecutionContextCreatedEvent, Unit]
  ): Unit = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("on")
  def on_executionContextDestroyed(
    event: executionContextDestroyed,
    listener: js.Function1[/* params */ ExecutionContextDestroyedEvent, Unit]
  ): Unit = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("on")
  def on_executionContextsCleared(event: executionContextsCleared, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("on")
  def on_inspectRequested(event: inspectRequested, listener: js.Function1[/* params */ InspectRequestedEvent, Unit]): Unit = js.native
  
  def queryObjects(params: QueryObjectsRequest): js.Promise[QueryObjectsResponse] = js.native
  
  /**
    * Releases remote object with given id.
    */
  def releaseObject(params: ReleaseObjectRequest): js.Promise[Unit] = js.native
  
  /**
    * Releases all remote objects that belong to a given group.
    */
  def releaseObjectGroup(params: ReleaseObjectGroupRequest): js.Promise[Unit] = js.native
  
  /**
    * This method does not remove binding function from global object but
    * unsubscribes current runtime agent from Runtime.bindingCalled notifications.
    */
  def removeBinding(params: RemoveBindingRequest): js.Promise[Unit] = js.native
  
  /**
    * Tells inspected instance to run if it was waiting for debugger to attach.
    */
  def runIfWaitingForDebugger(): js.Promise[Unit] = js.native
  
  /**
    * Runs script with given id in a given context.
    */
  def runScript(params: RunScriptRequest): js.Promise[RunScriptResponse] = js.native
  
  /**
    * Enables or disables async call stacks tracking.
    */
  def setAsyncCallStackDepth(params: SetAsyncCallStackDepthRequest): js.Promise[Unit] = js.native
  
  def setCustomObjectFormatterEnabled(params: SetCustomObjectFormatterEnabledRequest): js.Promise[Unit] = js.native
  
  def setMaxCallStackSizeToCapture(params: SetMaxCallStackSizeToCaptureRequest): js.Promise[Unit] = js.native
  
  /**
    * Terminate current or next JavaScript execution.
    * Will cancel the termination when the outer-most script execution ends.
    */
  def terminateExecution(): js.Promise[Unit] = js.native
}
