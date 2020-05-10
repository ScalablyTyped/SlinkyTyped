package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperation extends js.Object {
  /**
    * The type of stack set operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack set instances that are associated with the specified stack set. Update operations affect both the stack set itself, as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.native
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.  Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN_] = js.native
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * [Service-managed permissions] The AWS Organizations accounts affected by the stack operation.
    */
  var DeploymentTargets: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.DeploymentTargets] = js.native
  /**
    * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the IAM execution role used to create or update the stack set. Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ExecutionRoleName] = js.native
  /**
    * The unique ID of a stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The preferences for how AWS CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.native
  /**
    * For stack set operations of action type DELETE, specifies whether to remove the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an existing, saved stack to a new stack set.
    */
  var RetainStacks: js.UndefOr[RetainStacksNullable] = js.native
  /**
    * Detailed information about the drift status of the stack set. This includes information about drift operations currently being performed on the stack set. this information will only be present for stack set operations whose Action type is DETECT_DRIFT. For more information, see Detecting Unmanaged Changes in Stack Sets in the AWS CloudFormation User Guide.
    */
  var StackSetDriftDetectionDetails: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetDriftDetectionDetails] = js.native
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The status of the operation.     FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations. The operation is queued to be performed. For more information, see the stack set operation status codes in the AWS CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.native
}

object StackSetOperation {
  @scala.inline
  def apply(): StackSetOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperation]
  }
  @scala.inline
  implicit class StackSetOperationOps[Self <: StackSetOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: StackSetOperationAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(js.undefined)
        ret
    }
    @scala.inline
    def withAdministrationRoleARN(value: RoleARN_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdministrationRoleARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrationRoleARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdministrationRoleARN")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentTargets(value: DeploymentTargets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentTargets")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleName(value: ExecutionRoleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationId(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationId")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationPreferences(value: StackSetOperationPreferences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationPreferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationPreferences")(js.undefined)
        ret
    }
    @scala.inline
    def withRetainStacks(value: RetainStacksNullable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainStacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetainStacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RetainStacks")(js.undefined)
        ret
    }
    @scala.inline
    def withStackSetDriftDetectionDetails(value: StackSetDriftDetectionDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetDriftDetectionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackSetDriftDetectionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackSetDriftDetectionDetails")(js.undefined)
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
    def withStatus(value: StackSetOperationStatus): Self = {
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

