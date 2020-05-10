package typingsSlinky.inboxsdk.mod.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardShortcutDescriptor extends js.Object {
  var chord: String = js.native
  var description: String = js.native
}

object KeyboardShortcutDescriptor {
  @scala.inline
  def apply(chord: String, description: String): KeyboardShortcutDescriptor = {
    val __obj = js.Dynamic.literal(chord = chord.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardShortcutDescriptor]
  }
  @scala.inline
  implicit class KeyboardShortcutDescriptorOps[Self <: KeyboardShortcutDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

