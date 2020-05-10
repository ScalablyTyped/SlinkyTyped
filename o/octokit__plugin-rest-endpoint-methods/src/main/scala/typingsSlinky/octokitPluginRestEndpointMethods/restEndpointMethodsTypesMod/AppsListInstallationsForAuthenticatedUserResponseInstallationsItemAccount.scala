package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount extends js.Object {
  var avatar_url: String = js.native
  var description: js.UndefOr[String] = js.native
  var events_url: String = js.native
  var followers_url: js.UndefOr[String] = js.native
  var following_url: js.UndefOr[String] = js.native
  var gists_url: js.UndefOr[String] = js.native
  var gravatar_id: js.UndefOr[String] = js.native
  var hooks_url: js.UndefOr[String] = js.native
  var html_url: js.UndefOr[String] = js.native
  var id: Double = js.native
  var issues_url: js.UndefOr[String] = js.native
  var login: String = js.native
  var members_url: js.UndefOr[String] = js.native
  var node_id: String = js.native
  var organizations_url: js.UndefOr[String] = js.native
  var public_members_url: js.UndefOr[String] = js.native
  var received_events_url: js.UndefOr[String] = js.native
  var repos_url: String = js.native
  var site_admin: js.UndefOr[Boolean] = js.native
  var starred_url: js.UndefOr[String] = js.native
  var subscriptions_url: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: String = js.native
}

object AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount {
  @scala.inline
  def apply(
    avatar_url: String,
    events_url: String,
    id: Double,
    login: String,
    node_id: String,
    repos_url: String,
    url: String
  ): AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount]
  }
  @scala.inline
  implicit class AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccountOps[Self <: AppsListInstallationsForAuthenticatedUserResponseInstallationsItemAccount] (val x: Self) extends AnyVal {
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
    def withEvents_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("login")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepos_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repos_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    def withFollowers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowers_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followers_url")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowing_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowing_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following_url")(js.undefined)
        ret
    }
    @scala.inline
    def withGists_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGists_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gists_url")(js.undefined)
        ret
    }
    @scala.inline
    def withGravatar_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravatar_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravatar_id")(js.undefined)
        ret
    }
    @scala.inline
    def withHooks_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks_url")(js.undefined)
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(js.undefined)
        ret
    }
    @scala.inline
    def withIssues_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssues_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues_url")(js.undefined)
        ret
    }
    @scala.inline
    def withMembers_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members_url")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizations_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizations_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizations_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_members_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_members_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_members_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_members_url")(js.undefined)
        ret
    }
    @scala.inline
    def withReceived_events_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received_events_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReceived_events_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received_events_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSite_admin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite_admin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_admin")(js.undefined)
        ret
    }
    @scala.inline
    def withStarred_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarred_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starred_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscriptions_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptions_url")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

