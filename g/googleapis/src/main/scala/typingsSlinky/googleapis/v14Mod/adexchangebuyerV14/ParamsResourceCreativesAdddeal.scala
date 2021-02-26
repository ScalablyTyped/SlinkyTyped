package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCreativesAdddeal extends StandardParameters {
  
  /**
    * The id for the account that will serve this creative.
    */
  var accountId: js.UndefOr[Double] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The buyer-specific id for this creative.
    */
  var buyerCreativeId: js.UndefOr[String] = js.native
  
  /**
    * The id of the deal id to associate with this creative.
    */
  var dealId: js.UndefOr[String] = js.native
}
object ParamsResourceCreativesAdddeal {
  
  @scala.inline
  def apply(): ParamsResourceCreativesAdddeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesAdddeal]
  }
  
  @scala.inline
  implicit class ParamsResourceCreativesAdddealMutableBuilder[Self <: ParamsResourceCreativesAdddeal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    @scala.inline
    def setDealId(value: String): Self = StObject.set(x, "dealId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealIdUndefined: Self = StObject.set(x, "dealId", js.undefined)
  }
}
