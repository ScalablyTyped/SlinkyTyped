package typingsSlinky.officeUiFabricReact.checkboxTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxStyles extends js.Object {
  /**
    * Style for checkbox in its default unchecked/enabled state.
    */
  var checkbox: js.UndefOr[IStyle] = js.native
  /**
    * Style for the checkmark in the default enabled/unchecked state.
    */
  var checkmark: js.UndefOr[IStyle] = js.native
  /**
    * INTERNAL: This is mostly an internal implementation detail which you should avoid styling.
    * This refers to the <input type="checkbox"> element that is typically hidden and not rendered on screen.
    */
  var input: js.UndefOr[IStyle] = js.native
  /**
    * Style for the label part (contains the customized checkbox + text) when enabled.
    */
  var label: js.UndefOr[IStyle] = js.native
  /**
    * Style for the root element (a button) of the checkbox component in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style for text appearing with the checkbox in its default enabled state.
    */
  var text: js.UndefOr[IStyle] = js.native
}

object ICheckboxStyles {
  @scala.inline
  def apply(): ICheckboxStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxStyles]
  }
  @scala.inline
  implicit class ICheckboxStylesOps[Self <: ICheckboxStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckbox(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(null)
        ret
    }
    @scala.inline
    def withCheckmark(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckmark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckmarkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmark")(null)
        ret
    }
    @scala.inline
    def withInput(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
    @scala.inline
    def withLabel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

