package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction during which services are provided to the patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Encounter extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The set of accounts that may be used for billing for this Encounter
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The appointment that scheduled this encounter
    */
  var appointment: js.UndefOr[Reference] = js.native
  /**
    * inpatient | outpatient | ambulatory | emergency +
    */
  var `class`: js.UndefOr[Coding] = js.native
  /**
    * List of past encounter classes
    */
  var classHistory: js.UndefOr[js.Array[EncounterClassHistory]] = js.native
  /**
    * The list of diagnosis relevant to this encounter
    */
  var diagnosis: js.UndefOr[js.Array[EncounterDiagnosis]] = js.native
  /**
    * Episode(s) of care that this encounter should be recorded against
    */
  var episodeOfCare: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Details about the admission to a healthcare service
    */
  var hospitalization: js.UndefOr[EncounterHospitalization] = js.native
  /**
    * Identifier(s) by which this encounter is known
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The ReferralRequest that initiated this encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Quantity of time the encounter lasted (less time absent)
    */
  var length: js.UndefOr[Duration] = js.native
  /**
    * List of locations where the patient has been
    */
  var location: js.UndefOr[js.Array[EncounterLocation]] = js.native
  /**
    * Another Encounter this encounter is part of
    */
  var partOf: js.UndefOr[Reference] = js.native
  /**
    * List of participants involved in the encounter
    */
  var participant: js.UndefOr[js.Array[EncounterParticipant]] = js.native
  /**
    * The start and end time of the encounter
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Indicates the urgency of the encounter
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * Reason the encounter takes place (code)
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The custodian organization of this Encounter record
    */
  var serviceProvider: js.UndefOr[Reference] = js.native
  /**
    * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
    */
  var status: code = js.native
  /**
    * List of past encounter statuses
    */
  var statusHistory: js.UndefOr[js.Array[EncounterStatusHistory]] = js.native
  /**
    * The patient ro group present at the encounter
    */
  var subject: js.UndefOr[Reference] = js.native
  /**
    * Specific type of encounter
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object Encounter {
  @scala.inline
  def apply(status: code): Encounter = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encounter]
  }
  @scala.inline
  implicit class EncounterOps[Self <: Encounter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withAccount(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointment(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointment")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassHistory(value: js.Array[EncounterClassHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosis(value: js.Array[EncounterDiagnosis]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnosis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnosis")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodeOfCare(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeOfCare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodeOfCare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeOfCare")(js.undefined)
        ret
    }
    @scala.inline
    def withHospitalization(value: EncounterHospitalization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hospitalization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHospitalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hospitalization")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIncomingReferral(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingReferral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncomingReferral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingReferral")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Duration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: js.Array[EncounterLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withPartOf(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartOf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partOf")(js.undefined)
        ret
    }
    @scala.inline
    def withParticipant(value: js.Array[EncounterParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParticipant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(js.undefined)
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
    def withPriority(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
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
    def withServiceProvider(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusHistory(value: js.Array[EncounterStatusHistory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
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

