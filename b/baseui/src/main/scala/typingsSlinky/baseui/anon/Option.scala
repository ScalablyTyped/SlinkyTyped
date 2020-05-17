package typingsSlinky.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var option: js.UndefOr[typingsSlinky.baseui.selectMod.Option] = js.native
  var optionState: Disabled = js.native
}

object Option {
  @scala.inline
  def apply(optionState: Disabled): Option = {
    val __obj = js.Dynamic.literal(optionState = optionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionState(value: Disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: typingsSlinky.baseui.selectMod.Option): Self = {
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

