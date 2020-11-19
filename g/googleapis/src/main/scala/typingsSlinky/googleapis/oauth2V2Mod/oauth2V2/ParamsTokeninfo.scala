package typingsSlinky.googleapis.oauth2V2Mod.oauth2V2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsTokeninfo extends StandardParameters {
  
  /**
    *
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    *
    */
  var id_token: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var token_handle: js.UndefOr[String] = js.native
}
object ParamsTokeninfo {
  
  @scala.inline
  def apply(): ParamsTokeninfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsTokeninfo]
  }
  
  @scala.inline
  implicit class ParamsTokeninfoOps[Self <: ParamsTokeninfo] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    
    @scala.inline
    def setToken_handle(value: String): Self = this.set("token_handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_handle: Self = this.set("token_handle", js.undefined)
  }
}
