package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details by insurance coverage
  */
@js.native
trait EligibilityResponseInsurance extends BackboneElement {
  /**
    * Benefits by Category
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.native
  /**
    * Contract details
    */
  var contract: js.UndefOr[Reference] = js.native
  /**
    * Updated Coverage details
    */
  var coverage: js.UndefOr[Reference] = js.native
}

object EligibilityResponseInsurance {
  @scala.inline
  def apply(): EligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
  @scala.inline
  implicit class EligibilityResponseInsuranceOps[Self <: EligibilityResponseInsurance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenefitBalance(value: js.Array[EligibilityResponseInsuranceBenefitBalance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenefitBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withContract(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contract")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverage(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(js.undefined)
        ret
    }
  }
  
}

