package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNativePermissions.contractMod.Contract
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-permissions/lib/typescript/module.ios", JSImport.Namespace)
@js.native
object moduleIosMod extends js.Object {
  val module: Contract = js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}

