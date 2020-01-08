package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironmentArgs
import typingsSlinky.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironmentState
import typingsSlinky.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentArgs
import typingsSlinky.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentResult
import typingsSlinky.atPulumiAws.batchGetJobQueueMod.GetJobQueueArgs
import typingsSlinky.atPulumiAws.batchGetJobQueueMod.GetJobQueueResult
import typingsSlinky.atPulumiAws.batchJobDefinitionMod.JobDefinitionArgs
import typingsSlinky.atPulumiAws.batchJobDefinitionMod.JobDefinitionState
import typingsSlinky.atPulumiAws.batchJobQueueMod.JobQueueArgs
import typingsSlinky.atPulumiAws.batchJobQueueMod.JobQueueState
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.atPulumiPulumi.outputMod.Input
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "batch")
@js.native
object batch extends js.Object {
  @js.native
  class ComputeEnvironment protected ()
    extends typingsSlinky.atPulumiAws.batchMod.ComputeEnvironment {
    /**
      * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComputeEnvironmentArgs) = this()
    def this(name: String, args: ComputeEnvironmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobDefinition protected ()
    extends typingsSlinky.atPulumiAws.batchMod.JobDefinition {
    /**
      * Create a JobDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobDefinitionArgs) = this()
    def this(name: String, args: JobDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobQueue protected ()
    extends typingsSlinky.atPulumiAws.batchMod.JobQueue {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobQueueArgs) = this()
    def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
  }
  
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  /* static members */
  @js.native
  object ComputeEnvironment extends js.Object {
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState): typingsSlinky.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobDefinition extends js.Object {
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState): typingsSlinky.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobQueue extends js.Object {
    /**
      * Get an existing JobQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsSlinky.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState): typingsSlinky.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typingsSlinky.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
  }
  
}

