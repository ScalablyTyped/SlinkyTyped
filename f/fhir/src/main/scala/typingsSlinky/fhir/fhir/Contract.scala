package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Legal Agreement
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Contract extends DomainResource {
  /**
    * Contains extended information for property 'issued'.
    */
  var _issued: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Action stipulated by this Contract
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Rationale for the stiplulated action
    */
  var actionReason: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Entity being ascribed responsibility
    */
  var agent: js.UndefOr[js.Array[ContractAgent]] = js.native
  /**
    * Effective time
    */
  var applies: js.UndefOr[Period] = js.native
  /**
    * Authority under which this Contract has standing
    */
  var authority: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Binding Contract
    */
  var bindingAttachment: js.UndefOr[Attachment] = js.native
  /**
    * Binding Contract
    */
  var bindingReference: js.UndefOr[Reference] = js.native
  /**
    * Content derived from the basal information
    */
  var contentDerivative: js.UndefOr[CodeableConcept] = js.native
  /**
    * Decision by Grantor
    */
  var decisionType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Domain in which this Contract applies
    */
  var domain: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Contract Friendly Language
    */
  var friendly: js.UndefOr[js.Array[ContractFriendly]] = js.native
  /**
    * Contract number
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * When this Contract was issued
    */
  var issued: js.UndefOr[dateTime] = js.native
  /**
    * Contract Legal Language
    */
  var legal: js.UndefOr[js.Array[ContractLegal]] = js.native
  /**
    * Computable Contract Language
    */
  var rule: js.UndefOr[js.Array[ContractRule]] = js.native
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  /**
    * Contract Signatory
    */
  var signer: js.UndefOr[js.Array[ContractSigner]] = js.native
  /**
    * amended | appended | cancelled | disputed | entered-in-error | executable | executed | negotiable | offered | policy | rejected | renewed | revoked | resolved | terminated
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Subtype within the context of type
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Contract Target Entity
    */
  var subject: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Contract Term List
    */
  var term: js.UndefOr[js.Array[ContractTerm]] = js.native
  /**
    * Context of the Contract
    */
  var topic: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Type or form
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * Contract Valued Item List
    */
  var valuedItem: js.UndefOr[js.Array[ContractValuedItem]] = js.native
}

object Contract {
  @scala.inline
  def apply(): Contract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contract]
  }
  @scala.inline
  implicit class ContractOps[Self <: Contract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_issued(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_issued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_issued")(js.undefined)
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
    def withActionReason(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionReason")(js.undefined)
        ret
    }
    @scala.inline
    def withAgent(value: js.Array[ContractAgent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agent")(js.undefined)
        ret
    }
    @scala.inline
    def withApplies(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applies")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthority(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingAttachment(value: Attachment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingAttachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingAttachment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingAttachment")(js.undefined)
        ret
    }
    @scala.inline
    def withBindingReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindingReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingReference")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDerivative(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDerivative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentDerivative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDerivative")(js.undefined)
        ret
    }
    @scala.inline
    def withDecisionType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecisionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decisionType")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendly(value: js.Array[ContractFriendly]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly")(js.undefined)
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
    def withIssued(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issued")(js.undefined)
        ret
    }
    @scala.inline
    def withLegal(value: js.Array[ContractLegal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legal")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: js.Array[ContractRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rule")(js.undefined)
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
    def withSigner(value: js.Array[ContractSigner]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubType(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: js.Array[Reference]): Self = {
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
    def withTerm(value: js.Array[ContractTerm]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("term")(js.undefined)
        ret
    }
    @scala.inline
    def withTopic(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
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
    @scala.inline
    def withValuedItem(value: js.Array[ContractValuedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuedItem")(js.undefined)
        ret
    }
  }
  
}

