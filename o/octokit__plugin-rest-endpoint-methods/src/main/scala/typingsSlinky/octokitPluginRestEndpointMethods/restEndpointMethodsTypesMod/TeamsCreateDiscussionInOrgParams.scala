package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsCreateDiscussionInOrgParams extends js.Object {
  /**
    * The discussion post's body text.
    */
  var body: String = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * Private posts are only visible to team members, organization owners, and team maintainers. Public posts are visible to all members of the organization. Set to `true` to create a private post.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var team_slug: String = js.native
  /**
    * The discussion post's title.
    */
  var title: String = js.native
}

object TeamsCreateDiscussionInOrgParams {
  @scala.inline
  def apply(body: String, org_ : String, team_slug: String, title: String): TeamsCreateDiscussionInOrgParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCreateDiscussionInOrgParams]
  }
  @scala.inline
  implicit class TeamsCreateDiscussionInOrgParamsOps[Self <: TeamsCreateDiscussionInOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
  }
  
}

