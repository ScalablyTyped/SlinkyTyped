package typingsSlinky.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.native
  var openMenu: js.UndefOr[String] = js.native
}

object CloseMenu {
  @scala.inline
  def apply(): CloseMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMenu]
  }
  @scala.inline
  implicit class CloseMenuOps[Self <: CloseMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openMenu")(js.undefined)
        ret
    }
  }
  
}

