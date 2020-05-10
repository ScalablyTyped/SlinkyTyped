package typingsSlinky.inboxsdk.mod.NavMenu

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavItemView extends js.Object {
  var destroyed: Boolean = js.native
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView = js.native
  def isCollapsed(): Boolean = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  def remove(): Unit = js.native
  def setCollapsed(collapseValue: Boolean): Unit = js.native
}

object NavItemView {
  @scala.inline
  def apply(
    addNavItem: NavItemDescriptor => NavItemView,
    destroyed: Boolean,
    isCollapsed: () => Boolean,
    on: (destroy, js.Function0[Unit]) => Unit,
    remove: () => Unit,
    setCollapsed: Boolean => Unit
  ): NavItemView = {
    val __obj = js.Dynamic.literal(addNavItem = js.Any.fromFunction1(addNavItem), destroyed = destroyed.asInstanceOf[js.Any], isCollapsed = js.Any.fromFunction0(isCollapsed), on = js.Any.fromFunction2(on), remove = js.Any.fromFunction0(remove), setCollapsed = js.Any.fromFunction1(setCollapsed))
    __obj.asInstanceOf[NavItemView]
  }
  @scala.inline
  implicit class NavItemViewOps[Self <: NavItemView] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCollapsed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOn(value: (destroy, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCollapsed(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCollapsed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

