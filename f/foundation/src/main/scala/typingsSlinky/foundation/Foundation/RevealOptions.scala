package typingsSlinky.foundation.Foundation

import typingsSlinky.foundation.JQuery
import typingsSlinky.foundation.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevealOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var animation_speed: js.UndefOr[Double] = js.native
  var bg: js.UndefOr[JQuery] = js.native
  var bg_class: js.UndefOr[String] = js.native
  var close: js.UndefOr[js.Function0[_]] = js.native
  var close_on_background_click: js.UndefOr[Boolean] = js.native
  var closed: js.UndefOr[js.Function0[_]] = js.native
  var css: js.UndefOr[Close] = js.native
  var dismiss_modal_class: js.UndefOr[String] = js.native
  var multiple_opened: js.UndefOr[Boolean] = js.native
  var on_ajax_error: js.UndefOr[js.Function0[_]] = js.native
  var open: js.UndefOr[js.Function0[_]] = js.native
  var opened: js.UndefOr[js.Function0[_]] = js.native
  var root_element: js.UndefOr[String] = js.native
}

object RevealOptions {
  @scala.inline
  def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  @scala.inline
  implicit class RevealOptionsOps[Self <: RevealOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withBg(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withBg_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg_class")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withClose_on_background_click(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_on_background_click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose_on_background_click: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close_on_background_click")(js.undefined)
        ret
    }
    @scala.inline
    def withClosed(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closed")(js.undefined)
        ret
    }
    @scala.inline
    def withCss(value: Close): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(js.undefined)
        ret
    }
    @scala.inline
    def withDismiss_modal_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_modal_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismiss_modal_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismiss_modal_class")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple_opened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple_opened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple_opened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple_opened")(js.undefined)
        ret
    }
    @scala.inline
    def withOn_ajax_error(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_ajax_error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOn_ajax_error: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on_ajax_error")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOpened(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opened")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot_element(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root_element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot_element: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root_element")(js.undefined)
        ret
    }
  }
  
}

