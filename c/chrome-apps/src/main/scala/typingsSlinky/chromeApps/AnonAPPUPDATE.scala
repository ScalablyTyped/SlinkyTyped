package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.app_update_
import typingsSlinky.chromeApps.chromeAppsStrings.os_update_
import typingsSlinky.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAPPUPDATE extends js.Object {
  var APP_UPDATE: app_update_ = js.native
  var OS_UPDATE: os_update_ = js.native
  var PERIODIC: periodic_ = js.native
}

object AnonAPPUPDATE {
  @scala.inline
  def apply(APP_UPDATE: app_update_, OS_UPDATE: os_update_, PERIODIC: periodic_): AnonAPPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = APP_UPDATE.asInstanceOf[js.Any], OS_UPDATE = OS_UPDATE.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAPPUPDATE]
  }
  @scala.inline
  implicit class AnonAPPUPDATEOps[Self <: AnonAPPUPDATE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPP_UPDATE(value: app_update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOS_UPDATE(value: os_update_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OS_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPERIODIC(value: periodic_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERIODIC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

