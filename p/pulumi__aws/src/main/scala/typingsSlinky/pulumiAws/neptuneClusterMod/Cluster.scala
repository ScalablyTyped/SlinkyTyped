package typingsSlinky.pulumiAws.neptuneClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/neptune/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: Output_[Boolean] = js.native
  
  /**
    * The Neptune Cluster Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  
  /**
    * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
    */
  val availabilityZones: Output_[js.Array[String]] = js.native
  
  /**
    * The days to retain backups for. Default `1`
    */
  val backupRetentionPeriod: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val clusterIdentifier: Output_[String] = js.native
  
  /**
    * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `clusterIdentifier`.
    */
  val clusterIdentifierPrefix: Output_[String] = js.native
  
  /**
    * List of Neptune Instances that are a part of this cluster
    */
  val clusterMembers: Output_[js.Array[String]] = js.native
  
  /**
    * The Neptune Cluster Resource ID
    */
  val clusterResourceId: Output_[String] = js.native
  
  /**
    * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
    */
  val deletionProtection: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
    */
  val enableCloudwatchLogsExports: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The DNS address of the Neptune instance
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
    */
  val engine: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The database engine version.
    */
  val engineVersion: Output_[String] = js.native
  
  /**
    * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
    */
  val finalSnapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Route53 Hosted Zone ID of the endpoint
    */
  val hostedZoneId: Output_[String] = js.native
  
  /**
    * Specifies whether or mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
    */
  val iamRoles: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyArn`, `storageEncrypted` needs to be set to true.
    */
  val kmsKeyArn: Output_[String] = js.native
  
  /**
    * A cluster parameter group to associate with the cluster.
    */
  val neptuneClusterParameterGroupName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A Neptune subnet group to associate with this Neptune instance.
    */
  val neptuneSubnetGroupName: Output_[String] = js.native
  
  /**
    * The port on which the Neptune accepts connections. Default is `8182`.
    */
  val port: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per region. e.g. 04:00-09:00
    */
  val preferredBackupWindow: Output_[String] = js.native
  
  /**
    * The weekly time range during which system maintenance can occur, in (UTC) e.g. wed:04:00-wed:04:30
    */
  val preferredMaintenanceWindow: Output_[String] = js.native
  
  /**
    * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
    */
  val readerEndpoint: Output_[String] = js.native
  
  /**
    * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
    */
  val replicationSourceIdentifier: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `finalSnapshotIdentifier`. Default is `false`.
    */
  val skipFinalSnapshot: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
    */
  val snapshotIdentifier: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
    */
  val storageEncrypted: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * A map of tags to assign to the Neptune cluster.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * List of VPC security groups to associate with the Cluster
    */
  val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/neptune/cluster", "Cluster")
@js.native
object Cluster extends js.Object {
  
  /**
    * Get an existing Cluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Cluster = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState): Cluster = js.native
  def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): Cluster = js.native
  
  /**
    * Returns true if the given object is an instance of Cluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/neptune/cluster.Cluster */ Boolean = js.native
}
