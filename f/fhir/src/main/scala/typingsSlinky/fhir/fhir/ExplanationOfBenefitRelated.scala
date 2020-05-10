package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related Claims which may be revelant to processing this claim
  */
@js.native
trait ExplanationOfBenefitRelated extends BackboneElement {
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.native
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.native
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
}

object ExplanationOfBenefitRelated {
  @scala.inline
  def apply(): ExplanationOfBenefitRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitRelated]
  }
  @scala.inline
  implicit class ExplanationOfBenefitRelatedOps[Self <: ExplanationOfBenefitRelated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.undefined)
        ret
    }
    @scala.inline
    def withReference(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
  }
  
}

