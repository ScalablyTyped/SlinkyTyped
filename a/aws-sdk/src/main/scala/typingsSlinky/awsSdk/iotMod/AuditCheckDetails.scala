package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuditCheckDetails extends js.Object {
  /**
    * True if the check is complete and found all resources compliant.
    */
  var checkCompliant: js.UndefOr[CheckCompliant] = js.native
  /**
    * The completion status of this check. One of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED", "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
    */
  var checkRunStatus: js.UndefOr[AuditCheckRunStatus] = js.native
  /**
    * The code of any error encountered when this check is performed during this audit. One of "INSUFFICIENT_PERMISSIONS" or "AUDIT_CHECK_DISABLED".
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  /**
    * The message associated with any error encountered when this check is performed during this audit.
    */
  var message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The number of resources that were found noncompliant during the check.
    */
  var nonCompliantResourcesCount: js.UndefOr[NonCompliantResourcesCount] = js.native
  /**
    * The number of resources on which the check was performed.
    */
  var totalResourcesCount: js.UndefOr[TotalResourcesCount] = js.native
}

object AuditCheckDetails {
  @scala.inline
  def apply(): AuditCheckDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditCheckDetails]
  }
  @scala.inline
  implicit class AuditCheckDetailsOps[Self <: AuditCheckDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckCompliant(value: CheckCompliant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCompliant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckCompliant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkCompliant")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckRunStatus(value: AuditCheckRunStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRunStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckRunStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkRunStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantResourcesCount(value: NonCompliantResourcesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantResourcesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantResourcesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonCompliantResourcesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResourcesCount(value: TotalResourcesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResourcesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResourcesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResourcesCount")(js.undefined)
        ret
    }
  }
  
}

