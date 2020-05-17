package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.Plussign1
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.`-1`
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.confused
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.eyes
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.heart
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.hooray
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.laugh
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionsCreateForTeamDiscussionCommentInOrgParams extends js.Object {
  var comment_number: Double = js.native
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion comment.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes = js.native
  var discussion_number: Double = js.native
  @JSName("org")
  var org_ : String = js.native
  var team_slug: String = js.native
}

object ReactionsCreateForTeamDiscussionCommentInOrgParams {
  @scala.inline
  def apply(
    comment_number: Double,
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    org_ : String,
    team_slug: String
  ): ReactionsCreateForTeamDiscussionCommentInOrgParams = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionCommentInOrgParams]
  }
  @scala.inline
  implicit class ReactionsCreateForTeamDiscussionCommentInOrgParamsOps[Self <: ReactionsCreateForTeamDiscussionCommentInOrgParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscussion_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_number")(value.asInstanceOf[js.Any])
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
  }
  
}

