package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * A list of the AWS customer accounts authorized to restore the snapshot. Returns null if no accounts are authorized. Visible only to the snapshot owner. 
    */
  var AccountsWithRestoreAccess: js.UndefOr[AccountsWithRestoreAccessList] = js.native
  /**
    * The size of the incremental backup.
    */
  var ActualIncrementalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The Availability Zone in which the cluster was created.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The number of megabytes that have been transferred to the snapshot backup.
    */
  var BackupProgressInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The time (UTC) when the cluster was originally created.
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the cluster for which the snapshot was taken.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The version ID of the Amazon Redshift engine that is running on the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The number of megabytes per second being transferred to the snapshot backup. Returns 0 for a completed backup. 
    */
  var CurrentBackupRateInMegaBytesPerSecond: js.UndefOr[Double] = js.native
  /**
    * The name of the database that was created when the cluster was created.
    */
  var DBName: js.UndefOr[String] = js.native
  /**
    * The amount of time an in-progress snapshot backup has been running, or the amount of time it took a completed backup to finish.
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.native
  /**
    * If true, the data in the snapshot is encrypted at rest.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * A boolean that indicates whether the snapshot data is encrypted using the HSM keys of the source cluster. true indicates that the data is encrypted using HSM keys.
    */
  var EncryptedWithHSM: js.UndefOr[Boolean] = js.native
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.native
  /**
    * The estimate of the time remaining before the snapshot backup will complete. Returns 0 for a completed backup. 
    */
  var EstimatedSecondsToCompletion: js.UndefOr[Long] = js.native
  /**
    * The AWS Key Management Service (KMS) key ID of the encryption key that was used to encrypt data in the cluster from which the snapshot was taken.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the maintenance track for the snapshot.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  /**
    * The number of days until a manual snapshot will pass its retention period.
    */
  var ManualSnapshotRemainingDays: js.UndefOr[IntegerOptional] = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The node type of the nodes in the cluster.
    */
  var NodeType: js.UndefOr[String] = js.native
  /**
    * The number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
  /**
    * For manual snapshots, the AWS customer account used to create or copy the snapshot. For automatic snapshots, the owner of the cluster. The owner can perform all snapshot actions, such as sharing a manual snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.native
  /**
    * The port that the cluster is listening on.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The list of node types that this cluster snapshot is able to restore into.
    */
  var RestorableNodeTypes: js.UndefOr[RestorableNodeTypeList] = js.native
  /**
    * The time (in UTC format) when Amazon Redshift began the snapshot. A snapshot contains a copy of the cluster data as of this exact time.
    */
  var SnapshotCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * The snapshot identifier that is provided in the request.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A timestamp representing the start of the retention period for the snapshot.
    */
  var SnapshotRetentionStartTime: js.UndefOr[js.Date] = js.native
  /**
    * The snapshot type. Snapshots created using CreateClusterSnapshot and CopyClusterSnapshot are of type "manual". 
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * The source region from which the snapshot was copied.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  /**
    * The snapshot status. The value of the status depends on the API operation used:     CreateClusterSnapshot and CopyClusterSnapshot returns status as "creating".     DescribeClusterSnapshots returns status as "creating", "available", "final snapshot", or "failed".    DeleteClusterSnapshot returns status as "deleted".  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The list of tags for the cluster snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The size of the complete set of backup data that would be used to restore the cluster.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.native
  /**
    * The VPC identifier of the cluster if the snapshot is from a cluster in a VPC. Otherwise, this field is not in the output.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Snapshot {
  @scala.inline
  def apply(): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snapshot]
  }
  @scala.inline
  implicit class SnapshotOps[Self <: Snapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountsWithRestoreAccess(value: AccountsWithRestoreAccessList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountsWithRestoreAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountsWithRestoreAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountsWithRestoreAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withActualIncrementalBackupSizeInMegaBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualIncrementalBackupSizeInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActualIncrementalBackupSizeInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualIncrementalBackupSizeInMegaBytes")(js.undefined)
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
    def withBackupProgressInMegaBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupProgressInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupProgressInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupProgressInMegaBytes")(js.undefined)
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
    def withCurrentBackupRateInMegaBytesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBackupRateInMegaBytesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentBackupRateInMegaBytesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentBackupRateInMegaBytesPerSecond")(js.undefined)
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
    def withElapsedTimeInSeconds(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElapsedTimeInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ElapsedTimeInSeconds")(js.undefined)
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
    def withEncryptedWithHSM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedWithHSM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptedWithHSM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptedWithHSM")(js.undefined)
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
    def withEstimatedSecondsToCompletion(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSecondsToCompletion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedSecondsToCompletion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedSecondsToCompletion")(js.undefined)
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
    def withManualSnapshotRemainingDays(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRemainingDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSnapshotRemainingDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManualSnapshotRemainingDays")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSnapshotRetentionPeriod(value: IntegerOptional): Self = {
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
    def withOwnerAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Integer): Self = {
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
    def withRestorableNodeTypes(value: RestorableNodeTypeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestorableNodeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestorableNodeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestorableNodeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotCreateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotCreateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotRetentionStartTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotRetentionStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotRetentionStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotRetentionStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotType")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceRegion")(js.undefined)
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
    def withTotalBackupSizeInMegaBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBackupSizeInMegaBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalBackupSizeInMegaBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalBackupSizeInMegaBytes")(js.undefined)
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
  }
  
}

