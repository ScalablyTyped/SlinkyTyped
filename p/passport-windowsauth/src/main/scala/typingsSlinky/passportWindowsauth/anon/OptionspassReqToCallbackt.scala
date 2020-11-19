package typingsSlinky.passportWindowsauth.anon

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.passportWindowsauth.passportWindowsauthBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined passport-windowsauth.passport-windowsauth.Options & {  passReqToCallback :true} */
@js.native
trait OptionspassReqToCallbackt extends js.Object {
  
  var getUserNameFromHeader: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.native
  
  var integrated: js.UndefOr[Boolean] = js.native
  
  var ldap: js.UndefOr[Base] = js.native
  
  var passReqToCallback: js.UndefOr[Boolean] with `true` = js.native
  
  var passwordField: js.UndefOr[String] = js.native
  
  var usernameField: js.UndefOr[String] = js.native
}
object OptionspassReqToCallbackt {
  
  @scala.inline
  def apply(passReqToCallback: js.UndefOr[Boolean] with `true`): OptionspassReqToCallbackt = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionspassReqToCallbackt]
  }
  
  @scala.inline
  implicit class OptionspassReqToCallbacktOps[Self <: OptionspassReqToCallbackt] (val x: Self) extends AnyVal {
    
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
    def setPassReqToCallback(value: js.UndefOr[Boolean] with `true`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserNameFromHeader(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = this.set("getUserNameFromHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetUserNameFromHeader: Self = this.set("getUserNameFromHeader", js.undefined)
    
    @scala.inline
    def setIntegrated(value: Boolean): Self = this.set("integrated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrated: Self = this.set("integrated", js.undefined)
    
    @scala.inline
    def setLdap(value: Base): Self = this.set("ldap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLdap: Self = this.set("ldap", js.undefined)
    
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordField: Self = this.set("passwordField", js.undefined)
    
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
  }
}
