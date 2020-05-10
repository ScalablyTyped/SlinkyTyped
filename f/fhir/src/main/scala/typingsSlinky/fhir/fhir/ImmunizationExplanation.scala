package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Administration/non-administration reasons
  */
@js.native
trait ImmunizationExplanation extends BackboneElement {
  /**
    * Why immunization occurred
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Why immunization did not occur
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object ImmunizationExplanation {
  @scala.inline
  def apply(): ImmunizationExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationExplanation]
  }
  @scala.inline
  implicit class ImmunizationExplanationOps[Self <: ImmunizationExplanation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withReasonNotGiven(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotGiven")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonNotGiven: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonNotGiven")(js.undefined)
        ret
    }
  }
  
}

