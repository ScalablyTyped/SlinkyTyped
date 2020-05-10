package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of a healthcare service available at a location
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait HealthcareService extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'appointmentRequired'.
    */
  var _appointmentRequired: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'eligibilityNote'.
    */
  var _eligibilityNote: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'extraDetails'.
    */
  var _extraDetails: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'programName'.
    */
  var _programName: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Whether this healthcareservice is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * If an appointment is required for access to this service
    */
  var appointmentRequired: js.UndefOr[Boolean] = js.native
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[HealthcareServiceAvailableTime]] = js.native
  /**
    * Broad category of service being performed or delivered
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  /**
    * Collection of characteristics (attributes)
    */
  var characteristic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Additional description and/or any specific issues not covered elsewhere
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Location(s) service is inteded for/available to
    */
  var coverageArea: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Specific eligibility requirements required to use the service
    */
  var eligibility: js.UndefOr[CodeableConcept] = js.native
  /**
    * Describes the eligibility conditions for the service
    */
  var eligibilityNote: js.UndefOr[String] = js.native
  /**
    * Technical endpoints providing access to services operated for the location
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Extra details about the service that can't be placed in the other fields
    */
  var extraDetails: js.UndefOr[String] = js.native
  /**
    * External identifiers for this item
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Location(s) where service may be provided
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Description of service as presented to a consumer while searching
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[HealthcareServiceNotAvailable]] = js.native
  /**
    * Facilitates quick identification of the service
    */
  var photo: js.UndefOr[Attachment] = js.native
  /**
    * Program Names that categorize the service
    */
  var programName: js.UndefOr[js.Array[String]] = js.native
  /**
    * Organization that provides this service
    */
  var providedBy: js.UndefOr[Reference] = js.native
  /**
    * Ways that the service accepts referrals
    */
  var referralMethod: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Conditions under which service is available/offered
    */
  var serviceProvisionCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Specialties handled by the HealthcareService
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contacts related to the healthcare service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
  /**
    * Type of service that may be delivered or performed
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object HealthcareService {
  @scala.inline
  def apply(): HealthcareService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthcareService]
  }
  @scala.inline
  implicit class HealthcareServiceOps[Self <: HealthcareService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_active(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_active: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_active")(js.undefined)
        ret
    }
    @scala.inline
    def with_appointmentRequired(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_appointmentRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_appointmentRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_appointmentRequired")(js.undefined)
        ret
    }
    @scala.inline
    def with_availabilityExceptions(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availabilityExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_availabilityExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_availabilityExceptions")(js.undefined)
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
    def with_eligibilityNote(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eligibilityNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_eligibilityNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_eligibilityNote")(js.undefined)
        ret
    }
    @scala.inline
    def with_extraDetails(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_extraDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_extraDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_extraDetails")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_programName(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_programName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_programName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_programName")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAppointmentRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppointmentRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appointmentRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityExceptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailableTime(value: js.Array[HealthcareServiceAvailableTime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availableTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacteristic(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacteristic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characteristic")(js.undefined)
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
    def withCoverageArea(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverageArea")(js.undefined)
        ret
    }
    @scala.inline
    def withEligibility(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibility")(js.undefined)
        ret
    }
    @scala.inline
    def withEligibilityNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibilityNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEligibilityNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eligibilityNote")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDetails")(js.undefined)
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
    def withLocation(value: js.Array[Reference]): Self = {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotAvailable(value: js.Array[HealthcareServiceNotAvailable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo")(js.undefined)
        ret
    }
    @scala.inline
    def withProgramName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgramName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("programName")(js.undefined)
        ret
    }
    @scala.inline
    def withProvidedBy(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvidedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withReferralMethod(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferralMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceProvisionCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProvisionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProvisionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceProvisionCode")(js.undefined)
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
    def withTelecom(value: js.Array[ContactPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelecom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(js.undefined)
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

