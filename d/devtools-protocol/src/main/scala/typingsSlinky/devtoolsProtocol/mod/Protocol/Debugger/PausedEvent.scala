package typingsSlinky.devtoolsProtocol.mod.Protocol.Debugger

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.DOM
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.EventListener
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.OOM
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.XHR
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.ambiguous
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.assert
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.debugCommand
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.exception
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.instrumentation
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.other_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.promiseRejection
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PausedEvent extends StObject {
  
  /**
    * Never present, will be removed.
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.native
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.native
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.native
  
  /**
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame] = js.native
  
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Pause reason. (PausedEventReason enum)
    */
  var reason: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR = js.native
}
object PausedEvent {
  
  @scala.inline
  def apply(
    callFrames: js.Array[CallFrame],
    reason: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
  ): PausedEvent = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEvent]
  }
  
  @scala.inline
  implicit class PausedEventMutableBuilder[Self <: PausedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsyncCallStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncCallStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncCallStackTraceIdUndefined: Self = StObject.set(x, "asyncCallStackTraceId", js.undefined)
    
    @scala.inline
    def setAsyncStackTrace(value: StackTrace): Self = StObject.set(x, "asyncStackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncStackTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncStackTraceIdUndefined: Self = StObject.set(x, "asyncStackTraceId", js.undefined)
    
    @scala.inline
    def setAsyncStackTraceUndefined: Self = StObject.set(x, "asyncStackTrace", js.undefined)
    
    @scala.inline
    def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHitBreakpoints(value: js.Array[String]): Self = StObject.set(x, "hitBreakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitBreakpointsUndefined: Self = StObject.set(x, "hitBreakpoints", js.undefined)
    
    @scala.inline
    def setHitBreakpointsVarargs(value: String*): Self = StObject.set(x, "hitBreakpoints", js.Array(value :_*))
    
    @scala.inline
    def setReason(
      value: ambiguous | assert | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
