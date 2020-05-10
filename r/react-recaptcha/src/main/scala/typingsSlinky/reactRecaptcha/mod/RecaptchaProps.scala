package typingsSlinky.reactRecaptcha.mod

import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.audio
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.compact
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.dark
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.image
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.light
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.normal
import typingsSlinky.reactRecaptcha.reactRecaptchaStrings.onload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecaptchaProps extends js.Object {
  var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.native
  var className: js.UndefOr[String] = js.native
  var elementID: js.UndefOr[String] = js.native
  var expiredCallback: js.UndefOr[js.Function0[_]] = js.native
  var expiredCallbackName: js.UndefOr[String] = js.native
  var hl: js.UndefOr[String] = js.native
  var onloadCallback: js.UndefOr[js.Function0[_]] = js.native
  var onloadCallbackName: js.UndefOr[String] = js.native
  var render: js.UndefOr[onload | explicit] = js.native
  var sitekey: js.UndefOr[String] = js.native
  var size: js.UndefOr[normal | compact | invisible] = js.native
  var tabindex: js.UndefOr[Double | String] = js.native
  var theme: js.UndefOr[dark | light] = js.native
  var `type`: js.UndefOr[audio | image] = js.native
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, _]] = js.native
  var verifyCallbackName: js.UndefOr[String] = js.native
}

object RecaptchaProps {
  @scala.inline
  def apply(): RecaptchaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecaptchaProps]
  }
  @scala.inline
  implicit class RecaptchaPropsOps[Self <: RecaptchaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: bottomright | bottomleft | `inline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
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
    def withElementID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementID")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExpiredCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiredCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredCallbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiredCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiredCallbackName")(js.undefined)
        ret
    }
    @scala.inline
    def withHl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnloadCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withOnloadCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadCallbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnloadCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onloadCallbackName")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: onload | explicit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSitekey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSitekey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitekey")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: normal | compact | invisible): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: dark | light): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: audio | image): Self = {
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
    def withVerifyCallback(value: /* response */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutVerifyCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyCallbackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCallbackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyCallbackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyCallbackName")(js.undefined)
        ret
    }
  }
  
}

