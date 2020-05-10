package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeResponseType extends js.Object {
  /**
    * The challenge name
    */
  var ChallengeName: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ChallengeName] = js.native
  /**
    * The challenge response.
    */
  var ChallengeResponse: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponse] = js.native
}

object ChallengeResponseType {
  @scala.inline
  def apply(): ChallengeResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeResponseType]
  }
  @scala.inline
  implicit class ChallengeResponseTypeOps[Self <: ChallengeResponseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeName(value: ChallengeName): Self = {
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
    def withChallengeResponse(value: ChallengeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChallengeResponse")(js.undefined)
        ret
    }
  }
  
}

