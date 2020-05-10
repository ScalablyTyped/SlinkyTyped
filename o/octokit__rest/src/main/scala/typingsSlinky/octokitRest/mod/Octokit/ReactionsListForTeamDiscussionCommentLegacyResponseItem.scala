package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionsListForTeamDiscussionCommentLegacyResponseItem extends js.Object {
  var content: String = js.native
  var created_at: String = js.native
  var id: Double = js.native
  var node_id: String = js.native
  var user: ReactionsListForTeamDiscussionCommentLegacyResponseItemUser = js.native
}

object ReactionsListForTeamDiscussionCommentLegacyResponseItem {
  @scala.inline
  def apply(
    content: String,
    created_at: String,
    id: Double,
    node_id: String,
    user: ReactionsListForTeamDiscussionCommentLegacyResponseItemUser
  ): ReactionsListForTeamDiscussionCommentLegacyResponseItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsListForTeamDiscussionCommentLegacyResponseItem]
  }
  @scala.inline
  implicit class ReactionsListForTeamDiscussionCommentLegacyResponseItemOps[Self <: ReactionsListForTeamDiscussionCommentLegacyResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ReactionsListForTeamDiscussionCommentLegacyResponseItemUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

