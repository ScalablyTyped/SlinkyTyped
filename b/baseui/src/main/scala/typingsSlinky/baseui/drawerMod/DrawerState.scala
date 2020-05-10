package typingsSlinky.baseui.drawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerState extends js.Object {
  var isVisible: Boolean = js.native
  var mounted: Boolean = js.native
}

object DrawerState {
  @scala.inline
  def apply(isVisible: Boolean, mounted: Boolean): DrawerState = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerState]
  }
  @scala.inline
  implicit class DrawerStateOps[Self <: DrawerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMounted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mounted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

