package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionMap
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionExpiration
import typingsSlinky.unimodulesPermissionsInterface.mod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object coalescedPermissionsMod extends js.Object {
  
  def coalesceCanAskAgain(permissions: PermissionMap): Boolean = js.native
  
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  
  def coalesceGranted(permissions: PermissionMap): Boolean = js.native
  
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}
