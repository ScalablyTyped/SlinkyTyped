package typingsSlinky.inboxsdk.mod.NavMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavMenuInstance extends js.Object {
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView = js.native
}

object NavMenuInstance {
  @scala.inline
  def apply(addNavItem: NavItemDescriptor => NavItemView): NavMenuInstance = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem))
    __obj.asInstanceOf[NavMenuInstance]
  }
  @scala.inline
  implicit class NavMenuInstanceOps[Self <: NavMenuInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNavItem(value: NavItemDescriptor => NavItemView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNavItem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

