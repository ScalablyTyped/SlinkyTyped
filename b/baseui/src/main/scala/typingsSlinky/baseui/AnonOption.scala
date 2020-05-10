package typingsSlinky.baseui

import typingsSlinky.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOption extends js.Object {
  var option: js.UndefOr[Option] = js.native
  var optionState: AnonDisabled = js.native
}

object AnonOption {
  @scala.inline
  def apply(optionState: AnonDisabled): AnonOption = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOption]
  }
  @scala.inline
  implicit class AnonOptionOps[Self <: AnonOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionState(value: AnonDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: Option): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
  }
  
}

