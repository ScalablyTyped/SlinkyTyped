package typingsSlinky.reactDashNativeDashPermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptTypesMod {
  import typingsSlinky.reactDashNativeDashPermissions.Anon_ACCEPTHANDOVER
  import typingsSlinky.reactDashNativeDashPermissions.Anon_BLOCKED
  import typingsSlinky.reactDashNativeDashPermissions.Anon_BLUETOOTHPERIPHERAL

  type AndroidPermission = Values[Anon_ACCEPTHANDOVER]
  type IOSPermission = Values[Anon_BLUETOOTHPERIPHERAL]
  type Permission = AndroidPermission | IOSPermission
  type PermissionStatus = Values[Anon_BLOCKED]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
