package typingsSlinky.hcaptchaReactHcaptcha.mod

import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.compact
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.dark
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.invisible
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.light
import typingsSlinky.hcaptchaReactHcaptcha.hcaptchaReactHcaptchaStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HCaptchaProps extends js.Object {
  var languageOverride: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* event */ String, _]] = js.native
  var onExpire: js.UndefOr[js.Function0[_]] = js.native
  var onVerify: js.UndefOr[js.Function1[/* token */ String, _]] = js.native
  var sitekey: String = js.native
  var size: js.UndefOr[normal | compact | invisible] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var theme: js.UndefOr[light | dark] = js.native
}

object HCaptchaProps {
  @scala.inline
  def apply(sitekey: String): HCaptchaProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaProps]
  }
  @scala.inline
  implicit class HCaptchaPropsOps[Self <: HCaptchaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSitekey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageOverride(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* event */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpire(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExpire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpire")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVerify(value: /* token */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerify")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerify")(js.undefined)
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
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: light | dark): Self = {
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
  }
  
}

