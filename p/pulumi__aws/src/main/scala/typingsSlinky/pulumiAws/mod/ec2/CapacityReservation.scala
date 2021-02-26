package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservationArgs
import typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservationState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.CapacityReservation")
@js.native
class CapacityReservation protected ()
  extends typingsSlinky.pulumiAws.ec2Mod.CapacityReservation {
  /**
    * Create a CapacityReservation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CapacityReservationArgs) = this()
  def this(name: String, args: CapacityReservationArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object CapacityReservation {
  
  /**
    * Get an existing CapacityReservation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.CapacityReservation.get")
  @js.native
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservation = js.native
  @JSImport("@pulumi/aws", "ec2.CapacityReservation.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservation = js.native
  @JSImport("@pulumi/aws", "ec2.CapacityReservation.get")
  @js.native
  def get(name: String, id: Input[ID], state: CapacityReservationState): typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservation = js.native
  @JSImport("@pulumi/aws", "ec2.CapacityReservation.get")
  @js.native
  def get(name: String, id: Input[ID], state: CapacityReservationState, opts: CustomResourceOptions): typingsSlinky.pulumiAws.capacityReservationMod.CapacityReservation = js.native
  
  /**
    * Returns true if the given object is an instance of CapacityReservation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.CapacityReservation.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/capacityReservation.CapacityReservation */ Boolean = js.native
}
