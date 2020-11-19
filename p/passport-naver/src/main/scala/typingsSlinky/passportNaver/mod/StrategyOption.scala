package typingsSlinky.passportNaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOption extends js.Object {
  
  var authType: js.UndefOr[String] = js.native
  
  var authorizationURL: js.UndefOr[String] = js.native
  
  var callbackURL: String = js.native
  
  var clientID: String = js.native
  
  var clientSecret: String = js.native
  
  var profileURL: js.UndefOr[String] = js.native
  
  var svcType: js.UndefOr[Double] = js.native
  
  var tokenURL: js.UndefOr[String] = js.native
}
object StrategyOption {
  
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
  
  @scala.inline
  implicit class StrategyOptionOps[Self <: StrategyOption] (val x: Self) extends AnyVal {
    
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
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    
    @scala.inline
    def setProfileURL(value: String): Self = this.set("profileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileURL: Self = this.set("profileURL", js.undefined)
    
    @scala.inline
    def setSvcType(value: Double): Self = this.set("svcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvcType: Self = this.set("svcType", js.undefined)
    
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
  }
}
