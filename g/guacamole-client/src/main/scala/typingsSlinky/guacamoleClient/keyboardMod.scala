package typingsSlinky.guacamoleClient

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.guacamoleClient.guacamoleClientBooleans.`true`
import typingsSlinky.guacamoleClient.keyboardMod.Keyboard.ModifierState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/Keyboard", JSImport.Namespace)
@js.native
object keyboardMod extends js.Object {
  
  @js.native
  class Keyboard protected () extends js.Object {
    /**
      * @param element
      * The Element to use to provide keyboard events. If omitted, at least one
      * Element must be manually provided through the listenTo() function for
      * the Guacamole.Keyboard instance to have any effect.
      */
    def this(element: HTMLDocument) = this()
    def this(element: HTMLElement) = this()
    
    def listenTo(element: HTMLDocument): Unit = js.native
    /**
      * Attaches event listeners to the given Element, automatically translating
      * received key, input, and composition events into simple keydown/keyup
      * events signalled through this Guacamole.Keyboard's onkeydown and
      * onkeyup handlers.
      *
      * @param element
      * The Element to attach event listeners to for the sake of handling key or input events.
      */
    def listenTo(element: HTMLElement): Unit = js.native
    
    /**
      * All modifiers and their states.
      */
    var modifiers: ModifierState = js.native
    
    /**
      * Fired whenever the user presses a key with the element associated
      * with this Guacamole.Keyboard in focus.
      * @event
      * @param keysym The keysym of the key being pressed.
      * @return true if the key event should be allowed through to the browser, false otherwise.
      */
    var onkeydown: Null | (js.Function1[/* keysym */ Double, Boolean | Unit]) = js.native
    
    /**
      * Fired whenever the user releases a key with the element associated
      * with this Guacamole.Keyboard in focus.
      * @event
      * @param keysym The keysym of the key being released.
      */
    var onkeyup: Null | (js.Function1[/* keysym */ Double, Unit]) = js.native
    
    /**
      * Marks a key as pressed, firing the keydown event if registered. Key
      * repeat for the pressed key will start after a delay if that key is
      * not a modifier. The return value of this function depends on the
      * return value of the keydown event handler, if any.
      *
      * @param keysym The keysym of the key to press.
      * @return true if event should NOT be canceled, false otherwise.
      */
    def press(keysym: Double): Boolean = js.native
    
    /**
      * The state of every key, indexed by keysym. If a particular key is
      * pressed, the value of pressed for that keysym will be true. If a key
      * is not currently pressed, it will not be defined.
      */
    var pressed: NumberDictionary[`true`] = js.native
    
    /**
      * Marks a key as released, firing the keyup event if registered.
      * @param keysym The keysym of the key to release.
      */
    def release(keysym: Double): Unit = js.native
    
    /**
      * Resets the state of this keyboard, releasing all keys, and firing keyup
      * events for each released key.
      */
    def reset(): Unit = js.native
    
    /**
      * Presses and releases the keys necessary to type the given string of
      * text.
      *
      * @param str The string to type.
      */
    def `type`(str: String): Unit = js.native
  }
  @js.native
  object Keyboard extends js.Object {
    
    @js.native
    class ModifierState () extends js.Object {
      
      /**
        * Whether alt is currently pressed.
        */
      var alt: Boolean = js.native
      
      /**
        * Whether ctrl is currently pressed.
        */
      var ctrl: Boolean = js.native
      
      /**
        * Whether hyper (windows key) is currently pressed.
        */
      var hyper: Boolean = js.native
      
      /**
        * Whether meta (apple key) is currently pressed.
        */
      var meta: Boolean = js.native
      
      /**
        * Whether shift is currently pressed.
        */
      var shift: Boolean = js.native
    }
    /* static members */
    @js.native
    object ModifierState extends js.Object {
      
      /**
        * Returns the modifier state applicable to the keyboard event given.
        * @param event The keyboard event to read.
        * @returns The current state of keyboard modifiers.
        */
      def fromKeyboardEvent(event: KeyboardEvent): ModifierState = js.native
    }
  }
}
