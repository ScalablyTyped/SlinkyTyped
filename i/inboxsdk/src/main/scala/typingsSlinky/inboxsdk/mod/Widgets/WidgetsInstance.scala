package typingsSlinky.inboxsdk.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetsInstance extends js.Object {
  def showDrawerView(options: DrawerOptions): DrawerView = js.native
  def showModalView(options: ModalOptions): ModalView = js.native
  def showMoleView(options: MoleOptions): MoleView = js.native
}

object WidgetsInstance {
  @scala.inline
  def apply(
    showDrawerView: DrawerOptions => DrawerView,
    showModalView: ModalOptions => ModalView,
    showMoleView: MoleOptions => MoleView
  ): WidgetsInstance = {
    val __obj = js.Dynamic.literal(showDrawerView = js.Any.fromFunction1(showDrawerView), showModalView = js.Any.fromFunction1(showModalView), showMoleView = js.Any.fromFunction1(showMoleView))
    __obj.asInstanceOf[WidgetsInstance]
  }
  @scala.inline
  implicit class WidgetsInstanceOps[Self <: WidgetsInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowDrawerView(value: DrawerOptions => DrawerView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDrawerView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowModalView(value: ModalOptions => ModalView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showModalView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowMoleView(value: MoleOptions => MoleView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMoleView")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

