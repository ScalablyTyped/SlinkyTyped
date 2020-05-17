package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionState extends js.Object {
  var option: typingsSlinky.baseui.selectMod.Option = js.native
  var optionState: IsHighlighted = js.native
}

object OptionState {
  @scala.inline
  def apply(option: typingsSlinky.baseui.selectMod.Option, optionState: IsHighlighted): OptionState = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionState]
  }
  @scala.inline
  implicit class OptionStateOps[Self <: OptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: typingsSlinky.baseui.selectMod.Option): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionState(value: IsHighlighted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

