package typingsSlinky.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AndroidPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.anon.ReadonlyACCEPTHANDOVERand]
  
  type IOSPermission = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.anon.ReadonlyBLUETOOTHPERIPHER]
  
  type Permission = typingsSlinky.reactNativePermissions.typesMod.AndroidPermission | typingsSlinky.reactNativePermissions.typesMod.IOSPermission
  
  type PermissionStatus = typingsSlinky.reactNativePermissions.typesMod.Values[typingsSlinky.reactNativePermissions.anon.ReadonlyUNAVAILABLEunavai]
  
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
