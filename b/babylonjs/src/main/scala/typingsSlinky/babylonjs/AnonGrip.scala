package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGrip extends js.Object {
  var grip: String = js.native
  var menu: String = js.native
  var thumbstick: String = js.native
  var trackpad: String = js.native
  var trigger: String = js.native
}

object AnonGrip {
  @scala.inline
  def apply(grip: String, menu: String, thumbstick: String, trackpad: String, trigger: String): AnonGrip = {
    val __obj = js.Dynamic.literal(grip = grip.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], thumbstick = thumbstick.asInstanceOf[js.Any], trackpad = trackpad.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrip]
  }
  @scala.inline
  implicit class AnonGripOps[Self <: AnonGrip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbstick(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbstick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackpad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

