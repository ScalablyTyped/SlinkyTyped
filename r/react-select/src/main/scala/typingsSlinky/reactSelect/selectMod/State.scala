package typingsSlinky.reactSelect.selectMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var ariaLiveContext: String = js.native
  var ariaLiveSelection: String = js.native
  var focusedOption: OptionType | Null = js.native
  var focusedValue: OptionType | Null = js.native
  var inputIsHidden: Boolean = js.native
  var isComposing: Boolean = js.native
  var isFocused: Boolean = js.native
  var menuOptions: MenuOptions[OptionType] = js.native
  var selectValue: OptionsType[OptionType] = js.native
}

object State {
  @scala.inline
  def apply[OptionType](
    ariaLiveContext: String,
    ariaLiveSelection: String,
    inputIsHidden: Boolean,
    isComposing: Boolean,
    isFocused: Boolean,
    menuOptions: MenuOptions[OptionType],
    selectValue: OptionsType[OptionType]
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext.asInstanceOf[js.Any], ariaLiveSelection = ariaLiveSelection.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuOptions = menuOptions.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  @scala.inline
  implicit class StateOps[Self[optiontype] <: State[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withAriaLiveContext(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaLiveSelection(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLiveSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIsHidden(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsComposing(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComposing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuOptions(value: MenuOptions[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectValue(value: OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedOption(value: OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedOptionNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedOption")(null)
        ret
    }
    @scala.inline
    def withFocusedValue(value: OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusedValueNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedValue")(null)
        ret
    }
  }
  
}

