package typingsSlinky.materialUiCore.textFieldTextFieldMod

import typingsSlinky.materialUiCore.PartialOutlinedInputProps
import typingsSlinky.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlinedTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  var InputProps: js.UndefOr[PartialOutlinedInputProps] = js.native
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  @JSName("variant")
  var variant_OutlinedTextFieldProps: outlined = js.native
}

object OutlinedTextFieldProps {
  @scala.inline
  def apply(variant: outlined): OutlinedTextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlinedTextFieldProps]
  }
  @scala.inline
  implicit class OutlinedTextFieldPropsOps[Self <: OutlinedTextFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVariant(value: outlined): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputProps(value: PartialOutlinedInputProps): Self = {
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

