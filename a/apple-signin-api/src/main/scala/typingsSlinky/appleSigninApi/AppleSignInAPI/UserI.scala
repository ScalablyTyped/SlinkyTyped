package typingsSlinky.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/signinwithapplejs/useri
@js.native
trait UserI extends js.Object {
  
  var email: String = js.native
  
  var name: NameI = js.native
}
object UserI {
  
  @scala.inline
  def apply(email: String, name: NameI): UserI = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserI]
  }
  
  @scala.inline
  implicit class UserIOps[Self <: UserI] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameI): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
