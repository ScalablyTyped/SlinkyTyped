package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceBiddersAccountsCreativesDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The ID of the creative to delete.
    */
  var creativeId: js.UndefOr[String] = js.native
  
  /**
    * Name of the owner (bidder or account) of the creative to be deleted. For
    * example:  - For an account-level creative for the buyer account
    * representing bidder   123: `bidders/123/accounts/123`  - For an
    * account-level creative for the child seat buyer account 456   whose
    * bidder is 123: `bidders/123/accounts/456`
    */
  var ownerName: js.UndefOr[String] = js.native
}
object ParamsResourceBiddersAccountsCreativesDelete {
  
  @scala.inline
  def apply(): ParamsResourceBiddersAccountsCreativesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersAccountsCreativesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceBiddersAccountsCreativesDeleteOps[Self <: ParamsResourceBiddersAccountsCreativesDelete] (val x: Self) extends AnyVal {
    
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
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerName: Self = this.set("ownerName", js.undefined)
  }
}
