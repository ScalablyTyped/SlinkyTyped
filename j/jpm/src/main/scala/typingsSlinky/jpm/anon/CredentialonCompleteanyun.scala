package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.NSIException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpm.sdk/passwords.Credential & {  onComplete :(): any | undefined,   onError :(error : jpm.FFAddonSDK.NSIException): any | undefined} */
@js.native
trait CredentialonCompleteanyun extends js.Object {
  
  var formSubmitURL: js.UndefOr[String] = js.native
  
  var onComplete: js.UndefOr[js.Function0[_]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ NSIException, _]] = js.native
  
  var password: String = js.native
  
  var passwordField: js.UndefOr[String] = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var username: String = js.native
  
  var usernameField: js.UndefOr[String] = js.native
}
object CredentialonCompleteanyun {
  
  @scala.inline
  def apply(password: String, username: String): CredentialonCompleteanyun = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialonCompleteanyun]
  }
  
  @scala.inline
  implicit class CredentialonCompleteanyunOps[Self <: CredentialonCompleteanyun] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormSubmitURL(value: String): Self = this.set("formSubmitURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormSubmitURL: Self = this.set("formSubmitURL", js.undefined)
    
    @scala.inline
    def setOnComplete(value: () => _): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ NSIException => _): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordField: Self = this.set("passwordField", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
  }
}
