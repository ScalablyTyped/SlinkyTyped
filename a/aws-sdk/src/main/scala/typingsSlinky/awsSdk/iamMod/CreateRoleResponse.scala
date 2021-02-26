package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoleResponse extends StObject {
  
  /**
    * A structure containing details about the new role.
    */
  var Role: typingsSlinky.awsSdk.iamMod.Role = js.native
}
object CreateRoleResponse {
  
  @scala.inline
  def apply(Role: Role): CreateRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleResponse]
  }
  
  @scala.inline
  implicit class CreateRoleResponseMutableBuilder[Self <: CreateRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
  }
}
