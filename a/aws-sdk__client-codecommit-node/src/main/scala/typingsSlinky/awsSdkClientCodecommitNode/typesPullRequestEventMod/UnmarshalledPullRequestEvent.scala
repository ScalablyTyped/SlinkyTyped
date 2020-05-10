package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestEventMod

import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestCreatedEventMetadataMod.UnmarshalledPullRequestCreatedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestMergedStateChangedEventMetadataMod.UnmarshalledPullRequestMergedStateChangedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestSourceReferenceUpdatedEventMetadataMod.UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata
import typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod.UnmarshalledPullRequestStatusChangedEventMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledPullRequestEvent extends PullRequestEvent {
  /**
    * <p>The day and time of the pull request event, in timestamp format.</p>
    */
  @JSName("eventDate")
  var eventDate_UnmarshalledPullRequestEvent: js.UndefOr[js.Date] = js.native
  /**
    * <p>Information about the source and destination branches for the pull request.</p>
    */
  @JSName("pullRequestCreatedEventMetadata")
  var pullRequestCreatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestCreatedEventMetadata] = js.native
  /**
    * <p>Information about the change in mergability state for the pull request event.</p>
    */
  @JSName("pullRequestMergedStateChangedEventMetadata")
  var pullRequestMergedStateChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestMergedStateChangedEventMetadata] = js.native
  /**
    * <p>Information about the updated source branch for the pull request event. </p>
    */
  @JSName("pullRequestSourceReferenceUpdatedEventMetadata")
  var pullRequestSourceReferenceUpdatedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata] = js.native
  /**
    * <p>Information about the change in status for the pull request event.</p>
    */
  @JSName("pullRequestStatusChangedEventMetadata")
  var pullRequestStatusChangedEventMetadata_UnmarshalledPullRequestEvent: js.UndefOr[UnmarshalledPullRequestStatusChangedEventMetadata] = js.native
}

object UnmarshalledPullRequestEvent {
  @scala.inline
  def apply(): UnmarshalledPullRequestEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledPullRequestEvent]
  }
  @scala.inline
  implicit class UnmarshalledPullRequestEventOps[Self <: UnmarshalledPullRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPullRequestCreatedEventMetadata(value: UnmarshalledPullRequestCreatedEventMetadata): Self = {
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
    def withPullRequestMergedStateChangedEventMetadata(value: UnmarshalledPullRequestMergedStateChangedEventMetadata): Self = {
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
    def withPullRequestSourceReferenceUpdatedEventMetadata(value: UnmarshalledPullRequestSourceReferenceUpdatedEventMetadata): Self = {
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
    def withPullRequestStatusChangedEventMetadata(value: UnmarshalledPullRequestStatusChangedEventMetadata): Self = {
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

