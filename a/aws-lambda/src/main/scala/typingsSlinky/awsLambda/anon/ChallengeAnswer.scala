package typingsSlinky.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeAnswer extends js.Object {
  var challengeAnswer: js.UndefOr[String] = js.native
  var challengeName: js.UndefOr[String] = js.native
  var clientMetadata: js.UndefOr[StringDictionary[String]] = js.native
  var codeParameter: js.UndefOr[String] = js.native
  var linkParameter: js.UndefOr[String] = js.native
  var newDeviceUsed: js.UndefOr[Boolean] = js.native
  var password: js.UndefOr[String] = js.native
  var privateChallengeParameters: js.UndefOr[StringDictionary[String]] = js.native
  var session: js.UndefOr[js.Array[ChallengeMetadata]] = js.native
  var userAttributes: StringDictionary[String] = js.native
  var userNotFound: js.UndefOr[Boolean] = js.native
  var usernameParameter: js.UndefOr[String] = js.native
  var validationData: js.UndefOr[StringDictionary[String]] = js.native
}

object ChallengeAnswer {
  @scala.inline
  def apply(userAttributes: StringDictionary[String]): ChallengeAnswer = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAnswer]
  }
  @scala.inline
  implicit class ChallengeAnswerOps[Self <: ChallengeAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeAnswer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeAnswer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeAnswer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeAnswer")(js.undefined)
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
    def withClientMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withCodeParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withNewDeviceUsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeviceUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewDeviceUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDeviceUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
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
    def withSession(value: js.Array[ChallengeMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationData(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationData")(js.undefined)
        ret
    }
  }
  
}

