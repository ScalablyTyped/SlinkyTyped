package typingsSlinky.atomKeymap.mod.global.AtomKeymap.Events

import org.scalajs.dom.raw.Element
import typingsSlinky.atomKeymap.mod.global.AtomKeymap.KeyBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialKeybindingMatch extends js.Object {
  /** DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  /** The string of keystrokes that matched the binding. */
  var keystrokes: String = js.native
  /** The KeyBindings that the keystrokes partially matched. */
  var partiallyMatchedBindings: js.Array[KeyBinding] = js.native
}

object PartialKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String, partiallyMatchedBindings: js.Array[KeyBinding]): PartialKeybindingMatch = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any], partiallyMatchedBindings = partiallyMatchedBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeybindingMatch]
  }
  @scala.inline
  implicit class PartialKeybindingMatchOps[Self <: PartialKeybindingMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withPartiallyMatchedBindings(value: js.Array[KeyBinding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partiallyMatchedBindings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

