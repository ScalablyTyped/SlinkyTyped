package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnableReinitialize extends js.Object {
  var enableReinitialize: Boolean = js.native
  var isInitialValid: Boolean = js.native
  var validateOnBlur: Boolean = js.native
  var validateOnChange: Boolean = js.native
}

object AnonEnableReinitialize {
  @scala.inline
  def apply(
    enableReinitialize: Boolean,
    isInitialValid: Boolean,
    validateOnBlur: Boolean,
    validateOnChange: Boolean
  ): AnonEnableReinitialize = {
    val __obj = js.Dynamic.literal(enableReinitialize = enableReinitialize.asInstanceOf[js.Any], isInitialValid = isInitialValid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableReinitialize]
  }
  @scala.inline
  implicit class AnonEnableReinitializeOps[Self <: AnonEnableReinitialize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableReinitialize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableReinitialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInitialValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInitialValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

