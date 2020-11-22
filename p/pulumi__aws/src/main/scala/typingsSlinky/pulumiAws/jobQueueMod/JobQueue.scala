package typingsSlinky.pulumiAws.jobQueueMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
@js.native
object JobQueue extends js.Object {
  
  /**
    * Get an existing JobQueue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): JobQueue = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): JobQueue = js.native
  def get(name: String, id: Input[ID], state: JobQueueState): JobQueue = js.native
  def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): JobQueue = js.native
  
  /**
    * Returns true if the given object is an instance of JobQueue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
}
