package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.connected__
import typingsSlinky.chromeApps.chromeAppsStrings.disconnected__
import typingsSlinky.chromeApps.chromeAppsStrings.error_
import typingsSlinky.chromeApps.chromeAppsStrings.linkChanged
import typingsSlinky.chromeApps.chromeAppsStrings.linkDown
import typingsSlinky.chromeApps.chromeAppsStrings.linkUp
import typingsSlinky.chromeApps.chromeAppsStrings.resume_
import typingsSlinky.chromeApps.chromeAppsStrings.suspend_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DISCONNECTED extends js.Object {
  var CONNECTED: connected__ = js.native
  var DISCONNECTED: disconnected__ = js.native
  var ERROR: error_ = js.native
  var LINK_CHANGED: linkChanged = js.native
  var LINK_DOWN: linkDown = js.native
  var LINK_UP: linkUp = js.native
  var RESUME: resume_ = js.native
  var SUSPEND: suspend_ = js.native
}

object DISCONNECTED {
  @scala.inline
  def apply(
    CONNECTED: connected__,
    DISCONNECTED: disconnected__,
    ERROR: error_,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume_,
    SUSPEND: suspend_
  ): DISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISCONNECTED]
  }
  @scala.inline
  implicit class DISCONNECTEDOps[Self <: DISCONNECTED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONNECTED(value: connected__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDISCONNECTED(value: disconnected__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: error_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINK_CHANGED(value: linkChanged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK_CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINK_DOWN(value: linkDown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK_DOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLINK_UP(value: linkUp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK_UP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESUME(value: resume_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUSPEND(value: suspend_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUSPEND")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

