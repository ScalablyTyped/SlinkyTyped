package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManagedconfigurationssettingsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the product for which the managed configurations settings
    * applies to.
    */
  var productId: js.UndefOr[String] = js.native
}
object ParamsResourceManagedconfigurationssettingsList {
  
  @scala.inline
  def apply(): ParamsResourceManagedconfigurationssettingsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagedconfigurationssettingsList]
  }
  
  @scala.inline
  implicit class ParamsResourceManagedconfigurationssettingsListMutableBuilder[Self <: ParamsResourceManagedconfigurationssettingsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
