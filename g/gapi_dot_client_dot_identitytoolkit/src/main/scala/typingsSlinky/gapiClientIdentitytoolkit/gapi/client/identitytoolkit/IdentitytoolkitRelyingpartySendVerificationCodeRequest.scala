package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
  /** Receipt of successful app token validation with APNS. */
  var iosReceipt: js.UndefOr[String] = js.native
  /** Secret delivered to iOS app via APNS. */
  var iosSecret: js.UndefOr[String] = js.native
  /** The phone number to send the verification code to in E.164 format. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** Recaptcha solution. */
  var recaptchaToken: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartySendVerificationCodeRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySendVerificationCodeRequestOps[Self <: IdentitytoolkitRelyingpartySendVerificationCodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIosReceipt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosReceipt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosReceipt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosReceipt")(js.undefined)
        ret
    }
    @scala.inline
    def withIosSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRecaptchaToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecaptchaToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recaptchaToken")(js.undefined)
        ret
    }
  }
  
}

