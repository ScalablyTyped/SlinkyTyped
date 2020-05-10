package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Roles/organizations the practitioner is associated with
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait PractitionerRole extends DomainResource {
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'availabilityExceptions'.
    */
  var _availabilityExceptions: js.UndefOr[Element] = js.native
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Description of availability exceptions
    */
  var availabilityExceptions: js.UndefOr[String] = js.native
  /**
    * Times the Service Site is available
    */
  var availableTime: js.UndefOr[js.Array[PractitionerRoleAvailableTime]] = js.native
  /**
    * Roles which this practitioner may perform
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Technical endpoints providing access to services operated for the practitioner with this role
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The list of healthcare services that this worker provides for this role's Organization/Location(s)
    */
  var healthcareService: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Business Identifiers that are specific to a role/location
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * The location(s) at which this practitioner provides care
    */
  var location: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Not available during this time due to provided reason
    */
  var notAvailable: js.UndefOr[js.Array[PractitionerRoleNotAvailable]] = js.native
  /**
    * Organization where the roles are available
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The period during which the practitioner is authorized to perform in these role(s)
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Practitioner that is able to provide the defined services for the organation
    */
  var practitioner: js.UndefOr[Reference] = js.native
  /**
    * Specific specialty of the practitioner
    */
  var specialty: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contact details that are specific to the role/location/service
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object PractitionerRole {
  @scala.inline
  def apply(): PractitionerRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PractitionerRole]
  }
  @scala.inline
  implicit class PractitionerRoleOps[Self <: PractitionerRole] (val x: Self) extends AnyVal {
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
    def withAvailableTime(value: js.Array[PractitionerRoleAvailableTime]): Self = {
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
    def withCode(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
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
    def withHealthcareService(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcareService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthcareService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthcareService")(js.undefined)
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
    def withNotAvailable(value: js.Array[PractitionerRoleNotAvailable]): Self = {
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
    def withOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
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
    def withPractitioner(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practitioner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPractitioner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("practitioner")(js.undefined)
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
  }
  
}

