package typingsSlinky.googleapis.v41Mod.adsensehostV41

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Ad clients to list accounts for.
    */
  var filterAdClientId: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceAccountsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsListOps[Self <: ParamsResourceAccountsList] (val x: Self) extends AnyVal {
    
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
    def setFilterAdClientIdVarargs(value: String*): Self = this.set("filterAdClientId", js.Array(value :_*))
    
    @scala.inline
    def setFilterAdClientId(value: js.Array[String]): Self = this.set("filterAdClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterAdClientId: Self = this.set("filterAdClientId", js.undefined)
  }
}
