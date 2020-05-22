package typingsSlinky.awsLambda.anon

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

trait ChallengeMetadata extends js.Object {
  var challengeMetadata: js.UndefOr[String] = js.undefined
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
  var challengeResult: Boolean
}

object ChallengeMetadata {
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A,
    challengeResult: Boolean,
    challengeMetadata: String = null
  ): ChallengeMetadata = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    if (challengeMetadata != null) __obj.updateDynamic("challengeMetadata")(challengeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeMetadata]
  }
}

