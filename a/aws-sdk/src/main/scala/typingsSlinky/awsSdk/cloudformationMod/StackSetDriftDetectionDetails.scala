package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetDriftDetectionDetails extends js.Object {
  /**
    * The status of the stack set drift detection operation.    COMPLETED: The drift detection operation completed without failing on any stack instances.    FAILED: The drift detection operation exceeded the specified failure tolerance.     PARTIAL_SUCCESS: The drift detection operation completed without exceeding the failure tolerance for the operation.    IN_PROGRESS: The drift detection operation is currently being performed.    STOPPED: The user has cancelled the drift detection operation.  
    */
  var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.native
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.  
    */
  var DriftStatus: js.UndefOr[StackSetDriftStatus] = js.native
  /**
    * The number of stack instances that have drifted from the expected template and parameter configuration of the stack set. A stack instance is considered to have drifted if one or more of the resources in the associated stack do not match their expected configuration.
    */
  var DriftedStackInstancesCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DriftedStackInstancesCount] = js.native
  /**
    * The number of stack instances for which the drift detection operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.FailedStackInstancesCount] = js.native
  /**
    * The number of stack instances that are currently being checked for drift.
    */
  var InProgressStackInstancesCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.InProgressStackInstancesCount] = js.native
  /**
    * The number of stack instances which match the expected template and parameter configuration of the stack set.
    */
  var InSyncStackInstancesCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.InSyncStackInstancesCount] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The total number of stack instances belonging to this stack set.  The total number of stack instances is equal to the total of:   Stack instances that match the stack set configuration.    Stack instances that have drifted from the stack set configuration.    Stack instances where the drift detection operation has failed.   Stack instances currently being checked for drift.  
    */
  var TotalStackInstancesCount: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.TotalStackInstancesCount] = js.native
}

object StackSetDriftDetectionDetails {
  @scala.inline
  def apply(): StackSetDriftDetectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetDriftDetectionDetails]
  }
  @scala.inline
  implicit class StackSetDriftDetectionDetailsOps[Self <: StackSetDriftDetectionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriftDetectionStatus(value: StackSetDriftDetectionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftDetectionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftDetectionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftDetectionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftStatus(value: StackSetDriftStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftedStackInstancesCount(value: DriftedStackInstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftedStackInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriftedStackInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DriftedStackInstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedStackInstancesCount(value: FailedStackInstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedStackInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedStackInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedStackInstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInProgressStackInstancesCount(value: InProgressStackInstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgressStackInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInProgressStackInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InProgressStackInstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInSyncStackInstancesCount(value: InSyncStackInstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InSyncStackInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInSyncStackInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InSyncStackInstancesCount")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDriftCheckTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDriftCheckTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDriftCheckTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDriftCheckTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalStackInstancesCount(value: TotalStackInstancesCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalStackInstancesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalStackInstancesCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalStackInstancesCount")(js.undefined)
        ret
    }
  }
  
}

