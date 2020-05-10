package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolLambdaConfig extends js.Object {
  /**
    * The ARN of the lambda creating an authentication challenge.
    */
  var createAuthChallenge: js.UndefOr[Input[String]] = js.native
  /**
    * A custom Message AWS Lambda trigger.
    */
  var customMessage: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the authentication challenge.
    */
  var defineAuthChallenge: js.UndefOr[Input[String]] = js.native
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var postAuthentication: js.UndefOr[Input[String]] = js.native
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var postConfirmation: js.UndefOr[Input[String]] = js.native
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var preAuthentication: js.UndefOr[Input[String]] = js.native
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var preSignUp: js.UndefOr[Input[String]] = js.native
  /**
    * Allow to customize identity token claims before token generation.
    */
  var preTokenGeneration: js.UndefOr[Input[String]] = js.native
  /**
    * The user migration Lambda config type.
    */
  var userMigration: js.UndefOr[Input[String]] = js.native
  /**
    * Verifies the authentication challenge response.
    */
  var verifyAuthChallengeResponse: js.UndefOr[Input[String]] = js.native
}

object UserPoolLambdaConfig {
  @scala.inline
  def apply(): UserPoolLambdaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolLambdaConfig]
  }
  @scala.inline
  implicit class UserPoolLambdaConfigOps[Self <: UserPoolLambdaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAuthChallenge(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateAuthChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAuthChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMessage(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefineAuthChallenge(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineAuthChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefineAuthChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineAuthChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withPostAuthentication(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withPostConfirmation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreAuthentication(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSignUp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSignUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreSignUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preSignUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTokenGeneration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTokenGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreTokenGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preTokenGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMigration(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMigration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMigration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMigration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyAuthChallengeResponse(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAuthChallengeResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyAuthChallengeResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAuthChallengeResponse")(js.undefined)
        ret
    }
  }
  
}

