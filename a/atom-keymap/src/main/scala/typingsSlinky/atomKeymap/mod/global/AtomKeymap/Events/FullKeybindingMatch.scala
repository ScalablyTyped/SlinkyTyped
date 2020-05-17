package typingsSlinky.atomKeymap.mod.global.AtomKeymap.Events

import org.scalajs.dom.raw.Element
import typingsSlinky.atomKeymap.mod.global.AtomKeymap.KeyBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullKeybindingMatch extends js.Object {
  /** The KeyBinding that the keystrokes matched. */
  var binding: KeyBinding = js.native
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String = js.native
}

object FullKeybindingMatch {
  @scala.inline
  def apply(binding: KeyBinding, keyboardEventTarget: Element, keystrokes: String): FullKeybindingMatch = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullKeybindingMatch]
  }
  @scala.inline
  implicit class FullKeybindingMatchOps[Self <: FullKeybindingMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: KeyBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyboardEventTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEventTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystrokes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystrokes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

