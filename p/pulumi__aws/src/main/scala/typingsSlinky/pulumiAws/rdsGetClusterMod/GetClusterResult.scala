package typingsSlinky.pulumiAws.rdsGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterResult extends js.Object {
  val arn: String = js.native
  val availabilityZones: js.Array[String] = js.native
  val backupRetentionPeriod: Double = js.native
  val clusterIdentifier: String = js.native
  val clusterMembers: js.Array[String] = js.native
  val clusterResourceId: String = js.native
  val databaseName: String = js.native
  val dbClusterParameterGroupName: String = js.native
  val dbSubnetGroupName: String = js.native
  val enabledCloudwatchLogsExports: js.Array[String] = js.native
  val endpoint: String = js.native
  val engine: String = js.native
  val engineVersion: String = js.native
  val finalSnapshotIdentifier: String = js.native
  val hostedZoneId: String = js.native
  val iamDatabaseAuthenticationEnabled: Boolean = js.native
  val iamRoles: js.Array[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val kmsKeyId: String = js.native
  val masterUsername: String = js.native
  val port: Double = js.native
  val preferredBackupWindow: String = js.native
  val preferredMaintenanceWindow: String = js.native
  val readerEndpoint: String = js.native
  val replicationSourceIdentifier: String = js.native
  val storageEncrypted: Boolean = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcSecurityGroupIds: js.Array[String] = js.native
}

object GetClusterResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZones: js.Array[String],
    backupRetentionPeriod: Double,
    clusterIdentifier: String,
    clusterMembers: js.Array[String],
    clusterResourceId: String,
    databaseName: String,
    dbClusterParameterGroupName: String,
    dbSubnetGroupName: String,
    enabledCloudwatchLogsExports: js.Array[String],
    endpoint: String,
    engine: String,
    engineVersion: String,
    finalSnapshotIdentifier: String,
    hostedZoneId: String,
    iamDatabaseAuthenticationEnabled: Boolean,
    iamRoles: js.Array[String],
    id: String,
    kmsKeyId: String,
    masterUsername: String,
    port: Double,
    preferredBackupWindow: String,
    preferredMaintenanceWindow: String,
    readerEndpoint: String,
    replicationSourceIdentifier: String,
    storageEncrypted: Boolean,
    tags: StringDictionary[js.Any],
    vpcSecurityGroupIds: js.Array[String]
  ): GetClusterResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterMembers = clusterMembers.asInstanceOf[js.Any], clusterResourceId = clusterResourceId.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], dbClusterParameterGroupName = dbClusterParameterGroupName.asInstanceOf[js.Any], dbSubnetGroupName = dbSubnetGroupName.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], finalSnapshotIdentifier = finalSnapshotIdentifier.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], readerEndpoint = readerEndpoint.asInstanceOf[js.Any], replicationSourceIdentifier = replicationSourceIdentifier.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
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
    def withAvailabilityZones(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbClusterParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbSubnetGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabledCloudwatchLogsExports(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCloudwatchLogsExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
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
    def withFinalSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamDatabaseAuthenticationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReaderEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readerEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicationSourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationSourceIdentifier")(value.asInstanceOf[js.Any])
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
    def withVpcSecurityGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

