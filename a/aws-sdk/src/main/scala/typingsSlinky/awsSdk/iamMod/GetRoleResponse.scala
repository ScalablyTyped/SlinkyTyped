package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRoleResponse extends StObject {
  
  /**
    * A structure containing details about the IAM role.
    */
  var Role: typingsSlinky.awsSdk.iamMod.Role = js.native
}
object GetRoleResponse {
  
  @scala.inline
  def apply(Role: Role): GetRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleResponse]
  }
  
  @scala.inline
  implicit class GetRoleResponseMutableBuilder[Self <: GetRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
  }
}
