package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetOperationSummary extends js.Object {
  
  /**
    * The type of operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack instances that are associated with the specified stack set. Update operations affect both the stack set itself as well as all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.native
  
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested Regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The time at which the stack set operation ended, across all accounts and Regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or Region.
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.native
  
  /**
    * The unique ID of the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The overall status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each Region during stack create and update operations. If the number of failed stacks within a Region exceeds the failure tolerance, the status of the operation in the Region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining Regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations, the operation is queued to be performed. For more information, see the stack set operation status codes in the AWS CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: StackSetOperationAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: js.Date): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    
    @scala.inline
    def setEndTimestamp(value: js.Date): Self = this.set("EndTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimestamp: Self = this.set("EndTimestamp", js.undefined)
    
    @scala.inline
    def setOperationId(value: ClientRequestToken): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetOperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
