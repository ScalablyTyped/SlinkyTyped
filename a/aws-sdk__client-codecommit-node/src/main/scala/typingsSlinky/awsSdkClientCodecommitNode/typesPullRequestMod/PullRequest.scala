package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestTargetMod.PullRequestTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the user who created the pull request.</p>
    */
  var authorArn: js.UndefOr[String] = js.native
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.</p>
    */
  var description: js.UndefOr[String] = js.native
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  var lastActivityDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  /**
    * <p>The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  var pullRequestTargets: js.UndefOr[js.Array[PullRequestTarget] | js.Iterable[PullRequestTarget]] = js.native
  /**
    * <p>The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.</p>
    */
  var title: js.UndefOr[String] = js.native
}

object PullRequest {
  @scala.inline
  def apply(): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequest]
  }
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withClientRequestToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientRequestToken")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date | String | Double): Self = {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLastActivityDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastActivityDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastActivityDate(value: js.Date | String | Double): Self = {
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
    def withPullRequestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestStatus(value: OPEN | CLOSED | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestTargetsIterable(value: js.Iterable[PullRequestTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequestTargets(value: js.Array[PullRequestTarget] | js.Iterable[PullRequestTarget]): Self = {
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

