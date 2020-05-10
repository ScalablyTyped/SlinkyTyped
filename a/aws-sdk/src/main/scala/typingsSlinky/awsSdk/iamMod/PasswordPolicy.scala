package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordPolicy extends js.Object {
  /**
    * Specifies whether IAM users are allowed to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.native
  /**
    * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
    */
  var ExpirePasswords: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM users are prevented from setting a new password after their password has expired.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.native
  /**
    * The number of days that an IAM user password is valid.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.native
  /**
    * Minimum length to require for IAM user passwords.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.native
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.native
  /**
    * Specifies whether to require lowercase characters for IAM user passwords.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require numbers for IAM user passwords.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require symbols for IAM user passwords.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether to require uppercase characters for IAM user passwords.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.native
}

object PasswordPolicy {
  @scala.inline
  def apply(): PasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicy]
  }
  @scala.inline
  implicit class PasswordPolicyOps[Self <: PasswordPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUsersToChangePassword(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUsersToChangePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUsersToChangePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowUsersToChangePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirePasswords(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirePasswords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirePasswords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirePasswords")(js.undefined)
        ret
    }
    @scala.inline
    def withHardExpiry(value: booleanObjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HardExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HardExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPasswordAge(value: maxPasswordAgeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPasswordAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPasswordAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxPasswordAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumPasswordLength(value: minimumPasswordLengthType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumPasswordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPasswordLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumPasswordLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordReusePrevention(value: passwordReusePreventionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordReusePrevention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordReusePrevention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordReusePrevention")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireLowercaseCharacters(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireLowercaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireLowercaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireLowercaseCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireNumbers(value: booleanType): Self = {
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
    def withRequireSymbols(value: booleanType): Self = {
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
    def withRequireUppercaseCharacters(value: booleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireUppercaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireUppercaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireUppercaseCharacters")(js.undefined)
        ret
    }
  }
  
}

