package typingsSlinky.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassportLocalOptions extends js.Object {
  var attemptsField: js.UndefOr[String] = js.native
  var digestAlgorithm: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.native
  var hashField: js.UndefOr[String] = js.native
  var interval: js.UndefOr[Double] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var keylen: js.UndefOr[Double] = js.native
  var lastLoginField: js.UndefOr[String] = js.native
  var limitAttempts: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var maxInterval: js.UndefOr[Double] = js.native
  var passwordValidator: js.UndefOr[
    js.Function2[/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  var populateFields: js.UndefOr[String] = js.native
  var saltField: js.UndefOr[String] = js.native
  var saltlen: js.UndefOr[Double] = js.native
  var selectFields: js.UndefOr[String] = js.native
  var usernameField: js.UndefOr[String] = js.native
  var usernameLowerCase: js.UndefOr[Boolean] = js.native
  var usernameQueryFields: js.Array[String] = js.native
  var usernameUnique: js.UndefOr[Boolean] = js.native
}

object PassportLocalOptions {
  @scala.inline
  def apply(usernameQueryFields: js.Array[String]): PassportLocalOptions = {
    val __obj = js.Dynamic.literal(usernameQueryFields = usernameQueryFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportLocalOptions]
  }
  @scala.inline
  implicit class PassportLocalOptionsOps[Self <: PassportLocalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsernameQueryFields(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameQueryFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttemptsField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttemptsField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attemptsField")(js.undefined)
        ret
    }
    @scala.inline
    def withDigestAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDigestAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("digestAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessages(value: PassportLocalErrorMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withHashField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHashField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashField")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withKeylen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keylen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeylen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keylen")(js.undefined)
        ret
    }
    @scala.inline
    def withLastLoginField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastLoginField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastLoginField")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitAttempts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordValidator(value: (/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordValidator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPasswordValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordValidator")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulateFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulateFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populateFields")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltField")(js.undefined)
        ret
    }
    @scala.inline
    def withSaltlen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltlen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaltlen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltlen")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFields(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFields")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameField")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameLowerCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameLowerCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameLowerCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameLowerCase")(js.undefined)
        ret
    }
    @scala.inline
    def withUsernameUnique(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameUnique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsernameUnique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernameUnique")(js.undefined)
        ret
    }
  }
  
}

