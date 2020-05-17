package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.no_update_
import typingsSlinky.chromeApps.chromeAppsStrings.throttled_
import typingsSlinky.chromeApps.chromeAppsStrings.update_available_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOUPDATE extends js.Object {
  var NO_UPDATE: no_update_ = js.native
  var THROTTLED: throttled_ = js.native
  var UPDATE_AVAILABLE: update_available_ = js.native
}

object NOUPDATE {
  @scala.inline
  def apply(NO_UPDATE: no_update_, THROTTLED: throttled_, UPDATE_AVAILABLE: update_available_): NOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOUPDATE]
  }
  @scala.inline
  implicit class NOUPDATEOps[Self <: NOUPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNO_UPDATE(value: no_update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHROTTLED(value: throttled_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THROTTLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATE_AVAILABLE(value: update_available_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATE_AVAILABLE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

