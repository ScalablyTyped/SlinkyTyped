package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequest extends js.Object {
  /**
    * The approval rules applied to the pull request.
    */
  var approvalRules: js.UndefOr[ApprovalRulesList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who created the pull request.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The date and time the pull request was originally created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The day and time of the last user or system activity on the pull request, in timestamp format.
    */
  var lastActivityDate: js.UndefOr[js.Date] = js.native
  /**
    * The system-generated ID of the pull request. 
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * The status of the pull request. Pull request status can only change from OPEN to CLOSED.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  /**
    * The targets of the pull request, including the source branch and destination branch for the pull request.
    */
  var pullRequestTargets: js.UndefOr[PullRequestTargetList] = js.native
  /**
    * The system-generated revision ID for the pull request.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
  /**
    * The user-defined title of the pull request. This title is displayed in the list of pull requests to other repository users.
    */
  var title: js.UndefOr[Title] = js.native
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
    def withApprovalRules(value: ApprovalRulesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRules")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorArn(value: Arn): Self = {
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
    def withClientRequestToken(value: ClientRequestToken): Self = {
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
    def withDescription(value: Description): Self = {
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
    def withPullRequestId(value: PullRequestId): Self = {
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
    def withPullRequestStatus(value: PullRequestStatusEnum): Self = {
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
    def withPullRequestTargets(value: PullRequestTargetList): Self = {
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
    def withRevisionId(value: RevisionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: Title): Self = {
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

