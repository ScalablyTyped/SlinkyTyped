package typingsSlinky.playcanvas

import typingsSlinky.playcanvas.pc.GamePads
import typingsSlinky.playcanvas.pc.Keyboard
import typingsSlinky.playcanvas.pc.Mouse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGamepads extends js.Object {
  var gamepads: js.UndefOr[GamePads] = js.native
  var keyboard: js.UndefOr[Keyboard] = js.native
  var mouse: js.UndefOr[Mouse] = js.native
}

object AnonGamepads {
  @scala.inline
  def apply(): AnonGamepads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGamepads]
  }
  @scala.inline
  implicit class AnonGamepadsOps[Self <: AnonGamepads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGamepads(value: GamePads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGamepads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Keyboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMouse(value: Mouse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.undefined)
        ret
    }
  }
  
}

