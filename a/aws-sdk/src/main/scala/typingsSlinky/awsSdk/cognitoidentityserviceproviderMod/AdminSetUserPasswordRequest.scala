package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminSetUserPasswordRequest extends js.Object {
  /**
    * The password for the user.
    */
  var Password: PasswordType = js.native
  /**
    *  True if the password is permanent, False if it is temporary.
    */
  var Permanent: js.UndefOr[BooleanType] = js.native
  /**
    * The user pool ID for the user pool where you want to set the user's password.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user whose password you wish to set.
    */
  var Username: UsernameType = js.native
}

object AdminSetUserPasswordRequest {
  @scala.inline
  def apply(Password: PasswordType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminSetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminSetUserPasswordRequest]
  }
  @scala.inline
  implicit class AdminSetUserPasswordRequestOps[Self <: AdminSetUserPasswordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPassword(value: PasswordType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withPermanent(value: BooleanType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermanent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permanent")(js.undefined)
        ret
    }
  }
  
}

