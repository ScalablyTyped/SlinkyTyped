package typingsSlinky.googleapis.androidpublisherV1Mod.androidpublisherV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePurchasesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The package name of the application for which this subscription was
    * purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * The purchased subscription ID (for example, 'monthly001').
    */
  var subscriptionId: js.UndefOr[String] = js.native
  
  /**
    * The token provided to the user's device when the subscription was
    * purchased.
    */
  var token: js.UndefOr[String] = js.native
}
object ParamsResourcePurchasesGet {
  
  @scala.inline
  def apply(): ParamsResourcePurchasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesGet]
  }
  
  @scala.inline
  implicit class ParamsResourcePurchasesGetOps[Self <: ParamsResourcePurchasesGet] (val x: Self) extends AnyVal {
    
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
