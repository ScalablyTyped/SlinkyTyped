package typingsSlinky.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsResource extends js.Object {
  var roles: RolesResource = js.native
  var serviceAccounts: ServiceAccountsResource = js.native
}

object ProjectsResource {
  @scala.inline
  def apply(roles: RolesResource, serviceAccounts: ServiceAccountsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any], serviceAccounts = serviceAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoles(value: RolesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccounts(value: ServiceAccountsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccounts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

