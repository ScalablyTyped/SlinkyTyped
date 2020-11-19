package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionMap
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionType
import typingsSlinky.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-permissions/build/ExpoPermissions.web", JSImport.Namespace)
@js.native
object expoPermissionsWebMod extends js.Object {
  
  def getRequestMotionPermission(): js.Function0[js.Promise[PermissionState]] | Null = js.native
  
  @js.native
  object default extends js.Object {
    
    def askAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    
    def getAsync(permissionTypes: js.Array[PermissionType]): js.Promise[PermissionMap] = js.native
    
    val name: String = js.native
  }
}
