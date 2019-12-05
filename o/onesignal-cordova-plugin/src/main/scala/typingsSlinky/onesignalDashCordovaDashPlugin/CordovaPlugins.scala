package typingsSlinky.onesignalDashCordovaDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: typingsSlinky.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(
    OneSignal: typingsSlinky.onesignalDashCordovaDashPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

