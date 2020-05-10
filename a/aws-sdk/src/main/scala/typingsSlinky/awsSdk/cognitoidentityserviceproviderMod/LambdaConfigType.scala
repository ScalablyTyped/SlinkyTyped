package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaConfigType extends js.Object {
  /**
    * Creates an authentication challenge.
    */
  var CreateAuthChallenge: js.UndefOr[ArnType] = js.native
  /**
    * A custom Message AWS Lambda trigger.
    */
  var CustomMessage: js.UndefOr[ArnType] = js.native
  /**
    * Defines the authentication challenge.
    */
  var DefineAuthChallenge: js.UndefOr[ArnType] = js.native
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var PostAuthentication: js.UndefOr[ArnType] = js.native
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var PostConfirmation: js.UndefOr[ArnType] = js.native
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var PreAuthentication: js.UndefOr[ArnType] = js.native
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var PreSignUp: js.UndefOr[ArnType] = js.native
  /**
    * A Lambda trigger that is invoked before token generation.
    */
  var PreTokenGeneration: js.UndefOr[ArnType] = js.native
  /**
    * The user migration Lambda config type.
    */
  var UserMigration: js.UndefOr[ArnType] = js.native
  /**
    * Verifies the authentication challenge response.
    */
  var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.native
}

object LambdaConfigType {
  @scala.inline
  def apply(): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConfigType]
  }
  @scala.inline
  implicit class LambdaConfigTypeOps[Self <: LambdaConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAuthChallenge(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAuthChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateAuthChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateAuthChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomMessage(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDefineAuthChallenge(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefineAuthChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefineAuthChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefineAuthChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withPostAuthentication(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withPostConfirmation(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostConfirmation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostConfirmation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PostConfirmation")(js.undefined)
        ret
    }
    @scala.inline
    def withPreAuthentication(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withPreSignUp(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSignUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreSignUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreSignUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPreTokenGeneration(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreTokenGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreTokenGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreTokenGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMigration(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMigration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMigration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMigration")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyAuthChallengeResponse(value: ArnType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyAuthChallengeResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyAuthChallengeResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerifyAuthChallengeResponse")(js.undefined)
        ret
    }
  }
  
}

