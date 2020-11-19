package typingsSlinky.pulumiAws.amiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.AmiFromInstanceEbsBlockDevice
import typingsSlinky.pulumiAws.outputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
@js.native
class AmiFromInstance protected () extends CustomResource {
  /**
    * Create a AmiFromInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AmiFromInstanceArgs) = this()
  def this(name: String, args: AmiFromInstanceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: Output_[String] = js.native
  
  /**
    * The ARN of the AMI.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: Output_[js.Array[AmiFromInstanceEbsBlockDevice]] = js.native
  
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: Output_[Boolean] = js.native
  
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: Output_[js.Array[AmiFromInstanceEphemeralBlockDevice]] = js.native
  
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: Output_[String] = js.native
  
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: Output_[String] = js.native
  
  val manageEbsSnapshots: Output_[Boolean] = js.native
  
  /**
    * A region-unique name for the AMI.
    */
  val name: Output_[String] = js.native
  
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: Output_[String] = js.native
  
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: Output_[String] = js.native
  
  val rootSnapshotId: Output_[String] = js.native
  
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: Output_[String] = js.native
  
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
@js.native
object AmiFromInstance extends js.Object {
  
  /**
    * Get an existing AmiFromInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AmiFromInstance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AmiFromInstance = js.native
  def get(name: String, id: Input[ID], state: AmiFromInstanceState): AmiFromInstance = js.native
  def get(name: String, id: Input[ID], state: AmiFromInstanceState, opts: CustomResourceOptions): AmiFromInstance = js.native
  
  /**
    * Returns true if the given object is an instance of AmiFromInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ Boolean = js.native
}
