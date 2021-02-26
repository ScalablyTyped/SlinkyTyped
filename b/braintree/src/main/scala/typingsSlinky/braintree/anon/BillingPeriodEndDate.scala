package typingsSlinky.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPeriodEndDate extends StObject {
  
  var billingPeriodEndDate: js.Date = js.native
  
  var billingPeriodStartDate: js.Date = js.native
}
object BillingPeriodEndDate {
  
  @scala.inline
  def apply(billingPeriodEndDate: js.Date, billingPeriodStartDate: js.Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
  
  @scala.inline
  implicit class BillingPeriodEndDateMutableBuilder[Self <: BillingPeriodEndDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingPeriodEndDate(value: js.Date): Self = StObject.set(x, "billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPeriodStartDate(value: js.Date): Self = StObject.set(x, "billingPeriodStartDate", value.asInstanceOf[js.Any])
  }
}
