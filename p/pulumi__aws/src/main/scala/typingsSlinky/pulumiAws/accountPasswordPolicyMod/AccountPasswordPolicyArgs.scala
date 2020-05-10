package typingsSlinky.pulumiAws.accountPasswordPolicyMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPasswordPolicyArgs extends js.Object {
  /**
    * Whether to allow users to change their own password
    */
  val allowUsersToChangePassword: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether users are prevented from setting a new password after their password has expired
    * (i.e. require administrator reset)
    */
  val hardExpiry: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The number of days that an user password is valid.
    */
  val maxPasswordAge: js.UndefOr[Input[Double]] = js.native
  /**
    * Minimum length to require for user passwords.
    */
  val minimumPasswordLength: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of previous passwords that users are prevented from reusing.
    */
  val passwordReusePrevention: js.UndefOr[Input[Double]] = js.native
  /**
    * Whether to require lowercase characters for user passwords.
    */
  val requireLowercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to require numbers for user passwords.
    */
  val requireNumbers: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to require symbols for user passwords.
    */
  val requireSymbols: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether to require uppercase characters for user passwords.
    */
  val requireUppercaseCharacters: js.UndefOr[Input[Boolean]] = js.native
}

object AccountPasswordPolicyArgs {
  @scala.inline
  def apply(): AccountPasswordPolicyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordPolicyArgs]
  }
  @scala.inline
  implicit class AccountPasswordPolicyArgsOps[Self <: AccountPasswordPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowUsersToChangePassword(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUsersToChangePassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUsersToChangePassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUsersToChangePassword")(js.undefined)
        ret
    }
    @scala.inline
    def withHardExpiry(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardExpiry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardExpiry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardExpiry")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxPasswordAge(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPasswordAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxPasswordAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxPasswordAge")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumPasswordLength(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPasswordLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumPasswordLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumPasswordLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPasswordReusePrevention(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordReusePrevention")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasswordReusePrevention: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordReusePrevention")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireLowercaseCharacters(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireLowercaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireLowercaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireLowercaseCharacters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireNumbers(value: Input[Boolean]): Self = {
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
    def withRequireSymbols(value: Input[Boolean]): Self = {
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
    def withRequireUppercaseCharacters(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireUppercaseCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireUppercaseCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireUppercaseCharacters")(js.undefined)
        ret
    }
  }
  
}

