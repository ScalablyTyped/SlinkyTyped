package typingsSlinky.pulumiAws.snapshotScheduleAssociationMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/redshift/snapshotScheduleAssociation", "SnapshotScheduleAssociation")
@js.native
class SnapshotScheduleAssociation protected () extends CustomResource {
  /**
    * Create a SnapshotScheduleAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotScheduleAssociationArgs) = this()
  def this(name: String, args: SnapshotScheduleAssociationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Output_[String] = js.native
  
  /**
    * The snapshot schedule identifier.
    */
  val scheduleIdentifier: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/redshift/snapshotScheduleAssociation", "SnapshotScheduleAssociation")
@js.native
object SnapshotScheduleAssociation extends js.Object {
  
  /**
    * Get an existing SnapshotScheduleAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SnapshotScheduleAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotScheduleAssociation = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState): SnapshotScheduleAssociation = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleAssociationState, opts: CustomResourceOptions): SnapshotScheduleAssociation = js.native
  
  /**
    * Returns true if the given object is an instance of SnapshotScheduleAssociation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotScheduleAssociation.SnapshotScheduleAssociation */ Boolean = js.native
}
