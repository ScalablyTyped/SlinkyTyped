package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNativePermissions.contractMod.Contract
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-permissions/dist/typescript/methods.ios", JSImport.Namespace)
@js.native
object methodsIosMod extends js.Object {
  
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  
  val methods: Contract = js.native
  
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}
