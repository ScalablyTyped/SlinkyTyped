package typingsSlinky.plottable

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.dispatcherMod.Dispatcher
import typingsSlinky.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/dispatchers/mouseDispatcher", JSImport.Namespace)
@js.native
object mouseDispatcherMod extends js.Object {
  
  @js.native
  /**
    * This constructor not be invoked directly.
    *
    * @constructor
    */
  class Mouse protected () extends Dispatcher {
    
    var _lastMousePosition: js.Any = js.native
    
    /**
      * Computes the mouse position from the given event, and if successful
      * calls all the callbacks in the provided callbackSet.
      */
    /* private */ def _measureAndDispatch(component: js.Any, event: js.Any, eventName: js.Any, scope: js.Any): js.Any = js.native
    
    var _translator: js.Any = js.native
    
    def eventInside(component: Component, event: MouseEvent): Boolean = js.native
    
    /**
      * Returns the last computed mouse position in <svg> coordinate space.
      *
      * @return {Point}
      */
    def lastMousePosition(): Point = js.native
    
    /**
      * Removes a callback that would be called when a dblClick occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offDblClick(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a mousedown occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseDown(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the mouse position changes.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseMove(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a mouseup occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offMouseUp(callback: MouseCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a wheel event occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def offWheel(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a dblClick occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onDblClick(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a mousedown occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseDown(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when the mouse position changes.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseMove(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a mouseup occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onMouseUp(callback: MouseCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a wheel event occurs.
      *
      * @param {MouseCallback} callback
      * @return {Dispatchers.Mouse} The calling Mouse Dispatcher.
      */
    def onWheel(callback: MouseCallback): this.type = js.native
  }
  /* static members */
  @js.native
  object Mouse extends js.Object {
    
    var _DBLCLICK_EVENT_NAME: js.Any = js.native
    
    var _DISPATCHER_KEY: js.Any = js.native
    
    var _MOUSEDOWN_EVENT_NAME: js.Any = js.native
    
    var _MOUSEMOVE_EVENT_NAME: js.Any = js.native
    
    var _MOUSEOUT_EVENT_NAME: js.Any = js.native
    
    var _MOUSEOVER_EVENT_NAME: js.Any = js.native
    
    var _MOUSEUP_EVENT_NAME: js.Any = js.native
    
    var _WHEEL_EVENT_NAME: js.Any = js.native
    
    /**
      * Get a Mouse Dispatcher for the component tree.
      * If one already exists on that <svg>, it will be returned; otherwise, a new one will be created.
      *
      * @param {SVGElement} elem
      * @return {Dispatchers.Mouse}
      */
    def getDispatcher(component: Component): typingsSlinky.plottable.dispatchersMod.Mouse = js.native
  }
  
  type MouseCallback = js.Function2[/* p */ Point, /* event */ MouseEvent, Unit]
}
