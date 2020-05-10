package typingsSlinky.pulumiAws.inputMod.cognito

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolAdminCreateUserConfig extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[Input[UserPoolAdminCreateUserConfigInviteMessageTemplate]] = js.native
  /**
    * **DEPRECATED** Use password_policy.temporary_password_validity_days instead - The user account expiration limit, in days, after which the account is no longer usable.
    */
  var unusedAccountValidityDays: js.UndefOr[Input[Double]] = js.native
}

object UserPoolAdminCreateUserConfig {
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigOps[Self <: UserPoolAdminCreateUserConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAdminCreateUserOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdminCreateUserOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdminCreateUserOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAdminCreateUserOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteMessageTemplate(value: Input[UserPoolAdminCreateUserConfigInviteMessageTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteMessageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inviteMessageTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedAccountValidityDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedAccountValidityDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedAccountValidityDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unusedAccountValidityDays")(js.undefined)
        ret
    }
  }
  
}

