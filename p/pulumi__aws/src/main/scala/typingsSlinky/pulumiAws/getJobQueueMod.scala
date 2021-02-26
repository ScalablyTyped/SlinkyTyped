package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.batch.GetJobQueueComputeEnvironmentOrder
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getJobQueueMod {
  
  @JSImport("@pulumi/aws/batch/getJobQueue", "getJobQueue")
  @js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] = js.native
  @JSImport("@pulumi/aws/batch/getJobQueue", "getJobQueue")
  @js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] = js.native
  
  @js.native
  trait GetJobQueueArgs extends StObject {
    
    /**
      * The name of the job queue.
      */
    val name: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetJobQueueArgs {
    
    @scala.inline
    def apply(name: String): GetJobQueueArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetJobQueueArgs]
    }
    
    @scala.inline
    implicit class GetJobQueueArgsMutableBuilder[Self <: GetJobQueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetJobQueueResult extends StObject {
    
    /**
      * The ARN of the job queue.
      */
    val arn: String = js.native
    
    /**
      * The compute environments that are attached to the job queue and the order in
      * which job placement is preferred. Compute environments are selected for job placement in ascending order.
      * * `compute_environment_order.#.order` - The order of the compute environment.
      * * `compute_environment_order.#.compute_environment` - The ARN of the compute environment.
      */
    val computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * The priority of the job queue. Job queues with a higher priority are evaluated first when
      * associated with the same compute environment.
      */
    val priority: Double = js.native
    
    /**
      * Describes the ability of the queue to accept new jobs (for example, `ENABLED` or `DISABLED`).
      */
    val state: String = js.native
    
    /**
      * The current status of the job queue (for example, `CREATING` or `VALID`).
      */
    val status: String = js.native
    
    /**
      * A short, human-readable string to provide additional details about the current status
      * of the job queue.
      */
    val statusReason: String = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: StringDictionary[String] = js.native
  }
  object GetJobQueueResult {
    
    @scala.inline
    def apply(
      arn: String,
      computeEnvironmentOrders: js.Array[GetJobQueueComputeEnvironmentOrder],
      id: String,
      name: String,
      priority: Double,
      state: String,
      status: String,
      statusReason: String,
      tags: StringDictionary[String]
    ): GetJobQueueResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], computeEnvironmentOrders = computeEnvironmentOrders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetJobQueueResult]
    }
    
    @scala.inline
    implicit class GetJobQueueResultMutableBuilder[Self <: GetJobQueueResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeEnvironmentOrders(value: js.Array[GetJobQueueComputeEnvironmentOrder]): Self = StObject.set(x, "computeEnvironmentOrders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeEnvironmentOrdersVarargs(value: GetJobQueueComputeEnvironmentOrder*): Self = StObject.set(x, "computeEnvironmentOrders", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
