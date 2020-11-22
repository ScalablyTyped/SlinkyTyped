package typingsSlinky.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AndroidPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.permissionsAndroidMod.AndroidPermissionMap]
  
  type IOSPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.permissionsIosMod.IOSPermissionMap]
  
  type Permission = typingsSlinky.reactNativePermissions.typesMod.AndroidPermission | typingsSlinky.reactNativePermissions.typesMod.IOSPermission | typingsSlinky.reactNativePermissions.typesMod.WindowsPermission
  
  type PermissionStatus = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.resultsMod.ResultMap]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  type WindowsPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.permissionsWindowsMod.WindowsPermissionMap]
}
