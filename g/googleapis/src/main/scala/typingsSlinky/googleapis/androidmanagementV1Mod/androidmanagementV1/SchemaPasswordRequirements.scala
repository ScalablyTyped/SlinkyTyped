package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Requirements for the password used to unlock a device.
  */
@js.native
trait SchemaPasswordRequirements extends js.Object {
  /**
    * Number of incorrect device-unlock passwords that can be entered before a
    * device is wiped. A value of 0 means there is no restriction.
    */
  var maximumFailedPasswordsForWipe: js.UndefOr[Double] = js.native
  /**
    * Password expiration timeout.
    */
  var passwordExpirationTimeout: js.UndefOr[String] = js.native
  /**
    * The length of the password history. After setting this field, the user
    * won&#39;t be able to enter a new password that is the same as any
    * password in the history. A value of 0 means there is no restriction.
    */
  var passwordHistoryLength: js.UndefOr[Double] = js.native
  /**
    * The minimum allowed password length. A value of 0 means there is no
    * restriction. Only enforced when password_quality is NUMERIC,
    * NUMERIC_COMPLEX, ALPHABETIC, ALPHANUMERIC, or COMPLEX.
    */
  var passwordMinimumLength: js.UndefOr[Double] = js.native
  /**
    * Minimum number of letters required in the password. Only enforced when
    * password_quality is COMPLEX.
    */
  var passwordMinimumLetters: js.UndefOr[Double] = js.native
  /**
    * Minimum number of lower case letters required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumLowerCase: js.UndefOr[Double] = js.native
  /**
    * Minimum number of non-letter characters (numerical digits or symbols)
    * required in the password. Only enforced when password_quality is COMPLEX.
    */
  var passwordMinimumNonLetter: js.UndefOr[Double] = js.native
  /**
    * Minimum number of numerical digits required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumNumeric: js.UndefOr[Double] = js.native
  /**
    * Minimum number of symbols required in the password. Only enforced when
    * password_quality is COMPLEX.
    */
  var passwordMinimumSymbols: js.UndefOr[Double] = js.native
  /**
    * Minimum number of upper case letters required in the password. Only
    * enforced when password_quality is COMPLEX.
    */
  var passwordMinimumUpperCase: js.UndefOr[Double] = js.native
  /**
    * The required password quality.
    */
  var passwordQuality: js.UndefOr[String] = js.native
  /**
    * The scope that the password requirement applies to.
    */
  var passwordScope: js.UndefOr[String] = js.native
}

object SchemaPasswordRequirements {
  @scala.inline
  def apply(): SchemaPasswordRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPasswordRequirements]
  }
  @scala.inline
  implicit class SchemaPasswordRequirementsOps[Self <: SchemaPasswordRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumFailedPasswordsForWipe(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFailedPasswordsForWipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumFailedPasswordsForWipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumFailedPasswordsForWipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordExpirationTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpirationTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordExpirationTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordExpirationTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordHistoryLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHistoryLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordHistoryLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordHistoryLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumLetters(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLetters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumLetters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLetters")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumLowerCase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLowerCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumLowerCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumLowerCase")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumNonLetter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumNonLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumNonLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumNonLetter")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumNumeric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumSymbols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordMinimumUpperCase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumUpperCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordMinimumUpperCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordMinimumUpperCase")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordScope")(js.undefined)
        ret
    }
  }
  
}

