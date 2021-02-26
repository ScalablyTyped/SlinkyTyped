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
trait ParamsResourceEntitlementsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the entitlement (a product ID), e.g.
    * "app:com.google.android.gm".
    */
  var entitlementId: js.UndefOr[String] = js.native
  
  /**
    * Set to true to also install the product on all the user's devices where
    * possible. Failure to install on one or more devices will not prevent this
    * operation from returning successfully, as long as the entitlement was
    * successfully assigned to the user.
    */
  var install: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntitlement] = js.native
  
  /**
    * The ID of the user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceEntitlementsPatch {
  
  @scala.inline
  def apply(): ParamsResourceEntitlementsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntitlementsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceEntitlementsPatchMutableBuilder[Self <: ParamsResourceEntitlementsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseIdUndefined: Self = StObject.set(x, "enterpriseId", js.undefined)
    
    @scala.inline
    def setEntitlementId(value: String): Self = StObject.set(x, "entitlementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementIdUndefined: Self = StObject.set(x, "entitlementId", js.undefined)
    
    @scala.inline
    def setInstall(value: Boolean): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEntitlement): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
