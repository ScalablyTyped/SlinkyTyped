package typingsSlinky.officeUiFabricReact.comboBoxTypesMod

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxOptionStyles extends IButtonStyles {
  /**
    * Styles for the text inside the comboBox option.
    * This should be used instead of the description
    * inside IButtonStyles because we custom render the text
    * in the comboBox options.
    */
  var optionText: IStyle = js.native
  /**
    * Styles for the comboBox option text's wrapper.
    */
  var optionTextWrapper: IStyle = js.native
}

object IComboBoxOptionStyles {
  @scala.inline
  def apply(): IComboBoxOptionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComboBoxOptionStyles]
  }
  @scala.inline
  implicit class IComboBoxOptionStylesOps[Self <: IComboBoxOptionStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionText")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionText")(null)
        ret
    }
    @scala.inline
    def withOptionTextWrapper(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionTextWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionTextWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionTextWrapper")(null)
        ret
    }
  }
  
}

