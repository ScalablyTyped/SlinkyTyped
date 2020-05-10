package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestBySquashOutput extends js.Object {
  var pullRequest: js.UndefOr[PullRequest] = js.native
}

object MergePullRequestBySquashOutput {
  @scala.inline
  def apply(): MergePullRequestBySquashOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergePullRequestBySquashOutput]
  }
  @scala.inline
  implicit class MergePullRequestBySquashOutputOps[Self <: MergePullRequestBySquashOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullRequest(value: PullRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequest")(js.undefined)
        ret
    }
  }
  
}

