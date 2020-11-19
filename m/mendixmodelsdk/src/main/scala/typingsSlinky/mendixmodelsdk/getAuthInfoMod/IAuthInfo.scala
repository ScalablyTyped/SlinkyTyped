package typingsSlinky.mendixmodelsdk.getAuthInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthInfo extends js.Object {
  
  var openid: js.UndefOr[String] = js.native
  
  var password: String = js.native
  
  var username: String = js.native
}
object IAuthInfo {
  
  @scala.inline
  def apply(password: String, username: String): IAuthInfo = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthInfo]
  }
  
  @scala.inline
  implicit class IAuthInfoOps[Self <: IAuthInfo] (val x: Self) extends AnyVal {
    
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
    def setOpenid(value: String): Self = this.set("openid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenid: Self = this.set("openid", js.undefined)
  }
}
