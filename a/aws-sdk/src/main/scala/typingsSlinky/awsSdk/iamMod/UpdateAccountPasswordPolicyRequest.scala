package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAccountPasswordPolicyRequest extends js.Object {
  /**
    *  Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more information, see Letting IAM Users Change Their Own Passwords in the IAM User Guide. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users in the account do not automatically have permissions to change their own password.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.native
  /**
    * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed until an administrator resets the password. If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.native
  /**
    * The number of days that an IAM user password is valid. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM user passwords never expire.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.native
  /**
    * The minimum number of characters allowed in an IAM user password. If you do not specify a value for this parameter, then the operation uses the default value of 6.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.native
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing. If you do not specify a value for this parameter, then the operation uses the default value of 0. The result is that IAM users are not prevented from reusing previous passwords.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin alphabet (a to z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one lowercase character.
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one numeric character.
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | ' If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one symbol character.
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.native
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin alphabet (A to Z). If you do not specify a value for this parameter, then the operation uses the default value of false. The result is that passwords do not require at least one uppercase character.
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.native
}

object UpdateAccountPasswordPolicyRequest {
  @scala.inline
  def apply(): UpdateAccountPasswordPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountPasswordPolicyRequest]
  }
  @scala.inline
  implicit class UpdateAccountPasswordPolicyRequestOps[Self <: UpdateAccountPasswordPolicyRequest] (val x: Self) extends AnyVal {
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

