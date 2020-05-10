package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateAuthResponse extends js.Object {
  /**
    * The result of the authentication response. This is only returned if the caller does not need to pass another challenge. If the caller does need to pass another challenge before it gets tokens, ChallengeName, ChallengeParameters, and Session are returned.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.native
  /**
    * The name of the challenge which you are responding to with this call. This is returned to you in the AdminInitiateAuth response if you need to pass another challenge. Valid values include the following. Note that all of these challenges require USERNAME and SECRET_HASH (if applicable) in the parameters.    SMS_MFA: Next challenge is to supply an SMS_MFA_CODE, delivered via SMS.    PASSWORD_VERIFIER: Next challenge is to supply PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, and TIMESTAMP after the client-side SRP calculations.    CUSTOM_CHALLENGE: This is returned if your custom authentication flow determines that the user should pass another challenge before tokens are issued.    DEVICE_SRP_AUTH: If device tracking was enabled on your user pool and the previous challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.    DEVICE_PASSWORD_VERIFIER: Similar to PASSWORD_VERIFIER, but for devices only.    NEW_PASSWORD_REQUIRED: For users which are required to change their passwords after successful first login. This challenge should be passed with NEW_PASSWORD and any other required attributes.  
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.native
  /**
    * The challenge parameters. These are returned to you in the InitiateAuth response if you need to pass another challenge. The responses in this parameter should be used to compute inputs to the next call (RespondToAuthChallenge).  All challenges require USERNAME and SECRET_HASH (if applicable).
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
}

object InitiateAuthResponse {
  @scala.inline
  def apply(): InitiateAuthResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateAuthResponse]
  }
  @scala.inline
  implicit class InitiateAuthResponseOps[Self <: InitiateAuthResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationResult(value: AuthenticationResultType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationResult")(js.undefined)
        ret
    }
    @scala.inline
    def withChallengeName(value: ChallengeNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeName")(js.undefined)
        ret
    }
    @scala.inline
    def withChallengeParameters(value: ChallengeParametersType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeParameters")(js.undefined)
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

