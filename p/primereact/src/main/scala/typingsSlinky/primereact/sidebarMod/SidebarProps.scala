package typingsSlinky.primereact.sidebarMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarProps extends js.Object {
  var ariaCloseLabel: js.UndefOr[String] = js.native
  var baseZIndex: js.UndefOr[Double] = js.native
  var blockScroll: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  var dismissable: js.UndefOr[Boolean] = js.native
  var fullScreen: js.UndefOr[Boolean] = js.native
  var iconsTemplate: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.native
  var id: js.UndefOr[String] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var position: js.UndefOr[String] = js.native
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  def onHide(): Unit = js.native
}

object SidebarProps {
  @scala.inline
  def apply(onHide: () => Unit): SidebarProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[SidebarProps]
  }
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAriaCloseLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCloseLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaCloseLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCloseLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withDismissable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissable")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withIconsTemplate(value: () => js.UndefOr[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIconsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

