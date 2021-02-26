package typingsSlinky.reactNativePermissions

import typingsSlinky.reactNativePermissions.contractMod.Contract
import typingsSlinky.reactNativePermissions.typesMod.NotificationOption
import typingsSlinky.reactNativePermissions.typesMod.NotificationsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsIosMod {
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", "checkNotifications")
  @js.native
  def checkNotifications(): js.Promise[NotificationsResponse] = js.native
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", "methods")
  @js.native
  val methods: Contract = js.native
  
  @JSImport("react-native-permissions/dist/typescript/methods.ios", "requestNotifications")
  @js.native
  def requestNotifications(options: js.Array[NotificationOption]): js.Promise[NotificationsResponse] = js.native
}
