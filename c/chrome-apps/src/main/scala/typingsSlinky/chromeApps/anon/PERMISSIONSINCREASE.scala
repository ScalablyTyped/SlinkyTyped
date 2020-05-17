package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.permissions_increase_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PERMISSIONSINCREASE extends js.Object {
  var PERMISSIONS_INCREASE: permissions_increase_ = js.native
  var UNKNOWN: unknown__ = js.native
}

object PERMISSIONSINCREASE {
  @scala.inline
  def apply(PERMISSIONS_INCREASE: permissions_increase_, UNKNOWN: unknown__): PERMISSIONSINCREASE = {
    val __obj = js.Dynamic.literal(PERMISSIONS_INCREASE = PERMISSIONS_INCREASE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PERMISSIONSINCREASE]
  }
  @scala.inline
  implicit class PERMISSIONSINCREASEOps[Self <: PERMISSIONSINCREASE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPERMISSIONS_INCREASE(value: permissions_increase_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSIONS_INCREASE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUNKNOWN(value: unknown__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

