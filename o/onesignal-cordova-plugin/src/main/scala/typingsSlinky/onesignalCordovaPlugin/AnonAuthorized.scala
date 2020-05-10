package typingsSlinky.onesignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`0`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`1`
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorized extends js.Object {
  var Authorized: `1` = js.native
  var Denied: `2` = js.native
  var NotDetermined: `0` = js.native
}

object AnonAuthorized {
  @scala.inline
  def apply(Authorized: `1`, Denied: `2`, NotDetermined: `0`): AnonAuthorized = {
    val __obj = js.Dynamic.literal(Authorized = Authorized.asInstanceOf[js.Any], Denied = Denied.asInstanceOf[js.Any], NotDetermined = NotDetermined.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorized]
  }
  @scala.inline
  implicit class AnonAuthorizedOps[Self <: AnonAuthorized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorized(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDenied(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Denied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotDetermined(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotDetermined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

