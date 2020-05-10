package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateSecurityProfileBehaviorsResponse extends js.Object {
  /**
    * True if the behaviors were valid.
    */
  var valid: js.UndefOr[Valid] = js.native
  /**
    * The list of any errors found in the behaviors.
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.native
}

object ValidateSecurityProfileBehaviorsResponse {
  @scala.inline
  def apply(): ValidateSecurityProfileBehaviorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSecurityProfileBehaviorsResponse]
  }
  @scala.inline
  implicit class ValidateSecurityProfileBehaviorsResponseOps[Self <: ValidateSecurityProfileBehaviorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValid(value: Valid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationErrors(value: ValidationErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(js.undefined)
        ret
    }
  }
  
}

