package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.alt
import typingsSlinky.electron.electronStrings.capsLock
import typingsSlinky.electron.electronStrings.cmd
import typingsSlinky.electron.electronStrings.command
import typingsSlinky.electron.electronStrings.control
import typingsSlinky.electron.electronStrings.ctrl
import typingsSlinky.electron.electronStrings.isAutoRepeat
import typingsSlinky.electron.electronStrings.isKeypad
import typingsSlinky.electron.electronStrings.left
import typingsSlinky.electron.electronStrings.leftButtonDown
import typingsSlinky.electron.electronStrings.meta
import typingsSlinky.electron.electronStrings.middleButtonDown
import typingsSlinky.electron.electronStrings.numLock
import typingsSlinky.electron.electronStrings.right
import typingsSlinky.electron.electronStrings.rightButtonDown
import typingsSlinky.electron.electronStrings.shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/input-event
  /**
    * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
    * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
    * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
    */
  var modifiers: js.UndefOr[
    js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ]
  ] = js.native
}
object InputEvent {
  
  @scala.inline
  def apply(): InputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEvent]
  }
  
  @scala.inline
  implicit class InputEventMutableBuilder[Self <: InputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(
      value: js.Array[
          shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
        ]
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(
      value: (shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right)*
    ): Self = StObject.set(x, "modifiers", js.Array(value :_*))
  }
}
