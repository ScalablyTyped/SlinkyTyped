package typingsSlinky.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorization extends StObject {
  
  var authorization: String = js.native
  
  var customer: String = js.native
  
  var plan: String = js.native
  
  var start_date: js.UndefOr[js.Date] = js.native
}
object Authorization {
  
  @scala.inline
  def apply(authorization: String, customer: String, plan: String): Authorization = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
  
  @scala.inline
  implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_date(value: js.Date): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_dateUndefined: Self = StObject.set(x, "start_date", js.undefined)
  }
}
