package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsClientsInvitationsGet extends StandardParameters {
  
  /**
    * Numerical account ID of the client's sponsor buyer. (required)
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Numerical account ID of the client buyer that the user invitation to be
    * retrieved is associated with. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.native
  
  /**
    * Numerical identifier of the user invitation to retrieve. (required)
    */
  var invitationId: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsClientsInvitationsGet {
  
  @scala.inline
  def apply(): ParamsResourceAccountsClientsInvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsInvitationsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsClientsInvitationsGetOps[Self <: ParamsResourceAccountsClientsInvitationsGet] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setClientAccountId(value: String): Self = this.set("clientAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAccountId: Self = this.set("clientAccountId", js.undefined)
    
    @scala.inline
    def setInvitationId(value: String): Self = this.set("invitationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvitationId: Self = this.set("invitationId", js.undefined)
  }
}
