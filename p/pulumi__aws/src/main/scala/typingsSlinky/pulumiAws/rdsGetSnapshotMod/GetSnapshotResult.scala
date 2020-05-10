package typingsSlinky.pulumiAws.rdsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: String = js.native
  val dbInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: String = js.native
  val dbSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: Boolean = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: String = js.native
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val includePublic: js.UndefOr[Boolean] = js.native
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: Double = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: String = js.native
  val port: Double = js.native
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String = js.native
  val snapshotType: js.UndefOr[String] = js.native
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: String = js.native
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: String = js.native
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: String = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: String = js.native
  /**
    * Specifies the ID of the VPC associated with the DB snapshot.
    */
  val vpcId: String = js.native
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: Double,
    availabilityZone: String,
    dbSnapshotArn: String,
    encrypted: Boolean,
    engine: String,
    engineVersion: String,
    id: String,
    iops: Double,
    kmsKeyId: String,
    licenseModel: String,
    optionGroupName: String,
    port: Double,
    snapshotCreateTime: String,
    sourceDbSnapshotIdentifier: String,
    sourceRegion: String,
    status: String,
    storageType: String,
    vpcId: String
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], dbSnapshotArn = dbSnapshotArn.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], optionGroupName = optionGroupName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier.asInstanceOf[js.Any], sourceRegion = sourceRegion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
  @scala.inline
  implicit class GetSnapshotResultOps[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocatedStorage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbSnapshotArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSnapshotArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
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
    def withIops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotCreateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceDbSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDbSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbInstanceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbInstanceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbInstanceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePublic")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeShared")(js.undefined)
        ret
    }
    @scala.inline
    def withMostRecent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotType")(js.undefined)
        ret
    }
  }
  
}

