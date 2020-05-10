package typingsSlinky.onesignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin.OSSubscriptionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFromTo extends js.Object {
  var from: OSSubscriptionState = js.native
  var to: OSSubscriptionState = js.native
}

object AnonFromTo {
  @scala.inline
  def apply(from: OSSubscriptionState, to: OSSubscriptionState): AnonFromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromTo]
  }
  @scala.inline
  implicit class AnonFromToOps[Self <: AnonFromTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: OSSubscriptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: OSSubscriptionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

