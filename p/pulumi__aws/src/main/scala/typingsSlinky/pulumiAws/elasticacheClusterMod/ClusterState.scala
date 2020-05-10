package typingsSlinky.pulumiAws.elasticacheClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.elasticache.ClusterCacheNode
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon ElastiCache Documentation for more information.][1]
    * (Available since v0.6.0)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferredAvailabilityZones` instead. Default: System chosen Availability Zone.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `numCacheNodes` must be greater than `1`
    */
  val azMode: js.UndefOr[Input[String]] = js.native
  /**
    * List of node objects including `id`, `address`, `port` and `availabilityZone`.
    * Referenceable e.g. as `${aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.UndefOr[Input[js.Array[Input[ClusterCacheNode]]]] = js.native
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Group identifier. ElastiCache converts
    * this name to lowercase
    */
  val clusterId: js.UndefOr[Input[String]] = js.native
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the cache engine to be used for this cache cluster.
    * Valid values for this parameter are `memcached` or `redis`
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Version number of the cache engine to be used.
    * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
    * in the AWS Documentation center for supported versions
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
    * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The compute and memory capacity of the nodes. See
    * [Available Cache Node Types](https://aws.amazon.com/elasticache/details#Available_Cache_Node_Types) for
    * supported node types
    */
  val nodeType: js.UndefOr[Input[String]] = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic to send ElastiCache notifications to. Example:
    * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
    */
  val notificationTopicArn: js.UndefOr[Input[String]] = js.native
  /**
    * The initial number of cache nodes that the
    * cache cluster will have. For Redis, this value must be 1. For Memcache, this
    * value must be between 1 and 20. If this number is reduced on subsequent runs,
    * the highest numbered nodes will be removed.
    */
  val numCacheNodes: js.UndefOr[Input[Double]] = js.native
  /**
    * Name of the parameter group to associate
    * with this cache cluster
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port number on which each of the cache nodes will accept connections. For Memcache the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replicationGroupId`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * A list of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `numCacheNodes`. If you want all the nodes in the same Availability Zone, use `availabilityZone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
    */
  val preferredAvailabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
    */
  val replicationGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * One or more VPC security groups associated
    * with the cache cluster
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of security group
    * names to associate with this cache cluster
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A single-element string list containing an
    * Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3.
    * Example: `arn:aws:s3:::my_bucket/snapshot1.rdb`
    */
  val snapshotArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of a snapshot from which to restore data into the new node group.  Changing the `snapshotName` forces a new resource.
    */
  val snapshotName: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them. For example, if you set
    * SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days
    * before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off.
    * Please note that setting a `snapshotRetentionLimit` is not supported on cache.t1.micro or cache.t2.* cache nodes
    */
  val snapshotRetentionLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
    */
  val snapshotWindow: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the subnet group to be used
    * for the cache cluster.
    */
  val subnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(): ClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterState]
  }
  @scala.inline
  implicit class ClusterStateOps[Self <: ClusterState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyImmediately(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withAzMode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAzMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNodes(value: Input[js.Array[Input[ClusterCacheNode]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterAddress(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigurationEndpoint(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationTopicArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationTopicArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTopicArn")(js.undefined)
        ret
    }
    @scala.inline
    def withNumCacheNodes(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumCacheNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCacheNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredAvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredAvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotArns(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotArns")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotName")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotRetentionLimit(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotRetentionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotRetentionLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotRetentionLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

