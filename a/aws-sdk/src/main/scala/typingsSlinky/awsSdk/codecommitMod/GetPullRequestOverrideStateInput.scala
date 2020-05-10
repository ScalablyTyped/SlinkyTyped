package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestOverrideStateInput extends js.Object {
  /**
    * The ID of the pull request for which you want to get information about whether approval rules have been set aside (overridden).
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The system-generated ID of the revision for the pull request. To retrieve the most recent revision ID, use GetPullRequest.
    */
  var revisionId: RevisionId = js.native
}

object GetPullRequestOverrideStateInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, revisionId: RevisionId): GetPullRequestOverrideStateInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestOverrideStateInput]
  }
  @scala.inline
  implicit class GetPullRequestOverrideStateInputOps[Self <: GetPullRequestOverrideStateInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullRequestId(value: PullRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

