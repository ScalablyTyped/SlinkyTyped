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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputEvent extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/input-event
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
  implicit class InputEventOps[Self <: InputEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModifiersVarargs(
      value: (shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right)*
    ): Self = this.set("modifiers", js.Array(value :_*))
    @scala.inline
    def setModifiers(
      value: js.Array[
          shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
        ]
    ): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
  }
  
}

