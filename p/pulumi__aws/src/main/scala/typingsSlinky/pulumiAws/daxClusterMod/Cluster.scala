package typingsSlinky.pulumiAws.daxClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.dax.ClusterNode
import typingsSlinky.pulumiAws.outputMod.dax.ClusterServerSideEncryption
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/dax/cluster", "Cluster")
@js.native
class Cluster protected () extends CustomResource {
  /**
    * Create a Cluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterArgs) = this()
  def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the DAX cluster
    */
  val arn: Output_[String] = js.native
  
  /**
    * List of Availability Zones in which the
    * nodes will be created
    */
  val availabilityZones: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The DNS name of the DAX cluster without the port appended
    */
  val clusterAddress: Output_[String] = js.native
  
  /**
    * Group identifier. DAX converts this name to
    * lowercase
    */
  val clusterName: Output_[String] = js.native
  
  /**
    * The configuration endpoint for this DAX cluster,
    * consisting of a DNS name and a port number
    */
  val configurationEndpoint: Output_[String] = js.native
  
  /**
    * Description for the cluster
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A valid Amazon Resource Name (ARN) that identifies
    * an IAM role. At runtime, DAX will assume this role and use the role's
    * permissions to access DynamoDB on your behalf
    */
  val iamRoleArn: Output_[String] = js.native
  
  /**
    * Specifies the weekly time range for when
    * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
    * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
    * `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: Output_[String] = js.native
  
  /**
    * The compute and memory capacity of the nodes. See
    * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
    */
  val nodeType: Output_[String] = js.native
  
  /**
    * List of node objects including `id`, `address`, `port` and
    * `availabilityZone`. Referenceable e.g. as
    * `${aws_dax_cluster.test.nodes.0.address}`
    */
  val nodes: Output_[js.Array[ClusterNode]] = js.native
  
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send DAX notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of the parameter group to associate
    * with this DAX cluster
    */
  val parameterGroupName: Output_[String] = js.native
  
  /**
    * The port used by the configuration endpoint
    */
  val port: Output_[Double] = js.native
  
  /**
    * The number of nodes in the DAX cluster. A
    * replication factor of 1 will create a single-node cluster, without any read
    * replicas
    */
  val replicationFactor: Output_[Double] = js.native
  
  /**
    * One or more VPC security groups associated
    * with the cluster
    */
  val securityGroupIds: Output_[js.Array[String]] = js.native
  
  /**
    * Encrypt at rest options
    */
  val serverSideEncryption: Output_[js.UndefOr[ClusterServerSideEncryption]] = js.native
  
  /**
    * Name of the subnet group to be used for the
    * cluster
    */
  val subnetGroupName: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/dax/cluster", "Cluster")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dax/cluster.Cluster */ Boolean = js.native
}
