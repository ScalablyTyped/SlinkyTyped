package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InBackground extends js.Object {
  var inBackground: js.UndefOr[Boolean] = js.native
  var inNewWindow: js.UndefOr[Boolean] = js.native
  var isPinned: js.UndefOr[Boolean] = js.native
  var onActivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onClose: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onDeactivate: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onPageShow: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var onReady: js.UndefOr[js.Function1[/* tab */ Tab, _]] = js.native
  var url: String = js.native
}

object InBackground {
  @scala.inline
  def apply(url: String): InBackground = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InBackground]
  }
  @scala.inline
  implicit class InBackgroundOps[Self <: InBackground] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withInNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNewWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inNewWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPinned")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* tab */ Tab => _): Self = {
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
    def withOnDeactivate(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeactivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeactivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageShow(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* tab */ Tab => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
  }
  
}

