package typingsSlinky.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  var amount: Amount = js.native
  
  val create_time: js.UndefOr[String] = js.native
  
  val fmf_details: js.UndefOr[FraudManagementFiltersDetails] = js.native
  
  val id: String = js.native
  
  val links: js.UndefOr[js.Array[Link]] = js.native
  
  val parent_payment: js.UndefOr[String] = js.native
  
  val payment_mode: js.UndefOr[String] = js.native
  
  val processor_response: js.UndefOr[js.Any] = js.native
  
  val protection_eligibility: js.UndefOr[String] = js.native
  
  val protection_eligibility_type: js.UndefOr[String] = js.native
  
  val reason_code: js.UndefOr[String] = js.native
  
  val receipt_id: js.UndefOr[String] = js.native
  
  val state: js.UndefOr[String] = js.native
  
  val update_time: js.UndefOr[String] = js.native
}
object Resource {
  
  @scala.inline
  def apply(amount: Amount, id: String): Resource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Amount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    @scala.inline
    def setFmf_details(value: FraudManagementFiltersDetails): Self = StObject.set(x, "fmf_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmf_detailsUndefined: Self = StObject.set(x, "fmf_details", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setParent_payment(value: String): Self = StObject.set(x, "parent_payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_paymentUndefined: Self = StObject.set(x, "parent_payment", js.undefined)
    
    @scala.inline
    def setPayment_mode(value: String): Self = StObject.set(x, "payment_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_modeUndefined: Self = StObject.set(x, "payment_mode", js.undefined)
    
    @scala.inline
    def setProcessor_response(value: js.Any): Self = StObject.set(x, "processor_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessor_responseUndefined: Self = StObject.set(x, "processor_response", js.undefined)
    
    @scala.inline
    def setProtection_eligibility(value: String): Self = StObject.set(x, "protection_eligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection_eligibilityUndefined: Self = StObject.set(x, "protection_eligibility", js.undefined)
    
    @scala.inline
    def setProtection_eligibility_type(value: String): Self = StObject.set(x, "protection_eligibility_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection_eligibility_typeUndefined: Self = StObject.set(x, "protection_eligibility_type", js.undefined)
    
    @scala.inline
    def setReason_code(value: String): Self = StObject.set(x, "reason_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason_codeUndefined: Self = StObject.set(x, "reason_code", js.undefined)
    
    @scala.inline
    def setReceipt_id(value: String): Self = StObject.set(x, "receipt_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_idUndefined: Self = StObject.set(x, "receipt_id", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_timeUndefined: Self = StObject.set(x, "update_time", js.undefined)
  }
}
