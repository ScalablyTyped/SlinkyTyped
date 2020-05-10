package typingsSlinky.neteaseCaptcha.NeteaseCaptcha

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.`zh-CN`
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.embed
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.en
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.float
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.http
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.https
import typingsSlinky.neteaseCaptcha.neteaseCaptchaStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * Verification code id
    */
  var captchaId: String = js.native
  /**
    * Selector string or HTMLElement to render widget into
    */
  var element: String | HTMLElement = js.native
  /**
    * Defaults to 'zh-CN'
    */
  var lang: js.UndefOr[`zh-CN` | en] = js.native
  /**
    * Defaults to 'float' on desktop, and 'popup' on mobile
    */
  var mode: js.UndefOr[float | embed | popup] = js.native
  var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.native
  var onVerify: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ Data, Unit]] = js.native
  /**
    * Defaults to page protocol
    */
  var protocol: js.UndefOr[http | https] = js.native
  /**
    * Defaults to 'auto'
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Config {
  @scala.inline
  def apply(captchaId: String, element: String | HTMLElement): Config = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptchaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: `zh-CN` | en): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: float | embed | popup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReady(value: /* instance */ Instance => Unit): Self = {
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
    @scala.inline
    def withOnVerify(value: (/* error */ js.Any, /* data */ Data) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVerify")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: http | https): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

