package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import typingsSlinky.gapiClientSqladmin.AnonAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInstance extends js.Object {
  /**
    * FIRST_GEN: Basic Cloud SQL instance that runs in a Google-managed container.
    * SECOND_GEN: A newer Cloud SQL backend that runs in a Compute Engine VM.
    * EXTERNAL: A MySQL server that is not managed by Google.
    */
  var backendType: js.UndefOr[String] = js.native
  /** Connection name of the Cloud SQL instance used in connection strings. */
  var connectionName: js.UndefOr[String] = js.native
  /**
    * The current disk usage of the instance in bytes. This property has been deprecated. Users should use the
    * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see
    * https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ for details.
    */
  var currentDiskSize: js.UndefOr[String] = js.native
  /**
    * The database engine type and version. The databaseVersion field can not be changed after instance creation. MySQL Second Generation instances:
    * MYSQL_5_7 (default) or MYSQL_5_6. PostgreSQL instances: POSTGRES_9_6 MySQL First Generation instances: MYSQL_5_6 (default) or MYSQL_5_5
    */
  var databaseVersion: js.UndefOr[String] = js.native
  /** HTTP 1.1 Entity tag for the resource. */
  var etag: js.UndefOr[String] = js.native
  /** The name and status of the failover replica. This property is applicable only to Second Generation instances. */
  var failoverReplica: js.UndefOr[AnonAvailable] = js.native
  /**
    * The GCE zone that the instance is serving from. In case when the instance is failed over to standby zone, this value may be different with what user
    * specified in the settings.
    */
  var gceZone: js.UndefOr[String] = js.native
  /**
    * The instance type. This can be one of the following.
    * CLOUD_SQL_INSTANCE: A Cloud SQL instance that is not replicating from a master.
    * ON_PREMISES_INSTANCE: An instance running on the customer's premises.
    * READ_REPLICA_INSTANCE: A Cloud SQL instance configured as a read-replica.
    */
  var instanceType: js.UndefOr[String] = js.native
  /** The assigned IP addresses for the instance. */
  var ipAddresses: js.UndefOr[js.Array[IpMapping]] = js.native
  /** The IPv6 address assigned to the instance. This property is applicable only to First Generation instances. */
  var ipv6Address: js.UndefOr[String] = js.native
  /** This is always sql#instance. */
  var kind: js.UndefOr[String] = js.native
  /** The name of the instance which will act as master in the replication setup. */
  var masterInstanceName: js.UndefOr[String] = js.native
  /** The maximum disk size of the instance in bytes. */
  var maxDiskSize: js.UndefOr[String] = js.native
  /** Name of the Cloud SQL instance. This does not include the project ID. */
  var name: js.UndefOr[String] = js.native
  /** Configuration specific to on-premises instances. */
  var onPremisesConfiguration: js.UndefOr[OnPremisesConfiguration] = js.native
  /** The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable. */
  var project: js.UndefOr[String] = js.native
  /**
    * The geographical region. Can be us-central (FIRST_GEN instances only), us-central1 (SECOND_GEN instances only), asia-east1 or europe-west1. Defaults to
    * us-central or us-central1 depending on the instance type (First Generation or Second Generation). The region can not be changed after instance
    * creation.
    */
  var region: js.UndefOr[String] = js.native
  /** Configuration specific to read-replicas replicating from on-premises masters. */
  var replicaConfiguration: js.UndefOr[ReplicaConfiguration] = js.native
  /** The replicas of the instance. */
  var replicaNames: js.UndefOr[js.Array[String]] = js.native
  /** The URI of this resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** SSL configuration. */
  var serverCaCert: js.UndefOr[SslCert] = js.native
  /** The service account email address assigned to the instance. This property is applicable only to Second Generation instances. */
  var serviceAccountEmailAddress: js.UndefOr[String] = js.native
  /** The user settings. */
  var settings: js.UndefOr[Settings] = js.native
  /**
    * The current serving state of the Cloud SQL instance. This can be one of the following.
    * RUNNABLE: The instance is running, or is ready to run when accessed.
    * SUSPENDED: The instance is not available, for example due to problems with billing.
    * PENDING_CREATE: The instance is being created.
    * MAINTENANCE: The instance is down for maintenance.
    * FAILED: The instance creation failed.
    * UNKNOWN_STATE: The state of the instance is unknown.
    */
  var state: js.UndefOr[String] = js.native
  /** If the instance state is SUSPENDED, the reason for the suspension. */
  var suspensionReason: js.UndefOr[js.Array[String]] = js.native
}

object DatabaseInstance {
  @scala.inline
  def apply(): DatabaseInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInstance]
  }
  @scala.inline
  implicit class DatabaseInstanceOps[Self <: DatabaseInstance] (val x: Self) extends AnyVal {
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
    def withIpAddresses(value: js.Array[IpMapping]): Self = {
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
    def withOnPremisesConfiguration(value: OnPremisesConfiguration): Self = {
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
    def withReplicaConfiguration(value: ReplicaConfiguration): Self = {
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
    def withServerCaCert(value: SslCert): Self = {
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
    def withSettings(value: Settings): Self = {
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

