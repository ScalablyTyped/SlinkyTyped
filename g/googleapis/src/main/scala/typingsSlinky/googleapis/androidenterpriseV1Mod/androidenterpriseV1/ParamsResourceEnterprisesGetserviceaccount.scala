package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEnterprisesGetserviceaccount extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the enterprise.
    */
  var enterpriseId: js.UndefOr[String] = js.native
  
  /**
    * The type of credential to return with the service account. Required.
    */
  var keyType: js.UndefOr[String] = js.native
}
object ParamsResourceEnterprisesGetserviceaccount {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesGetserviceaccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesGetserviceaccount]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesGetserviceaccountOps[Self <: ParamsResourceEnterprisesGetserviceaccount] (val x: Self) extends AnyVal {
    
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
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
  }
}
