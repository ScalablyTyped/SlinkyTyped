package typingsSlinky.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJobQueueRequest extends StObject {
  
  /**
    * Details the set of compute environments mapped to a job queue and their order relative to each other. This is one of the parameters used by the job scheduler to determine which compute environment should execute a given job.
    */
  var computeEnvironmentOrder: js.UndefOr[ComputeEnvironmentOrders] = js.native
  
  /**
    * The name or the Amazon Resource Name (ARN) of the job queue.
    */
  var jobQueue: String = js.native
  
  /**
    * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the priority parameter) are evaluated first when associated with the same compute environment. Priority is determined in descending order, for example, a job queue with a priority value of 10 is given scheduling preference over a job queue with a priority value of 1.
    */
  var priority: js.UndefOr[Integer] = js.native
  
  /**
    * Describes the queue's ability to accept new jobs. If the job queue state is ENABLED, it is able to accept jobs. If the job queue state is DISABLED, new jobs cannot be added to the queue, but jobs already in the queue can finish.
    */
  var state: js.UndefOr[JQState] = js.native
}
object UpdateJobQueueRequest {
  
  @scala.inline
  def apply(jobQueue: String): UpdateJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobQueueRequest]
  }
  
  @scala.inline
  implicit class UpdateJobQueueRequestMutableBuilder[Self <: UpdateJobQueueRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeEnvironmentOrder(value: ComputeEnvironmentOrders): Self = StObject.set(x, "computeEnvironmentOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeEnvironmentOrderUndefined: Self = StObject.set(x, "computeEnvironmentOrder", js.undefined)
    
    @scala.inline
    def setComputeEnvironmentOrderVarargs(value: ComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrder", js.Array(value :_*))
    
    @scala.inline
    def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setState(value: JQState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
