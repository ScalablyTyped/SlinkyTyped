package typingsSlinky.atlassianCrowdClient.validationFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationFactorsObj extends js.Object {
  var validationFactors: js.Array[_] = js.native
}

object ValidationFactorsObj {
  @scala.inline
  def apply(validationFactors: js.Array[_]): ValidationFactorsObj = {
    val __obj = js.Dynamic.literal(validationFactors = validationFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationFactorsObj]
  }
  @scala.inline
  implicit class ValidationFactorsObjOps[Self <: ValidationFactorsObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidationFactors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFactors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

