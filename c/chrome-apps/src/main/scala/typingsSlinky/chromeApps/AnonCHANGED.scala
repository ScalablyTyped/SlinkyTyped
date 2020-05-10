package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.CHANGED
import typingsSlinky.chromeApps.chromeAppsStrings.DELETED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCHANGED extends js.Object {
  var CHANGED: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED = js.native
  var DELETED: typingsSlinky.chromeApps.chromeAppsStrings.DELETED = js.native
}

object AnonCHANGED {
  @scala.inline
  def apply(CHANGED: CHANGED, DELETED: DELETED): AnonCHANGED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCHANGED]
  }
  @scala.inline
  implicit class AnonCHANGEDOps[Self <: AnonCHANGED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCHANGED(value: CHANGED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDELETED(value: DELETED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

