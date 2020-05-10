package typingsSlinky.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleCredentialsRequest extends js.Object {
  /**
    * The token issued by the CreateToken API call. For more information, see CreateToken in the AWS SSO OIDC API Reference Guide.
    */
  var accessToken: AccessTokenType = js.native
  /**
    * The identifier for the AWS account that is assigned to the user.
    */
  var accountId: AccountIdType = js.native
  /**
    * The friendly name of the role that is assigned to the user.
    */
  var roleName: RoleNameType = js.native
}

object GetRoleCredentialsRequest {
  @scala.inline
  def apply(accessToken: AccessTokenType, accountId: AccountIdType, roleName: RoleNameType): GetRoleCredentialsRequest = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], accountId = accountId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleCredentialsRequest]
  }
  @scala.inline
  implicit class GetRoleCredentialsRequestOps[Self <: GetRoleCredentialsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: AccessTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountId(value: AccountIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoleName(value: RoleNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

