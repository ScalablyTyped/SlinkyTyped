package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DELETED extends js.Object {
  var CHANGED: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED = js.native
  var DELETED: typingsSlinky.chromeApps.chromeAppsStrings.DELETED = js.native
}

object DELETED {
  @scala.inline
  def apply(
    CHANGED: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED,
    DELETED: typingsSlinky.chromeApps.chromeAppsStrings.DELETED
  ): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETED]
  }
  @scala.inline
  implicit class DELETEDOps[Self <: DELETED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGED(value: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDELETED(value: typingsSlinky.chromeApps.chromeAppsStrings.DELETED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

