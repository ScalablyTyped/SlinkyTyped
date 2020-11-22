package typingsSlinky.nodeRedRuntime.anon

import typingsSlinky.nodeRedRuntime.mod.ProjectUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remote extends js.Object {
  
  var id: String = js.native
  
  var remote: Boolean = js.native
  
  var req: js.UndefOr[js.Object] = js.native
  
  var user: js.UndefOr[ProjectUser] = js.native
}
object Remote {
  
  @scala.inline
  def apply(id: String, remote: Boolean): Remote = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit class RemoteOps[Self <: Remote] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote(value: Boolean): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setUser(value: ProjectUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
