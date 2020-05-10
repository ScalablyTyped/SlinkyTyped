package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoolRolesResponse extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typingsSlinky.awsSdk.cognitoidentityMod.IdentityPoolId] = js.native
  /**
    * How users for a specific identity provider are to mapped to roles. This is a String-to-RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var RoleMappings: js.UndefOr[RoleMappingMap] = js.native
  /**
    * The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.
    */
  var Roles: js.UndefOr[RolesMap] = js.native
}

object GetIdentityPoolRolesResponse {
  @scala.inline
  def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  @scala.inline
  implicit class GetIdentityPoolRolesResponseOps[Self <: GetIdentityPoolRolesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityPoolId(value: IdentityPoolId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentityPoolId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityPoolId")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleMappings(value: RoleMappingMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withRoles(value: RolesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Roles")(js.undefined)
        ret
    }
  }
  
}

