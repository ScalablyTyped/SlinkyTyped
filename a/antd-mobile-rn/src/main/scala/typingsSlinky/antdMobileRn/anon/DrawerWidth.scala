package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWidth extends js.Object {
  var drawerWidth: Double = js.native
  var open: Boolean = js.native
  var position: String = js.native
}

object DrawerWidth {
  @scala.inline
  def apply(drawerWidth: Double, open: Boolean, position: String): DrawerWidth = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerWidth]
  }
  @scala.inline
  implicit class DrawerWidthOps[Self <: DrawerWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrawerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

