package typingsSlinky.angularPermission.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permission {
  type PermissionValidationFunction = js.Function2[
    /* permissionName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[typingsSlinky.angularPermission.mod.permission.TransitionProperties], 
    scala.Boolean | typingsSlinky.angular.mod.IPromise[js.Any]
  ]
  type RoleValidationFunction = js.Function2[
    /* roleName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[typingsSlinky.angularPermission.mod.permission.TransitionProperties], 
    scala.Boolean | typingsSlinky.angular.mod.IPromise[js.Any]
  ]
}
