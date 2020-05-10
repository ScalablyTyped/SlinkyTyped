package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse extends js.Object {
  var expiresIn: js.UndefOr[String] = js.native
  var idToken: js.UndefOr[String] = js.native
  var isNewUser: js.UndefOr[Boolean] = js.native
  var localId: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var refreshToken: js.UndefOr[String] = js.native
  var temporaryProof: js.UndefOr[String] = js.native
  var temporaryProofExpiresIn: js.UndefOr[String] = js.native
  var verificationProof: js.UndefOr[String] = js.native
  var verificationProofExpiresIn: js.UndefOr[String] = js.native
}

object IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse {
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse]
  }
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyPhoneNumberResponseOps[Self <: IdentitytoolkitRelyingpartyVerifyPhoneNumberResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiresIn")(js.undefined)
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
    def withIsNewUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNewUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNewUser")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(js.undefined)
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
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(js.undefined)
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
    def withTemporaryProofExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryProofExpiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryProofExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryProofExpiresIn")(js.undefined)
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
    @scala.inline
    def withVerificationProofExpiresIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationProofExpiresIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerificationProofExpiresIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verificationProofExpiresIn")(js.undefined)
        ret
    }
  }
  
}

