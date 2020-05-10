package typingsSlinky.pulumiAws.elasticacheGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.elasticache.GetClusterCacheNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  val arn: String = js.native
  /**
    * The Availability Zone for the cache cluster.
    */
  val availabilityZone: String = js.native
  /**
    * List of node objects including `id`, `address`, `port` and `availabilityZone`.
    * Referenceable e.g. as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
    */
  val cacheNodes: js.Array[GetClusterCacheNode] = js.native
  /**
    * (Memcached only) The DNS name of the cache cluster without the port appended.
    */
  val clusterAddress: String = js.native
  val clusterId: String = js.native
  /**
    * (Memcached only) The configuration endpoint to allow host discovery.
    */
  val configurationEndpoint: String = js.native
  /**
    * Name of the cache engine.
    */
  val engine: String = js.native
  /**
    * Version number of the cache engine.
    */
  val engineVersion: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Specifies the weekly time range for when maintenance
    * on the cache cluster is performed.
    */
  val maintenanceWindow: String = js.native
  /**
    * The cluster node type.
    */
  val nodeType: String = js.native
  /**
    * An Amazon Resource Name (ARN) of an
    * SNS topic that ElastiCache notifications get sent to.
    */
  val notificationTopicArn: String = js.native
  /**
    * The number of cache nodes that the cache cluster has.
    */
  val numCacheNodes: Double = js.native
  /**
    * Name of the parameter group associated with this cache cluster.
    */
  val parameterGroupName: String = js.native
  /**
    * The port number on which each of the cache nodes will
    * accept connections.
    */
  val port: Double = js.native
  /**
    * The replication group to which this cache cluster belongs.
    */
  val replicationGroupId: String = js.native
  /**
    * List VPC security groups associated with the cache cluster.
    */
  val securityGroupIds: js.Array[String] = js.native
  /**
    * List of security group names associated with this cache cluster.
    */
  val securityGroupNames: js.Array[String] = js.native
  /**
    * The number of days for which ElastiCache will
    * retain automatic cache cluster snapshots before deleting them.
    */
  val snapshotRetentionLimit: Double = js.native
  /**
    * The daily time range (in UTC) during which ElastiCache will
    * begin taking a daily snapshot of the cache cluster.
    */
  val snapshotWindow: String = js.native
  /**
    * Name of the subnet group associated to the cache cluster.
    */
  val subnetGroupName: String = js.native
  /**
    * The tags assigned to the resource
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZone: String,
    cacheNodes: js.Array[GetClusterCacheNode],
    clusterAddress: String,
    clusterId: String,
    configurationEndpoint: String,
    engine: String,
    engineVersion: String,
    id: String,
    maintenanceWindow: String,
    nodeType: String,
    notificationTopicArn: String,
    numCacheNodes: Double,
    parameterGroupName: String,
    port: Double,
    replicationGroupId: String,
    securityGroupIds: js.Array[String],
    securityGroupNames: js.Array[String],
    snapshotRetentionLimit: Double,
    snapshotWindow: String,
    subnetGroupName: String,
    tags: StringDictionary[js.Any]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], cacheNodes = cacheNodes.asInstanceOf[js.Any], clusterAddress = clusterAddress.asInstanceOf[js.Any], clusterId = clusterId.asInstanceOf[js.Any], configurationEndpoint = configurationEndpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maintenanceWindow = maintenanceWindow.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], notificationTopicArn = notificationTopicArn.asInstanceOf[js.Any], numCacheNodes = numCacheNodes.asInstanceOf[js.Any], parameterGroupName = parameterGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replicationGroupId = replicationGroupId.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any], securityGroupNames = securityGroupNames.asInstanceOf[js.Any], snapshotRetentionLimit = snapshotRetentionLimit.asInstanceOf[js.Any], snapshotWindow = snapshotWindow.asInstanceOf[js.Any], subnetGroupName = subnetGroupName.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheNodes(value: js.Array[GetClusterCacheNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationTopicArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationTopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumCacheNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCacheNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityGroupNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotRetentionLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotRetentionLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

