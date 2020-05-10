package typingsSlinky.peerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait util extends js.Object {
  var browser: String = js.native
  var supports: UtilSupportsObj = js.native
}

object util {
  @scala.inline
  def apply(browser: String, supports: UtilSupportsObj): util = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[util]
  }
  @scala.inline
  implicit class utilOps[Self <: util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupports(value: UtilSupportsObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

