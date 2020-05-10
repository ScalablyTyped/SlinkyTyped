package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Appointment extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'minutesDuration'.
    */
  var _minutesDuration: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The style of appointment or patient that has been booked in the slot (not service type)
    */
  var appointmentType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additional comments
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * The date that this appointment was initially created
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Shown on a subject line in a meeting request, or appointment list
    */
  var description: js.UndefOr[String] = js.native
  /**
    * When appointment is to conclude
    */
  var end: js.UndefOr[instant] = js.native
  /**
    * External Ids for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The ReferralRequest provided as information to allocate to the Encounter
    */
  var incomingReferral: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reason the appointment is to takes place (resource)
    */
  var indication: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Can be less than start/end (e.g. estimate)
    */
  var minutesDuration: js.UndefOr[positiveInt] = js.native
  /**
    * Participants involved in appointment
    */
  var participant: js.Array[AppointmentParticipant] = js.native
  /**
    * Used to make informed decisions if needing to re-prioritize
    */
  var priority: js.UndefOr[unsignedInt] = js.native
  /**
    * Reason this appointment is scheduled
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Potential date/time interval(s) requested to allocate the appointment within
    */
  var requestedPeriod: js.UndefOr[js.Array[Period]] = js.native
  /**
    * A broad categorisation of the service that is to be performed during this appointment
    */
  var serviceCategory: js.UndefOr[CodeableConcept] = js.native
  /**
    * The specific service that is to be performed during this appointment
    */
  var serviceType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * The slots that this appointment is filling
    */
  var slot: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The specialty of a practitioner that would be required to perform the service requested in this appointment
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * When appointment is to take place
    */
  var start: js.UndefOr[instant] = js.native
  /**
    * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error
    */
  var status: code = js.native
  /**
    * Additional information to support the appointment
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.native
}

object Appointment {
  @scala.inline
  def apply(participant: js.Array[AppointmentParticipant], status: code): Appointment = {
    val __obj = js.Dynamic.literal(participant = participant.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appointment]
  }
  @scala.inline
  implicit class AppointmentOps[Self <: Appointment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParticipant(value: js.Array[AppointmentParticipant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_comment(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_comment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_comment")(js.undefined)
        ret
    }
    @scala.inline
    def with_created(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_created")(js.undefined)
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_end(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_end: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_end")(js.undefined)
        ret
    }
    @scala.inline
    def with_minutesDuration(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minutesDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_minutesDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_minutesDuration")(js.undefined)
        ret
    }
    @scala.inline
    def with_priority(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_priority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_priority")(js.undefined)
        ret
    }
    @scala.inline
    def with_start(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_start: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_start")(js.undefined)
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
    def withAppointmentType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentType")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
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
    def withIndication(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indication")(js.undefined)
        ret
    }
    @scala.inline
    def withMinutesDuration(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutesDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutesDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: unsignedInt): Self = {
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
    def withRequestedPeriod(value: js.Array[Period]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceType(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSlot(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slot")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialty(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialty")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportingInformation(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportingInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportingInformation")(js.undefined)
        ret
    }
  }
  
}

