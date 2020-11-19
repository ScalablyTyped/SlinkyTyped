package typingsSlinky.passportOauth2.mod

import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOptionsBase extends js.Object {
  
  var authorizationURL: String = js.native
  
  var callbackURL: js.UndefOr[String] = js.native
  
  var clientID: String = js.native
  
  var clientSecret: String = js.native
  
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var pkce: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[js.Any] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var scopeSeparator: js.UndefOr[String] = js.native
  
  var sessionKey: js.UndefOr[String] = js.native
  
  var skipUserProfile: js.UndefOr[js.Any] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var store: js.UndefOr[StateStore] = js.native
  
  var tokenURL: String = js.native
}
object StrategyOptionsBase {
  
  @scala.inline
  def apply(authorizationURL: String, clientID: String, clientSecret: String, tokenURL: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackURL: Self = this.set("callbackURL", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: OutgoingHttpHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setPkce(value: Boolean): Self = this.set("pkce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkce: Self = this.set("pkce", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setSkipUserProfile(value: js.Any): Self = this.set("skipUserProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUserProfile: Self = this.set("skipUserProfile", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStore(value: StateStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
