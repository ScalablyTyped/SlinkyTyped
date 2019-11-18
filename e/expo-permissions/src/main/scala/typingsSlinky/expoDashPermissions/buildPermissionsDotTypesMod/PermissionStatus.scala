package typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionStatus extends js.Object

@JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
@js.native
object PermissionStatus extends js.Object {
  @js.native
  sealed trait DENIED extends PermissionStatus
  
  @js.native
  sealed trait GRANTED extends PermissionStatus
  
  @js.native
  sealed trait UNDETERMINED extends PermissionStatus
  
  /* "denied" */ val DENIED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED with String = js.native
  /* "granted" */ val GRANTED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED with String = js.native
  /* "undetermined" */ val UNDETERMINED: typingsSlinky.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PermissionStatus with String] = js.native
}

