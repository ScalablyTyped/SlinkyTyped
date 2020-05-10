package typingsSlinky.materialTextfield.helperTextConstantsMod

import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field-helper-text--persistent`
import typingsSlinky.materialTextfield.materialTextfieldStrings.`mdc-text-field-helper-text--validation-msg`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssClasses extends MDCStrings {
  var HELPER_TEXT_PERSISTENT: `mdc-text-field-helper-text--persistent` = js.native
  var HELPER_TEXT_VALIDATION_MSG: `mdc-text-field-helper-text--validation-msg` = js.native
}

object cssClasses {
  @scala.inline
  def apply(
    HELPER_TEXT_PERSISTENT: `mdc-text-field-helper-text--persistent`,
    HELPER_TEXT_VALIDATION_MSG: `mdc-text-field-helper-text--validation-msg`
  ): cssClasses = {
    val __obj = js.Dynamic.literal(HELPER_TEXT_PERSISTENT = HELPER_TEXT_PERSISTENT.asInstanceOf[js.Any], HELPER_TEXT_VALIDATION_MSG = HELPER_TEXT_VALIDATION_MSG.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssClasses]
  }
  @scala.inline
  implicit class cssClassesOps[Self <: cssClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHELPER_TEXT_PERSISTENT(value: `mdc-text-field-helper-text--persistent`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_PERSISTENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHELPER_TEXT_VALIDATION_MSG(value: `mdc-text-field-helper-text--validation-msg`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

