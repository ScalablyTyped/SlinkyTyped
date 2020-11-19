package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PaymentReconciliation resource
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait PaymentReconciliation extends DomainResource {
  
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
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.native
  
  /**
    * List of settlements
    */
  var detail: js.UndefOr[js.Array[PaymentReconciliationDetail]] = js.native
  
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.native
  
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Business Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Insurer
    */
  var organization: js.UndefOr[Reference] = js.native
  
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Period covered
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Processing comments
    */
  var processNote: js.UndefOr[js.Array[PaymentReconciliationProcessNote]] = js.native
  
  /**
    * Claim reference
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
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Total amount of Payment
    */
  var total: js.UndefOr[Money] = js.native
}
object PaymentReconciliation {
  
  @scala.inline
  def apply(): PaymentReconciliation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentReconciliation]
  }
  
  @scala.inline
  implicit class PaymentReconciliationOps[Self <: PaymentReconciliation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_created(value: Element): Self = this.set("_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_created: Self = this.set("_created", js.undefined)
    
    @scala.inline
    def set_disposition(value: Element): Self = this.set("_disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disposition: Self = this.set("_disposition", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCreated(value: dateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: PaymentReconciliationDetail*): Self = this.set("detail", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: js.Array[PaymentReconciliationDetail]): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setDisposition(value: String): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    
    @scala.inline
    def setForm(value: CodeableConcept): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setOutcome(value: CodeableConcept): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setProcessNoteVarargs(value: PaymentReconciliationProcessNote*): Self = this.set("processNote", js.Array(value :_*))
    
    @scala.inline
    def setProcessNote(value: js.Array[PaymentReconciliationProcessNote]): Self = this.set("processNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessNote: Self = this.set("processNote", js.undefined)
    
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRequestOrganization(value: Reference): Self = this.set("requestOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOrganization: Self = this.set("requestOrganization", js.undefined)
    
    @scala.inline
    def setRequestProvider(value: Reference): Self = this.set("requestProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestProvider: Self = this.set("requestProvider", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTotal(value: Money): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
