package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCompareCommitsResponseMergeBaseCommit extends js.Object {
  var author: ReposCompareCommitsResponseMergeBaseCommitAuthor = js.native
  var comments_url: String = js.native
  var commit: ReposCompareCommitsResponseMergeBaseCommitCommit = js.native
  var committer: ReposCompareCommitsResponseMergeBaseCommitCommitter = js.native
  var html_url: String = js.native
  var node_id: String = js.native
  var parents: js.Array[ReposCompareCommitsResponseMergeBaseCommitParentsItem] = js.native
  var sha: String = js.native
  var url: String = js.native
}

object ReposCompareCommitsResponseMergeBaseCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseMergeBaseCommitAuthor,
    comments_url: String,
    commit: ReposCompareCommitsResponseMergeBaseCommitCommit,
    committer: ReposCompareCommitsResponseMergeBaseCommitCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposCompareCommitsResponseMergeBaseCommitParentsItem],
    sha: String,
    url: String
  ): ReposCompareCommitsResponseMergeBaseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponseMergeBaseCommit]
  }
  @scala.inline
  implicit class ReposCompareCommitsResponseMergeBaseCommitOps[Self <: ReposCompareCommitsResponseMergeBaseCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposCompareCommitsResponseMergeBaseCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComments_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: ReposCompareCommitsResponseMergeBaseCommitCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ReposCompareCommitsResponseMergeBaseCommitCommitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtml_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[ReposCompareCommitsResponseMergeBaseCommitParentsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

