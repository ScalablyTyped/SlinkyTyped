package typingsSlinky.guacamoleClient.mod

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Keyboard")
@js.native
class Keyboard protected ()
  extends typingsSlinky.guacamoleClient.keyboardMod.Keyboard {
  /**
    * @param element
    * The Element to use to provide keyboard events. If omitted, at least one
    * Element must be manually provided through the listenTo() function for
    * the Guacamole.Keyboard instance to have any effect.
    */
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Keyboard {
  
  @JSImport("guacamole-client", "Keyboard.ModifierState")
  @js.native
  class ModifierState ()
    extends typingsSlinky.guacamoleClient.keyboardMod.Keyboard.ModifierState
  /* static members */
  object ModifierState {
    
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    @JSImport("guacamole-client", "Keyboard.ModifierState.fromKeyboardEvent")
    @js.native
    def fromKeyboardEvent(event: KeyboardEvent): typingsSlinky.guacamoleClient.keyboardMod.Keyboard.ModifierState = js.native
  }
}
