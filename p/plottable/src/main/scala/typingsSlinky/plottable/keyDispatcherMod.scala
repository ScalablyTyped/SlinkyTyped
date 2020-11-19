package typingsSlinky.plottable

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.plottable.dispatcherMod.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/dispatchers/keyDispatcher", JSImport.Namespace)
@js.native
object keyDispatcherMod extends js.Object {
  
  @js.native
  /**
    * This constructor should not be invoked directly.
    *
    * @constructor
    */
  class Key () extends Dispatcher {
    
    /* private */ def _processKeydown(event: js.Any): js.Any = js.native
    
    /* private */ def _processKeyup(event: js.Any): js.Any = js.native
    
    /**
      * Removes the callback to be called whenever a key is pressed.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def offKeyDown(callback: KeyCallback): this.type = js.native
    
    /**
      * Removes the callback to be called whenever a key is released.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def offKeyUp(callback: KeyCallback): this.type = js.native
    
    /**
      * Registers a callback to be called whenever a key is pressed.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def onKeyDown(callback: KeyCallback): this.type = js.native
    
    /** Registers a callback to be called whenever a key is released.
      *
      * @param {KeyCallback} callback
      * @return {Dispatchers.Key} The calling Key Dispatcher.
      */
    def onKeyUp(callback: KeyCallback): this.type = js.native
  }
  /* static members */
  @js.native
  object Key extends js.Object {
    
    var _DISPATCHER_KEY: js.Any = js.native
    
    var _KEYDOWN_EVENT_NAME: js.Any = js.native
    
    var _KEYUP_EVENT_NAME: js.Any = js.native
    
    /**
      * Gets a Key Dispatcher. If one already exists it will be returned;
      * otherwise, a new one will be created.
      *
      * @return {Dispatchers.Key}
      */
    def getDispatcher(): typingsSlinky.plottable.dispatchersMod.Key = js.native
  }
  
  type KeyCallback = js.Function2[/* keyCode */ Double, /* event */ KeyboardEvent, Unit]
}
