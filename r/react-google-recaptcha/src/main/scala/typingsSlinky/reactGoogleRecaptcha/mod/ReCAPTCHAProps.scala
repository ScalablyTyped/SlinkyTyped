package typingsSlinky.reactGoogleRecaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReCAPTCHAProps extends js.Object {
  /**
  	 * Optional. The badge location for g-recaptcha with size of "invisible".
  	 *
  	 * @default "bottomright"
  	 */
  var badge: js.UndefOr[Badge] = js.native
  /**
    *  if you are using the barebone component you need to provide access  to the google grecaptcha object.
    */
  var grecaptcha: js.UndefOr[js.Object] = js.native
  /**
  	 *  Optional. Forces the widget to render in a specific language. Auto-detects the user's language if unspecified.
  	 */
  var hl: js.UndefOr[String] = js.native
  /**
  	 *  The function to be called when the user successfully completes the normal or compat captcha.
  	 * 	It will also be called with null, when captcha expires
  	 *  @param token string or null
  	 */
  var onChange: js.UndefOr[js.Function1[/* token */ String | Null, Unit]] = js.native
  /**
  	 *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
  	 *  and cannot continue until connectivity is restored. If you specify a function here, you are
  	 *  responsible for informing the user that they should retry.
  	 */
  var onErrored: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  	 *  Optional callback, called when a challenge expires and has to be redone by the user.
  	 */
  var onExpired: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  	 *  The API client key
  	 */
  var sitekey: String = js.native
  /**
  	 *  Optional compact, normal or invisible. This allows you to change the size or do an invisible captcha
  	 */
  var size: js.UndefOr[Size] = js.native
  /**
  	 *  Optional set the stoken parameter, which allows the captcha to be used from different domains,
  	 *  @see reCAPTCHA secure-token
  	 */
  var stoken: js.UndefOr[String] = js.native
  /**
  	 *  Optional the tabindex of the element
  	 *  @default 0
  	 */
  var tabindex: js.UndefOr[Double] = js.native
  /**
  	 *  Optional light or dark theme of the widget
  	 *  @default "light"
  	 */
  var theme: js.UndefOr[Theme] = js.native
  /**
  	 * Optional image or audio The type of initial captcha
  	 * @default "image"
  	 */
  var `type`: js.UndefOr[Type] = js.native
}

object ReCAPTCHAProps {
  @scala.inline
  def apply(sitekey: String): ReCAPTCHAProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReCAPTCHAProps]
  }
  @scala.inline
  implicit class ReCAPTCHAPropsOps[Self <: ReCAPTCHAProps] (val x: Self) extends AnyVal {
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
    def withGrecaptcha(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grecaptcha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrecaptcha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grecaptcha")(js.undefined)
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
    def withOnChange(value: /* token */ String | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrored(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrored")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnErrored: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrored")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpired(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpired")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExpired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpired")(js.undefined)
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
    def withStoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoken")(js.undefined)
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

