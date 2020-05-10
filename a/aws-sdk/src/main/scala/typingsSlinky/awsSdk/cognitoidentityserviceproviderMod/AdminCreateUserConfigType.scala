package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCreateUserConfigType extends js.Object {
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.native
  /**
    * The message template to be used for the welcome message to new users. See also Customizing User Invitation Messages.
    */
  var InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.native
  /**
    * The user account expiration limit, in days, after which the account is no longer usable. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter. The default value for this parameter is 7.   If you set a value for TemporaryPasswordValidityDays in PasswordPolicy, that value will be used and UnusedAccountValidityDays will be deprecated for that user pool.  
    */
  var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.native
}

object AdminCreateUserConfigType {
  @scala.inline
  def apply(): AdminCreateUserConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserConfigType]
  }
  @scala.inline
  implicit class AdminCreateUserConfigTypeOps[Self <: AdminCreateUserConfigType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAdminCreateUserOnly(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAdminCreateUserOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAdminCreateUserOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowAdminCreateUserOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withInviteMessageTemplate(value: MessageTemplateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteMessageTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInviteMessageTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InviteMessageTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedAccountValidityDays(value: AdminCreateUserUnusedAccountValidityDaysType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedAccountValidityDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedAccountValidityDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedAccountValidityDays")(js.undefined)
        ret
    }
  }
  
}

