package typingsSlinky.reactSelect.srcCreatableMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var newOption: js.UndefOr[OptionType] = js.native
  var options: OptionsType[OptionType] = js.native
}

object State {
  @scala.inline
  def apply[OptionType](options: OptionsType[OptionType]): State[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  @scala.inline
  implicit class StateOps[Self[optiontype] <: State[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withOptions(value: OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewOption(value: OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newOption")(js.undefined)
        ret
    }
  }
  
}

