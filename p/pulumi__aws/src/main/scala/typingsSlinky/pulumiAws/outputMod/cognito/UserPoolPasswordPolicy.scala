package typingsSlinky.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolPasswordPolicy extends js.Object {
  /**
    * The minimum length of the password policy that you have set.
    */
  var minimumLength: js.UndefOr[Double] = js.native
  /**
    * Whether you have required users to use at least one lowercase letter in their password.
    */
  var requireLowercase: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one number in their password.
    */
  var requireNumbers: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one symbol in their password.
    */
  var requireSymbols: js.UndefOr[Boolean] = js.native
  /**
    * Whether you have required users to use at least one uppercase letter in their password.
    */
  var requireUppercase: js.UndefOr[Boolean] = js.native
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
    */
  var temporaryPasswordValidityDays: js.UndefOr[Double] = js.native
}

object UserPoolPasswordPolicy {
  @scala.inline
  def apply(): UserPoolPasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolPasswordPolicy]
  }
  @scala.inline
  implicit class UserPoolPasswordPolicyOps[Self <: UserPoolPasswordPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireLowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireLowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireLowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSymbols(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireUppercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireUppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireUppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporaryPasswordValidityDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryPasswordValidityDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryPasswordValidityDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("temporaryPasswordValidityDays")(js.undefined)
        ret
    }
  }
  
}

