package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateSoftwareTokenResponse extends js.Object {
  /**
    * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
    */
  var SecretCode: js.UndefOr[SecretCodeType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
    */
  var Session: js.UndefOr[SessionType] = js.native
}

object AssociateSoftwareTokenResponse {
  @scala.inline
  def apply(): AssociateSoftwareTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSoftwareTokenResponse]
  }
  @scala.inline
  implicit class AssociateSoftwareTokenResponseOps[Self <: AssociateSoftwareTokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretCode(value: SecretCodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: SessionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(js.undefined)
        ret
    }
  }
  
}

