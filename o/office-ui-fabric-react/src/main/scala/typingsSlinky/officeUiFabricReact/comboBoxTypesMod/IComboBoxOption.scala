package typingsSlinky.officeUiFabricReact.comboBoxTypesMod

import typingsSlinky.officeUiFabricReact.PartialIComboBoxOptionSty
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxOption extends ISelectableOption {
  /**
    * Specific styles for each comboBox option. If you intend to give
    * common styles to all comboBox option please use
    * the prop comboBoxOptionStyles
    */
  var styles: js.UndefOr[PartialIComboBoxOptionSty] = js.native
  /**
    * In scenarios where embedded data is used at the text prop, we will use the ariaLabel prop
    * to set the aria-label and preview text. Default to false
    * @defaultvalue false;
    */
  var useAriaLabelAsText: js.UndefOr[Boolean] = js.native
}

object IComboBoxOption {
  @scala.inline
  def apply(key: String | Double, text: String): IComboBoxOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxOption]
  }
  @scala.inline
  implicit class IComboBoxOptionOps[Self <: IComboBoxOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: PartialIComboBoxOptionSty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAriaLabelAsText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAriaLabelAsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAriaLabelAsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAriaLabelAsText")(js.undefined)
        ret
    }
  }
  
}

