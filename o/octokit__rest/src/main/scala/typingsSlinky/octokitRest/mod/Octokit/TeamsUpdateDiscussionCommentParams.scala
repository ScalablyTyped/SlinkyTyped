package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamsUpdateDiscussionCommentParams extends js.Object {
  /**
    * The discussion comment's body text.
    */
  var body: String = js.native
  var comment_number: Double = js.native
  var discussion_number: Double = js.native
  var team_id: Double = js.native
}

object TeamsUpdateDiscussionCommentParams {
  @scala.inline
  def apply(body: String, comment_number: Double, discussion_number: Double, team_id: Double): TeamsUpdateDiscussionCommentParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsUpdateDiscussionCommentParams]
  }
  @scala.inline
  implicit class TeamsUpdateDiscussionCommentParamsOps[Self <: TeamsUpdateDiscussionCommentParams] (val x: Self) extends AnyVal {
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
    def withComment_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiscussion_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discussion_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeam_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("team_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

