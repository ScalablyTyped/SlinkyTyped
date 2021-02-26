package typingsSlinky.paypalRestSdk.mod

import typingsSlinky.paypalRestSdk.anon.Cancelurl
import typingsSlinky.paypalRestSdk.anon.Paymentmethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment_ extends StObject {
  
  val create_time: js.UndefOr[String] = js.native
  
  var experience_profile_id: js.UndefOr[String] = js.native
  
  val failure_reason: js.UndefOr[String] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  var intent: String = js.native
  
  val links: js.UndefOr[js.Array[Link]] = js.native
  
  var note_to_payer: js.UndefOr[String] = js.native
  
  var payer: Paymentmethod = js.native
  
  var redirect_urls: js.UndefOr[Cancelurl] = js.native
  
  val state: js.UndefOr[String] = js.native
  
  var transactions: js.Array[Transaction] = js.native
  
  val update_time: js.UndefOr[String] = js.native
}
object Payment_ {
  
  @scala.inline
  def apply(intent: String, payer: Paymentmethod, transactions: js.Array[Transaction]): Payment_ = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
  
  @scala.inline
  implicit class Payment_MutableBuilder[Self <: Payment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    @scala.inline
    def setExperience_profile_id(value: String): Self = StObject.set(x, "experience_profile_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperience_profile_idUndefined: Self = StObject.set(x, "experience_profile_id", js.undefined)
    
    @scala.inline
    def setFailure_reason(value: String): Self = StObject.set(x, "failure_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_reasonUndefined: Self = StObject.set(x, "failure_reason", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value :_*))
    
    @scala.inline
    def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_to_payerUndefined: Self = StObject.set(x, "note_to_payer", js.undefined)
    
    @scala.inline
    def setPayer(value: Paymentmethod): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_urls(value: Cancelurl): Self = StObject.set(x, "redirect_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_urlsUndefined: Self = StObject.set(x, "redirect_urls", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    
    @scala.inline
    def setUpdate_time(value: String): Self = StObject.set(x, "update_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_timeUndefined: Self = StObject.set(x, "update_time", js.undefined)
  }
}
