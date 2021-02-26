package typingsSlinky.coinbase.mod

import typingsSlinky.coinbase.coinbaseStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMoneyOpts extends StObject {
  
  /**
    * Amount to be transferred
    */
  var amount: String = js.native
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * An email of the recipient
    */
  var to: String = js.native
  
  /**
    * Type request is required when sending money
    */
  var `type`: request = js.native
}
object RequestMoneyOpts {
  
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: request): RequestMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMoneyOpts]
  }
  
  @scala.inline
  implicit class RequestMoneyOptsMutableBuilder[Self <: RequestMoneyOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
