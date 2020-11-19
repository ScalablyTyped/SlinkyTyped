package typingsSlinky.pulumiAws.neptuneClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance")
@js.native
class ClusterInstance protected () extends CustomResource {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterInstanceArgs) = this()
  def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The hostname of the instance. See also `endpoint` and `port`.
    */
  val address: Output_[String] = js.native
  
  /**
    * Specifies whether any instance modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: Output_[Boolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of neptune instance
    */
  val arn: Output_[String] = js.native
  
  /**
    * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
    */
  val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The EC2 Availability Zone that the neptune instance is created in.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
    */
  val clusterIdentifier: Output_[String] = js.native
  
  /**
    * The region-unique, immutable identifier for the neptune instance.
    */
  val dbiResourceId: Output_[String] = js.native
  
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
    */
  val engine: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The neptune engine version.
    */
  val engineVersion: Output_[String] = js.native
  
  /**
    * The indentifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: Output_[String] = js.native
  
  /**
    * The instance class to use.
    */
  val instanceClass: Output_[String] = js.native
  
  /**
    * The ARN for the KMS encryption key if one is set to the neptune cluster.
    */
  val kmsKeyArn: Output_[String] = js.native
  
  /**
    * The name of the neptune parameter group to associate with this instance.
    */
  val neptuneParameterGroupName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `aws.neptune.Cluster`.
    */
  val neptuneSubnetGroupName: Output_[String] = js.native
  
  /**
    * The port on which the DB accepts connections. Defaults to `8182`.
    */
  val port: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
    */
  val preferredBackupWindow: Output_[String] = js.native
  
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: Output_[String] = js.native
  
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * Bool to control if instance is publicly accessible. Default is `false`.
    */
  val publiclyAccessible: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Specifies whether the neptune cluster is encrypted.
    */
  val storageEncrypted: Output_[Boolean] = js.native
  
  /**
    * A map of tags to assign to the instance.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: Output_[Boolean] = js.native
}
/* static members */
@JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = js.native
  
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/clusterInstance.ClusterInstance */ Boolean = js.native
}
