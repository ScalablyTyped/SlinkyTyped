package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabase extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether automated backup retention is enabled for the database.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The certificate associated with the database.
    */
  var caCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The timestamp when the database was created. Formatted in Unix time.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  /**
    * The database software (for example, MySQL).
    */
  var engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * The database engine version (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the hardware of the database.
    */
  var hardware: js.UndefOr[RelationalDatabaseHardware] = js.native
  /**
    * The latest point in time to which the database can be restored. Formatted in Unix time.
    */
  var latestRestorableTime: js.UndefOr[js.Date] = js.native
  /**
    * The Region name and Availability Zone where the database is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the master database created when the Lightsail database resource is created.
    */
  var masterDatabaseName: js.UndefOr[String] = js.native
  /**
    * The master endpoint for the database.
    */
  var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.native
  /**
    * The master user name of the database.
    */
  var masterUsername: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the database resource in Lightsail.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The status of parameter updates for the database.
    */
  var parameterApplyStatus: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the pending maintenance actions for the database.
    */
  var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.native
  /**
    * Describes pending database value modifications.
    */
  var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.native
  /**
    * The daily time range during which automated backups are created for the database (for example, 16:00-16:30).
    */
  var preferredBackupWindow: js.UndefOr[NonEmptyString] = js.native
  /**
    * The weekly time range during which system maintenance can occur on the database. In the format ddd:hh24:mi-ddd:hh24:mi. For example, Tue:17:00-Tue:17:30.
    */
  var preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether the database is publicly accessible.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * The blueprint ID for the database. A blueprint describes the major engine version of a database.
    */
  var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle ID for the database. A bundle describes the performance specifications for your database.
    */
  var relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type for the database (for example, RelationalDatabase).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
    */
  var secondaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Describes the current state of the database.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  /**
    * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object RelationalDatabase {
  @scala.inline
  def apply(): RelationalDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabase]
  }
  @scala.inline
  implicit class RelationalDatabaseOps[Self <: RelationalDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCaCertificateIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertificateIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertificateIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withHardware(value: RelationalDatabaseHardware): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestRestorableTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRestorableTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestRestorableTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestRestorableTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: ResourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDatabaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterDatabaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterEndpoint(value: RelationalDatabaseEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterUsername(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUsername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterUsername")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
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
    def withParameterApplyStatus(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterApplyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterApplyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingMaintenanceActions(value: PendingMaintenanceActionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingMaintenanceActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingMaintenanceActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingMaintenanceActions")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingModifiedValues(value: PendingModifiedRelationalDatabaseValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingModifiedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingModifiedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingModifiedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredBackupWindow(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBackupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredBackupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferredMaintenanceWindow(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferredMaintenanceWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferredMaintenanceWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubliclyAccessible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publiclyAccessible")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationalDatabaseBlueprintId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseBlueprintId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseBlueprintId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseBlueprintId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationalDatabaseBundleId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalDatabaseBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationalDatabaseBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAvailabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryAvailabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: NonEmptyString): Self = {
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
    def withSupportCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

