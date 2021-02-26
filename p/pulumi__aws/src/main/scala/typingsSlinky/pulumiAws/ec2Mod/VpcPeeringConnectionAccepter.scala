package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterArgs
import typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepterState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter")
@js.native
class VpcPeeringConnectionAccepter protected ()
  extends typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter {
  /**
    * Create a VpcPeeringConnectionAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcPeeringConnectionAccepterArgs) = this()
  def this(name: String, args: VpcPeeringConnectionAccepterArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object VpcPeeringConnectionAccepter {
  
  /**
    * Get an existing VpcPeeringConnectionAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  @JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  @JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState): typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  @JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpcPeeringConnectionAccepterState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.vpcPeeringConnectionAccepterMod.VpcPeeringConnectionAccepter = js.native
  
  /**
    * Returns true if the given object is an instance of VpcPeeringConnectionAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws/ec2", "VpcPeeringConnectionAccepter.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnectionAccepter.VpcPeeringConnectionAccepter */ Boolean = js.native
}
