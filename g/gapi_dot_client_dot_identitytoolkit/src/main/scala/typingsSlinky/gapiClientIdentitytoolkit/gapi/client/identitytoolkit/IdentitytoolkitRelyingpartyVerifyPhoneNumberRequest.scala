package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest extends js.Object {
  var code: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  /** The session info previously returned by IdentityToolkit-SendVerificationCode. */
  var sessionInfo: js.UndefOr[String] = js.native
  var temporaryProof: js.UndefOr[String] = js.native
  var verificationProof: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPhoneNumberRequestOps[Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
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
    def withSessionInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporaryProof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryProof")(js.undefined)
        ret
    }
    @scala.inline
    def withVerificationProof(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationProof")(js.undefined)
        ret
    }
  }
  
}

