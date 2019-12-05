package typingsSlinky.awsDashLambda.awsDashLambdaMod

import typingsSlinky.awsDashLambda.Anon_AnswerCorrect
import typingsSlinky.awsDashLambda.Anon_AwsSdkVersion
import typingsSlinky.awsDashLambda.Anon_ChallengeAnswer
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CreateAuthChallenge_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_AdminCreateUser
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_ForgotPassword
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_ResendCode
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_SignUp
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_UpdateUserAttribute
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.CustomMessage_VerifyUserAttribute
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.DefineAuthChallenge_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PostAuthentication_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PostConfirmation_ConfirmSignUp
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PreAuthentication_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PreSignUp_AdminCreateUser
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PreSignUp_ExternalProvider
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.PreSignUp_SignUp
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.TokenGeneration_AuthenticateDevice
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.TokenGeneration_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.TokenGeneration_HostedAuth
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.TokenGeneration_NewPasswordChallenge
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.TokenGeneration_RefreshTokens
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.UserMigration_Authentication
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.UserMigration_ForgotPassword
import typingsSlinky.awsDashLambda.awsDashLambdaStrings.VerifyAuthChallengeResponse_Authentication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoUserPoolTriggerEvent extends js.Object {
  var callerContext: Anon_AwsSdkVersion
  var region: String
  var request: Anon_ChallengeAnswer
  var response: Anon_AnswerCorrect
  var triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
  var userName: js.UndefOr[String] = js.undefined
  var userPoolId: String
  var version: Double
}

object CognitoUserPoolTriggerEvent {
  @scala.inline
  def apply(
    callerContext: Anon_AwsSdkVersion,
    region: String,
    request: Anon_ChallengeAnswer,
    response: Anon_AnswerCorrect,
    triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword,
    userPoolId: String,
    version: Double,
    userName: String = null
  ): CognitoUserPoolTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
  }
}

