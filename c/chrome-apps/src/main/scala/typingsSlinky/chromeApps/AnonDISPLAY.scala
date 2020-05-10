package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.display_
import typingsSlinky.chromeApps.chromeAppsStrings.system_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDISPLAY extends js.Object {
  var DISPLAY: display_ = js.native
  var SYSTEM: system_ = js.native
}

object AnonDISPLAY {
  @scala.inline
  def apply(DISPLAY: display_, SYSTEM: system_): AnonDISPLAY = {
    val __obj = js.Dynamic.literal(DISPLAY = DISPLAY.asInstanceOf[js.Any], SYSTEM = SYSTEM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDISPLAY]
  }
  @scala.inline
  implicit class AnonDISPLAYOps[Self <: AnonDISPLAY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDISPLAY(value: display_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISPLAY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYSTEM(value: system_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

