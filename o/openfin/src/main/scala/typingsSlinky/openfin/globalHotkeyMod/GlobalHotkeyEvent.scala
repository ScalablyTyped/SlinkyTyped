package typingsSlinky.openfin.globalHotkeyMod

import typingsSlinky.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped 'global-hotkey' extends 'window' | 'view' ? openfin.openfin/_v2/api/events/base.WindowEvent<'global-hotkey', Type> : 'global-hotkey' extends 'frame' ? openfin.openfin/_v2/api/events/frame.FrameEvent<Type> : 'global-hotkey' extends 'application' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : 'global-hotkey' extends 'external-window' ? openfin.openfin/_v2/api/events/base.ApplicationEvent<'global-hotkey', Type> : openfin.openfin/_v2/api/events/base.BaseEvent<'global-hotkey', Type> */ @js.native
trait GlobalHotkeyEvent[Type] extends js.Object {
  var hotkey: String = js.native
  var identity: Identity = js.native
}

object GlobalHotkeyEvent {
  @scala.inline
  def apply[Type](hotkey: String, identity: Identity): GlobalHotkeyEvent[Type] = {
    val __obj = js.Dynamic.literal(hotkey = hotkey.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalHotkeyEvent[Type]]
  }
  @scala.inline
  implicit class GlobalHotkeyEventOps[Self[`type`] <: GlobalHotkeyEvent[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def withHotkey(value: String): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentity(value: Identity): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

