package typingsSlinky.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShiftRegisterOption extends js.Object {
  var isAnode: js.UndefOr[Boolean] = js.native
  var pins: js.Any = js.native
}

object ShiftRegisterOption {
  @scala.inline
  def apply(pins: js.Any): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftRegisterOption]
  }
  @scala.inline
  implicit class ShiftRegisterOptionOps[Self <: ShiftRegisterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPins(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAnode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAnode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnode")(js.undefined)
        ret
    }
  }
  
}

