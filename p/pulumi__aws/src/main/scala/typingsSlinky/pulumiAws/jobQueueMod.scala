package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobQueueMod {
  
  @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
  @js.native
  class JobQueue protected () extends CustomResource {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobQueueArgs) = this()
    def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name of the job queue.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: Output_[js.Array[String]] = js.native
    
    /**
      * Specifies the name of the job queue.
      */
    val name: Output_[String] = js.native
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: Output_[Double] = js.native
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object JobQueue {
    
    /**
      * Get an existing JobQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID]): JobQueue = js.native
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): JobQueue = js.native
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobQueueState): JobQueue = js.native
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): JobQueue = js.native
    
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
  }
  
  @js.native
  trait JobQueueArgs extends StObject {
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: Input[js.Array[Input[String]]] = js.native
    
    /**
      * Specifies the name of the job queue.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: Input[Double] = js.native
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: Input[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object JobQueueArgs {
    
    @scala.inline
    def apply(computeEnvironments: Input[js.Array[Input[String]]], priority: Input[Double], state: Input[String]): JobQueueArgs = {
      val __obj = js.Dynamic.literal(computeEnvironments = computeEnvironments.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobQueueArgs]
    }
    
    @scala.inline
    implicit class JobQueueArgsMutableBuilder[Self <: JobQueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeEnvironmentsVarargs(value: Input[String]*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait JobQueueState extends StObject {
    
    /**
      * The Amazon Resource Name of the job queue.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Specifies the name of the job queue.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object JobQueueState {
    
    @scala.inline
    def apply(): JobQueueState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobQueueState]
    }
    
    @scala.inline
    implicit class JobQueueStateMutableBuilder[Self <: JobQueueState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
      
      @scala.inline
      def setComputeEnvironmentsVarargs(value: Input[String]*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
