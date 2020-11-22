package typingsSlinky.pulumiAws.mod.glue

import typingsSlinky.pulumiAws.jobMod.JobArgs
import typingsSlinky.pulumiAws.jobMod.JobState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "glue.Job")
@js.native
class Job protected ()
  extends typingsSlinky.pulumiAws.glueMod.Job {
  /**
    * Create a Job resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: JobArgs) = this()
  def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "glue.Job")
@js.native
object Job extends js.Object {
  
  /**
    * Get an existing Job resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.jobMod.Job = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobMod.Job = js.native
  def get(name: String, id: Input[ID], state: JobState): typingsSlinky.pulumiAws.jobMod.Job = js.native
  def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.jobMod.Job = js.native
  
  /**
    * Returns true if the given object is an instance of Job.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
}
