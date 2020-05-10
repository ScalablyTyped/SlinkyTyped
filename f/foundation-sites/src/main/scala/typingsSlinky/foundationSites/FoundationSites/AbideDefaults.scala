package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbideDefaults extends js.Object {
  var formErrorClass: String = js.native
  var formErrorSelector: String = js.native
  var inputErrorClass: String = js.native
  var labelErrorClass: String = js.native
  var liveValidate: Boolean = js.native
  var patterns: IAbidePatterns = js.native
  var validateOn: String = js.native
  var validateOnBlur: Boolean = js.native
  var validators: js.Any = js.native
}

object AbideDefaults {
  @scala.inline
  def apply(
    formErrorClass: String,
    formErrorSelector: String,
    inputErrorClass: String,
    labelErrorClass: String,
    liveValidate: Boolean,
    patterns: IAbidePatterns,
    validateOn: String,
    validateOnBlur: Boolean,
    validators: js.Any
  ): AbideDefaults = {
    val __obj = js.Dynamic.literal(formErrorClass = formErrorClass.asInstanceOf[js.Any], formErrorSelector = formErrorSelector.asInstanceOf[js.Any], inputErrorClass = inputErrorClass.asInstanceOf[js.Any], labelErrorClass = labelErrorClass.asInstanceOf[js.Any], liveValidate = liveValidate.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], validateOn = validateOn.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbideDefaults]
  }
  @scala.inline
  implicit class AbideDefaultsOps[Self <: AbideDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormErrorSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiveValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: IAbidePatterns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

