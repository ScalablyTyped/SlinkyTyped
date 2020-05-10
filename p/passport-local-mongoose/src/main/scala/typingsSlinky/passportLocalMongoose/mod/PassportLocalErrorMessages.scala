package typingsSlinky.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportLocalErrorMessages extends js.Object {
  var AttemptTooSoonError: js.UndefOr[String] = js.native
  var IncorrectPasswordError: js.UndefOr[String] = js.native
  var IncorrectUsernameError: js.UndefOr[String] = js.native
  var MissingPasswordError: js.UndefOr[String] = js.native
  var MissingUsernameError: js.UndefOr[String] = js.native
  var NoSaltValueStoredError: js.UndefOr[String] = js.native
  var TooManyAttemptsError: js.UndefOr[String] = js.native
  var UserExistsError: js.UndefOr[String] = js.native
}

object PassportLocalErrorMessages {
  @scala.inline
  def apply(): PassportLocalErrorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassportLocalErrorMessages]
  }
  @scala.inline
  implicit class PassportLocalErrorMessagesOps[Self <: PassportLocalErrorMessages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttemptTooSoonError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttemptTooSoonError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptTooSoonError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttemptTooSoonError")(js.undefined)
        ret
    }
    @scala.inline
    def withIncorrectPasswordError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncorrectPasswordError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncorrectPasswordError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncorrectPasswordError")(js.undefined)
        ret
    }
    @scala.inline
    def withIncorrectUsernameError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncorrectUsernameError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncorrectUsernameError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncorrectUsernameError")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingPasswordError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingPasswordError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingPasswordError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingPasswordError")(js.undefined)
        ret
    }
    @scala.inline
    def withMissingUsernameError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingUsernameError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissingUsernameError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MissingUsernameError")(js.undefined)
        ret
    }
    @scala.inline
    def withNoSaltValueStoredError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSaltValueStoredError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoSaltValueStoredError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoSaltValueStoredError")(js.undefined)
        ret
    }
    @scala.inline
    def withTooManyAttemptsError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TooManyAttemptsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooManyAttemptsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TooManyAttemptsError")(js.undefined)
        ret
    }
    @scala.inline
    def withUserExistsError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserExistsError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserExistsError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserExistsError")(js.undefined)
        ret
    }
  }
  
}

