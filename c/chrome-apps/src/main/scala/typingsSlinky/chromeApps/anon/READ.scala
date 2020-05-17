package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.WRITE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait READ extends js.Object {
  var READ: typingsSlinky.chromeApps.chromeAppsStrings.READ = js.native
  var WRITE: typingsSlinky.chromeApps.chromeAppsStrings.WRITE = js.native
}

object READ {
  @scala.inline
  def apply(READ: typingsSlinky.chromeApps.chromeAppsStrings.READ, WRITE: WRITE): READ = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[READ]
  }
  @scala.inline
  implicit class READOps[Self <: READ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withREAD(value: typingsSlinky.chromeApps.chromeAppsStrings.READ): Self = {
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

