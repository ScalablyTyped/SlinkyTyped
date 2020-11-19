package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpointArgs
import typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpointState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.VpcEndpoint")
@js.native
class VpcEndpoint protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.VpcEndpoint {
  /**
    * Create a VpcEndpoint resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcEndpointArgs) = this()
  def this(name: String, args: VpcEndpointArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws", "ec2.VpcEndpoint")
@js.native
object VpcEndpoint extends js.Object {
  
  /**
    * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState): typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpoint = js.native
  def get(name: String, id: Input[ID], state: VpcEndpointState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcEndpointMod.VpcEndpoint = js.native
  
  /**
    * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ Boolean = js.native
}
