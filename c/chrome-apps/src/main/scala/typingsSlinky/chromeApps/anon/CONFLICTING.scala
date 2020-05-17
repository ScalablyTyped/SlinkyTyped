package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.conflicting_
import typingsSlinky.chromeApps.chromeAppsStrings.pending_
import typingsSlinky.chromeApps.chromeAppsStrings.synced_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CONFLICTING extends js.Object {
  var CONFLICTING: conflicting_ = js.native
  var PENDING: pending_ = js.native
  var SYNCED: synced_ = js.native
}

object CONFLICTING {
  @scala.inline
  def apply(CONFLICTING: conflicting_, PENDING: pending_, SYNCED: synced_): CONFLICTING = {
    val __obj = js.Dynamic.literal(CONFLICTING = CONFLICTING.asInstanceOf[js.Any], PENDING = PENDING.asInstanceOf[js.Any], SYNCED = SYNCED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONFLICTING]
  }
  @scala.inline
  implicit class CONFLICTINGOps[Self <: CONFLICTING] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCONFLICTING(value: conflicting_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONFLICTING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPENDING(value: pending_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSYNCED(value: synced_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SYNCED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

