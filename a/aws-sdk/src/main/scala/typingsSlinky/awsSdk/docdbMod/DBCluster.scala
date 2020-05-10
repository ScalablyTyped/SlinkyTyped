package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCluster extends js.Object {
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the cluster. IAM roles that are associated with a cluster grant permission for the cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.native
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.docdbMod.AvailabilityZones] = js.native
  /**
    * Specifies the number of days for which automatic snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) for the cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  /**
    * Contains a user-supplied cluster identifier. This identifier is the unique key that identifies a cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Provides the list of instances that make up the cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.native
  /**
    * Specifies the name of the cluster parameter group for the cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.native
  /**
    * Specifies information on the subnet group that is associated with the cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of log types that this cluster is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint for the primary instance of the cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * Provides the name of the database engine to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * Contains the master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.native
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The reader endpoint for the cluster. The reader endpoint for a cluster load balances connections across the Amazon DocumentDB replicas that are available in a cluster. As clients request new connections to the reader endpoint, Amazon DocumentDB distributes the connection requests among the Amazon DocumentDB replicas in the cluster. This functionality can help balance your read workload across multiple Amazon DocumentDB replicas in your cluster.  If a failover occurs, and the Amazon DocumentDB replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Amazon DocumentDB replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides a list of virtual private cloud (VPC) security groups that the cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBCluster {
  @scala.inline
  def apply(): DBCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBCluster]
  }
  @scala.inline
  implicit class DBClusterOps[Self <: DBCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociatedRoles(value: DBClusterRoles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociatedRoles")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterMembers(value: DBClusterMemberList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterParameterGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDBSubnetGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBSubnetGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSubnetGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbClusterResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withEarliestRestorableTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarliestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EarliestRestorableTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledCloudwatchLogsExports(value: LogTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledCloudwatchLogsExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledCloudwatchLogsExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnabledCloudwatchLogsExports")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestRestorableTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestRestorableTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MasterUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZ")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentProgress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PercentProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withReaderEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReaderEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaderEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReaderEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcSecurityGroups")(js.undefined)
        ret
    }
  }
  
}

