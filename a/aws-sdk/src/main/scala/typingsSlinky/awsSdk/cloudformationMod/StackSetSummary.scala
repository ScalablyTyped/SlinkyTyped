package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetSummary extends js.Object {
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.AutoDeployment] = js.native
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.native
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetName] = js.native
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.native
}

object StackSetSummary {
  @scala.inline
  def apply(): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetSummary]
  }
  @scala.inline
  implicit class StackSetSummaryOps[Self <: StackSetSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoDeployment(value: AutoDeployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeployment")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withDriftStatus(value: StackDriftStatus): Self = {
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
    def withPermissionModel(value: PermissionModels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PermissionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetId(value: StackSetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetName(value: StackSetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: StackSetStatus): Self = {
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
  }
  
}

