package typingsSlinky.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersGetByUsernameEndpoint extends js.Object {
  
  var username: String = js.native
}
object UsersGetByUsernameEndpoint {
  
  @scala.inline
  def apply(username: String): UsersGetByUsernameEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetByUsernameEndpoint]
  }
  
  @scala.inline
  implicit class UsersGetByUsernameEndpointOps[Self <: UsersGetByUsernameEndpoint] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
