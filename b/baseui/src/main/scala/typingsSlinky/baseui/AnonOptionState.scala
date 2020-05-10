package typingsSlinky.baseui

import typingsSlinky.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOptionState extends js.Object {
  var option: Option = js.native
  var optionState: AnonIsHighlighted = js.native
}

object AnonOptionState {
  @scala.inline
  def apply(option: Option, optionState: AnonIsHighlighted): AnonOptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptionState]
  }
  @scala.inline
  implicit class AnonOptionStateOps[Self <: AnonOptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: Option): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionState(value: AnonIsHighlighted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

