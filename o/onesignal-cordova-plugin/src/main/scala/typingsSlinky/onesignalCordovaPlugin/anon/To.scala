package typingsSlinky.onesignalCordovaPlugin.anon

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSPermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait To extends js.Object {
  var from: OSPermissionState
  var to: OSPermissionState
}

object To {
  @scala.inline
  def apply(from: OSPermissionState, to: OSPermissionState): To = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
}

