package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.last_write_win_
import typingsSlinky.chromeApps.chromeAppsStrings.manual__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLASTWRITEWIN extends js.Object {
  var LAST_WRITE_WIN: last_write_win_ = js.native
  var MANUAL: manual__ = js.native
}

object AnonLASTWRITEWIN {
  @scala.inline
  def apply(LAST_WRITE_WIN: last_write_win_, MANUAL: manual__): AnonLASTWRITEWIN = {
    val __obj = js.Dynamic.literal(LAST_WRITE_WIN = LAST_WRITE_WIN.asInstanceOf[js.Any], MANUAL = MANUAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLASTWRITEWIN]
  }
  @scala.inline
  implicit class AnonLASTWRITEWINOps[Self <: AnonLASTWRITEWIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLAST_WRITE_WIN(value: last_write_win_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LAST_WRITE_WIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMANUAL(value: manual__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MANUAL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

