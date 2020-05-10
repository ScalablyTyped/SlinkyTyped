package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of participants involved in the encounter
  */
@js.native
trait EncounterParticipant extends BackboneElement {
  /**
    * Persons involved in the encounter other than the patient
    */
  var individual: js.UndefOr[Reference] = js.native
  /**
    * Period of time during the encounter that the participant participated
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Role of participant in encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object EncounterParticipant {
  @scala.inline
  def apply(): EncounterParticipant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterParticipant]
  }
  @scala.inline
  implicit class EncounterParticipantOps[Self <: EncounterParticipant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndividual(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndividual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("individual")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Array[CodeableConcept]): Self = {
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

