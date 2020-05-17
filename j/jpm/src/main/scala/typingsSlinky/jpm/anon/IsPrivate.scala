package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsPrivate extends js.Object {
  var isPrivate: js.UndefOr[Boolean] = js.native
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  var url: String = js.native
}

object IsPrivate {
  @scala.inline
  def apply(url: String): IsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrivate]
  }
  @scala.inline
  implicit class IsPrivateOps[Self <: IsPrivate] (val x: Self) extends AnyVal {
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
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActivate(value: /* window */ BrowserWindow => _): Self = {
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
    def withOnClose(value: /* window */ BrowserWindow => _): Self = {
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
    def withOnDeactivate(value: /* window */ BrowserWindow => _): Self = {
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
    def withOnOpen(value: /* window */ BrowserWindow => _): Self = {
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
  }
  
}

