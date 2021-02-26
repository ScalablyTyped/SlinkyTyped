package typingsSlinky.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoleRequest extends StObject {
  
  /** The Role resource to create. */
  var role: js.UndefOr[Role] = js.native
  
  /**
    * The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64
    * characters.
    */
  var roleId: js.UndefOr[String] = js.native
}
object CreateRoleRequest {
  
  @scala.inline
  def apply(): CreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoleRequest]
  }
  
  @scala.inline
  implicit class CreateRoleRequestMutableBuilder[Self <: CreateRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
