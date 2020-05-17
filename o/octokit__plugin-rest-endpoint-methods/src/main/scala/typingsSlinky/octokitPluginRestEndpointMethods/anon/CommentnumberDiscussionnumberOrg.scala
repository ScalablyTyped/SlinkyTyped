package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentnumberDiscussionnumberOrg extends js.Object {
  var comment_number: Required = js.native
  var discussion_number: Required = js.native
  @JSName("org")
  var org_ : Required = js.native
  var team_slug: Required = js.native
}

object CommentnumberDiscussionnumberOrg {
  @scala.inline
  def apply(comment_number: Required, discussion_number: Required, org_ : Required, team_slug: Required): CommentnumberDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentnumberDiscussionnumberOrg]
  }
  @scala.inline
  implicit class CommentnumberDiscussionnumberOrgOps[Self <: CommentnumberDiscussionnumberOrg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscussion_number(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrg_(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("org")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_slug(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_slug")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

