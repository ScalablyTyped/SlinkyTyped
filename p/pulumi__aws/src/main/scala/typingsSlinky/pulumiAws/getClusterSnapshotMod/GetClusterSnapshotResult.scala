package typingsSlinky.pulumiAws.getClusterSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Double = js.native
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.Array[String] = js.native
  /**
    * Specifies the DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
    */
  val dbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: String = js.native
  val dbClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: String = js.native
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val includePublic: js.UndefOr[Boolean] = js.native
  val includeShared: js.UndefOr[Boolean] = js.native
  /**
    * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: String = js.native
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: Double = js.native
  /**
    * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: String = js.native
  val snapshotType: js.UndefOr[String] = js.native
  val sourceDbClusterSnapshotArn: String = js.native
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: String = js.native
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: Boolean = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: String = js.native
}

object GetClusterSnapshotResult {
  @scala.inline
  def apply(
    allocatedStorage: Double,
    availabilityZones: js.Array[String],
    dbClusterSnapshotArn: String,
    engine: String,
    engineVersion: String,
    id: String,
    kmsKeyId: String,
    licenseModel: String,
    port: Double,
    snapshotCreateTime: String,
    sourceDbClusterSnapshotArn: String,
    status: String,
    storageEncrypted: Boolean,
    tags: StringDictionary[js.Any],
    vpcId: String
  ): GetClusterSnapshotResult = {
    val __obj = js.Dynamic.literal(allocatedStorage = allocatedStorage.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], dbClusterSnapshotArn = dbClusterSnapshotArn.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], licenseModel = licenseModel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], snapshotCreateTime = snapshotCreateTime.asInstanceOf[js.Any], sourceDbClusterSnapshotArn = sourceDbClusterSnapshotArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterSnapshotResult]
  }
  @scala.inline
  implicit class GetClusterSnapshotResultOps[Self <: GetClusterSnapshotResult] (val x: Self) extends AnyVal {
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
    def withAvailabilityZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbClusterSnapshotArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotArn")(value.asInstanceOf[js.Any])
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
    def withSourceDbClusterSnapshotArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceDbClusterSnapshotArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterSnapshotIdentifier")(js.undefined)
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

