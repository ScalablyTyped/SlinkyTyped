package typingsSlinky.nwGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HideMenusOptions extends js.Object {
  var hideEdit: Boolean = js.native
  var hideWindow: Boolean = js.native
}

object HideMenusOptions {
  @scala.inline
  def apply(hideEdit: Boolean, hideWindow: Boolean): HideMenusOptions = {
    val __obj = js.Dynamic.literal(hideEdit = hideEdit.asInstanceOf[js.Any], hideWindow = hideWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideMenusOptions]
  }
  @scala.inline
  implicit class HideMenusOptionsOps[Self <: HideMenusOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHideEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideWindow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

