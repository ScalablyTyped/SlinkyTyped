package typingsSlinky.plottable

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.dispatcherMod.Dispatcher
import typingsSlinky.plottable.interfacesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchDispatcherMod {
  
  @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
  @js.native
  class Touch protected () extends Dispatcher {
    /**
      * This constructor should not be invoked directly.
      *
      * @param {SVGElement} svg The root <svg> to attach to.
      */
    def this(component: Component) = this()
    
    /**
      * Computes the Touch position from the given event, and if successful
      * calls all the callbacks in the provided callbackSet.
      */
    /* private */ def _measureAndDispatch(component: js.Any, event: js.Any, eventName: js.Any, scope: js.Any): js.Any = js.native
    
    var _translator: js.Any = js.native
    
    def eventInside(component: Component, event: TouchEvent): Boolean = js.native
    
    /**
      * Removes a callback that would be called when a touch is cancelled.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchCancel(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a touch ends.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchEnd(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when the touch position changes.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchMove(callback: TouchCallback): this.type = js.native
    
    /**
      * Removes a callback that would be called when a touch starts.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def offTouchStart(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch is cancelled.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchCancel(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch ends.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchEnd(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when the touch position changes.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchMove(callback: TouchCallback): this.type = js.native
    
    /**
      * Registers a callback to be called when a touch starts.
      *
      * @param {TouchCallback} callback
      * @return {Dispatchers.Touch} The calling Touch Dispatcher.
      */
    def onTouchStart(callback: TouchCallback): this.type = js.native
  }
  /* static members */
  object Touch {
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._DISPATCHER_KEY")
    @js.native
    def _DISPATCHER_KEY: js.Any = js.native
    @scala.inline
    def _DISPATCHER_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DISPATCHER_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHCANCEL_EVENT_NAME")
    @js.native
    def _TOUCHCANCEL_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHCANCEL_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHCANCEL_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHEND_EVENT_NAME")
    @js.native
    def _TOUCHEND_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHEND_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHEND_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHMOVE_EVENT_NAME")
    @js.native
    def _TOUCHMOVE_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHMOVE_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHMOVE_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch._TOUCHSTART_EVENT_NAME")
    @js.native
    def _TOUCHSTART_EVENT_NAME: js.Any = js.native
    @scala.inline
    def _TOUCHSTART_EVENT_NAME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TOUCHSTART_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Gets a Touch Dispatcher for the component.
      * If one already exists, it will be returned; otherwise, a new one will be created.
      *
      * @param component
      * @return {Dispatchers.Touch}
      */
    @JSImport("plottable/build/src/dispatchers/touchDispatcher", "Touch.getDispatcher")
    @js.native
    def getDispatcher(component: Component): typingsSlinky.plottable.dispatchersMod.Touch = js.native
  }
  
  type TouchCallback = js.Function3[
    /* ids */ js.Array[Double], 
    /* idToPoint */ NumberDictionary[Point], 
    /* event */ TouchEvent, 
    Unit
  ]
}
