package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecaptchaParamResponse extends js.Object {
  /** The fixed string "identitytoolkit#GetRecaptchaParamResponse". */
  var kind: js.UndefOr[String] = js.native
  /** Site key registered at recaptcha. */
  var recaptchaSiteKey: js.UndefOr[String] = js.native
  /** The stoken field for the recaptcha widget, used to request captcha challenge. */
  var recaptchaStoken: js.UndefOr[String] = js.native
}

object GetRecaptchaParamResponse {
  @scala.inline
  def apply(): GetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRecaptchaParamResponse]
  }
  @scala.inline
  implicit class GetRecaptchaParamResponseOps[Self <: GetRecaptchaParamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withRecaptchaSiteKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaSiteKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecaptchaSiteKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaSiteKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRecaptchaStoken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaStoken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecaptchaStoken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaStoken")(js.undefined)
        ret
    }
  }
  
}

