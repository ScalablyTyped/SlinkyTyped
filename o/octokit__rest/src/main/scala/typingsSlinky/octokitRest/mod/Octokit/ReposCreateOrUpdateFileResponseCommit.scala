package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateOrUpdateFileResponseCommit extends js.Object {
  var author: ReposCreateOrUpdateFileResponseCommitAuthor = js.native
  var committer: ReposCreateOrUpdateFileResponseCommitCommitter = js.native
  var html_url: String = js.native
  var message: String = js.native
  var node_id: String = js.native
  var parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem] = js.native
  var sha: String = js.native
  var tree: ReposCreateOrUpdateFileResponseCommitTree = js.native
  var url: String = js.native
  var verification: ReposCreateOrUpdateFileResponseCommitVerification = js.native
}

object ReposCreateOrUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateOrUpdateFileResponseCommitAuthor,
    committer: ReposCreateOrUpdateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposCreateOrUpdateFileResponseCommitTree,
    url: String,
    verification: ReposCreateOrUpdateFileResponseCommitVerification
  ): ReposCreateOrUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommit]
  }
  @scala.inline
  implicit class ReposCreateOrUpdateFileResponseCommitOps[Self <: ReposCreateOrUpdateFileResponseCommit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthor(value: ReposCreateOrUpdateFileResponseCommitAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommitter(value: ReposCreateOrUpdateFileResponseCommitCommitter): Self = {
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
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParents(value: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem]): Self = {
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
    def withTree(value: ReposCreateOrUpdateFileResponseCommitTree): Self = {
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
    def withVerification(value: ReposCreateOrUpdateFileResponseCommitVerification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

