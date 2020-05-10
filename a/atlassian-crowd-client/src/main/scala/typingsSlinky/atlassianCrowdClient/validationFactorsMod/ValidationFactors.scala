package typingsSlinky.atlassianCrowdClient.validationFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationFactors extends js.Object {
  val validationFactors: js.Any = js.native
  def toCrowd(): ValidationFactorsObj = js.native
}

object ValidationFactors {
  @scala.inline
  def apply(toCrowd: () => ValidationFactorsObj, validationFactors: js.Any): ValidationFactors = {
    val __obj = js.Dynamic.literal(toCrowd = js.Any.fromFunction0(toCrowd), validationFactors = validationFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationFactors]
  }
  @scala.inline
  implicit class ValidationFactorsOps[Self <: ValidationFactors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToCrowd(value: () => ValidationFactorsObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toCrowd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidationFactors(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationFactors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

