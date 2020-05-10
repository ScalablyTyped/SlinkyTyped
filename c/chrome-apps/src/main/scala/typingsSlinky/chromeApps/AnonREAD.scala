package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.READ
import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonREAD extends js.Object {
  var READ: typingsSlinky.chromeApps.chromeAppsStrings.READ = js.native
  var WRITE: typingsSlinky.chromeApps.chromeAppsStrings.WRITE = js.native
}

object AnonREAD {
  @scala.inline
  def apply(READ: READ, WRITE: WRITE): AnonREAD = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonREAD]
  }
  @scala.inline
  implicit class AnonREADOps[Self <: AnonREAD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREAD(value: READ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWRITE(value: WRITE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WRITE")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

