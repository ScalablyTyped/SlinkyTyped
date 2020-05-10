package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insurance or medical plan
  */
@js.native
trait ClaimInsurance extends BackboneElement {
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'focal'.
    */
  var _focal: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.native
  /**
    * Adjudication results
    */
  var claimResponse: js.UndefOr[Reference] = js.native
  /**
    * Insurance information
    */
  var coverage: Reference = js.native
  /**
    * Is the focal Coverage
    */
  var focal: Boolean = js.native
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.native
  /**
    * Service instance identifier
    */
  var sequence: positiveInt = js.native
}

object ClaimInsurance {
  @scala.inline
  def apply(coverage: Reference, focal: Boolean, sequence: positiveInt): ClaimInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], focal = focal.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimInsurance]
  }
  @scala.inline
  implicit class ClaimInsuranceOps[Self <: ClaimInsurance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverage(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_businessArrangement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_businessArrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_businessArrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_businessArrangement")(js.undefined)
        ret
    }
    @scala.inline
    def with_focal(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_focal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_focal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_focal")(js.undefined)
        ret
    }
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
    def with_sequence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_sequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessArrangement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessArrangement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessArrangement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessArrangement")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimResponse(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimResponse")(js.undefined)
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

