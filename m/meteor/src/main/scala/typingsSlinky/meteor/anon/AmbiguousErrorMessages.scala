package typingsSlinky.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmbiguousErrorMessages extends js.Object {
  var ambiguousErrorMessages: js.UndefOr[Boolean] = js.native
  var forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
  var loginExpirationInDays: js.UndefOr[Double] = js.native
  var oauthSecretKey: js.UndefOr[String] = js.native
  var passwordEnrollTokenExpirationInDays: js.UndefOr[Double] = js.native
  var passwordResetTokenExpirationInDays: js.UndefOr[Double] = js.native
  var restrictCreationByEmailDomain: js.UndefOr[String | js.Function] = js.native
  var sendVerificationEmail: js.UndefOr[Boolean] = js.native
}

object AmbiguousErrorMessages {
  @scala.inline
  def apply(): AmbiguousErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmbiguousErrorMessages]
  }
  @scala.inline
  implicit class AmbiguousErrorMessagesOps[Self <: AmbiguousErrorMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmbiguousErrorMessages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousErrorMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmbiguousErrorMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ambiguousErrorMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withForbidClientAccountCreation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidClientAccountCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbidClientAccountCreation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbidClientAccountCreation")(js.undefined)
        ret
    }
    @scala.inline
    def withLoginExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginExpirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoginExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loginExpirationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthSecretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthSecretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordEnrollTokenExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordEnrollTokenExpirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordEnrollTokenExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordEnrollTokenExpirationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordResetTokenExpirationInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordResetTokenExpirationInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordResetTokenExpirationInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordResetTokenExpirationInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictCreationByEmailDomain(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictCreationByEmailDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictCreationByEmailDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictCreationByEmailDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withSendVerificationEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVerificationEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendVerificationEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendVerificationEmail")(js.undefined)
        ret
    }
  }
  
}

