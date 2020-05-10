package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminDeleteUserAttributesRequest extends js.Object {
  /**
    * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributeNames: AttributeNameListType = js.native
  /**
    * The user pool ID for the user pool where you want to delete user attributes.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user from which you would like to delete attributes.
    */
  var Username: UsernameType = js.native
}

object AdminDeleteUserAttributesRequest {
  @scala.inline
  def apply(UserAttributeNames: AttributeNameListType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminDeleteUserAttributesRequest = {
    val __obj = js.Dynamic.literal(UserAttributeNames = UserAttributeNames.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDeleteUserAttributesRequest]
  }
  @scala.inline
  implicit class AdminDeleteUserAttributesRequestOps[Self <: AdminDeleteUserAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserAttributeNames(value: AttributeNameListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserAttributeNames")(value.asInstanceOf[js.Any])
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

