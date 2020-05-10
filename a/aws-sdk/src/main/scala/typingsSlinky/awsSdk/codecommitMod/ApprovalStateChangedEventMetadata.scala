package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalStateChangedEventMetadata extends js.Object {
  /**
    * The approval status for the pull request.
    */
  var approvalStatus: js.UndefOr[ApprovalState] = js.native
  /**
    * The revision ID of the pull request when the approval state changed.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object ApprovalStateChangedEventMetadata {
  @scala.inline
  def apply(): ApprovalStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
  }
  @scala.inline
  implicit class ApprovalStateChangedEventMetadataOps[Self <: ApprovalStateChangedEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApprovalStatus(value: ApprovalState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApprovalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approvalStatus")(js.undefined)
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
  }
  
}

