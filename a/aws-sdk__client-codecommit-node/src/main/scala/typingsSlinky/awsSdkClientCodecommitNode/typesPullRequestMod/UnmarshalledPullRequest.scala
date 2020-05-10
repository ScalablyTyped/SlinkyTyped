package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMod

import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestTargetMod.UnmarshalledPullRequestTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequest extends PullRequest {
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledPullRequest: js.UndefOr[js.Date] = js.native
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  @JSName("lastActivityDate")
  var lastActivityDate_UnmarshalledPullRequest: js.UndefOr[js.Date] = js.native
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  @JSName("pullRequestTargets")
  var pullRequestTargets_UnmarshalledPullRequest: js.UndefOr[js.Array[UnmarshalledPullRequestTarget]] = js.native
}

object UnmarshalledPullRequest {
  @scala.inline
  def apply(): UnmarshalledPullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequest]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestOps[Self <: UnmarshalledPullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActivityDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActivityDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastActivityDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActivityDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestTargets(value: js.Array[UnmarshalledPullRequestTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestTargets")(js.undefined)
        ret
    }
  }
  
}

