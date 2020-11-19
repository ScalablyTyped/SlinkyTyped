package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logout extends js.Object {
  
  var logout: js.UndefOr[js.Object] = js.native
}
object Logout {
  
  @scala.inline
  def apply(): Logout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logout]
  }
  
  @scala.inline
  implicit class LogoutOps[Self <: Logout] (val x: Self) extends AnyVal {
    
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
    def setLogout(value: js.Object): Self = this.set("logout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogout: Self = this.set("logout", js.undefined)
  }
}
