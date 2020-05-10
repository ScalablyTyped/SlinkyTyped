package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGetUserResponse extends js.Object {
  /**
    * Indicates that the status is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use the AdminGetUserResponse$UserMFASettingList response instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.native
  /**
    * An array of name-value pairs representing user attributes.
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.native
  /**
    * The date the user was created.
    */
  var UserCreateDate: js.UndefOr[js.Date] = js.native
  /**
    * The date the user was last modified.
    */
  var UserLastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The MFA options that are enabled for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.native
  /**
    * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.   RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or she can sign in.   FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first sign-in, the user must change his or her password to a new value before doing anything else.   
    */
  var UserStatus: js.UndefOr[UserStatusType] = js.native
  /**
    * The user name of the user about whom you are receiving information.
    */
  var Username: UsernameType = js.native
}

object AdminGetUserResponse {
  @scala.inline
  def apply(Username: UsernameType): AdminGetUserResponse = {
    val __obj = js.Dynamic.literal(Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetUserResponse]
  }
  @scala.inline
  implicit class AdminGetUserResponseOps[Self <: AdminGetUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMFAOptions(value: MFAOptionListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFAOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMFAOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFAOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMfaSetting(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMfaSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMfaSetting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMfaSetting")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAttributes(value: AttributeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUserCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserCreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserLastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMFASettingList(value: UserMFASettingListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMFASettingList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMFASettingList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMFASettingList")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStatus(value: UserStatusType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserStatus")(js.undefined)
        ret
    }
  }
  
}

