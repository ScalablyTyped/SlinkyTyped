package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrgunitsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Immutable ID of the G Suite account
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Full path of the organizational unit or its ID
    */
  var orgUnitPath: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceOrgunitsGet {
  
  @scala.inline
  def apply(): ParamsResourceOrgunitsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrgunitsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceOrgunitsGetOps[Self <: ParamsResourceOrgunitsGet] (val x: Self) extends AnyVal {
    
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setOrgUnitPathVarargs(value: String*): Self = this.set("orgUnitPath", js.Array(value :_*))
    
    @scala.inline
    def setOrgUnitPath(value: js.Array[String]): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
  }
}
