package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestEvent extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with more commits or changing the status of a pull request.
    */
  var actorArn: js.UndefOr[Arn] = js.native
  /**
    * Information about a pull request event.
    */
  var approvalRuleEventMetadata: js.UndefOr[ApprovalRuleEventMetadata] = js.native
  /**
    * Information about an approval rule override event for a pull request.
    */
  var approvalRuleOverriddenEventMetadata: js.UndefOr[ApprovalRuleOverriddenEventMetadata] = js.native
  /**
    * Information about an approval state change for a pull request.
    */
  var approvalStateChangedEventMetadata: js.UndefOr[ApprovalStateChangedEventMetadata] = js.native
  /**
    * The day and time of the pull request event, in timestamp format.
    */
  var eventDate: js.UndefOr[js.Date] = js.native
  /**
    * Information about the source and destination branches for the pull request.
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
  /**
    * The type of the pull request event (for example, a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED)).
    */
  var pullRequestEventType: js.UndefOr[PullRequestEventType] = js.native
  /**
    * The system-generated ID of the pull request.
    */
  var pullRequestId: js.UndefOr[PullRequestId] = js.native
  /**
    * Information about the change in mergability state for the pull request event.
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * Information about the updated source branch for the pull request event. 
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * Information about the change in status for the pull request event.
    */
  var pullRequestStatusChangedEventMetadata: js.UndefOr[PullRequestStatusChangedEventMetadata] = js.native
}

object PullRequestEvent {
  @scala.inline
  def apply(): PullRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestEvent]
  }
  @scala.inline
  implicit class PullRequestEventOps[Self <: PullRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActorArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActorArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorArn")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleEventMetadata(value: ApprovalRuleEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalRuleOverriddenEventMetadata(value: ApprovalRuleOverriddenEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleOverriddenEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalRuleOverriddenEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalRuleOverriddenEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withApprovalStateChangedEventMetadata(value: ApprovalStateChangedEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStateChangedEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalStateChangedEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStateChangedEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestCreatedEventMetadata(value: PullRequestCreatedEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestCreatedEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestCreatedEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestCreatedEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestEventType(value: PullRequestEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestEventType")(js.undefined)
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
    def withPullRequestMergedStateChangedEventMetadata(value: PullRequestMergedStateChangedEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestMergedStateChangedEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestMergedStateChangedEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestMergedStateChangedEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestSourceReferenceUpdatedEventMetadata(value: PullRequestSourceReferenceUpdatedEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestSourceReferenceUpdatedEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestSourceReferenceUpdatedEventMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPullRequestStatusChangedEventMetadata(value: PullRequestStatusChangedEventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestStatusChangedEventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullRequestStatusChangedEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestStatusChangedEventMetadata")(js.undefined)
        ret
    }
  }
  
}

