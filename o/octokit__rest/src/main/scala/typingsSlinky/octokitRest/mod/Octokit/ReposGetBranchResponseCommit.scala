package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchResponseCommit extends js.Object {
  var author: ReposGetBranchResponseCommitAuthor = js.native
  var commit: ReposGetBranchResponseCommitCommit = js.native
  var committer: ReposGetBranchResponseCommitCommitter = js.native
  var node_id: String = js.native
  var parents: js.Array[ReposGetBranchResponseCommitParentsItem] = js.native
  var sha: String = js.native
  var url: String = js.native
}

object ReposGetBranchResponseCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitAuthor,
    commit: ReposGetBranchResponseCommitCommit,
    committer: ReposGetBranchResponseCommitCommitter,
    node_id: String,
    parents: js.Array[ReposGetBranchResponseCommitParentsItem],
    sha: String,
    url: String
  ): ReposGetBranchResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseCommit]
  }
  @scala.inline
  implicit class ReposGetBranchResponseCommitOps[Self <: ReposGetBranchResponseCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposGetBranchResponseCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommit(value: ReposGetBranchResponseCommitCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ReposGetBranchResponseCommitCommitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[ReposGetBranchResponseCommitParentsItem]): Self = {
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

