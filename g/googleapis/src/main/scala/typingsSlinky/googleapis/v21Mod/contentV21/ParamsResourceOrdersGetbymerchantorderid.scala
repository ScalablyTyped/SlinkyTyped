package typingsSlinky.googleapis.v21Mod.contentV21

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrdersGetbymerchantorderid extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * The merchant order ID to be looked for.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
}
object ParamsResourceOrdersGetbymerchantorderid {
  
  @scala.inline
  def apply(): ParamsResourceOrdersGetbymerchantorderid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersGetbymerchantorderid]
  }
  
  @scala.inline
  implicit class ParamsResourceOrdersGetbymerchantorderidMutableBuilder[Self <: ParamsResourceOrdersGetbymerchantorderid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
  }
}
