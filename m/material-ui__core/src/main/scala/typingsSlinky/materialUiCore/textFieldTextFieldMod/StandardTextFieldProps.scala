package typingsSlinky.materialUiCore.textFieldTextFieldMod

import typingsSlinky.materialUiCore.anon.PartialInputProps
import typingsSlinky.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typingsSlinky.materialUiCore.materialUiCoreStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  var InputProps: js.UndefOr[PartialInputProps] = js.native
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  @JSName("variant")
  var variant_StandardTextFieldProps: js.UndefOr[standard] = js.native
}

object StandardTextFieldProps {
  @scala.inline
  def apply(): StandardTextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardTextFieldProps]
  }
  @scala.inline
  implicit class StandardTextFieldPropsOps[Self <: StandardTextFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputProps(value: PartialInputProps): Self = {
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
    @scala.inline
    def withVariant(value: standard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

