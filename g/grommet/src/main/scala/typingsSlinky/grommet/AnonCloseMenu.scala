package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloseMenu extends js.Object {
  var closeMenu: js.UndefOr[String] = js.native
  var openMenu: js.UndefOr[String] = js.native
}

object AnonCloseMenu {
  @scala.inline
  def apply(): AnonCloseMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCloseMenu]
  }
  @scala.inline
  implicit class AnonCloseMenuOps[Self <: AnonCloseMenu] (val x: Self) extends AnyVal {
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

