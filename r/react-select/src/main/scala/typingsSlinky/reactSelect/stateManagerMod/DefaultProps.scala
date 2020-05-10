package typingsSlinky.reactSelect.stateManagerMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var defaultInputValue: String = js.native
  var defaultMenuIsOpen: Boolean = js.native
  var defaultValue: ValueType[OptionType] = js.native
}

object DefaultProps {
  @scala.inline
  def apply[OptionType](defaultInputValue: String, defaultMenuIsOpen: Boolean): DefaultProps[OptionType] = {
    val __obj = js.Dynamic.literal(defaultInputValue = defaultInputValue.asInstanceOf[js.Any], defaultMenuIsOpen = defaultMenuIsOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps[OptionType]]
  }
  @scala.inline
  implicit class DefaultPropsOps[Self[optiontype] <: DefaultProps[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withDefaultInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultMenuIsOpen(value: Boolean): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMenuIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: ValueType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValueNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(null)
        ret
    }
  }
  
}

