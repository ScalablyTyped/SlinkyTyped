package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminSetUserSettingsRequest extends js.Object {
  /**
    * You can use this parameter only to set an SMS configuration that uses SMS for delivery.
    */
  var MFAOptions: MFAOptionListType = js.native
  /**
    * The ID of the user pool that contains the user that you are setting options for.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user that you are setting options for.
    */
  var Username: UsernameType = js.native
}

object AdminSetUserSettingsRequest {
  @scala.inline
  def apply(MFAOptions: MFAOptionListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserSettingsRequest = {
    val __obj = js.Dynamic.literal(MFAOptions = MFAOptions.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserSettingsRequest]
  }
  @scala.inline
  implicit class AdminSetUserSettingsRequestOps[Self <: AdminSetUserSettingsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMFAOptions(value: MFAOptionListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MFAOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

