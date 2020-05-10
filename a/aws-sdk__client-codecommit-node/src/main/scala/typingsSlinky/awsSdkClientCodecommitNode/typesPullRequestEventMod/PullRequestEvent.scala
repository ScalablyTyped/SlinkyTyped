package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestEventMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_CREATED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_MERGE_STATE_CHANGED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_SOURCE_REFERENCE_UPDATED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PULL_REQUEST_STATUS_CHANGED
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.PullRequestCreatedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.PullRequestMergedStateChangedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.PullRequestSourceReferenceUpdatedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.PullRequestStatusChangedEventMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestEvent extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the user whose actions resulted in the event. Examples include updating the pull request with additional commits or changing the status of a pull request.</p>
    */
  var actorArn: js.UndefOr[String] = js.native
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  var eventDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  var pullRequestCreatedEventMetadata: js.UndefOr[PullRequestCreatedEventMetadata] = js.native
  /**
    * <p>The type of the pull request event, for example a status change event (PULL_REQUEST_STATUS_CHANGED) or update event (PULL_REQUEST_SOURCE_REFERENCE_UPDATED).</p>
    */
  var pullRequestEventType: js.UndefOr[
    PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
  ] = js.native
  /**
    * <p>The system-generated ID of the pull request.</p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  var pullRequestMergedStateChangedEventMetadata: js.UndefOr[PullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  var pullRequestSourceReferenceUpdatedEventMetadata: js.UndefOr[PullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * <p>Information about the change in status for the pull request event.</p>
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
    def withActorArn(value: String): Self = {
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
    def withEventDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventDate(value: js.Date | String | Double): Self = {
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
    def withPullRequestEventType(
      value: PULL_REQUEST_CREATED | PULL_REQUEST_STATUS_CHANGED | PULL_REQUEST_SOURCE_REFERENCE_UPDATED | PULL_REQUEST_MERGE_STATE_CHANGED | String
    ): Self = {
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

