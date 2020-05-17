package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.changed_
import typingsSlinky.chromeApps.chromeAppsStrings.created
import typingsSlinky.chromeApps.chromeAppsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CHANGED extends js.Object {
  var CHANGED: changed_ = js.native
  var CREATED: created = js.native
  var REMOVED: removed = js.native
}

object CHANGED {
  @scala.inline
  def apply(CHANGED: changed_, CREATED: created, REMOVED: removed): CHANGED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], CREATED = CREATED.asInstanceOf[js.Any], REMOVED = REMOVED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CHANGED]
  }
  @scala.inline
  implicit class CHANGEDOps[Self <: CHANGED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGED(value: changed_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCREATED(value: created): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CREATED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOVED(value: removed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

