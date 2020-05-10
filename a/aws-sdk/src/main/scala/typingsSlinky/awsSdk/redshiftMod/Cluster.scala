package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * A boolean value that, if true, indicates that major version upgrades will be applied automatically to the cluster during the maintenance window. 
    */
  var AllowVersionUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * The number of days that automatic cluster snapshots are retained.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The name of the Availability Zone in which the cluster is located.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The availability status of the cluster for queries. Possible values are the following:   Available - The cluster is available for queries.    Unavailable - The cluster is not available for queries.   Maintenance - The cluster is intermittently available for queries due to maintenance activities.   Modifying - The cluster is intermittently available for queries due to changes that modify the cluster.   Failed - The cluster failed and is not available for queries.  
    */
  var ClusterAvailabilityStatus: js.UndefOr[String] = js.native
  /**
    * The date and time that the cluster was created.
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The unique identifier of the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The nodes in the cluster.
    */
  var ClusterNodes: js.UndefOr[ClusterNodesList] = js.native
  /**
    * The list of cluster parameter groups that are associated with this cluster. Each parameter group in the list is returned with its status.
    */
  var ClusterParameterGroups: js.UndefOr[ClusterParameterGroupStatusList] = js.native
  /**
    * The public key for the cluster.
    */
  var ClusterPublicKey: js.UndefOr[String] = js.native
  /**
    * The specific revision number of the database in the cluster.
    */
  var ClusterRevisionNumber: js.UndefOr[String] = js.native
  /**
    * A list of cluster security group that are associated with the cluster. Each security group is represented by an element that contains ClusterSecurityGroup.Name and ClusterSecurityGroup.Status subelements.  Cluster security groups are used when the cluster is not created in an Amazon Virtual Private Cloud (VPC). Clusters that are created in a VPC use VPC security groups, which are listed by the VpcSecurityGroups parameter. 
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroupMembershipList] = js.native
  /**
    * A value that returns the destination region and retention period that are configured for cross-region snapshot copy.
    */
  var ClusterSnapshotCopyStatus: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ClusterSnapshotCopyStatus] = js.native
  /**
    *  The current state of the cluster. Possible values are the following:    available     available, prep-for-resize     available, resize-cleanup     cancelling-resize     creating     deleting     final-snapshot     hardware-failure     incompatible-hsm     incompatible-network     incompatible-parameters     incompatible-restore     modifying     paused     rebooting     renaming     resizing     rotating-keys     storage-full     updating-hsm   
    */
  var ClusterStatus: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group that is associated with the cluster. This parameter is valid only when the cluster is in a VPC.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The name of the initial database that was created when the cluster was created. This same name is returned for the life of the cluster. If an initial database was not specified, a database named devdev was created by default. 
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * 
    */
  var DataTransferProgress: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.DataTransferProgress] = js.native
  /**
    * Describes a group of DeferredMaintenanceWindow objects.
    */
  var DeferredMaintenanceWindows: js.UndefOr[DeferredMaintenanceWindowsList] = js.native
  /**
    * The status of the elastic IP (EIP) address.
    */
  var ElasticIpStatus: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ElasticIpStatus] = js.native
  /**
    * The number of nodes that you can resize the cluster to with the elastic resize method. 
    */
  var ElasticResizeNumberOfNodeOptions: js.UndefOr[String] = js.native
  /**
    * A boolean value that, if true, indicates that data in the cluster is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The connection endpoint.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Endpoint] = js.native
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  /**
    * The date and time when the next snapshot is expected to be taken for clusters with a valid snapshot schedule and backups enabled. 
    */
  var ExpectedNextSnapshotScheduleTime: js.UndefOr[js.Date] = js.native
  /**
    *  The status of next expected snapshot for clusters having a valid snapshot schedule and backups enabled. Possible values are the following:   OnTrack - The next snapshot is expected to be taken on time.    Pending - The next snapshot is pending to be taken.   
    */
  var ExpectedNextSnapshotScheduleTimeStatus: js.UndefOr[String] = js.native
  /**
    * A value that reports whether the Amazon Redshift cluster has finished applying any hardware security module (HSM) settings changes specified in a modify cluster command. Values: active, applying
    */
  var HsmStatus: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.HsmStatus] = js.native
  /**
    * A list of AWS Identity and Access Management (IAM) roles that can be used by the cluster to access other AWS services.
    */
  var IamRoles: js.UndefOr[ClusterIamRoleList] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key ID of the encryption key used to encrypt data in the cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track for the cluster.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The default number of days to retain a manual snapshot. If the value is -1, the snapshot is retained indefinitely. This setting doesn't change the retention period of existing snapshots. The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  /**
    * The master user name for the cluster. This name is used to connect to the database that is specified in the DBName parameter. 
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The status of a modify operation, if any, initiated for the cluster.
    */
  var ModifyStatus: js.UndefOr[String] = js.native
  /**
    * The date and time in UTC when system maintenance can begin.
    */
  var NextMaintenanceWindowStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The node type for the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of compute nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  /**
    * Cluster operations that are waiting to be started.
    */
  var PendingActions: js.UndefOr[PendingActionsList] = js.native
  /**
    * A value that, if present, indicates that changes to the cluster are pending. Specific pending changes are identified by subelements.
    */
  var PendingModifiedValues: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.PendingModifiedValues] = js.native
  /**
    * The weekly time range, in Universal Coordinated Time (UTC), during which system maintenance can occur.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A boolean value that, if true, indicates that the cluster can be accessed from a public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * Returns the following:   AllowCancelResize: a boolean value indicating if the resize operation can be cancelled.   ResizeType: Returns ClassicResize  
    */
  var ResizeInfo: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.ResizeInfo] = js.native
  /**
    * A value that describes the status of a cluster restore action. This parameter returns null if the cluster was not created by restoring a snapshot.
    */
  var RestoreStatus: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.RestoreStatus] = js.native
  /**
    * A unique identifier for the cluster snapshot schedule.
    */
  var SnapshotScheduleIdentifier: js.UndefOr[String] = js.native
  /**
    * The current state of the cluster snapshot schedule.
    */
  var SnapshotScheduleState: js.UndefOr[ScheduleState] = js.native
  /**
    * The list of tags for the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The identifier of the VPC the cluster is in, if the cluster is in a VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
  /**
    * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups that are associated with the cluster. This parameter is returned only if the cluster is in a VPC.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVersionUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomatedSnapshotRetentionPeriod(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomatedSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomatedSnapshotRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterAvailabilityStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterAvailabilityStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterAvailabilityStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterAvailabilityStatus")(js.undefined)
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
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterNodes(value: ClusterNodesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterParameterGroups(value: ClusterParameterGroupStatusList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterParameterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterParameterGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterPublicKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterRevisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSecurityGroups(value: ClusterSecurityGroupMembershipList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSecurityGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSecurityGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSnapshotCopyStatus(value: ClusterSnapshotCopyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSnapshotCopyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSnapshotCopyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSnapshotCopyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDBName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBName")(js.undefined)
        ret
    }
    @scala.inline
    def withDataTransferProgress(value: DataTransferProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTransferProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataTransferProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withDeferredMaintenanceWindows(value: DeferredMaintenanceWindowsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferredMaintenanceWindows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferredMaintenanceWindows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeferredMaintenanceWindows")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticIpStatus(value: ElasticIpStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIpStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticIpStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticIpStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withElasticResizeNumberOfNodeOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticResizeNumberOfNodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElasticResizeNumberOfNodeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElasticResizeNumberOfNodeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: Endpoint): Self = {
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
    def withEnhancedVpcRouting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedVpcRouting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnhancedVpcRouting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnhancedVpcRouting")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedNextSnapshotScheduleTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedNextSnapshotScheduleTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedNextSnapshotScheduleTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedNextSnapshotScheduleTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpectedNextSnapshotScheduleTimeStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedNextSnapshotScheduleTimeStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpectedNextSnapshotScheduleTimeStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpectedNextSnapshotScheduleTimeStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withHsmStatus(value: HsmStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHsmStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withIamRoles(value: ClusterIamRoleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamRoles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IamRoles")(js.undefined)
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
    def withMaintenanceTrackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceTrackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaintenanceTrackName")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotRetentionPeriod(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRetentionPeriod")(js.undefined)
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
    def withModifyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMaintenanceWindowStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMaintenanceWindowStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMaintenanceWindowStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMaintenanceWindowStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NodeType")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfNodes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingActions(value: PendingActionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingActions")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingModifiedValues(value: PendingModifiedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingModifiedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PendingModifiedValues")(js.undefined)
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
    def withPubliclyAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PubliclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeInfo(value: ResizeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreStatus(value: RestoreStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotScheduleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotScheduleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotScheduleState(value: ScheduleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotScheduleState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotScheduleState")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
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

