package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsGetResponse extends js.Object {
  var avatar_url: String = js.native
  var billing_email: js.UndefOr[String] = js.native
  var blog: String = js.native
  var collaborators: js.UndefOr[Double] = js.native
  var company: String = js.native
  var created_at: String = js.native
  var default_repository_permission: js.UndefOr[String] = js.native
  var description: String = js.native
  var disk_usage: js.UndefOr[Double] = js.native
  var email: String = js.native
  var events_url: String = js.native
  var followers: Double = js.native
  var following: Double = js.native
  var has_organization_projects: Boolean = js.native
  var has_repository_projects: Boolean = js.native
  var hooks_url: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var is_verified: Boolean = js.native
  var issues_url: String = js.native
  var location: String = js.native
  var login: String = js.native
  var members_allowed_repository_creation_type: js.UndefOr[String] = js.native
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.native
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.native
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.native
  var members_can_create_repositories: js.UndefOr[Boolean] = js.native
  var members_url: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var owned_private_repos: js.UndefOr[Double] = js.native
  var plan: OrgsGetResponsePlan = js.native
  var private_gists: js.UndefOr[Double] = js.native
  var public_gists: Double = js.native
  var public_members_url: String = js.native
  var public_repos: Double = js.native
  var repos_url: String = js.native
  var total_private_repos: js.UndefOr[Double] = js.native
  var two_factor_requirement_enabled: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object OrgsGetResponse {
  @scala.inline
  def apply(
    avatar_url: String,
    blog: String,
    company: String,
    created_at: String,
    description: String,
    email: String,
    events_url: String,
    followers: Double,
    following: Double,
    has_organization_projects: Boolean,
    has_repository_projects: Boolean,
    hooks_url: String,
    html_url: String,
    id: Double,
    is_verified: Boolean,
    issues_url: String,
    location: String,
    login: String,
    members_url: String,
    name: String,
    node_id: String,
    plan: OrgsGetResponsePlan,
    public_gists: Double,
    public_members_url: String,
    public_repos: Double,
    repos_url: String,
    `type`: String,
    url: String
  ): OrgsGetResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsGetResponse]
  }
  @scala.inline
  implicit class OrgsGetResponseOps[Self <: OrgsGetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompany(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("company")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_organization_projects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_organization_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_repository_projects(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_repository_projects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHooks_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan(value: OrgsGetResponsePlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_gists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_members_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_members_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    def withCollaborators(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollaborators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collaborators")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_repository_permission(value: String): Self = {
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
    def withDisk_usage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisk_usage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disk_usage")(js.undefined)
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
    def withOwned_private_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owned_private_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwned_private_repos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owned_private_repos")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate_gists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate_gists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_gists")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_private_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_private_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_private_repos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_private_repos")(js.undefined)
        ret
    }
    @scala.inline
    def withTwo_factor_requirement_enabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_requirement_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwo_factor_requirement_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_requirement_enabled")(js.undefined)
        ret
    }
  }
  
}

