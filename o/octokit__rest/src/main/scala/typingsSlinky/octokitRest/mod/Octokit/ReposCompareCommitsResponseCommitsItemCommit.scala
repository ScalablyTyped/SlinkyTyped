package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCompareCommitsResponseCommitsItemCommit extends js.Object {
  var author: ReposCompareCommitsResponseCommitsItemCommitAuthor = js.native
  var comment_count: Double = js.native
  var committer: ReposCompareCommitsResponseCommitsItemCommitCommitter = js.native
  var message: String = js.native
  var tree: ReposCompareCommitsResponseCommitsItemCommitTree = js.native
  var url: String = js.native
  var verification: ReposCompareCommitsResponseCommitsItemCommitVerification = js.native
}

object ReposCompareCommitsResponseCommitsItemCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseCommitsItemCommitAuthor,
    comment_count: Double,
    committer: ReposCompareCommitsResponseCommitsItemCommitCommitter,
    message: String,
    tree: ReposCompareCommitsResponseCommitsItemCommitTree,
    url: String,
    verification: ReposCompareCommitsResponseCommitsItemCommitVerification
  ): ReposCompareCommitsResponseCommitsItemCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponseCommitsItemCommit]
  }
  @scala.inline
  implicit class ReposCompareCommitsResponseCommitsItemCommitOps[Self <: ReposCompareCommitsResponseCommitsItemCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposCompareCommitsResponseCommitsItemCommitAuthor): Self = {
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
    def withCommitter(value: ReposCompareCommitsResponseCommitsItemCommitCommitter): Self = {
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
    def withTree(value: ReposCompareCommitsResponseCommitsItemCommitTree): Self = {
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
    def withVerification(value: ReposCompareCommitsResponseCommitsItemCommitVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

