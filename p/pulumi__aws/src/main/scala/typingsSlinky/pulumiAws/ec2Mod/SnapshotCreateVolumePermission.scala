package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionArgs
import typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermissionState
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "SnapshotCreateVolumePermission")
@js.native
class SnapshotCreateVolumePermission protected ()
  extends typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission {
  /**
    * Create a SnapshotCreateVolumePermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotCreateVolumePermissionArgs) = this()
  def this(name: String, args: SnapshotCreateVolumePermissionArgs, opts: CustomResourceOptions) = this()
}
/* static members */
@JSImport("@pulumi/aws/ec2", "SnapshotCreateVolumePermission")
@js.native
object SnapshotCreateVolumePermission extends js.Object {
  
  /**
    * Get an existing SnapshotCreateVolumePermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
  def get(name: String, id: Input[ID], state: SnapshotCreateVolumePermissionState): typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
  def get(
    name: String,
    id: Input[ID],
    state: SnapshotCreateVolumePermissionState,
    opts: CustomResourceOptions
  ): typingsSlinky.pulumiAws.snapshotCreateVolumePermissionMod.SnapshotCreateVolumePermission = js.native
  
  /**
    * Returns true if the given object is an instance of SnapshotCreateVolumePermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/snapshotCreateVolumePermission.SnapshotCreateVolumePermission */ Boolean = js.native
}
