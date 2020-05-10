package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposListBranchesForHeadCommitResponseItem extends js.Object {
  var commit: ReposListBranchesForHeadCommitResponseItemCommit = js.native
  var name: String = js.native
  var `protected`: String = js.native
}

object ReposListBranchesForHeadCommitResponseItem {
  @scala.inline
  def apply(commit: ReposListBranchesForHeadCommitResponseItemCommit, name: String, `protected`: String): ReposListBranchesForHeadCommitResponseItem = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListBranchesForHeadCommitResponseItem]
  }
  @scala.inline
  implicit class ReposListBranchesForHeadCommitResponseItemOps[Self <: ReposListBranchesForHeadCommitResponseItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommit(value: ReposListBranchesForHeadCommitResponseItemCommit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

