package typingsSlinky.reactRecaptchaV3.mod.ReCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCaptchaProps extends js.Object {
  var action: String = js.native
  var elementID: js.UndefOr[String] = js.native
  var sitekey: String = js.native
  var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
  var verifyCallbackName: js.UndefOr[String] = js.native
}

object ReCaptchaProps {
  @scala.inline
  def apply(action: String, sitekey: String): ReCaptchaProps = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCaptchaProps]
  }
  @scala.inline
  implicit class ReCaptchaPropsOps[Self <: ReCaptchaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSitekey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitekey")(value.asInstanceOf[js.Any])
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
    def withVerifyCallback(value: /* response */ String => Unit): Self = {
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

