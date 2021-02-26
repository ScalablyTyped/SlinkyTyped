package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironmentArgs
import typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironmentState
import typingsSlinky.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentArgs
import typingsSlinky.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentResult
import typingsSlinky.pulumiAws.getJobQueueMod.GetJobQueueArgs
import typingsSlinky.pulumiAws.getJobQueueMod.GetJobQueueResult
import typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinitionArgs
import typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinitionState
import typingsSlinky.pulumiAws.jobQueueMod.JobQueueArgs
import typingsSlinky.pulumiAws.jobQueueMod.JobQueueState
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMod {
  
  @JSImport("@pulumi/aws/batch", "ComputeEnvironment")
  @js.native
  class ComputeEnvironment protected ()
    extends typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironment {
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
  /* static members */
  object ComputeEnvironment {
    
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/batch", "ComputeEnvironment.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    @JSImport("@pulumi/aws/batch", "ComputeEnvironment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    @JSImport("@pulumi/aws/batch", "ComputeEnvironment.get")
    @js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState): typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    @JSImport("@pulumi/aws/batch", "ComputeEnvironment.get")
    @js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.computeEnvironmentMod.ComputeEnvironment = js.native
    
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/batch", "ComputeEnvironment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/batch", "JobDefinition")
  @js.native
  class JobDefinition protected ()
    extends typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinition {
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
  /* static members */
  object JobDefinition {
    
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/batch", "JobDefinition.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    @JSImport("@pulumi/aws/batch", "JobDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    @JSImport("@pulumi/aws/batch", "JobDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState): typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    @JSImport("@pulumi/aws/batch", "JobDefinition.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobDefinitionMod.JobDefinition = js.native
    
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/batch", "JobDefinition.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/batch", "JobQueue")
  @js.native
  class JobQueue protected ()
    extends typingsSlinky.pulumiAws.jobQueueMod.JobQueue {
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
    @JSImport("@pulumi/aws/batch", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.jobQueueMod.JobQueue = js.native
    @JSImport("@pulumi/aws/batch", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobQueueMod.JobQueue = js.native
    @JSImport("@pulumi/aws/batch", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobQueueState): typingsSlinky.pulumiAws.jobQueueMod.JobQueue = js.native
    @JSImport("@pulumi/aws/batch", "JobQueue.get")
    @js.native
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobQueueMod.JobQueue = js.native
    
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/batch", "JobQueue.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/batch", "getComputeEnvironment")
  @js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] = js.native
  @JSImport("@pulumi/aws/batch", "getComputeEnvironment")
  @js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] = js.native
  
  @JSImport("@pulumi/aws/batch", "getJobQueue")
  @js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] = js.native
  @JSImport("@pulumi/aws/batch", "getJobQueue")
  @js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] = js.native
}
