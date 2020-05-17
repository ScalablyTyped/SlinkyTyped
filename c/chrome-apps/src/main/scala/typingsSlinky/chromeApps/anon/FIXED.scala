package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.fixed_
import typingsSlinky.chromeApps.chromeAppsStrings.removable_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FIXED extends js.Object {
  var FIXED: fixed_ = js.native
  var REMOVABLE: removable_ = js.native
  var UNKNOWN: unknown__ = js.native
}

object FIXED {
  @scala.inline
  def apply(FIXED: fixed_, REMOVABLE: removable_, UNKNOWN: unknown__): FIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], REMOVABLE = REMOVABLE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[FIXED]
  }
  @scala.inline
  implicit class FIXEDOps[Self <: FIXED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFIXED(value: fixed_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOVABLE(value: removable_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOVABLE")(value.asInstanceOf[js.Any])
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

