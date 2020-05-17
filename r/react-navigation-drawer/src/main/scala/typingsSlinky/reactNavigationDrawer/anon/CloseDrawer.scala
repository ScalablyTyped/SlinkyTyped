package typingsSlinky.reactNavigationDrawer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseDrawer extends js.Object {
  def closeDrawer(): js.Any = js.native
  def openDrawer(): js.Any = js.native
  def toggleDrawer(): js.Any = js.native
}

object CloseDrawer {
  @scala.inline
  def apply(closeDrawer: () => js.Any, openDrawer: () => js.Any, toggleDrawer: () => js.Any): CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[CloseDrawer]
  }
  @scala.inline
  implicit class CloseDrawerOps[Self <: CloseDrawer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseDrawer(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDrawer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenDrawer(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDrawer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToggleDrawer(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDrawer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

