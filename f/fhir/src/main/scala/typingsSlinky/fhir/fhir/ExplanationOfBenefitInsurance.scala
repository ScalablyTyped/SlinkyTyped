package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan
  */
@js.native
trait ExplanationOfBenefitInsurance extends BackboneElement {
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Insurance information
    */
  var coverage: js.UndefOr[Reference] = js.native
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.native
}

object ExplanationOfBenefitInsurance {
  @scala.inline
  def apply(): ExplanationOfBenefitInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitInsurance]
  }
  @scala.inline
  implicit class ExplanationOfBenefitInsuranceOps[Self <: ExplanationOfBenefitInsurance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_preAuthRef(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preAuthRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_preAuthRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_preAuthRef")(js.undefined)
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
    @scala.inline
    def withPreAuthRef(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreAuthRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthRef")(js.undefined)
        ret
    }
  }
  
}

