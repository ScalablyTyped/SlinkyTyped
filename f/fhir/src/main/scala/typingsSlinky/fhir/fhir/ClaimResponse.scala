package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remittance resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ClaimResponse extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.native
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.native
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  /**
    * Response  number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.native
  /**
    * Insurance issuing organization
    */
  var insurer: js.UndefOr[Reference] = js.native
  /**
    * Line items
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.native
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
  var payeeType: js.UndefOr[CodeableConcept] = js.native
  /**
    * Payment details, if paid
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.native
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.native
  /**
    * Id of resource triggering adjudication
    */
  var request: js.UndefOr[Reference] = js.native
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.native
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.native
  /**
    * Funds reserved status
    */
  var reserved: js.UndefOr[Coding] = js.native
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.native
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.native
  /**
    * Unallocated deductible
    */
  var unallocDeductable: js.UndefOr[Money] = js.native
}

object ClaimResponse {
  @scala.inline
  def apply(): ClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimResponse]
  }
  @scala.inline
  implicit class ClaimResponseOps[Self <: ClaimResponse] (val x: Self) extends AnyVal {
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
    def withAddItem(value: js.Array[ClaimResponseAddItem]): Self = {
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
    def withCommunicationRequest(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communicationRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommunicationRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("communicationRequest")(js.undefined)
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
    def withError(value: js.Array[ClaimResponseError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
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
    def withInsurance(value: js.Array[ClaimResponseInsurance]): Self = {
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
    def withItem(value: js.Array[ClaimResponseItem]): Self = {
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
    def withPayeeType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payeeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayeeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payeeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPayment(value: ClaimResponsePayment): Self = {
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
    def withProcessNote(value: js.Array[ClaimResponseProcessNote]): Self = {
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
    def withRequest(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestProvider(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withReserved(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserved")(js.undefined)
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

