package typingsSlinky.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * Optional. The badge location for g-recaptcha with size of "invisible".
    *
    * @default "bottomright"
    */
  var badge: js.UndefOr[Badge] = js.native
  /**
    * Optional. Your callback function that's executed when the user submits a successful CAPTCHA response.
    * The user's response, g-recaptcha-response, will be the input for your callback function.
    */
  var callback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.native
  /**
    * Optional. Your callback function that's executed when reCAPTCHA encounters an error (usually network connectivity) and cannot continue until connectivity is restored.
    * If you specify this function, you are responsible for informing the user that they should retry.
    */
  // Notice to the reader
  // I need to surround this object with quotes, this will however break intellisense in VS 2013.
  var `error-callback`: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional. Your callback function that's executed when the reCAPTCHA response expires and the user needs to solve a new CAPTCHA.
    */
  // Notice to the reader
  // I need to surround this object with quotes, this will however break intellisense in VS 2013.
  var `expired-callback`: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Optional. Invisible reCAPTCHA only. For plugin owners to not interfere with existing reCAPTCHA installations on a page.
    * If true, this reCAPTCHA instance will be part of a separate ID space.
    *
    * @default false
    */
  var isolated: js.UndefOr[Boolean] = js.native
  /**
    * Your sitekey.
    */
  var sitekey: js.UndefOr[String] = js.native
  /**
    * Optional. The size of the widget.
    * Accepted values: "compact", "normal", "invisible".
    * @default "compact"
    */
  var size: js.UndefOr[Size] = js.native
  /**
    * Optional. The tabindex of the widget and challenge.
    * If other elements in your page use tabindex, it should be set to make user navigation easier.
    */
  var tabindex: js.UndefOr[Double] = js.native
  /**
    * Optional. The color theme of the widget.
    * Accepted values: "light", "dark"
    * @default "light"
    */
  var theme: js.UndefOr[Theme] = js.native
  /**
    * Optional. The type of CAPTCHA to serve.
    * Accepted values: "audio", "image"
    * @default "image"
    */
  var `type`: js.UndefOr[Type] = js.native
}

object Parameters {
  @scala.inline
  def apply(): Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameters]
  }
  @scala.inline
  implicit class ParametersOps[Self <: Parameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: Badge): Self = {
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
    def withCallback(value: /* response */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def `withError-callback`(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error-callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def `withoutError-callback`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error-callback")(js.undefined)
        ret
    }
    @scala.inline
    def `withExpired-callback`(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired-callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def `withoutExpired-callback`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expired-callback")(js.undefined)
        ret
    }
    @scala.inline
    def withIsolated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsolated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isolated")(js.undefined)
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
    def withSize(value: Size): Self = {
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
    def withTabindex(value: Double): Self = {
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
    def withTheme(value: Theme): Self = {
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
    def withType(value: Type): Self = {
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
  }
  
}

