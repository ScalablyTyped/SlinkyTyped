package typingsSlinky.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker

import typingsSlinky.daterangepicker.mod.Options
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends Options {
  var containerClass: js.UndefOr[String] = js.native
  var containerStyles: js.UndefOr[CSSProperties] = js.native
  var onApply: js.UndefOr[EventHandler] = js.native
  var onCancel: js.UndefOr[EventHandler] = js.native
  var onEvent: js.UndefOr[EventHandler] = js.native
  var onHide: js.UndefOr[EventHandler] = js.native
  var onHideCalendar: js.UndefOr[EventHandler] = js.native
  var onShow: js.UndefOr[EventHandler] = js.native
  var onShowCalendar: js.UndefOr[EventHandler] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerStyles(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withOnApply(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnApply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onApply")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCancel(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEvent(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHideCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideCalendar")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHideCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHideCalendar")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShowCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowCalendar")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnShowCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShowCalendar")(js.undefined)
        ret
    }
  }
  
}

