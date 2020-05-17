package typingsSlinky.reactNativePermissions.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNativePermissions.typesMod.AndroidPermission
  - typingsSlinky.reactNativePermissions.typesMod.IOSPermission
*/
trait Permission extends js.Object

object Permission {
  @scala.inline
  implicit def apply(value: AndroidPermission | IOSPermission): Permission = value.asInstanceOf[Permission]
}

