package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationResultSummary extends js.Object {
  /**
    * [Self-managed permissions] The name of the AWS account for this operation result.
    */
  var Account: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Account] = js.native
  /**
    * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set operations in an account
    */
  var AccountGateResult: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.AccountGateResult] = js.native
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) ID for this operation result.
    */
  var OrganizationalUnitId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.OrganizationalUnitId] = js.native
  /**
    * The name of the AWS region for this operation result.
    */
  var Region: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Region] = js.native
  /**
    * The result status of the stack set operation for the given account in the given region.    CANCELLED: The operation in the specified account and region has been cancelled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and region failed.  If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set operation as a whole might be exceeded.     RUNNING: The operation in the specified account and region is currently in progress.    PENDING: The operation in the specified account and region has yet to start.     SUCCEEDED: The operation in the specified account and region completed successfully.  
    */
  var Status: js.UndefOr[StackSetOperationResultStatus] = js.native
  /**
    * The reason for the assigned result status.
    */
  var StatusReason: js.UndefOr[Reason] = js.native
}

object StackSetOperationResultSummary {
  @scala.inline
  def apply(): StackSetOperationResultSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationResultSummary]
  }
  @scala.inline
  implicit class StackSetOperationResultSummaryOps[Self <: StackSetOperationResultSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: Account): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountGateResult(value: AccountGateResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountGateResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountGateResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountGateResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationalUnitId(value: OrganizationalUnitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Region): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StackSetOperationResultStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReason(value: Reason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReason")(js.undefined)
        ret
    }
  }
  
}

