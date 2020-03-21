package typingsSlinky.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AndroidPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.ReadonlyACCEPTHANDOVERand]
  type IOSPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.ReadonlyBLUETOOTHPERIPHER]
  type Permission = typingsSlinky.reactNativePermissions.typesMod.AndroidPermission | typingsSlinky.reactNativePermissions.typesMod.IOSPermission
  type PermissionStatus = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.ReadonlyUNAVAILABLEunavai]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
