package typingsSlinky.awsSdkClientCodecommitNode.typesPullRequestStatusChangedEventMetadataMod

import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typingsSlinky.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestStatusChangedEventMetadata extends js.Object {
  /**
    * <p>The changed status of the pull request.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
}

object PullRequestStatusChangedEventMetadata {
  @scala.inline
  def apply(): PullRequestStatusChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequestStatusChangedEventMetadata]
  }
  @scala.inline
  implicit class PullRequestStatusChangedEventMetadataOps[Self <: PullRequestStatusChangedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

