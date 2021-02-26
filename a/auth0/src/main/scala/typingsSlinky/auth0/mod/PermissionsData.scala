package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionsData extends StObject {
  
  var permissions: js.Array[PermissionData] = js.native
}
object PermissionsData {
  
  @scala.inline
  def apply(permissions: js.Array[PermissionData]): PermissionsData = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsData]
  }
  
  @scala.inline
  implicit class PermissionsDataMutableBuilder[Self <: PermissionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[PermissionData]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: PermissionData*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
