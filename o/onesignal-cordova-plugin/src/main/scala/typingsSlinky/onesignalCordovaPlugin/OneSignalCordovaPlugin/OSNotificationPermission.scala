package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iOS only
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
  - typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
  - typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
*/
trait OSNotificationPermission extends js.Object

object OSNotificationPermission {
  @scala.inline
  def Authorized: `1` = this.cast(1)
  @scala.inline
  def Denied: `2` = this.cast(2)
  @scala.inline
  def NotDetermined: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

