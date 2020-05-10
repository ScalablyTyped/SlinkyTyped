package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshot extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * Provides the list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
    */
  var AvailabilityZones: js.UndefOr[typingsSlinky.awsSdk.rdsMod.AvailabilityZones] = js.native
  /**
    * Specifies the time when the DB cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the identifier for the DB cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Provides the version of the database engine for this DB cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Provides the license model information for this DB cluster snapshot.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Provides the master username for the DB cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  /**
    * Specifies the port that the DB cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[js.Date] = js.native
  /**
    * Provides the type of the DB cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  /**
    * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the source DB cluster snapshot, otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.native
  /**
    * Specifies the status of this DB cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides the VPC ID associated with the DB cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBClusterSnapshot {
  @scala.inline
  def apply(): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshot]
  }
  @scala.inline
  implicit class DBClusterSnapshotOps[Self <: DBClusterSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedStorage(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocatedStorage")(js.undefined)
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
    def withDBClusterSnapshotArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshotArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(js.undefined)
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
    def withIAMDatabaseAuthenticationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIAMDatabaseAuthenticationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IAMDatabaseAuthenticationEnabled")(js.undefined)
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
    def withLicenseModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseModel")(js.undefined)
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
    def withPercentProgress(value: Integer): Self = {
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
    def withSourceDBClusterSnapshotArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDBClusterSnapshotArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceDBClusterSnapshotArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceDBClusterSnapshotArn")(js.undefined)
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

