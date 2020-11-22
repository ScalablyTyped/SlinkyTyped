package typingsSlinky.expo

import typingsSlinky.expo.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
@js.native
object exponentNotificationsHelperWebMod extends js.Object {
  
  def getDevicePushTokenAsync(): js.Promise[Data] = js.native
  
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  
  def guardPermission(): Unit = js.native
}
