package typingsSlinky.materialUiCore.textFieldTextFieldMod

import typingsSlinky.materialUiCore.anon.PartialFilledInputProps
import typingsSlinky.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.filled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilledTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  var InputProps: js.UndefOr[PartialFilledInputProps] = js.native
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  @JSName("variant")
  var variant_FilledTextFieldProps: filled = js.native
}

object FilledTextFieldProps {
  @scala.inline
  def apply(variant: filled): FilledTextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilledTextFieldProps]
  }
  @scala.inline
  implicit class FilledTextFieldPropsOps[Self <: FilledTextFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariant(value: filled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputProps(value: PartialFilledInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputProps")(js.undefined)
        ret
    }
  }
  
}

