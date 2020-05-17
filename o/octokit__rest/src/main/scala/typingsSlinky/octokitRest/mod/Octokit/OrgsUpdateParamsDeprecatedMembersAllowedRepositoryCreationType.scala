package typingsSlinky.octokitRest.mod.Octokit

import typingsSlinky.octokitRest.octokitRestStrings.admin
import typingsSlinky.octokitRest.octokitRestStrings.none
import typingsSlinky.octokitRest.octokitRestStrings.read
import typingsSlinky.octokitRest.octokitRestStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType extends js.Object {
  /**
    * Billing email address. This address is not publicized.
    */
  var billing_email: js.UndefOr[String] = js.native
  /**
    * The company name.
    */
  var company: js.UndefOr[String] = js.native
  /**
    * Default permission level members have for organization repositories:
    * \* `read` - can pull, but not push to or administer this repository.
    * \* `write` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push, and administer this repository.
    * \* `none` - no permissions granted by default.
    */
  var default_repository_permission: js.UndefOr[read | write | admin | none] = js.native
  /**
    * The description of the company.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The publicly visible email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Toggles whether an organization can use organization projects.
    */
  var has_organization_projects: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether repositories that belong to the organization can use repository projects.
    */
  var has_repository_projects: js.UndefOr[Boolean] = js.native
  /**
    * The location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Specifies which types of repositories non-admin organization members can create. Can be one of:
    * \* `all` - all organization members can create public and private repositories.
    * \* `private` - members can create private repositories. This option is only available to repositories that are part of an organization on GitHub Enterprise Cloud.
    * \* `none` - only admin members can create repositories.
    * **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See [this note](https://developer.github.com/v3/orgs/#members_can_create_repositories) for details.
    * @deprecated "members_allowed_repository_creation_type" parameter has been deprecated and will be removed in future
    */
  var members_allowed_repository_creation_type: js.UndefOr[String] = js.native
  /**
    * Toggles whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud. Can be one of:
    * \* `true` - all organization members can create internal repositories.
    * \* `false` - only organization owners can create internal repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether organization members can create private repositories, which are visible to organization members with permission. Can be one of:
    * \* `true` - all organization members can create private repositories.
    * \* `false` - only organization owners can create private repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether organization members can create public repositories, which are visible to anyone. Can be one of:
    * \* `true` - all organization members can create public repositories.
    * \* `false` - only organization owners can create public repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the ability of non-admin organization members to create repositories. Can be one of:
    * \* `true` - all organization members can create repositories.
    * \* `false` - only organization owners can create repositories.
    * Default: `true`
    * **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
    */
  var members_can_create_repositories: js.UndefOr[Boolean] = js.native
  /**
    * The shorthand name of the company.
    */
  var name: js.UndefOr[String] = js.native
  @JSName("org")
  var org_ : String = js.native
}

object OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType {
  @scala.inline
  def apply(org_ : String): OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType]
  }
  @scala.inline
  implicit class OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationTypeOps[Self <: OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing_email")(js.undefined)
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_repository_permission(value: read | write | admin | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_repository_permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_repository_permission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_repository_permission")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_organization_projects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_organization_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_organization_projects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_organization_projects")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_repository_projects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_repository_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_repository_projects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_repository_projects")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_allowed_repository_creation_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_allowed_repository_creation_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_allowed_repository_creation_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_allowed_repository_creation_type")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_can_create_internal_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_internal_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_can_create_internal_repositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_internal_repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_can_create_private_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_private_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_can_create_private_repositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_private_repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_can_create_public_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_public_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_can_create_public_repositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_public_repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_can_create_repositories(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_repositories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_can_create_repositories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_can_create_repositories")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

