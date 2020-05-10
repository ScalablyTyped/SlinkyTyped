package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Claim, Pre-determination or Pre-authorization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Claim extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Details about an accident
    */
  var accident: js.UndefOr[ClaimAccident] = js.native
  /**
    * Period for charge submission
    */
  var billablePeriod: js.UndefOr[Period] = js.native
  /**
    * Members of the care team
    */
  var careTeam: js.UndefOr[js.Array[ClaimCareTeam]] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * List of Diagnosis
    */
  var diagnosis: js.UndefOr[js.Array[ClaimDiagnosis]] = js.native
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
    * Funds requested to be reserved
    */
  var fundsReserve: js.UndefOr[CodeableConcept] = js.native
  /**
    * Period in hospital
    */
  var hospitalization: js.UndefOr[Period] = js.native
  /**
    * Claim number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Exceptions, special considerations, the condition, situation, prior or concurrent issues
    */
  var information: js.UndefOr[js.Array[ClaimInformation]] = js.native
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimInsurance]] = js.native
  /**
    * Target
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Goods and Services
    */
  var item: js.UndefOr[js.Array[ClaimItem]] = js.native
  /**
    * Responsible organization
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * Original prescription if superceded by fulfiller
    */
  var originalPrescription: js.UndefOr[Reference] = js.native
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.native
  /**
    * Party to be paid any benefits payable
    */
  var payee: js.UndefOr[ClaimPayee] = js.native
  /**
    * Prescription authorizing services or products
    */
  var prescription: js.UndefOr[Reference] = js.native
  /**
    * Desired processing priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.native
  /**
    * Procedures performed
    */
  var procedure: js.UndefOr[js.Array[ClaimProcedure]] = js.native
  /**
    * Responsible provider
    */
  var provider: js.UndefOr[Reference] = js.native
  /**
    * Treatment Referral
    */
  var referral: js.UndefOr[Reference] = js.native
  /**
    * Related Claims which may be revelant to processing this claimn
    */
  var related: js.UndefOr[js.Array[ClaimRelated]] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Finer grained claim type information
    */
  var subType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Total claim cost
    */
  var total: js.UndefOr[Money] = js.native
  /**
    * Type or discipline
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  /**
    * complete | proposed | exploratory | other
    */
  var use: js.UndefOr[code] = js.native
}

object Claim {
  @scala.inline
  def apply(): Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Claim]
  }
  @scala.inline
  implicit class ClaimOps[Self <: Claim] (val x: Self) extends AnyVal {
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
    def with_use(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_use: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(js.undefined)
        ret
    }
    @scala.inline
    def withAccident(value: ClaimAccident): Self = {
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
    def withCareTeam(value: js.Array[ClaimCareTeam]): Self = {
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
    def withDiagnosis(value: js.Array[ClaimDiagnosis]): Self = {
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
    def withFundsReserve(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fundsReserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFundsReserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fundsReserve")(js.undefined)
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
    def withInformation(value: js.Array[ClaimInformation]): Self = {
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
    def withInsurance(value: js.Array[ClaimInsurance]): Self = {
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
    def withItem(value: js.Array[ClaimItem]): Self = {
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
    def withPayee(value: ClaimPayee): Self = {
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
    def withProcedure(value: js.Array[ClaimProcedure]): Self = {
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
    def withRelated(value: js.Array[ClaimRelated]): Self = {
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
    def withTotal(value: Money): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
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
    def withUse(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
  }
  
}

