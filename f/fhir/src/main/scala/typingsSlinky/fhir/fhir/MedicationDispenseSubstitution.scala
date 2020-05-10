package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Whether a substitution was performed on the dispense
  */
@js.native
trait MedicationDispenseSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'wasSubstituted'.
    */
  var _wasSubstituted: js.UndefOr[Element] = js.native
  /**
    * Why was substitution made
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who is responsible for the substitution
    */
  var responsibleParty: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Code signifying whether a different drug was dispensed from what was prescribed
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * Whether a substitution was or was not performed on the dispense
    */
  var wasSubstituted: Boolean = js.native
}

object MedicationDispenseSubstitution {
  @scala.inline
  def apply(wasSubstituted: Boolean): MedicationDispenseSubstitution = {
    val __obj = js.Dynamic.literal(wasSubstituted = wasSubstituted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispenseSubstitution]
  }
  @scala.inline
  implicit class MedicationDispenseSubstitutionOps[Self <: MedicationDispenseSubstitution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWasSubstituted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wasSubstituted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_wasSubstituted(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wasSubstituted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_wasSubstituted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wasSubstituted")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsibleParty(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibleParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsibleParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsibleParty")(js.undefined)
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

