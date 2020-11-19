package typingsSlinky.pulumiAws.containerPolicyMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
@js.native
class ContainerPolicy protected () extends CustomResource {
  /**
    * Create a ContainerPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ContainerPolicyArgs) = this()
  def this(name: String, args: ContainerPolicyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the container.
    */
  val containerName: Output_[String] = js.native
  
  /**
    * The contents of the policy.
    */
  val policy: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/mediastore/containerPolicy", "ContainerPolicy")
@js.native
object ContainerPolicy extends js.Object {
  
  /**
    * Get an existing ContainerPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ContainerPolicy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ContainerPolicy = js.native
  def get(name: String, id: Input[ID], state: ContainerPolicyState): ContainerPolicy = js.native
  def get(name: String, id: Input[ID], state: ContainerPolicyState, opts: CustomResourceOptions): ContainerPolicy = js.native
  
  /**
    * Returns true if the given object is an instance of ContainerPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediastore/containerPolicy.ContainerPolicy */ Boolean = js.native
}
