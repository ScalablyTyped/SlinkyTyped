package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddCustomAttributesRequest extends js.Object {
  /**
    * An array of custom attributes, such as Mutable and Name.
    */
  var CustomAttributes: CustomAttributesListType = js.native
  /**
    * The user pool ID for the user pool where you want to add custom attributes.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object AddCustomAttributesRequest {
  @scala.inline
  def apply(CustomAttributes: CustomAttributesListType, UserPoolId: UserPoolIdType): AddCustomAttributesRequest = {
    val __obj = js.Dynamic.literal(CustomAttributes = CustomAttributes.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomAttributesRequest]
  }
  @scala.inline
  implicit class AddCustomAttributesRequestOps[Self <: AddCustomAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomAttributes(value: CustomAttributesListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

