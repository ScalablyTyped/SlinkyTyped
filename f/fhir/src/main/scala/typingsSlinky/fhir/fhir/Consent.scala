package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ConsentMutableBuilder[Self <: Consent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value :_*))
    
    @scala.inline
    def setActor(value: js.Array[ConsentActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    @scala.inline
    def setActorVarargs(value: ConsentActor*): Self = StObject.set(x, "actor", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setConsentingParty(value: js.Array[Reference]): Self = StObject.set(x, "consentingParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentingPartyUndefined: Self = StObject.set(x, "consentingParty", js.undefined)
    
    @scala.inline
    def setConsentingPartyVarargs(value: Reference*): Self = StObject.set(x, "consentingParty", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ConsentData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ConsentData*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDateTime(value: dateTime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    @scala.inline
    def setExcept(value: js.Array[ConsentExcept]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    @scala.inline
    def setExceptVarargs(value: ConsentExcept*): Self = StObject.set(x, "except", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setOrganization(value: js.Array[Reference]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    @scala.inline
    def setOrganizationVarargs(value: Reference*): Self = StObject.set(x, "organization", js.Array(value :_*))
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPolicy(value: js.Array[ConsentPolicy]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRule(value: uri): Self = StObject.set(x, "policyRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyRuleUndefined: Self = StObject.set(x, "policyRule", js.undefined)
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setPolicyVarargs(value: ConsentPolicy*): Self = StObject.set(x, "policy", js.Array(value :_*))
    
    @scala.inline
    def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSourceAttachment(value: Attachment): Self = StObject.set(x, "sourceAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAttachmentUndefined: Self = StObject.set(x, "sourceAttachment", js.undefined)
    
    @scala.inline
    def setSourceIdentifier(value: Identifier): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdentifierUndefined: Self = StObject.set(x, "sourceIdentifier", js.undefined)
    
    @scala.inline
    def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateTime(value: Element): Self = StObject.set(x, "_dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateTimeUndefined: Self = StObject.set(x, "_dateTime", js.undefined)
    
    @scala.inline
    def set_policyRule(value: Element): Self = StObject.set(x, "_policyRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_policyRuleUndefined: Self = StObject.set(x, "_policyRule", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
