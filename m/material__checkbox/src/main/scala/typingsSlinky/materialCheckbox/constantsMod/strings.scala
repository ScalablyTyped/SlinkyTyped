package typingsSlinky.materialCheckbox.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`Dotmdc-checkbox__native-control`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`aria-checked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.checked
import typingsSlinky.materialCheckbox.materialCheckboxStrings.indeterminate
import typingsSlinky.materialCheckbox.materialCheckboxStrings.init
import typingsSlinky.materialCheckbox.materialCheckboxStrings.mixed
import typingsSlinky.materialCheckbox.materialCheckboxStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait strings extends MDCStrings {
  var ARIA_CHECKED_ATTR: `aria-checked` = js.native
  var ARIA_CHECKED_INDETERMINATE_VALUE: mixed = js.native
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control` = js.native
  var TRANSITION_STATE_CHECKED: checked = js.native
  var TRANSITION_STATE_INDETERMINATE: indeterminate = js.native
  var TRANSITION_STATE_INIT: init = js.native
  var TRANSITION_STATE_UNCHECKED: unchecked = js.native
}

object strings {
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: `aria-checked`,
    ARIA_CHECKED_INDETERMINATE_VALUE: mixed,
    NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control`,
    TRANSITION_STATE_CHECKED: checked,
    TRANSITION_STATE_INDETERMINATE: indeterminate,
    TRANSITION_STATE_INIT: init,
    TRANSITION_STATE_UNCHECKED: unchecked
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED.asInstanceOf[js.Any], TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE.asInstanceOf[js.Any], TRANSITION_STATE_INIT = TRANSITION_STATE_INIT.asInstanceOf[js.Any], TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED.asInstanceOf[js.Any])
    __obj.asInstanceOf[strings]
  }
  @scala.inline
  implicit class stringsOps[Self <: strings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARIA_CHECKED_ATTR(value: `aria-checked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARIA_CHECKED_INDETERMINATE_VALUE(value: mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_INDETERMINATE_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNATIVE_CONTROL_SELECTOR(value: `Dotmdc-checkbox__native-control`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_STATE_CHECKED(value: checked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_CHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_STATE_INDETERMINATE(value: indeterminate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_INDETERMINATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_STATE_INIT(value: init): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_INIT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRANSITION_STATE_UNCHECKED(value: unchecked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_STATE_UNCHECKED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

