package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.added_
import typingsSlinky.chromeApps.chromeAppsStrings.deleted_
import typingsSlinky.chromeApps.chromeAppsStrings.updated_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonADDED extends js.Object {
  var ADDED: added_ = js.native
  var DELETED: deleted_ = js.native
  var UPDATED: updated_ = js.native
}

object AnonADDED {
  @scala.inline
  def apply(ADDED: added_, DELETED: deleted_, UPDATED: updated_): AnonADDED = {
    val __obj = js.Dynamic.literal(ADDED = ADDED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any], UPDATED = UPDATED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonADDED]
  }
  @scala.inline
  implicit class AnonADDEDOps[Self <: AnonADDED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADDED(value: added_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDELETED(value: deleted_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELETED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUPDATED(value: updated_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

