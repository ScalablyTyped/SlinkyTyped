package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityProviderByIdentifierRequest extends js.Object {
  /**
    * The identity provider ID.
    */
  var IdpIdentifier: IdpIdentifierType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object GetIdentityProviderByIdentifierRequest {
  @scala.inline
  def apply(IdpIdentifier: IdpIdentifierType, UserPoolId: UserPoolIdType): GetIdentityProviderByIdentifierRequest = {
    val __obj = js.Dynamic.literal(IdpIdentifier = IdpIdentifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityProviderByIdentifierRequest]
  }
  @scala.inline
  implicit class GetIdentityProviderByIdentifierRequestOps[Self <: GetIdentityProviderByIdentifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdpIdentifier(value: IdpIdentifierType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdpIdentifier")(value.asInstanceOf[js.Any])
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

