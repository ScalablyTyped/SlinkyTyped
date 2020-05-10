package typingsSlinky.bootstrapNotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifySettings extends js.Object {
  var allow_dismiss: js.UndefOr[Boolean] = js.native
  var allow_duplicates: js.UndefOr[Boolean] = js.native
  var animate: js.UndefOr[AnonEnter] = js.native
  var delay: js.UndefOr[Double] = js.native
  var element: js.UndefOr[String] = js.native
  var icon_type: js.UndefOr[String] = js.native
  var mouse_over: js.UndefOr[String] = js.native
  var newest_on_top: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double | AnonX] = js.native
  var onClose: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.native
  var onClosed: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.native
  var onShown: js.UndefOr[js.Function1[/* $ele */ JQuery_[HTMLElement], Unit]] = js.native
  var placement: js.UndefOr[AnonAlign] = js.native
  var position: js.UndefOr[String] = js.native
  var showProgressbar: js.UndefOr[Boolean] = js.native
  var spacing: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String] = js.native
  var timer: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url_target: js.UndefOr[String] = js.native
  var z_index: js.UndefOr[Double] = js.native
}

object NotifySettings {
  @scala.inline
  def apply(): NotifySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifySettings]
  }
  @scala.inline
  implicit class NotifySettingsOps[Self <: NotifySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_dismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_dismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_dismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_dismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_duplicates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_duplicates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_duplicates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_duplicates")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: AnonEnter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon_type")(js.undefined)
        ret
    }
    @scala.inline
    def withMouse_over(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse_over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse_over: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse_over")(js.undefined)
        ret
    }
    @scala.inline
    def withNewest_on_top(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newest_on_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewest_on_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newest_on_top")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* $ele */ JQuery_[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosed(value: /* $ele */ JQuery_[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* $ele */ JQuery_[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShown(value: /* $ele */ JQuery_[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShown")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: AnonAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
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
    def withShowProgressbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowProgressbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showProgressbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timer")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl_target(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url_target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl_target: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url_target")(js.undefined)
        ret
    }
    @scala.inline
    def withZ_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z_index")(js.undefined)
        ret
    }
  }
  
}

