package typingsSlinky.guacamoleClient.mod

import org.scalajs.dom.raw.HTMLDocument
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("guacamole-client", "Keyboard")
@js.native
object Keyboard extends js.Object {
  @js.native
  class ModifierState ()
    extends typingsSlinky.guacamoleClient.keyboardMod.Keyboard.ModifierState
  
  /* static members */
  @js.native
  object ModifierState extends js.Object {
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    def fromKeyboardEvent(event: KeyboardEvent): typingsSlinky.guacamoleClient.keyboardMod.Keyboard.ModifierState = js.native
  }
  
}

