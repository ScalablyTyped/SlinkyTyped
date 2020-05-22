package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Billingemail extends js.Object {
  var billing_email: Type
  var company: Type
  var default_repository_permission: Enum
  var description: Type
  var email: Type
  var has_organization_projects: Type
  var has_repository_projects: Type
  var location: Type
  var members_allowed_repository_creation_type: Enum
  var members_can_create_internal_repositories: Type
  var members_can_create_private_repositories: Type
  var members_can_create_public_repositories: Type
  var members_can_create_repositories: Type
  var name: Type
  @JSName("org")
  var org_ : Required
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
}

