package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsGetMembershipForAuthenticatedUserResponse extends js.Object {
  var organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization = js.native
  var organization_url: String = js.native
  var role: String = js.native
  var state: String = js.native
  var url: String = js.native
  var user: OrgsGetMembershipForAuthenticatedUserResponseUser = js.native
}

object OrgsGetMembershipForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    organization: OrgsGetMembershipForAuthenticatedUserResponseOrganization,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: OrgsGetMembershipForAuthenticatedUserResponseUser
  ): OrgsGetMembershipForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetMembershipForAuthenticatedUserResponse]
  }
  @scala.inline
  implicit class OrgsGetMembershipForAuthenticatedUserResponseOps[Self <: OrgsGetMembershipForAuthenticatedUserResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganization(value: OrgsGetMembershipForAuthenticatedUserResponseOrganization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganization_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: OrgsGetMembershipForAuthenticatedUserResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

