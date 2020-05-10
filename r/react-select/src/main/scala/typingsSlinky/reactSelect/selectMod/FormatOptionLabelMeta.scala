package typingsSlinky.reactSelect.selectMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptionLabelMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var context: FormatOptionLabelContext = js.native
  var inputValue: String = js.native
  var selectValue: ValueType[OptionType] = js.native
}

object FormatOptionLabelMeta {
  @scala.inline
  def apply[OptionType](context: FormatOptionLabelContext, inputValue: String): FormatOptionLabelMeta[OptionType] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
  }
  @scala.inline
  implicit class FormatOptionLabelMetaOps[Self[optiontype] <: FormatOptionLabelMeta[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withContext(value: FormatOptionLabelContext): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectValue(value: ValueType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectValue: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectValueNull: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectValue")(null)
        ret
    }
  }
  
}

