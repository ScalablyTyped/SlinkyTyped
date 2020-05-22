package typingsSlinky.onesignalCordovaPlugin.anon

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromTo extends js.Object {
  var from: OSSubscriptionState
  var to: OSSubscriptionState
}

object FromTo {
  @scala.inline
  def apply(from: OSSubscriptionState, to: OSSubscriptionState): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
}

