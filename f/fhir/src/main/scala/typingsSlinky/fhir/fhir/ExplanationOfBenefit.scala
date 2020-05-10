package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explanation of Benefit resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ExplanationOfBenefit extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'precedence'.
    */
  var _precedence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Details of an accident
    */
  var accident: js.UndefOr[ExplanationOfBenefitAccident] = js.native
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ExplanationOfBenefitAddItem]] = js.native
  /**
    * Balance by Benefit Category
    */
  var benefitBalance: js.UndefOr[js.Array[ExplanationOfBenefitBenefitBalance]] = js.native
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.native
  /**
    * Care Team members
    */
  var careTeam: js.UndefOr[js.Array[ExplanationOfBenefitCareTeam]] = js.native
  /**
    * Claim reference
    */
  var claim: js.UndefOr[Reference] = js.native
  /**
    * Claim response reference
    */
  var claimResponse: js.UndefOr[Reference] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ExplanationOfBenefitDiagnosis]] = js.native
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  /**
    * Period unable to work
    */
  var employmentImpacted: js.UndefOr[Period] = js.native
  /**
    * Author
    */
  var enterer: js.UndefOr[Reference] = js.native
  /**
    * Servicing Facility
    */
  var facility: js.UndefOr[Reference] = js.native
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.native
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ExplanationOfBenefitInformation]] = js.native
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[ExplanationOfBenefitInsurance] = js.native
  /**
    * Insurer responsible for the EOB
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ExplanationOfBenefitItem]] = js.native
  /**
    * Responsible organization for the claim
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.native
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ExplanationOfBenefitPayee] = js.native
  /**
    * Payment (if paid)
    */
  var payment: js.UndefOr[ExplanationOfBenefitPayment] = js.native
  /**
    * Precedence (primary, secondary, etc.)
    */
  var precedence: js.UndefOr[positiveInt] = js.native
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.native
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ExplanationOfBenefitProcedure]] = js.native
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ExplanationOfBenefitProcessNote]] = js.native
  /**
    * Responsible provider for the claim
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.native
  /**
    * Related Claims which may be revelant to processing this claim
    */
  var related: js.UndefOr[js.Array[ExplanationOfBenefitRelated]] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.native
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.native
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * Unallocated deductable
    */
  var unallocDeductable: js.UndefOr[Money] = js.native
}

object ExplanationOfBenefit {
  @scala.inline
  def apply(): ExplanationOfBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefit]
  }
  @scala.inline
  implicit class ExplanationOfBenefitOps[Self <: ExplanationOfBenefit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def with_disposition(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_disposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_disposition")(js.undefined)
        ret
    }
    @scala.inline
    def with_precedence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_precedence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_precedence")(js.undefined)
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
    def withAccident(value: ExplanationOfBenefitAccident): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccident: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accident")(js.undefined)
        ret
    }
    @scala.inline
    def withAddItem(value: js.Array[ExplanationOfBenefitAddItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItem")(js.undefined)
        ret
    }
    @scala.inline
    def withBenefitBalance(value: js.Array[ExplanationOfBenefitBenefitBalance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitBalance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenefitBalance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefitBalance")(js.undefined)
        ret
    }
    @scala.inline
    def withBillablePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billablePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillablePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billablePeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCareTeam(value: js.Array[ExplanationOfBenefitCareTeam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careTeam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCareTeam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("careTeam")(js.undefined)
        ret
    }
    @scala.inline
    def withClaim(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimResponse(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimResponse")(js.undefined)
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
    def withDiagnosis(value: js.Array[ExplanationOfBenefitDiagnosis]): Self = {
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
    def withDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposition")(js.undefined)
        ret
    }
    @scala.inline
    def withEmploymentImpacted(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employmentImpacted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmploymentImpacted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("employmentImpacted")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterer")(js.undefined)
        ret
    }
    @scala.inline
    def withFacility(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facility")(js.undefined)
        ret
    }
    @scala.inline
    def withForm(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form")(js.undefined)
        ret
    }
    @scala.inline
    def withHospitalization(value: Period): Self = {
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
    def withInformation(value: js.Array[ExplanationOfBenefitInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("information")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("information")(js.undefined)
        ret
    }
    @scala.inline
    def withInsurance(value: ExplanationOfBenefitInsurance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsurance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurance")(js.undefined)
        ret
    }
    @scala.inline
    def withInsurer(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsurer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insurer")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: js.Array[ExplanationOfBenefitItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
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
    def withOriginalPrescription(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPrescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalPrescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalPrescription")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcome(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
        ret
    }
    @scala.inline
    def withPatient(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patient")(js.undefined)
        ret
    }
    @scala.inline
    def withPayee(value: ExplanationOfBenefitPayee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment(value: ExplanationOfBenefitPayment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payment")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecedence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecedence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precedence")(js.undefined)
        ret
    }
    @scala.inline
    def withPrescription(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prescription")(js.undefined)
        ret
    }
    @scala.inline
    def withProcedure(value: js.Array[ExplanationOfBenefitProcedure]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcedure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessNote(value: js.Array[ExplanationOfBenefitProcessNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processNote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processNote")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withReferral(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referral")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: js.Array[ExplanationOfBenefitRelated]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
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
    def withTotalBenefit(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBenefit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBenefit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalBenefit")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCost(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCost")(js.undefined)
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
    def withUnallocDeductable(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unallocDeductable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnallocDeductable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unallocDeductable")(js.undefined)
        ret
    }
  }
  
}

