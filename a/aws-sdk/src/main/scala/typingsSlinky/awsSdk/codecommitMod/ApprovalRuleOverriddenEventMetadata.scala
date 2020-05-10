package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalRuleOverriddenEventMetadata extends js.Object {
  /**
    * The status of the override event.
    */
  var overrideStatus: js.UndefOr[OverrideStatus] = js.native
  /**
    * The revision ID of the pull request when the override event occurred.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object ApprovalRuleOverriddenEventMetadata {
  @scala.inline
  def apply(): ApprovalRuleOverriddenEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
  }
  @scala.inline
  implicit class ApprovalRuleOverriddenEventMetadataOps[Self <: ApprovalRuleOverriddenEventMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverrideStatus(value: OverrideStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideStatus")(js.undefined)
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

