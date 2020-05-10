package typingsSlinky.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostStarParams extends js.Object {
  var commentId: js.UndefOr[Double] = js.native
  var issueId: js.UndefOr[Double] = js.native
  var pullRequestCommentId: js.UndefOr[Double] = js.native
  var pullRequestId: js.UndefOr[Double] = js.native
  var wikiId: js.UndefOr[Double] = js.native
}

object PostStarParams {
  @scala.inline
  def apply(): PostStarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostStarParams]
  }
  @scala.inline
  implicit class PostStarParamsOps[Self <: PostStarParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentId")(js.undefined)
        ret
    }
    @scala.inline
    def withIssueId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssueId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issueId")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestCommentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestCommentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestCommentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestCommentId")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withWikiId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wikiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWikiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wikiId")(js.undefined)
        ret
    }
  }
  
}

