package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceV1beta1Getsettings extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert settings are associated with. Inferred from the
    * caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
}
object ParamsResourceV1beta1Getsettings {
  
  @scala.inline
  def apply(): ParamsResourceV1beta1Getsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1beta1Getsettings]
  }
  
  @scala.inline
  implicit class ParamsResourceV1beta1GetsettingsMutableBuilder[Self <: ParamsResourceV1beta1Getsettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
