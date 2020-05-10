package typingsSlinky.pulumiAws.redshiftGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  /**
    * Whether major version upgrades can be applied during maintenance period
    */
  val allowVersionUpgrade: Boolean = js.native
  /**
    * The backup retention period
    */
  val automatedSnapshotRetentionPeriod: Double = js.native
  /**
    * The availability zone of the cluster
    */
  val availabilityZone: String = js.native
  /**
    * The name of the S3 bucket where the log files are to be stored
    */
  val bucketName: String = js.native
  /**
    * The cluster identifier
    */
  val clusterIdentifier: String = js.native
  /**
    * The name of the parameter group to be associated with this cluster
    */
  val clusterParameterGroupName: String = js.native
  /**
    * The public key for the cluster
    */
  val clusterPublicKey: String = js.native
  /**
    * The cluster revision number
    */
  val clusterRevisionNumber: String = js.native
  /**
    * The security groups associated with the cluster
    */
  val clusterSecurityGroups: js.Array[String] = js.native
  /**
    * The name of a cluster subnet group to be associated with this cluster
    */
  val clusterSubnetGroupName: String = js.native
  /**
    * The cluster type
    */
  val clusterType: String = js.native
  val clusterVersion: String = js.native
  /**
    * The name of the default database in the cluster
    */
  val databaseName: String = js.native
  /**
    * The Elastic IP of the cluster
    */
  val elasticIp: String = js.native
  /**
    * Whether cluster logging is enabled
    */
  val enableLogging: Boolean = js.native
  /**
    * Whether the cluster data is encrypted
    */
  val encrypted: Boolean = js.native
  /**
    * The cluster endpoint
    */
  val endpoint: String = js.native
  /**
    * Whether enhanced VPC routing is enabled
    */
  val enhancedVpcRouting: Boolean = js.native
  /**
    * The IAM roles associated to the cluster
    */
  val iamRoles: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The KMS encryption key associated to the cluster
    */
  val kmsKeyId: String = js.native
  /**
    * Username for the master DB user
    */
  val masterUsername: String = js.native
  /**
    * The cluster node type
    */
  val nodeType: String = js.native
  /**
    * The number of nodes in the cluster
    */
  val numberOfNodes: Double = js.native
  /**
    * The port the cluster responds on
    */
  val port: Double = js.native
  /**
    * The maintenance window
    */
  val preferredMaintenanceWindow: String = js.native
  /**
    * Whether the cluster is publicly accessible
    */
  val publiclyAccessible: Boolean = js.native
  /**
    * The folder inside the S3 bucket where the log files are stored
    */
  val s3KeyPrefix: String = js.native
  /**
    * The tags associated to the cluster
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The VPC Id associated with the cluster
    */
  val vpcId: String = js.native
  /**
    * The VPC security group Ids associated with the cluster
    */
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    allowVersionUpgrade: Boolean,
    automatedSnapshotRetentionPeriod: Double,
    availabilityZone: String,
    bucketName: String,
    clusterIdentifier: String,
    clusterParameterGroupName: String,
    clusterPublicKey: String,
    clusterRevisionNumber: String,
    clusterSecurityGroups: js.Array[String],
    clusterSubnetGroupName: String,
    clusterType: String,
    clusterVersion: String,
    databaseName: String,
    elasticIp: String,
    enableLogging: Boolean,
    encrypted: Boolean,
    endpoint: String,
    enhancedVpcRouting: Boolean,
    iamRoles: js.Array[String],
    id: String,
    kmsKeyId: String,
    masterUsername: String,
    nodeType: String,
    numberOfNodes: Double,
    port: Double,
    preferredMaintenanceWindow: String,
    publiclyAccessible: Boolean,
    s3KeyPrefix: String,
    vpcId: String,
    vpcSecurityGroupIds: js.Array[String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(allowVersionUpgrade = allowVersionUpgrade.asInstanceOf[js.Any], automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterParameterGroupName = clusterParameterGroupName.asInstanceOf[js.Any], clusterPublicKey = clusterPublicKey.asInstanceOf[js.Any], clusterRevisionNumber = clusterRevisionNumber.asInstanceOf[js.Any], clusterSecurityGroups = clusterSecurityGroups.asInstanceOf[js.Any], clusterSubnetGroupName = clusterSubnetGroupName.asInstanceOf[js.Any], clusterType = clusterType.asInstanceOf[js.Any], clusterVersion = clusterVersion.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], elasticIp = elasticIp.asInstanceOf[js.Any], enableLogging = enableLogging.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], enhancedVpcRouting = enhancedVpcRouting.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], numberOfNodes = numberOfNodes.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], publiclyAccessible = publiclyAccessible.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterResult]
  }
  @scala.inline
  implicit class GetClusterResultOps[Self <: GetClusterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutomatedSnapshotRetentionPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterSecurityGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElasticIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnhancedVpcRouting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhancedVpcRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamRoles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasterUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3KeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3KeyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
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

