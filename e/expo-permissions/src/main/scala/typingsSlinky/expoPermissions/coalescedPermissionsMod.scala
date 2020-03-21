package typingsSlinky.expoPermissions

import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionExpiration
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionMap
import typingsSlinky.expoPermissions.permissionsTypesMod.PermissionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions/build/CoalescedPermissions", JSImport.Namespace)
@js.native
object coalescedPermissionsMod extends js.Object {
  def coalesceExpirations(permissions: PermissionMap): PermissionExpiration = js.native
  def coalesceStatuses(permissions: PermissionMap): PermissionStatus = js.native
}

