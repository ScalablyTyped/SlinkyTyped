package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetOperationSummary extends js.Object {
  /**
    * The type of operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack instances that are associated with the specified stack set. Update operations affect both the stack set itself as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.native
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The unique ID of the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The overall status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations. The operation is queued to be performed. For more information, see the stack set operation status codes in the AWS CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.native
}

object StackSetOperationSummary {
  @scala.inline
  def apply(): StackSetOperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationSummary]
  }
  @scala.inline
  implicit class StackSetOperationSummaryOps[Self <: StackSetOperationSummary] (val x: Self) extends AnyVal {
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

