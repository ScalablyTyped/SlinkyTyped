package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Billingemail extends js.Object {
  var billing_email: Type = js.native
  var company: Type = js.native
  var default_repository_permission: Enum = js.native
  var description: Type = js.native
  var email: Type = js.native
  var has_organization_projects: Type = js.native
  var has_repository_projects: Type = js.native
  var location: Type = js.native
  var members_allowed_repository_creation_type: Enum = js.native
  var members_can_create_internal_repositories: Type = js.native
  var members_can_create_private_repositories: Type = js.native
  var members_can_create_public_repositories: Type = js.native
  var members_can_create_repositories: Type = js.native
  var name: Type = js.native
  @JSName("org")
  var org_ : Required = js.native
}

object Billingemail {
  @scala.inline
  def apply(
    billing_email: Type,
    company: Type,
    default_repository_permission: Enum,
    description: Type,
    email: Type,
    has_organization_projects: Type,
    has_repository_projects: Type,
    location: Type,
    members_allowed_repository_creation_type: Enum,
    members_can_create_internal_repositories: Type,
    members_can_create_private_repositories: Type,
    members_can_create_public_repositories: Type,
    members_can_create_repositories: Type,
    name: Type,
    org_ : Required
  ): Billingemail = {
    val __obj = js.Dynamic.literal(billing_email = billing_email.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], default_repository_permission = default_repository_permission.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], members_allowed_repository_creation_type = members_allowed_repository_creation_type.asInstanceOf[js.Any], members_can_create_internal_repositories = members_can_create_internal_repositories.asInstanceOf[js.Any], members_can_create_private_repositories = members_can_create_private_repositories.asInstanceOf[js.Any], members_can_create_public_repositories = members_can_create_public_repositories.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billingemail]
  }
  @scala.inline
  implicit class BillingemailOps[Self <: Billingemail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilling_email(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault_repository_permission(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_repository_permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_organization_projects(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_organization_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_repository_projects(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_repository_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_allowed_repository_creation_type(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_allowed_repository_creation_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_internal_repositories(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_internal_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_private_repositories(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_private_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_public_repositories(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_public_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_can_create_repositories(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

