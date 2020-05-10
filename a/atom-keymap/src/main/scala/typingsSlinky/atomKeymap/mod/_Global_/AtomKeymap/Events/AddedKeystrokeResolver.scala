package typingsSlinky.atomKeymap.mod._Global_.AtomKeymap.Events

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddedKeystrokeResolver extends js.Object {
  /**
    *  The raw DOM 3 `KeyboardEvent` being resolved. See the DOM API documentation
    *  for more details.
    */
  var event: KeyboardEvent = js.native
  /**
    *  An object mapping DOM 3 `KeyboardEvent.code` values to objects with the
    *  typed character for that key in each modifier state, based on the current
    *  operating system layout.
    */
  var keymap: js.Object = js.native
  /**
    *  The currently resolved keystroke string. If your function returns a falsy
    *  value, this is how Atom will resolve your keystroke.
    */
  var keystroke: String = js.native
  /** The OS-specific name of the current keyboard layout. */
  var layoutName: String = js.native
}

object AddedKeystrokeResolver {
  @scala.inline
  def apply(event: KeyboardEvent, keymap: js.Object, keystroke: String, layoutName: String): AddedKeystrokeResolver = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], keymap = keymap.asInstanceOf[js.Any], keystroke = keystroke.asInstanceOf[js.Any], layoutName = layoutName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddedKeystrokeResolver]
  }
  @scala.inline
  implicit class AddedKeystrokeResolverOps[Self <: AddedKeystrokeResolver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: KeyboardEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeymap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keymap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeystroke(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keystroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

