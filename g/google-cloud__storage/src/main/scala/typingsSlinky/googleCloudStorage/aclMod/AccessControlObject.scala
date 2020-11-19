package typingsSlinky.googleCloudStorage.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlObject extends js.Object {
  
  var entity: String = js.native
  
  var projectTeam: String = js.native
  
  var role: String = js.native
}
object AccessControlObject {
  
  @scala.inline
  def apply(entity: String, projectTeam: String, role: String): AccessControlObject = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], projectTeam = projectTeam.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlObject]
  }
  
  @scala.inline
  implicit class AccessControlObjectOps[Self <: AccessControlObject] (val x: Self) extends AnyVal {
    
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
    def setEntity(value: String): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectTeam(value: String): Self = this.set("projectTeam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
