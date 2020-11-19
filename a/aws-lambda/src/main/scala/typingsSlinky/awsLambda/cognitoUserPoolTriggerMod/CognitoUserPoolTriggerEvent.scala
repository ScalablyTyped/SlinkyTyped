package typingsSlinky.awsLambda.cognitoUserPoolTriggerMod

import typingsSlinky.awsLambda.anon.AnswerCorrect
import typingsSlinky.awsLambda.anon.AwsSdkVersion
import typingsSlinky.awsLambda.anon.ChallengeAnswer
import typingsSlinky.awsLambda.awsLambdaStrings.CreateAuthChallenge_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_ResendCode
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_SignUp
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute
import typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute
import typingsSlinky.awsLambda.awsLambdaStrings.DefineAuthChallenge_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp
import typingsSlinky.awsLambda.awsLambdaStrings.PreAuthentication_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser
import typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider
import typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_SignUp
import typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice
import typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth
import typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge
import typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens
import typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typingsSlinky.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoUserPoolTriggerEvent extends js.Object {
  
  var callerContext: AwsSdkVersion = js.native
  
  var region: String = js.native
  
  var request: ChallengeAnswer = js.native
  
  var response: AnswerCorrect = js.native
  
  var triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword = js.native
  
  var userName: js.UndefOr[String] = js.native
  
  var userPoolId: String = js.native
  
  var version: Double = js.native
}
object CognitoUserPoolTriggerEvent {
  
  @scala.inline
  def apply(
    callerContext: AwsSdkVersion,
    region: String,
    request: ChallengeAnswer,
    response: AnswerCorrect,
    triggerSource: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword,
    userPoolId: String,
    version: Double
  ): CognitoUserPoolTriggerEvent = {
    val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPoolTriggerEvent]
  }
  
  @scala.inline
  implicit class CognitoUserPoolTriggerEventOps[Self <: CognitoUserPoolTriggerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallerContext(value: AwsSdkVersion): Self = this.set("callerContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChallengeAnswer): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: AnswerCorrect): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSource(
      value: PreSignUp_SignUp | PreSignUp_ExternalProvider | PostConfirmation_ConfirmSignUp | PreAuthentication_Authentication | PostAuthentication_Authentication | CustomMessage_SignUp | CustomMessage_AdminCreateUser | CustomMessage_ResendCode | CustomMessage_ForgotPassword | CustomMessage_UpdateUserAttribute | CustomMessage_VerifyUserAttribute | CustomMessage_Authentication | DefineAuthChallenge_Authentication | CreateAuthChallenge_Authentication | VerifyAuthChallengeResponse_Authentication | PreSignUp_AdminCreateUser | PostConfirmation_ConfirmForgotPassword | TokenGeneration_HostedAuth | TokenGeneration_Authentication | TokenGeneration_NewPasswordChallenge | TokenGeneration_AuthenticateDevice | TokenGeneration_RefreshTokens | UserMigration_Authentication | UserMigration_ForgotPassword
    ): Self = this.set("triggerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
