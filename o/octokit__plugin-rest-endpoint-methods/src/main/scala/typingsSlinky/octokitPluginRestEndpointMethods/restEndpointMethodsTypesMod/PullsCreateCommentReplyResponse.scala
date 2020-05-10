package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullsCreateCommentReplyResponse extends js.Object {
  var _links: PullsCreateCommentReplyResponseLinks = js.native
  var author_association: String = js.native
  var body: String = js.native
  var commit_id: String = js.native
  var created_at: String = js.native
  var diff_hunk: String = js.native
  var html_url: String = js.native
  var id: Double = js.native
  var in_reply_to_id: Double = js.native
  var line: Double = js.native
  var node_id: String = js.native
  var original_commit_id: String = js.native
  var original_line: Double = js.native
  var original_position: Double = js.native
  var original_start_line: Double = js.native
  var path: String = js.native
  var position: Double = js.native
  var pull_request_review_id: Double = js.native
  var pull_request_url: String = js.native
  var side: String = js.native
  var start_line: Double = js.native
  var start_side: String = js.native
  var updated_at: String = js.native
  var url: String = js.native
  var user: PullsCreateCommentReplyResponseUser = js.native
}

object PullsCreateCommentReplyResponse {
  @scala.inline
  def apply(
    _links: PullsCreateCommentReplyResponseLinks,
    author_association: String,
    body: String,
    commit_id: String,
    created_at: String,
    diff_hunk: String,
    html_url: String,
    id: Double,
    in_reply_to_id: Double,
    line: Double,
    node_id: String,
    original_commit_id: String,
    original_line: Double,
    original_position: Double,
    original_start_line: Double,
    path: String,
    position: Double,
    pull_request_review_id: Double,
    pull_request_url: String,
    side: String,
    start_line: Double,
    start_side: String,
    updated_at: String,
    url: String,
    user: PullsCreateCommentReplyResponseUser
  ): PullsCreateCommentReplyResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], in_reply_to_id = in_reply_to_id.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_line = original_line.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], original_start_line = original_start_line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], start_side = start_side.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsCreateCommentReplyResponse]
  }
  @scala.inline
  implicit class PullsCreateCommentReplyResponseOps[Self <: PullsCreateCommentReplyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: PullsCreateCommentReplyResponseLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor_association(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author_association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff_hunk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff_hunk")(value.asInstanceOf[js.Any])
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
    def withIn_reply_to_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_reply_to_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_commit_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_commit_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_start_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_review_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_review_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull_request_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull_request_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_side(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_side")(value.asInstanceOf[js.Any])
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
    def withUser(value: PullsCreateCommentReplyResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

