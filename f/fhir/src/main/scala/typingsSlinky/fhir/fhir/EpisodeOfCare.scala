package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait EpisodeOfCare extends DomainResource {
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The set of accounts that may be used for billing for this EpisodeOfCare
    */
  var account: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Care manager/care co-ordinator for the patient
    */
  var careManager: js.UndefOr[Reference] = js.native
  /**
    * The list of diagnosis relevant to this episode of care
    */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.native
  /**
    * Business Identifier(s) relevant for this EpisodeOfCare
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Organization that assumes care
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  /**
    * The patient who is the focus of this episode of care
    */
  var patient: Reference = js.native
  /**
    * Interval during responsibility is assumed
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Originating Referral Request(s)
    */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
    */
  var status: code = js.native
  /**
    * Past list of status codes (the current status may be included to cover the start date of the status)
    */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.native
  /**
    * Other practitioners facilitating this episode of care
    */
  var team: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type/class  - e.g. specialist referral, disease management
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object EpisodeOfCare {
  @scala.inline
  def apply(patient: Reference, status: code): EpisodeOfCare = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EpisodeOfCare]
  }
  @scala.inline
  implicit class EpisodeOfCareOps[Self <: EpisodeOfCare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCareManager(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCareManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careManager")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnosis(value: js.Array[EpisodeOfCareDiagnosis]): Self = {
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
    def withManagingOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(js.undefined)
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
    def withReferralRequest(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferralRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusHistory(value: js.Array[EpisodeOfCareStatusHistory]): Self = {
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
    def withTeam(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team")(js.undefined)
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

