package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Party to be paid any benefits payable
  */
@js.native
trait ExplanationOfBenefitPayee extends BackboneElement {
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.native
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ExplanationOfBenefitPayee {
  @scala.inline
  def apply(): ExplanationOfBenefitPayee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayee]
  }
  @scala.inline
  implicit class ExplanationOfBenefitPayeeOps[Self <: ExplanationOfBenefitPayee] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParty(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("party")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("party")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

