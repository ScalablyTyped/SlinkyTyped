package typingsSlinky.baseui

import typingsSlinky.baseui.layerMod.PopperOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrow extends js.Object {
  var arrow: js.UndefOr[PopperOffset] = js.native
  var popper: PopperOffset = js.native
}

object AnonArrow {
  @scala.inline
  def apply(popper: PopperOffset): AnonArrow = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrow]
  }
  @scala.inline
  implicit class AnonArrowOps[Self <: AnonArrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopper(value: PopperOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrow(value: PopperOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
  }
  
}

