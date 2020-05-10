package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordPolicyType extends js.Object {
  /**
    * The minimum length of the password policy that you have set. Cannot be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.native
  /**
    * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.  When you set TemporaryPasswordValidityDays for a user pool, you will no longer be able to set the deprecated UnusedAccountValidityDays value for that user pool. 
    */
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.native
}

object PasswordPolicyType {
  @scala.inline
  def apply(): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicyType]
  }
  @scala.inline
  implicit class PasswordPolicyTypeOps[Self <: PasswordPolicyType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimumLength(value: PasswordPolicyMinLengthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireLowercase(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireLowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireLowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireLowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireNumbers(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireSymbols(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireSymbols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireSymbols: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireSymbols")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireUppercase(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireUppercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireUppercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireUppercase")(js.undefined)
        ret
    }
    @scala.inline
    def withTemporaryPasswordValidityDays(value: TemporaryPasswordValidityDaysType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporaryPasswordValidityDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemporaryPasswordValidityDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemporaryPasswordValidityDays")(js.undefined)
        ret
    }
  }
  
}

