package typingsSlinky.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinilogBackends extends js.Object {
  var array: js.Any = js.native
  var browser: js.Any = js.native
  var console: Console = js.native
  var jQuery: js.Any = js.native
  var localstorage: js.Any = js.native
}

object MinilogBackends {
  @scala.inline
  def apply(array: js.Any, browser: js.Any, console: Console, jQuery: js.Any, localstorage: js.Any): MinilogBackends = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], console = console.asInstanceOf[js.Any], jQuery = jQuery.asInstanceOf[js.Any], localstorage = localstorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinilogBackends]
  }
  @scala.inline
  implicit class MinilogBackendsOps[Self <: MinilogBackends] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalstorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localstorage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

