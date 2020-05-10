package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserResponse extends js.Object {
  /**
    *  This response parameter is no longer supported. It provides information only about SMS MFA configurations. It doesn't provide information about TOTP software token MFA configurations. To look up information about either type of MFA configuration, use the use the GetUserResponse$UserMFASettingList response instead.
    */
  var MFAOptions: js.UndefOr[MFAOptionListType] = js.native
  /**
    * The user's preferred MFA setting.
    */
  var PreferredMfaSetting: js.UndefOr[StringType] = js.native
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType = js.native
  /**
    * The MFA options that are enabled for the user. The possible values in this list are SMS_MFA and SOFTWARE_TOKEN_MFA.
    */
  var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.native
  /**
    * The user name of the user you wish to retrieve from the get user request.
    */
  var Username: UsernameType = js.native
}

object GetUserResponse {
  @scala.inline
  def apply(UserAttributes: AttributeListType, Username: UsernameType): GetUserResponse = {
    val __obj = js.Dynamic.literal(UserAttributes = UserAttributes.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserResponse]
  }
  @scala.inline
  implicit class GetUserResponseOps[Self <: GetUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAttributes(value: AttributeListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
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
  }
  
}

