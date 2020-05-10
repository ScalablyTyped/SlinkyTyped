package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifySoftwareTokenRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: js.UndefOr[TokenModelType] = js.native
  /**
    * The friendly device name.
    */
  var FriendlyDeviceName: js.UndefOr[StringType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * The one time password computed using the secret code returned by 
    */
  var UserCode: SoftwareTokenMFAUserCodeType = js.native
}

object VerifySoftwareTokenRequest {
  @scala.inline
  def apply(UserCode: SoftwareTokenMFAUserCodeType): VerifySoftwareTokenRequest = {
    val __obj = js.Dynamic.literal(UserCode = UserCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySoftwareTokenRequest]
  }
  @scala.inline
  implicit class VerifySoftwareTokenRequestOps[Self <: VerifySoftwareTokenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserCode(value: SoftwareTokenMFAUserCodeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendlyDeviceName(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FriendlyDeviceName")(js.undefined)
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

