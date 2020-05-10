package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance settings.
  */
@js.native
trait SchemaSettings extends js.Object {
  /**
    * The activation policy specifies when the instance is activated; it is
    * applicable only when the instance state is RUNNABLE. Valid values:
    * ALWAYS: The instance is on, and remains so even in the absence of
    * connection requests. NEVER: The instance is off; it is not activated,
    * even if a connection request arrives. ON_DEMAND: First Generation
    * instances only. The instance responds to incoming requests, and turns
    * itself off when not in use. Instances with PER_USE pricing turn off after
    * 15 minutes of inactivity. Instances with PER_PACKAGE pricing turn off
    * after 12 hours of inactivity.
    */
  var activationPolicy: js.UndefOr[String] = js.native
  /**
    * The App Engine app IDs that can access this instance. First Generation
    * instances only.
    */
  var authorizedGaeApplications: js.UndefOr[js.Array[String]] = js.native
  /**
    * Availability type (PostgreSQL instances only). Potential values: ZONAL:
    * The instance serves data from only one zone. Outages in that zone affect
    * data accessibility. REGIONAL: The instance can serve data from more than
    * one zone in a region (it is highly available). For more information, see
    * Overview of the High Availability Configuration.
    */
  var availabilityType: js.UndefOr[String] = js.native
  /**
    * The daily backup configuration for the instance.
    */
  var backupConfiguration: js.UndefOr[SchemaBackupConfiguration] = js.native
  /**
    * Configuration specific to read replica instances. Indicates whether
    * database flags for crash-safe replication are enabled. This property is
    * only applicable to First Generation instances.
    */
  var crashSafeReplicationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The size of data disk, in GB. The data disk size minimum is 10GB. Not
    * used for First Generation instances.
    */
  var dataDiskSizeGb: js.UndefOr[String] = js.native
  /**
    * The type of data disk: PD_SSD (default) or PD_HDD. Not used for First
    * Generation instances.
    */
  var dataDiskType: js.UndefOr[String] = js.native
  /**
    * The database flags passed to the instance at startup.
    */
  var databaseFlags: js.UndefOr[js.Array[SchemaDatabaseFlags]] = js.native
  /**
    * Configuration specific to read replica instances. Indicates whether
    * replication is enabled or not.
    */
  var databaseReplicationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The settings for IP Management. This allows to enable or disable the
    * instance IP and manage which external networks can connect to the
    * instance. The IPv4 address cannot be disabled for Second Generation
    * instances.
    */
  var ipConfiguration: js.UndefOr[SchemaIpConfiguration] = js.native
  /**
    * This is always sql#settings.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The location preference settings. This allows the instance to be located
    * as near as possible to either an App Engine app or Compute Engine zone
    * for better performance. App Engine co-location is only applicable to
    * First Generation instances.
    */
  var locationPreference: js.UndefOr[SchemaLocationPreference] = js.native
  /**
    * The maintenance window for this instance. This specifies when the
    * instance can be restarted for maintenance purposes. Not used for First
    * Generation instances.
    */
  var maintenanceWindow: js.UndefOr[SchemaMaintenanceWindow] = js.native
  /**
    * The pricing plan for this instance. This can be either PER_USE or
    * PACKAGE. Only PER_USE is supported for Second Generation instances.
    */
  var pricingPlan: js.UndefOr[String] = js.native
  /**
    * The type of replication this instance uses. This can be either
    * ASYNCHRONOUS or SYNCHRONOUS. This property is only applicable to First
    * Generation instances.
    */
  var replicationType: js.UndefOr[String] = js.native
  /**
    * The version of instance settings. This is a required field for update
    * method to make sure concurrent updates are handled properly. During
    * update, use the most recent settingsVersion value for this instance and
    * do not try to update this value.
    */
  var settingsVersion: js.UndefOr[String] = js.native
  /**
    * Configuration to increase storage size automatically. The default value
    * is true. Not used for First Generation instances.
    */
  var storageAutoResize: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size to which storage capacity can be automatically
    * increased. The default value is 0, which specifies that there is no
    * limit. Not used for First Generation instances.
    */
  var storageAutoResizeLimit: js.UndefOr[String] = js.native
  /**
    * The tier (or machine type) for this instance, for example
    * db-n1-standard-1 (MySQL instances) or db-custom-1-3840 (PostgreSQL
    * instances). For MySQL instances, this property determines whether the
    * instance is First or Second Generation. For more information, see
    * Instance Settings.
    */
  var tier: js.UndefOr[String] = js.native
  /**
    * User-provided labels, represented as a dictionary where each label is a
    * single key value pair.
    */
  var userLabels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  @scala.inline
  implicit class SchemaSettingsOps[Self <: SchemaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivationPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedGaeApplications(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedGaeApplications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedGaeApplications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedGaeApplications")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityType")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupConfiguration(value: SchemaBackupConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withCrashSafeReplicationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashSafeReplicationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrashSafeReplicationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crashSafeReplicationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDiskSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withDataDiskType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataDiskType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDiskType")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseFlags(value: js.Array[SchemaDatabaseFlags]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseReplicationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseReplicationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseReplicationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseReplicationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIpConfiguration(value: SchemaIpConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipConfiguration")(js.undefined)
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
    def withLocationPreference(value: SchemaLocationPreference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: SchemaMaintenanceWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingPlan(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pricingPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationType")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingsVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageAutoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAutoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAutoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageAutoResizeLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAutoResizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageAutoResizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageAutoResizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLabels")(js.undefined)
        ret
    }
  }
  
}

