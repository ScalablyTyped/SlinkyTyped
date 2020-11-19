package typingsSlinky.auth0Js.mod

import typingsSlinky.auth0Js.auth0JsStrings.login
import typingsSlinky.auth0Js.auth0JsStrings.signUp
import typingsSlinky.auth0Js.auth0JsStrings.signup_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeOptions extends js.Object {
  
  var accessType: js.UndefOr[String] = js.native
  
  var appState: js.UndefOr[js.Any] = js.native
  
  var approvalPrompt: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var clientID: js.UndefOr[String] = js.native
  
  var connection: js.UndefOr[String] = js.native
  
  var connection_scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var login_hint: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[login | signUp] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var responseMode: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var screen_hint: js.UndefOr[signup_] = js.native
  
  var state: js.UndefOr[String] = js.native
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsOps[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessType(value: String): Self = this.set("accessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessType: Self = this.set("accessType", js.undefined)
    
    @scala.inline
    def setAppState(value: js.Any): Self = this.set("appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppState: Self = this.set("appState", js.undefined)
    
    @scala.inline
    def setApprovalPrompt(value: String): Self = this.set("approvalPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalPrompt: Self = this.set("approvalPrompt", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setConnection_scopeVarargs(value: String*): Self = this.set("connection_scope", js.Array(value :_*))
    
    @scala.inline
    def setConnection_scope(value: String | js.Array[String]): Self = this.set("connection_scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_scope: Self = this.set("connection_scope", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLogin_hint(value: String): Self = this.set("login_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin_hint: Self = this.set("login_hint", js.undefined)
    
    @scala.inline
    def setMode(value: login | signUp): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScreen_hint(value: signup_): Self = this.set("screen_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen_hint: Self = this.set("screen_hint", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
