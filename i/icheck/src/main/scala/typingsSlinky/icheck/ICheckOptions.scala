package typingsSlinky.icheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckOptions extends js.Object {
  /**
  	* Class added on active state (mouse button is pressed on an input)
  	*/
  var activeClass: js.UndefOr[String] = js.native
  /**
  	* Base class added to customized checkboxes
  	*/
  var checkboxClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'checkedClass' option (checkbox input specific)
  	*/
  var checkedCheckboxClass: js.UndefOr[String] = js.native
  /**
  	* Class added on checked state (input.checked = true)
  	*/
  var checkedClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'checkedClass' option (radio button input specific)
  	*/
  var checkedRadioClass: js.UndefOr[String] = js.native
  /**
  	* True to set 'pointer' CSS cursor over enabled inputs and 'default' over disabled
  	*/
  var cursor: js.UndefOr[Boolean] = js.native
  /**
  	* If not empty, used instead of 'disabledClass' option (checkbox input specific)
  	*/
  var disabledCheckboxClass: js.UndefOr[String] = js.native
  /**
  	* Class added on disabled state (input.disabled = true)
  	*/
  var disabledClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'disabledClass' option (radio button input specific)
  	*/
  var disabledRadioClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'enabledClass' option (checkbox input specific)
  	*/
  var enabledCheckboxClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, added as class name on enabled state (input.disabled = false)
  	*/
  var enabledClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'enabledClass' option (radio button input specific)
  	*/
  var enabledRadioClass: js.UndefOr[String] = js.native
  /**
  	* Class added on focus state (input has gained focus)
  	*/
  var focusClass: js.UndefOr[String] = js.native
  /**
  	* 'checkbox' or 'radio' to style only checkboxes or radio buttons, both by default
  	*/
  var handle: js.UndefOr[String] = js.native
  /**
  	* Class added on hover state (pointer is moved onto an input)
  	*/
  var hoverClass: js.UndefOr[String] = js.native
  /**
  	* Increase clickable area by given % (negative number to decrease)
  	*/
  var increaseArea: js.UndefOr[String] = js.native
  /**
  	* Set true to inherit original input's class name
  	*/
  var inheritClass: js.UndefOr[Boolean] = js.native
  /**
  	* If set to true, input's id is prefixed with 'iCheck-' and attached
  	*/
  var inheritID: js.UndefOr[Boolean] = js.native
  /**
  	* Add HTML code or text inside customized input
  	*/
  var insert: js.UndefOr[String] = js.native
  /**
  	* Adds hoverClass to customized input on label hover and labelHoverClass to label on input hover
  	*/
  var labelHover: js.UndefOr[Boolean] = js.native
  /**
  	* Class added to label if labelHover set to true
  	*/
  var labelHoverClass: js.UndefOr[String] = js.native
  /**
  	* Base class added to customized radio buttons
  	*/
  var radioClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'uncheckedClass' option (checkbox input specific)
  	*/
  var uncheckedCheckboxClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, added as class name on unchecked state (input.checked = false)
  	*/
  var uncheckedClass: js.UndefOr[String] = js.native
  /**
  	* If not empty, used instead of 'uncheckedClass' option (radio button input specific)
  	*/
  var uncheckedRadioClass: js.UndefOr[String] = js.native
}

object ICheckOptions {
  @scala.inline
  def apply(): ICheckOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckOptions]
  }
  @scala.inline
  implicit class ICheckOptionsOps[Self <: ICheckOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCheckboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedCheckboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedRadioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedRadioClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCheckboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledCheckboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledRadioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledRadioClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCheckboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCheckboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledRadioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledRadioClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIncreaseArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncreaseArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseArea")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritID")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHover")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCheckboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedCheckboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUncheckedRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedRadioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncheckedRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedRadioClass")(js.undefined)
        ret
    }
  }
  
}

