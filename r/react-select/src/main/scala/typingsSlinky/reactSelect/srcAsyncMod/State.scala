package typingsSlinky.reactSelect.srcAsyncMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultOptions: js.UndefOr[OptionsType[OptionType]] = js.native
  var inputValue: String = js.native
  var isLoading: Boolean = js.native
  var loadedInputValue: js.UndefOr[String] = js.native
  var loadedOptions: OptionsType[OptionType] = js.native
  var passEmptyOptions: Boolean = js.native
}

object State {
  @scala.inline
  def apply[OptionType](
    inputValue: String,
    isLoading: Boolean,
    loadedOptions: OptionsType[OptionType],
    passEmptyOptions: Boolean
  ): State[OptionType] = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], loadedOptions = loadedOptions.asInstanceOf[js.Any], passEmptyOptions = passEmptyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[OptionType]]
  }
  @scala.inline
  implicit class StateOps[Self[optiontype] <: State[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadedOptions(value: OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassEmptyOptions(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passEmptyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultOptions(value: OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOptions: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadedInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedInputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedInputValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedInputValue")(js.undefined)
        ret
    }
  }
  
}

