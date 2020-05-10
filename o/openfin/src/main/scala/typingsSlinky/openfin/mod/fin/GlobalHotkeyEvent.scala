package typingsSlinky.openfin.mod.fin

import typingsSlinky.openfin.AnonEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHotkeyEvent extends js.Object {
  var hotkey: String = js.native
  /**
    * The Identity that has just registered the hotkey
    */
  var identity: AnonEntityType = js.native
  var topic: String = js.native
  var `type`: OpenFinGlobalHotkeyEventType = js.native
}

object GlobalHotkeyEvent {
  @scala.inline
  def apply(hotkey: String, identity: AnonEntityType, topic: String, `type`: OpenFinGlobalHotkeyEventType): GlobalHotkeyEvent = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent]
  }
  @scala.inline
  implicit class GlobalHotkeyEventOps[Self <: GlobalHotkeyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHotkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: AnonEntityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: OpenFinGlobalHotkeyEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

