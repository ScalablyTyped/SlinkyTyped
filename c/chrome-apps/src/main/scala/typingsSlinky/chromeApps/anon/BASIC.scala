package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.basic_
import typingsSlinky.chromeApps.chromeAppsStrings.image_
import typingsSlinky.chromeApps.chromeAppsStrings.list_
import typingsSlinky.chromeApps.chromeAppsStrings.progress_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BASIC extends js.Object {
  var BASIC: basic_ = js.native
  var IMAGE: image_ = js.native
  var LIST: list_ = js.native
  var PROGRESS: progress_ = js.native
}

object BASIC {
  @scala.inline
  def apply(BASIC: basic_, IMAGE: image_, LIST: list_, PROGRESS: progress_): BASIC = {
    val __obj = js.Dynamic.literal(BASIC = BASIC.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], PROGRESS = PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[BASIC]
  }
  @scala.inline
  implicit class BASICOps[Self <: BASIC] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBASIC(value: basic_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BASIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIMAGE(value: image_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IMAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLIST(value: list_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LIST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPROGRESS(value: progress_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PROGRESS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

