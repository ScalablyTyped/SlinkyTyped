package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposGetBranchResponseCommitCommit extends js.Object {
  var author: ReposGetBranchResponseCommitCommitAuthor = js.native
  var committer: ReposGetBranchResponseCommitCommitCommitter = js.native
  var message: String = js.native
  var tree: ReposGetBranchResponseCommitCommitTree = js.native
  var url: String = js.native
  var verification: ReposGetBranchResponseCommitCommitVerification = js.native
}

object ReposGetBranchResponseCommitCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitCommitAuthor,
    committer: ReposGetBranchResponseCommitCommitCommitter,
    message: String,
    tree: ReposGetBranchResponseCommitCommitTree,
    url: String,
    verification: ReposGetBranchResponseCommitCommitVerification
  ): ReposGetBranchResponseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommit]
  }
  @scala.inline
  implicit class ReposGetBranchResponseCommitCommitOps[Self <: ReposGetBranchResponseCommitCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposGetBranchResponseCommitCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ReposGetBranchResponseCommitCommitCommitter): Self = {
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
    def withTree(value: ReposGetBranchResponseCommitCommitTree): Self = {
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
    def withVerification(value: ReposGetBranchResponseCommitCommitVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

