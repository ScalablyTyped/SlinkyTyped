package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEntitlementsUpdate extends StandardParameters {
  
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
object ParamsResourceEntitlementsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceEntitlementsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEntitlementsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceEntitlementsUpdateOps[Self <: ParamsResourceEntitlementsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseId: Self = this.set("enterpriseId", js.undefined)
    
    @scala.inline
    def setEntitlementId(value: String): Self = this.set("entitlementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntitlementId: Self = this.set("entitlementId", js.undefined)
    
    @scala.inline
    def setInstall(value: Boolean): Self = this.set("install", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstall: Self = this.set("install", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEntitlement): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
