package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Consent extends DomainResource {
  /**
    * Contains extended information for property 'dateTime'.
    */
  var _dateTime: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'policyRule'.
    */
  var _policyRule: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Actions controlled by this consent
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who|what controlled by this consent (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentActor]] = js.native
  /**
    * Classification of the consent statement - for indexing/retrieval
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Who is agreeing to the policy and exceptions
    */
  var consentingParty: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Data controlled by this consent
    */
  var data: js.UndefOr[js.Array[ConsentData]] = js.native
  /**
    * Timeframe for data controlled by this consent
    */
  var dataPeriod: js.UndefOr[Period] = js.native
  /**
    * When this Consent was created or indexed
    */
  var dateTime: js.UndefOr[typingsSlinky.fhir.fhir.dateTime] = js.native
  /**
    * Additional rule -  addition or removal of permissions
    */
  var except: js.UndefOr[js.Array[ConsentExcept]] = js.native
  /**
    * Identifier for this record (external references)
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Custodian of the consent
    */
  var organization: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Who the consent applies to
    */
  var patient: Reference = js.native
  /**
    * Period that this consent applies
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Policies covered by this consent
    */
  var policy: js.UndefOr[js.Array[ConsentPolicy]] = js.native
  /**
    * Policy that this consents to
    */
  var policyRule: js.UndefOr[uri] = js.native
  /**
    * Context of activities for which the agreement is made
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceIdentifier: js.UndefOr[Identifier] = js.native
  /**
    * Source from which this consent is taken
    */
  var sourceReference: js.UndefOr[Reference] = js.native
  /**
    * draft | proposed | active | rejected | inactive | entered-in-error
    */
  var status: code = js.native
}

object Consent {
  @scala.inline
  def apply(patient: Reference, status: code): Consent = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consent]
  }
  @scala.inline
  implicit class ConsentOps[Self <: Consent] (val x: Self) extends AnyVal {
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
    def with_dateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def with_policyRule(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policyRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_policyRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_policyRule")(js.undefined)
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
    def withAction(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withActor(value: js.Array[ConsentActor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actor")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: js.Array[CodeableConcept]): Self = {
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
    def withConsentingParty(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consentingParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsentingParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consentingParty")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[ConsentData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExcept(value: js.Array[ConsentExcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("except")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
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
    def withOrganization(value: js.Array[Reference]): Self = {
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
    def withPolicy(value: js.Array[ConsentPolicy]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyRule(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyRule")(js.undefined)
        ret
    }
    @scala.inline
    def withPurpose(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurpose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purpose")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityLabel(value: js.Array[Coding]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReference")(js.undefined)
        ret
    }
  }
  
}

