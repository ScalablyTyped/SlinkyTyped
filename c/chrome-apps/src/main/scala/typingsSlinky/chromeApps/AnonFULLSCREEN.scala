package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.fullscreen_
import typingsSlinky.chromeApps.chromeAppsStrings.maximized_
import typingsSlinky.chromeApps.chromeAppsStrings.minimized_
import typingsSlinky.chromeApps.chromeAppsStrings.normal_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFULLSCREEN extends js.Object {
  var FULLSCREEN: fullscreen_ = js.native
  var MAXIMIZED: maximized_ = js.native
  var MINIMIZED: minimized_ = js.native
  var NORMAL: normal_ = js.native
}

object AnonFULLSCREEN {
  @scala.inline
  def apply(FULLSCREEN: fullscreen_, MAXIMIZED: maximized_, MINIMIZED: minimized_, NORMAL: normal_): AnonFULLSCREEN = {
    val __obj = js.Dynamic.literal(FULLSCREEN = FULLSCREEN.asInstanceOf[js.Any], MAXIMIZED = MAXIMIZED.asInstanceOf[js.Any], MINIMIZED = MINIMIZED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFULLSCREEN]
  }
  @scala.inline
  implicit class AnonFULLSCREENOps[Self <: AnonFULLSCREEN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFULLSCREEN(value: fullscreen_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FULLSCREEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAXIMIZED(value: maximized_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAXIMIZED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMINIMIZED(value: minimized_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MINIMIZED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNORMAL(value: normal_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

