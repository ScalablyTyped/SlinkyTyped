package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPolicyPolicy extends StObject {
  
  /**
    * Required. Last day for returning the items. In ISO 8601 format. When specifying the return window like this, set the policy type to "lastReturnDate". Use this for seasonal overrides
    * only.
    */
  var lastReturnDate: js.UndefOr[String] = js.native
  
  /**
    * The number of days items can be returned after delivery, where one day is defined to be 24 hours after the delivery timestamp. When specifying the return window like this, set the
    * policy type to "numberOfDaysAfterDelivery". Acceptable values are 30, 45, 60, 90, 100, 180, 270 and 365 for the default policy. Additional policies further allow 14, 15, 21 and 28
    * days, but note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics. A policy of less than 30 days can only be applied to those
    * items.
    */
  var numberOfDays: js.UndefOr[String] = js.native
  
  /**
    * Policy type. Use "lastReturnDate" for seasonal overrides only. Note that for most items a minimum of 30 days is required for returns. Exceptions may be made for electronics or
    * non-returnable items such as food, perishables, and living things. A policy of less than 30 days can only be applied to those items. Acceptable values are: - "`lastReturnDate`" -
    * "`lifetimeReturns`" - "`noReturns`" - "`numberOfDaysAfterDelivery`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object ReturnPolicyPolicy {
  
  @scala.inline
  def apply(): ReturnPolicyPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyPolicy]
  }
  
  @scala.inline
  implicit class ReturnPolicyPolicyMutableBuilder[Self <: ReturnPolicyPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastReturnDate(value: String): Self = StObject.set(x, "lastReturnDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastReturnDateUndefined: Self = StObject.set(x, "lastReturnDate", js.undefined)
    
    @scala.inline
    def setNumberOfDays(value: String): Self = StObject.set(x, "numberOfDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfDaysUndefined: Self = StObject.set(x, "numberOfDays", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
