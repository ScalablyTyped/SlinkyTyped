package typingsSlinky.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accountnumber extends StObject {
  
  var account_number: String = js.native
  
  var business_name: String = js.native
  
  var percentage_charge: Double = js.native
  
  var settlement_bank: String = js.native
}
object Accountnumber {
  
  @scala.inline
  def apply(account_number: String, business_name: String, percentage_charge: Double, settlement_bank: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], percentage_charge = percentage_charge.asInstanceOf[js.Any], settlement_bank = settlement_bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
  
  @scala.inline
  implicit class AccountnumberMutableBuilder[Self <: Accountnumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusiness_name(value: String): Self = StObject.set(x, "business_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentage_charge(value: Double): Self = StObject.set(x, "percentage_charge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlement_bank(value: String): Self = StObject.set(x, "settlement_bank", value.asInstanceOf[js.Any])
  }
}
