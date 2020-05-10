package typingsSlinky.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsLambda.awsLambdaStrings.CONFIRMED
import typingsSlinky.awsLambda.awsLambdaStrings.EMAIL
import typingsSlinky.awsLambda.awsLambdaStrings.RESET_REQUIRED
import typingsSlinky.awsLambda.awsLambdaStrings.SMS
import typingsSlinky.awsLambda.awsLambdaStrings.SUPPRESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnswerCorrect extends js.Object {
  var answerCorrect: js.UndefOr[Boolean] = js.native
  var autoConfirmUser: js.UndefOr[Boolean] = js.native
  var autoVerifyEmail: js.UndefOr[Boolean] = js.native
  var autoVerifyPhone: js.UndefOr[Boolean] = js.native
  var challengeMetadata: js.UndefOr[String] = js.native
  var challengeName: js.UndefOr[String] = js.native
  var claimsOverrideDetails: js.UndefOr[AnonClaimsToAddOrOverride] = js.native
  var desiredDeliveryMediums: js.UndefOr[js.Array[EMAIL | SMS]] = js.native
  var emailMessage: js.UndefOr[String] = js.native
  var emailSubject: js.UndefOr[String] = js.native
  var failAuthentication: js.UndefOr[Boolean] = js.native
  var finalUserStatus: js.UndefOr[CONFIRMED | RESET_REQUIRED] = js.native
  var forceAliasCreation: js.UndefOr[Boolean] = js.native
  var issueTokens: js.UndefOr[Boolean] = js.native
  var messageAction: js.UndefOr[SUPPRESS] = js.native
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  var publicChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  var smsMessage: js.UndefOr[String] = js.native
  var userAttributes: js.UndefOr[StringDictionary[String]] = js.native
}

object AnonAnswerCorrect {
  @scala.inline
  def apply(): AnonAnswerCorrect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAnswerCorrect]
  }
  @scala.inline
  implicit class AnonAnswerCorrectOps[Self <: AnonAnswerCorrect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnswerCorrect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerCorrect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnswerCorrect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("answerCorrect")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConfirmUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfirmUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConfirmUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoConfirmUser")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoVerifyEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifyEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoVerifyEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifyEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoVerifyPhone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifyPhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoVerifyPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoVerifyPhone")(js.undefined)
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
    @scala.inline
    def withChallengeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeName")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimsOverrideDetails(value: AnonClaimsToAddOrOverride): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsOverrideDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimsOverrideDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimsOverrideDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withDesiredDeliveryMediums(value: js.Array[EMAIL | SMS]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredDeliveryMediums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredDeliveryMediums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredDeliveryMediums")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSubject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailSubject")(js.undefined)
        ret
    }
    @scala.inline
    def withFailAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalUserStatus(value: CONFIRMED | RESET_REQUIRED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUserStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalUserStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalUserStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAliasCreation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAliasCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAliasCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAliasCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueTokens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueTokens")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageAction(value: SUPPRESS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageAction")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateChallengeParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateChallengeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateChallengeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateChallengeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicChallengeParameters(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicChallengeParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicChallengeParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicChallengeParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSmsMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmsMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smsMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(js.undefined)
        ret
    }
  }
  
}

