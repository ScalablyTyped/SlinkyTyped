package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionData extends StObject {
  
  var permission_name: String = js.native
  
  var resource_server_identifier: String = js.native
}
object PermissionData {
  
  @scala.inline
  def apply(permission_name: String, resource_server_identifier: String): PermissionData = {
    val __obj = js.Dynamic.literal(permission_name = permission_name.asInstanceOf[js.Any], resource_server_identifier = resource_server_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionData]
  }
  
  @scala.inline
  implicit class PermissionDataMutableBuilder[Self <: PermissionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission_name(value: String): Self = StObject.set(x, "permission_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_server_identifier(value: String): Self = StObject.set(x, "resource_server_identifier", value.asInstanceOf[js.Any])
  }
}
