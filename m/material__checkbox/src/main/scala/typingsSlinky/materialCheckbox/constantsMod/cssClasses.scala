package typingsSlinky.materialCheckbox.constantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-checked-indeterminate`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-checked-unchecked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-indeterminate-checked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-indeterminate-unchecked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-unchecked-checked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--anim-unchecked-indeterminate`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--checked`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--disabled`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--indeterminate`
import typingsSlinky.materialCheckbox.materialCheckboxStrings.`mdc-checkbox--upgraded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var ANIM_CHECKED_INDETERMINATE: `mdc-checkbox--anim-checked-indeterminate` = js.native
  var ANIM_CHECKED_UNCHECKED: `mdc-checkbox--anim-checked-unchecked` = js.native
  var ANIM_INDETERMINATE_CHECKED: `mdc-checkbox--anim-indeterminate-checked` = js.native
  var ANIM_INDETERMINATE_UNCHECKED: `mdc-checkbox--anim-indeterminate-unchecked` = js.native
  var ANIM_UNCHECKED_CHECKED: `mdc-checkbox--anim-unchecked-checked` = js.native
  var ANIM_UNCHECKED_INDETERMINATE: `mdc-checkbox--anim-unchecked-indeterminate` = js.native
  var CHECKED: `mdc-checkbox--checked` = js.native
  var DISABLED: `mdc-checkbox--disabled` = js.native
  var INDETERMINATE: `mdc-checkbox--indeterminate` = js.native
  var UPGRADED: `mdc-checkbox--upgraded` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    ANIM_CHECKED_INDETERMINATE: `mdc-checkbox--anim-checked-indeterminate`,
    ANIM_CHECKED_UNCHECKED: `mdc-checkbox--anim-checked-unchecked`,
    ANIM_INDETERMINATE_CHECKED: `mdc-checkbox--anim-indeterminate-checked`,
    ANIM_INDETERMINATE_UNCHECKED: `mdc-checkbox--anim-indeterminate-unchecked`,
    ANIM_UNCHECKED_CHECKED: `mdc-checkbox--anim-unchecked-checked`,
    ANIM_UNCHECKED_INDETERMINATE: `mdc-checkbox--anim-unchecked-indeterminate`,
    CHECKED: `mdc-checkbox--checked`,
    DISABLED: `mdc-checkbox--disabled`,
    INDETERMINATE: `mdc-checkbox--indeterminate`,
    UPGRADED: `mdc-checkbox--upgraded`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ANIM_CHECKED_INDETERMINATE = ANIM_CHECKED_INDETERMINATE.asInstanceOf[js.Any], ANIM_CHECKED_UNCHECKED = ANIM_CHECKED_UNCHECKED.asInstanceOf[js.Any], ANIM_INDETERMINATE_CHECKED = ANIM_INDETERMINATE_CHECKED.asInstanceOf[js.Any], ANIM_INDETERMINATE_UNCHECKED = ANIM_INDETERMINATE_UNCHECKED.asInstanceOf[js.Any], ANIM_UNCHECKED_CHECKED = ANIM_UNCHECKED_CHECKED.asInstanceOf[js.Any], ANIM_UNCHECKED_INDETERMINATE = ANIM_UNCHECKED_INDETERMINATE.asInstanceOf[js.Any], CHECKED = CHECKED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INDETERMINATE = INDETERMINATE.asInstanceOf[js.Any], UPGRADED = UPGRADED.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANIM_CHECKED_INDETERMINATE(value: `mdc-checkbox--anim-checked-indeterminate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_CHECKED_INDETERMINATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIM_CHECKED_UNCHECKED(value: `mdc-checkbox--anim-checked-unchecked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_CHECKED_UNCHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIM_INDETERMINATE_CHECKED(value: `mdc-checkbox--anim-indeterminate-checked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_INDETERMINATE_CHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIM_INDETERMINATE_UNCHECKED(value: `mdc-checkbox--anim-indeterminate-unchecked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_INDETERMINATE_UNCHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIM_UNCHECKED_CHECKED(value: `mdc-checkbox--anim-unchecked-checked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_UNCHECKED_CHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANIM_UNCHECKED_INDETERMINATE(value: `mdc-checkbox--anim-unchecked-indeterminate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANIM_UNCHECKED_INDETERMINATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCHECKED(value: `mdc-checkbox--checked`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: `mdc-checkbox--disabled`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINDETERMINATE(value: `mdc-checkbox--indeterminate`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INDETERMINATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPGRADED(value: `mdc-checkbox--upgraded`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

