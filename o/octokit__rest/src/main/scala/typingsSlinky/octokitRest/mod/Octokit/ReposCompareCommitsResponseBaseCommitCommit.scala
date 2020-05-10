package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCompareCommitsResponseBaseCommitCommit extends js.Object {
  var author: ReposCompareCommitsResponseBaseCommitCommitAuthor = js.native
  var comment_count: Double = js.native
  var committer: ReposCompareCommitsResponseBaseCommitCommitCommitter = js.native
  var message: String = js.native
  var tree: ReposCompareCommitsResponseBaseCommitCommitTree = js.native
  var url: String = js.native
  var verification: ReposCompareCommitsResponseBaseCommitCommitVerification = js.native
}

object ReposCompareCommitsResponseBaseCommitCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseBaseCommitCommitAuthor,
    comment_count: Double,
    committer: ReposCompareCommitsResponseBaseCommitCommitCommitter,
    message: String,
    tree: ReposCompareCommitsResponseBaseCommitCommitTree,
    url: String,
    verification: ReposCompareCommitsResponseBaseCommitCommitVerification
  ): ReposCompareCommitsResponseBaseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommitCommit]
  }
  @scala.inline
  implicit class ReposCompareCommitsResponseBaseCommitCommitOps[Self <: ReposCompareCommitsResponseBaseCommitCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposCompareCommitsResponseBaseCommitCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ReposCompareCommitsResponseBaseCommitCommitCommitter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("committer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: ReposCompareCommitsResponseBaseCommitCommitTree): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerification(value: ReposCompareCommitsResponseBaseCommitCommitVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

