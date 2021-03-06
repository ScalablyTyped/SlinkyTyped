package typingsSlinky.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.GetEventListenersResponse
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveDOMBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveEventListenerBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveInstrumentationBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveXHRBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.SetDOMBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.SetEventListenerBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.SetInstrumentationBreakpointRequest
import typingsSlinky.devtoolsProtocol.mod.Protocol.DOMDebugger.SetXHRBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMDebuggerApi extends StObject {
  
  /**
    * Returns event listeners of the given object.
    */
  def getEventListeners(params: GetEventListenersRequest): js.Promise[GetEventListenersResponse] = js.native
  
  /**
    * Removes DOM breakpoint that was set using `setDOMBreakpoint`.
    */
  def removeDOMBreakpoint(params: RemoveDOMBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes breakpoint on particular DOM event.
    */
  def removeEventListenerBreakpoint(params: RemoveEventListenerBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes breakpoint on particular native event.
    */
  def removeInstrumentationBreakpoint(params: RemoveInstrumentationBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes breakpoint from XMLHttpRequest.
    */
  def removeXHRBreakpoint(params: RemoveXHRBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets breakpoint on particular operation with DOM.
    */
  def setDOMBreakpoint(params: SetDOMBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets breakpoint on particular DOM event.
    */
  def setEventListenerBreakpoint(params: SetEventListenerBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets breakpoint on particular native event.
    */
  def setInstrumentationBreakpoint(params: SetInstrumentationBreakpointRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets breakpoint on XMLHttpRequest.
    */
  def setXHRBreakpoint(params: SetXHRBreakpointRequest): js.Promise[Unit] = js.native
}
object DOMDebuggerApi {
  
  @scala.inline
  def apply(
    getEventListeners: GetEventListenersRequest => js.Promise[GetEventListenersResponse],
    removeDOMBreakpoint: RemoveDOMBreakpointRequest => js.Promise[Unit],
    removeEventListenerBreakpoint: RemoveEventListenerBreakpointRequest => js.Promise[Unit],
    removeInstrumentationBreakpoint: RemoveInstrumentationBreakpointRequest => js.Promise[Unit],
    removeXHRBreakpoint: RemoveXHRBreakpointRequest => js.Promise[Unit],
    setDOMBreakpoint: SetDOMBreakpointRequest => js.Promise[Unit],
    setEventListenerBreakpoint: SetEventListenerBreakpointRequest => js.Promise[Unit],
    setInstrumentationBreakpoint: SetInstrumentationBreakpointRequest => js.Promise[Unit],
    setXHRBreakpoint: SetXHRBreakpointRequest => js.Promise[Unit]
  ): DOMDebuggerApi = {
    val __obj = js.Dynamic.literal(getEventListeners = js.Any.fromFunction1(getEventListeners), removeDOMBreakpoint = js.Any.fromFunction1(removeDOMBreakpoint), removeEventListenerBreakpoint = js.Any.fromFunction1(removeEventListenerBreakpoint), removeInstrumentationBreakpoint = js.Any.fromFunction1(removeInstrumentationBreakpoint), removeXHRBreakpoint = js.Any.fromFunction1(removeXHRBreakpoint), setDOMBreakpoint = js.Any.fromFunction1(setDOMBreakpoint), setEventListenerBreakpoint = js.Any.fromFunction1(setEventListenerBreakpoint), setInstrumentationBreakpoint = js.Any.fromFunction1(setInstrumentationBreakpoint), setXHRBreakpoint = js.Any.fromFunction1(setXHRBreakpoint))
    __obj.asInstanceOf[DOMDebuggerApi]
  }
  
  @scala.inline
  implicit class DOMDebuggerApiMutableBuilder[Self <: DOMDebuggerApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEventListeners(value: GetEventListenersRequest => js.Promise[GetEventListenersResponse]): Self = StObject.set(x, "getEventListeners", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDOMBreakpoint(value: RemoveDOMBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "removeDOMBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListenerBreakpoint(value: RemoveEventListenerBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "removeEventListenerBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveInstrumentationBreakpoint(value: RemoveInstrumentationBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "removeInstrumentationBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveXHRBreakpoint(value: RemoveXHRBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "removeXHRBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDOMBreakpoint(value: SetDOMBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "setDOMBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEventListenerBreakpoint(value: SetEventListenerBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "setEventListenerBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInstrumentationBreakpoint(value: SetInstrumentationBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "setInstrumentationBreakpoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetXHRBreakpoint(value: SetXHRBreakpointRequest => js.Promise[Unit]): Self = StObject.set(x, "setXHRBreakpoint", js.Any.fromFunction1(value))
  }
}
