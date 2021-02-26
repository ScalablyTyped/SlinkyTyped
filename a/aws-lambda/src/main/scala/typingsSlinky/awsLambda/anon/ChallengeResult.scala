package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.ADMIN_NO_SRP_AUTH
import typingsSlinky.awsLambda.awsLambdaStrings.CUSTOM_CHALLENGE
import typingsSlinky.awsLambda.awsLambdaStrings.DEVICE_PASSWORD_VERIFIER
import typingsSlinky.awsLambda.awsLambdaStrings.DEVICE_SRP_AUTH
import typingsSlinky.awsLambda.awsLambdaStrings.PASSWORD_VERIFIER
import typingsSlinky.awsLambda.awsLambdaStrings.SMS_MFA
import typingsSlinky.awsLambda.awsLambdaStrings.SRP_A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeResult extends StObject {
  
  var challengeMetadata: js.UndefOr[String] = js.native
  
  var challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A = js.native
  
  var challengeResult: Boolean = js.native
}
object ChallengeResult {
  
  @scala.inline
  def apply(
    challengeName: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A,
    challengeResult: Boolean
  ): ChallengeResult = {
    val __obj = js.Dynamic.literal(challengeName = challengeName.asInstanceOf[js.Any], challengeResult = challengeResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeResult]
  }
  
  @scala.inline
  implicit class ChallengeResultMutableBuilder[Self <: ChallengeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeMetadata(value: String): Self = StObject.set(x, "challengeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeMetadataUndefined: Self = StObject.set(x, "challengeMetadata", js.undefined)
    
    @scala.inline
    def setChallengeName(
      value: CUSTOM_CHALLENGE | PASSWORD_VERIFIER | SMS_MFA | DEVICE_SRP_AUTH | DEVICE_PASSWORD_VERIFIER | ADMIN_NO_SRP_AUTH | SRP_A
    ): Self = StObject.set(x, "challengeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeResult(value: Boolean): Self = StObject.set(x, "challengeResult", value.asInstanceOf[js.Any])
  }
}
