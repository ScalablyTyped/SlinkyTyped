package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBillingemail extends js.Object {
  var billing_email: AnonType = js.native
  var company: AnonType = js.native
  var default_repository_permission: AnonEnum = js.native
  var description: AnonType = js.native
  var email: AnonType = js.native
  var has_organization_projects: AnonType = js.native
  var has_repository_projects: AnonType = js.native
  var location: AnonType = js.native
  var members_allowed_repository_creation_type: AnonEnum = js.native
  var members_can_create_internal_repositories: AnonType = js.native
  var members_can_create_private_repositories: AnonType = js.native
  var members_can_create_public_repositories: AnonType = js.native
  var members_can_create_repositories: AnonType = js.native
  var name: AnonType = js.native
  var org: AnonRequired = js.native
}

object AnonBillingemail {
  @scala.inline
  def apply(
    billing_email: AnonType,
    company: AnonType,
    default_repository_permission: AnonEnum,
    description: AnonType,
    email: AnonType,
    has_organization_projects: AnonType,
    has_repository_projects: AnonType,
    location: AnonType,
    members_allowed_repository_creation_type: AnonEnum,
    members_can_create_internal_repositories: AnonType,
    members_can_create_private_repositories: AnonType,
    members_can_create_public_repositories: AnonType,
    members_can_create_repositories: AnonType,
    name: AnonType,
    org: AnonRequired
  ): AnonBillingemail = {
    val __obj = js.Dynamic.literal(billing_email = billing_email.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], default_repository_permission = default_repository_permission.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], members_allowed_repository_creation_type = members_allowed_repository_creation_type.asInstanceOf[js.Any], members_can_create_internal_repositories = members_can_create_internal_repositories.asInstanceOf[js.Any], members_can_create_private_repositories = members_can_create_private_repositories.asInstanceOf[js.Any], members_can_create_public_repositories = members_can_create_public_repositories.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingemail]
  }
  @scala.inline
  implicit class AnonBillingemailOps[Self <: AnonBillingemail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_email(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_repository_permission(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_repository_permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_organization_projects(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_organization_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_repository_projects(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_repository_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_allowed_repository_creation_type(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_allowed_repository_creation_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_internal_repositories(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_internal_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_private_repositories(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_private_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_public_repositories(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_public_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_repositories(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

