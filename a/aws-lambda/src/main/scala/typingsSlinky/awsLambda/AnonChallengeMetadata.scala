package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
import typingsSlinky.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import typingsSlinky.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typingsSlinky.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
import typingsSlinky.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
import typingsSlinky.awsLambda.awsLambdaStrings.SMS_MFA
import typingsSlinky.awsLambda.awsLambdaStrings.SRP_A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChallengeMetadata extends js.Object {
  var challengeMetadata: js.UndefOr[String] = js.native
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A = js.native
  var challengeResult: Boolean = js.native
}

object AnonChallengeMetadata {
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A,
    challengeResult: Boolean
  ): AnonChallengeMetadata = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChallengeMetadata]
  }
  @scala.inline
  implicit class AnonChallengeMetadataOps[Self <: AnonChallengeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeName(
      value: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeMetadata(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeMetadata")(js.undefined)
        ret
    }
  }
  
}

