package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any restrictions on medication substitution
  */
@js.native
trait MedicationRequestSubstitution extends BackboneElement {
  /**
    * Contains extended information for property 'allowed'.
    */
  var _allowed: js.UndefOr[Element] = js.native
  /**
    * Whether substitution is allowed or not
    */
  var allowed: Boolean = js.native
  /**
    * Why should (not) substitution be made
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
}

object MedicationRequestSubstitution {
  @scala.inline
  def apply(allowed: Boolean): MedicationRequestSubstitution = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationRequestSubstitution]
  }
  @scala.inline
  implicit class MedicationRequestSubstitutionOps[Self <: MedicationRequestSubstitution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_allowed(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_allowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_allowed")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: CodeableConcept): Self = {
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
  }
  
}

