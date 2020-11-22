package typingsSlinky.pulumiAws.volumeMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ebs/volume", "Volume")
@js.native
class Volume protected () extends CustomResource {
  /**
    * Create a Volume resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VolumeArgs) = this()
  def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: Output_[String] = js.native
  
  /**
    * The AZ where the EBS volume will exist.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: Output_[Boolean] = js.native
  
  /**
    * The amount of IOPS to provision for the disk. Only valid for `type` of `io1` or `io2`.
    */
  val iops: Output_[Double] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported exclusively on `io1` volumes.
    */
  val multiAttachEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The size of the drive in GiBs.
    */
  val size: Output_[Double] = js.native
  
  /**
    * A snapshot to base the EBS volume off of.
    */
  val snapshotId: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The type of EBS volume. Can be "standard", "gp2", "io1", "io2", "sc1" or "st1" (Default: "gp2").
    */
  val `type`: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ebs/volume", "Volume")
@js.native
object Volume extends js.Object {
  
  /**
    * Get an existing Volume resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Volume = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Volume = js.native
  def get(name: String, id: Input[ID], state: VolumeState): Volume = js.native
  def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): Volume = js.native
  
  /**
    * Returns true if the given object is an instance of Volume.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
}
