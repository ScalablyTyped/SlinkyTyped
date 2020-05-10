package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import typingsSlinky.googleapis.AnonAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud SQL instance resource.
  */
@js.native
trait SchemaDatabaseInstance extends js.Object {
  /**
    * FIRST_GEN: First Generation instance. MySQL only. SECOND_GEN: Second
    * Generation instance or PostgreSQL instance. EXTERNAL: A database server
    * that is not managed by Google. This property is read-only; use the tier
    * property in the settings object to determine the database type and Second
    * or First Generation.
    */
  var backendType: js.UndefOr[String] = js.native
  /**
    * Connection name of the Cloud SQL instance used in connection strings.
    */
  var connectionName: js.UndefOr[String] = js.native
  /**
    * The current disk usage of the instance in bytes. This property has been
    * deprecated. Users should use the
    * &quot;cloudsql.googleapis.com/database/disk/bytes_used&quot; metric in
    * Cloud Monitoring API instead. Please see this announcement for details.
    */
  var currentDiskSize: js.UndefOr[String] = js.native
  /**
    * The database engine type and version. The databaseVersion field can not
    * be changed after instance creation. MySQL Second Generation instances:
    * MYSQL_5_7 (default) or MYSQL_5_6. PostgreSQL instances: POSTGRES_9_6
    * (default) or POSTGRES_11 Beta. MySQL First Generation instances:
    * MYSQL_5_6 (default) or MYSQL_5_5
    */
  var databaseVersion: js.UndefOr[String] = js.native
  /**
    * Disk encryption configuration specific to an instance. Applies only to
    * Second Generation instances.
    */
  var diskEncryptionConfiguration: js.UndefOr[SchemaDiskEncryptionConfiguration] = js.native
  /**
    * Disk encryption status specific to an instance. Applies only to Second
    * Generation instances.
    */
  var diskEncryptionStatus: js.UndefOr[SchemaDiskEncryptionStatus] = js.native
  /**
    * This field is deprecated and will be removed from a future version of the
    * API. Use the settings.settingsVersion field instead.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The name and status of the failover replica. This property is applicable
    * only to Second Generation instances.
    */
  var failoverReplica: js.UndefOr[AnonAvailable] = js.native
  /**
    * The Compute Engine zone that the instance is currently serving from. This
    * value could be different from the zone that was specified when the
    * instance was created if the instance has failed over to its secondary
    * zone.
    */
  var gceZone: js.UndefOr[String] = js.native
  /**
    * The instance type. This can be one of the following. CLOUD_SQL_INSTANCE:
    * A Cloud SQL instance that is not replicating from a master.
    * ON_PREMISES_INSTANCE: An instance running on the customer&#39;s premises.
    * READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The assigned IP addresses for the instance.
    */
  var ipAddresses: js.UndefOr[js.Array[SchemaIpMapping]] = js.native
  /**
    * The IPv6 address assigned to the instance. This property is applicable
    * only to First Generation instances.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  /**
    * This is always sql#instance.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the instance which will act as master in the replication
    * setup.
    */
  var masterInstanceName: js.UndefOr[String] = js.native
  /**
    * The maximum disk size of the instance in bytes.
    */
  var maxDiskSize: js.UndefOr[String] = js.native
  /**
    * Name of the Cloud SQL instance. This does not include the project ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Configuration specific to on-premises instances.
    */
  var onPremisesConfiguration: js.UndefOr[SchemaOnPremisesConfiguration] = js.native
  /**
    * The project ID of the project containing the Cloud SQL instance. The
    * Google apps domain is prefixed if applicable.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * The geographical region. Can be us-central (FIRST_GEN instances only),
    * us-central1 (SECOND_GEN instances only), asia-east1 or europe-west1.
    * Defaults to us-central or us-central1 depending on the instance type
    * (First Generation or Second Generation). The region can not be changed
    * after instance creation.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Configuration specific to failover replicas and read replicas.
    */
  var replicaConfiguration: js.UndefOr[SchemaReplicaConfiguration] = js.native
  /**
    * The replicas of the instance.
    */
  var replicaNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * SSL configuration.
    */
  var serverCaCert: js.UndefOr[SchemaSslCert] = js.native
  /**
    * The service account email address assigned to the instance. This property
    * is applicable only to Second Generation instances.
    */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
  /**
    * The user settings.
    */
  var settings: js.UndefOr[SchemaSettings] = js.native
  /**
    * The current serving state of the Cloud SQL instance. This can be one of
    * the following. RUNNABLE: The instance is running, or is ready to run when
    * accessed. SUSPENDED: The instance is not available, for example due to
    * problems with billing. PENDING_CREATE: The instance is being created.
    * MAINTENANCE: The instance is down for maintenance. FAILED: The instance
    * creation failed. UNKNOWN_STATE: The state of the instance is unknown.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * If the instance state is SUSPENDED, the reason for the suspension.
    */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.native
}

object SchemaDatabaseInstance {
  @scala.inline
  def apply(): SchemaDatabaseInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseInstance]
  }
  @scala.inline
  implicit class SchemaDatabaseInstanceOps[Self <: SchemaDatabaseInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackendType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackendType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backendType")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentDiskSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDiskSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentDiskSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDiskSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskEncryptionConfiguration(value: SchemaDiskEncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskEncryptionStatus(value: SchemaDiskEncryptionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskEncryptionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskEncryptionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withFailoverReplica(value: AnonAvailable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverReplica")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailoverReplica: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failoverReplica")(js.undefined)
        ret
    }
    @scala.inline
    def withGceZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gceZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGceZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gceZone")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddresses(value: js.Array[SchemaIpMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddresses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipAddresses")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDiskSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDiskSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDiskSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDiskSize")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremisesConfiguration(value: SchemaOnPremisesConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremisesConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPremisesConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaConfiguration(value: SchemaReplicaConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicaNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicaNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicaNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCaCert(value: SchemaSslCert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCaCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCaCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCaCert")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountEmailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: SchemaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspensionReason(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspensionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspensionReason")(js.undefined)
        ret
    }
  }
  
}

