package typingsSlinky.pulumiAws.managedScalingPolicyMod

import typingsSlinky.pulumiAws.outputMod.emr.ManagedScalingPolicyComputeLimit
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy")
@js.native
class ManagedScalingPolicy protected () extends CustomResource {
  /**
    * Create a ManagedScalingPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ManagedScalingPolicyArgs) = this()
  def this(name: String, args: ManagedScalingPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The id of the EMR cluster
    */
  val clusterId: Output_[String] = js.native
  
  /**
    * Configuration block with compute limit settings. Described below.
    */
  val computeLimits: Output_[js.Array[ManagedScalingPolicyComputeLimit]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/emr/managedScalingPolicy", "ManagedScalingPolicy")
@js.native
object ManagedScalingPolicy extends js.Object {
  
  /**
    * Get an existing ManagedScalingPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ManagedScalingPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ManagedScalingPolicy = js.native
  def get(name: String, id: Input[ID], state: ManagedScalingPolicyState): ManagedScalingPolicy = js.native
  def get(name: String, id: Input[ID], state: ManagedScalingPolicyState, opts: CustomResourceOptions): ManagedScalingPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of ManagedScalingPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/emr/managedScalingPolicy.ManagedScalingPolicy */ Boolean = js.native
}
