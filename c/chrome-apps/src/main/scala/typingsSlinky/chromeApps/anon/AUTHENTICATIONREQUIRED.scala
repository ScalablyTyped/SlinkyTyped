package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.authentication_required_
import typingsSlinky.chromeApps.chromeAppsStrings.disabled__
import typingsSlinky.chromeApps.chromeAppsStrings.initializing_
import typingsSlinky.chromeApps.chromeAppsStrings.running_
import typingsSlinky.chromeApps.chromeAppsStrings.temporary_unavailable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required_ = js.native
  var DISABLED: disabled__ = js.native
  var INITIALIZING: initializing_ = js.native
  var RUNNING: running_ = js.native
  var TEMPORARY_UNAVAILABLE: temporary_unavailable_ = js.native
}

object AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required_,
    DISABLED: disabled__,
    INITIALIZING: initializing_,
    RUNNING: running_,
    TEMPORARY_UNAVAILABLE: temporary_unavailable_
  ): AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INITIALIZING = INITIALIZING.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTHENTICATIONREQUIRED]
  }
  @scala.inline
  implicit class AUTHENTICATIONREQUIREDOps[Self <: AUTHENTICATIONREQUIRED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAUTHENTICATION_REQUIRED(value: authentication_required_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATION_REQUIRED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISABLED(value: disabled__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINITIALIZING(value: initializing_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INITIALIZING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRUNNING(value: running_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RUNNING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEMPORARY_UNAVAILABLE(value: temporary_unavailable_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEMPORARY_UNAVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

