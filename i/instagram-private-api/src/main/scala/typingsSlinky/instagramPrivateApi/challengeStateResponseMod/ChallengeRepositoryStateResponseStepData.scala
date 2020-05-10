package typingsSlinky.instagramPrivateApi.challengeStateResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeRepositoryStateResponseStepData extends js.Object {
  var big_blue_token: String = js.native
  var choice: String = js.native
  var contact_point: String = js.native
  var email: String = js.native
  var fb_access_token: String = js.native
  var form_type: String = js.native
  var google_oauth_token: String = js.native
  var resend_delay: Double = js.native
  var security_code: String = js.native
}

object ChallengeRepositoryStateResponseStepData {
  @scala.inline
  def apply(
    big_blue_token: String,
    choice: String,
    contact_point: String,
    email: String,
    fb_access_token: String,
    form_type: String,
    google_oauth_token: String,
    resend_delay: Double,
    security_code: String
  ): ChallengeRepositoryStateResponseStepData = {
    val __obj = js.Dynamic.literal(big_blue_token = big_blue_token.asInstanceOf[js.Any], choice = choice.asInstanceOf[js.Any], contact_point = contact_point.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fb_access_token = fb_access_token.asInstanceOf[js.Any], form_type = form_type.asInstanceOf[js.Any], google_oauth_token = google_oauth_token.asInstanceOf[js.Any], resend_delay = resend_delay.asInstanceOf[js.Any], security_code = security_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeRepositoryStateResponseStepData]
  }
  @scala.inline
  implicit class ChallengeRepositoryStateResponseStepDataOps[Self <: ChallengeRepositoryStateResponseStepData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBig_blue_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("big_blue_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContact_point(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFb_access_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fb_access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogle_oauth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("google_oauth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResend_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resend_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurity_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security_code")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

