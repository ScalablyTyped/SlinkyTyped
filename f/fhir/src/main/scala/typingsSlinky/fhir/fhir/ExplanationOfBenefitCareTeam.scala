package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Care Team members
  */
@js.native
trait ExplanationOfBenefitCareTeam extends BackboneElement {
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  /**
    * Member of the Care Team
    */
  var provider: Reference = js.native
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.native
  /**
    * Billing practitioner
    */
  var responsible: js.UndefOr[Boolean] = js.native
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.native
  /**
    * Number to covey order of careteam
    */
  var sequence: positiveInt = js.native
}

object ExplanationOfBenefitCareTeam {
  @scala.inline
  def apply(provider: Reference, sequence: positiveInt): ExplanationOfBenefitCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitCareTeam]
  }
  @scala.inline
  implicit class ExplanationOfBenefitCareTeamOps[Self <: ExplanationOfBenefitCareTeam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_responsible(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_responsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_responsible")(js.undefined)
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
    def withQualification(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualification")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsible")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
  }
  
}

