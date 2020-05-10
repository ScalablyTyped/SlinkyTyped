package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersGetAuthenticatedResponse extends js.Object {
  var avatar_url: String = js.native
  var bio: String = js.native
  var blog: String = js.native
  var collaborators: js.UndefOr[Double] = js.native
  var company: String = js.native
  var created_at: String = js.native
  var disk_usage: js.UndefOr[Double] = js.native
  var email: String = js.native
  var events_url: String = js.native
  var followers: Double = js.native
  var followers_url: String = js.native
  var following: Double = js.native
  var following_url: String = js.native
  var gists_url: String = js.native
  var gravatar_id: String = js.native
  var hireable: Boolean = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var location: String = js.native
  var login: String = js.native
  var name: String = js.native
  var node_id: String = js.native
  var organizations_url: String = js.native
  var owned_private_repos: js.UndefOr[Double] = js.native
  var plan: js.UndefOr[UsersGetAuthenticatedResponsePlan] = js.native
  var private_gists: js.UndefOr[Double] = js.native
  var public_gists: Double = js.native
  var public_repos: Double = js.native
  var received_events_url: String = js.native
  var repos_url: String = js.native
  var site_admin: Boolean = js.native
  var starred_url: String = js.native
  var subscriptions_url: String = js.native
  var total_private_repos: js.UndefOr[Double] = js.native
  var two_factor_authentication: js.UndefOr[Boolean] = js.native
  var `type`: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
}

object UsersGetAuthenticatedResponse {
  @scala.inline
  def apply(
    avatar_url: String,
    bio: String,
    blog: String,
    company: String,
    created_at: String,
    email: String,
    events_url: String,
    followers: Double,
    followers_url: String,
    following: Double,
    following_url: String,
    gists_url: String,
    gravatar_id: String,
    hireable: Boolean,
    html_url: String,
    id: Double,
    location: String,
    login: String,
    name: String,
    node_id: String,
    organizations_url: String,
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): UsersGetAuthenticatedResponse = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersGetAuthenticatedResponse]
  }
  @scala.inline
  implicit class UsersGetAuthenticatedResponseOps[Self <: UsersGetAuthenticatedResponse] (val x: Self) extends AnyVal {
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
    def withBio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bio")(value.asInstanceOf[js.Any])
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
    def withFollowers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowing_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGists_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGravatar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHireable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hireable")(value.asInstanceOf[js.Any])
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
    def withOrganizations_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_gists(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_gists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublic_repos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_repos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived_events_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received_events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSite_admin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStarred_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptions_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    def withPlan(value: UsersGetAuthenticatedResponsePlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan")(js.undefined)
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
    def withTwo_factor_authentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwo_factor_authentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_authentication")(js.undefined)
        ret
    }
  }
  
}

