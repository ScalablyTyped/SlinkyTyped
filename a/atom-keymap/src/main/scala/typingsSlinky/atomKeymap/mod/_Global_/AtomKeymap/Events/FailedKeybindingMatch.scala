package typingsSlinky.atomKeymap.mod._Global_.AtomKeymap.Events

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedKeybindingMatch extends js.Object {
  /** The DOM element that was the target of the most recent keyboard event. */
  var keyboardEventTarget: Element = js.native
  /** The string of keystrokes that failed to match the binding. */
  var keystrokes: String = js.native
}

object FailedKeybindingMatch {
  @scala.inline
  def apply(keyboardEventTarget: Element, keystrokes: String): FailedKeybindingMatch = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], keystrokes = keystrokes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedKeybindingMatch]
  }
  @scala.inline
  implicit class FailedKeybindingMatchOps[Self <: FailedKeybindingMatch] (val x: Self) extends AnyVal {
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
  }
  
}

