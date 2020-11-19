package typingsSlinky.pulumiAws.rdsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
@js.native
class Snapshot protected () extends CustomResource {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotArgs) = this()
  def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Output_[Double] = js.native
  
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: Output_[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: Output_[String] = js.native
  
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: Output_[String] = js.native
  
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: Output_[Boolean] = js.native
  
  /**
    * Specifies the name of the database engine.
    */
  val engine: Output_[String] = js.native
  
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: Output_[String] = js.native
  
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: Output_[Double] = js.native
  
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: Output_[String] = js.native
  
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: Output_[String] = js.native
  
  val port: Output_[Double] = js.native
  
  val snapshotType: Output_[String] = js.native
  
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: Output_[String] = js.native
  
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: Output_[String] = js.native
  
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: Output_[String] = js.native
  
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val vpcId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
@js.native
object Snapshot extends js.Object {
  
  /**
    * Get an existing Snapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Snapshot = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState): Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): Snapshot = js.native
  
  /**
    * Returns true if the given object is an instance of Snapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = js.native
}
