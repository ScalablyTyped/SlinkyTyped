package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RespondToAuthChallengeResponse extends js.Object {
  /**
    * The result returned by the server in response to the request to respond to the authentication challenge.
    */
  var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.native
  /**
    * The challenge name. For more information, see .
    */
  var ChallengeName: js.UndefOr[ChallengeNameType] = js.native
  /**
    * The challenge parameters. For more information, see .
    */
  var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
}

object RespondToAuthChallengeResponse {
  @scala.inline
  def apply(): RespondToAuthChallengeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RespondToAuthChallengeResponse]
  }
  @scala.inline
  implicit class RespondToAuthChallengeResponseOps[Self <: RespondToAuthChallengeResponse] (val x: Self) extends AnyVal {
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

