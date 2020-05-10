package typingsSlinky.pulumiAws.rdsInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.rds.InstanceS3Import
import typingsSlinky.pulumiAws.rdsInstanceTypeMod.InstanceType
import typingsSlinky.pulumiAws.storageTypeMod.StorageType
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceArgs extends js.Object {
  /**
    * The allocated storage in gibibytes. If `maxAllocatedStorage` is configured, this argument represents the initial storage allocation and differences from the configuration will be ignored automatically when Storage Autoscaling occurs.
    */
  val allocatedStorage: js.UndefOr[Input[Double]] = js.native
  /**
    * Indicates that major version
    * upgrades are allowed. Changing this parameter does not result in an outage and
    * the change is asynchronously applied as soon as possible.
    */
  val allowMajorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is
    * `false`. See [Amazon RDS Documentation for more
    * information.](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html)
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates that minor engine upgrades
    * will be applied automatically to the DB instance during the maintenance window.
    * Defaults to true.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The AZ for the RDS instance.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The days to retain backups for. Must be
    * between `0` and `35`. Must be greater than `0` if the database is used as a source for a Read Replica. [See Read Replica][1].
    */
  val backupRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range (in UTC) during which
    * automated backups are created if they are enabled. Example: "09:46-10:16". Must
    * not overlap with `maintenanceWindow`.
    */
  val backupWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The character set name to use for DB
    * encoding in Oracle instances. This can't be changed. See [Oracle Character Sets
    * Supported in Amazon
    * RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.OracleCharacterSets.html)
    * for more information.
    */
  val characterSetName: js.UndefOr[Input[String]] = js.native
  /**
    * Copy all Instance `tags` to snapshots. Default is `false`.
    */
  val copyTagsToSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of [DB subnet group](https://www.terraform.io/docs/providers/aws/r/db_subnet_group.html). DB instance will
    * be created in the VPC associated with the DB subnet group. If unspecified, will
    * be created in the `default` VPC, or in EC2 Classic, if available. When working
    * with read replicas, it should be specified only if the source database
    * specifies an instance in another AWS Region. See [DBSubnetGroupName in API
    * action CreateDBInstanceReadReplica](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstanceReadReplica.html)
    * for additional read replica contraints.
    */
  val dbSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether to remove automated backups immediately after the DB instance is deleted. Default is `true`.
    */
  val deleteAutomatedBackups: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If the DB instance should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ID of the Directory Service Active Directory domain to create the instance in.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IAM role to be used when making API calls to the Directory Service.
    */
  val domainIamRoleName: js.UndefOr[Input[String]] = js.native
  /**
    * List of log types to enable for exporting to CloudWatch logs. If omitted, no logs will be exported. Valid values (depending on `engine`): `agent` (MSSQL), `alert`, `audit`, `error`, `general`, `listener`, `slowquery`, `trace`, `postgresql` (PostgreSQL), `upgrade` (PostgreSQL).
    */
  val enabledCloudwatchLogsExports: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) The database engine to use.  For supported values, see the Engine parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine'.
    * For information on the difference between the available Aurora MySQL engines
    * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
    * in the Amazon RDS User Guide.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * The engine version to use. If `autoMinorVersionUpgrade`
    * is enabled, you can provide a prefix of the version such as `5.7` (for `5.7.10`) and
    * this attribute will ignore differences in the patch version automatically (e.g. `5.7.17`).
    * For supported values, see the EngineVersion parameter in [API action CreateDBInstance](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html).
    * Note that for Amazon Aurora instances the engine version must match the [DB cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html)'s engine version'.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The name of your final DB snapshot
    * when this DB instance is deleted. Must be provided if `skipFinalSnapshot` is
    * set to `false`.
    */
  val finalSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether or
    * mappings of AWS Identity and Access Management (IAM) accounts to database
    * accounts is enabled.
    */
  val iamDatabaseAuthenticationEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the RDS instance,
    * if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The instance type of the RDS instance.
    */
  val instanceClass: Input[String | InstanceType] = js.native
  /**
    * The amount of provisioned IOPS. Setting this implies a
    * storageType of "io1".
    */
  val iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN for the KMS encryption key. If creating an
    * encrypted replica, set this to the destination KMS ARN.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * (Optional, but required for some DB engines, i.e. Oracle
    * SE1) License model information for this DB instance.
    */
  val licenseModel: js.UndefOr[Input[String]] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00". See [RDS
    * Maintenance Window
    * docs](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow)
    * for more information.
    */
  val maintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * When configured, the upper limit to which Amazon RDS can automatically scale the storage of the DB instance. Configuring this will automatically ignore differences to `allocatedStorage`. Must be greater than or equal to `allocatedStorage` or `0` to disable Storage Autoscaling.
    */
  val maxAllocatedStorage: js.UndefOr[Input[Double]] = js.native
  /**
    * The interval, in seconds, between points
    * when Enhanced Monitoring metrics are collected for the DB instance. To disable
    * collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid
    * Values: 0, 1, 5, 10, 15, 30, 60.
    */
  val monitoringInterval: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN for the IAM role that permits RDS
    * to send enhanced monitoring metrics to CloudWatch Logs. You can find more
    * information on the [AWS
    * Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
    * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
    */
  val monitoringRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies if the RDS instance is multi-AZ
    */
  val multiAz: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the database to create when the DB instance is created. If this parameter is not specified, no database is created in the DB instance. Note that this does not apply for Oracle or SQL Server engines. See the [AWS documentation](http://docs.aws.amazon.com/cli/latest/reference/rds/create-db-instance.html) for more details on what applies for those engines.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DB option group to associate.
    */
  val optionGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the DB parameter group to
    * associate.
    */
  val parameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) Password for the master DB user. Note that this may show up in
    * logs, and it will be stored in the state file.
    */
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether Performance Insights are enabled. Defaults to false.
    */
  val performanceInsightsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN for the KMS key to encrypt Performance Insights data. When specifying `performanceInsightsKmsKeyId`, `performanceInsightsEnabled` needs to be set to true. Once KMS key is set, it can never be changed.
    */
  val performanceInsightsKmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performanceInsightsRetentionPeriod`, `performanceInsightsEnabled` needs to be set to true. Defaults to '7'.
    */
  val performanceInsightsRetentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The port on which the DB accepts connections.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * Bool to control if instance is publicly
    * accessible. Default is `false`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies that this resource is a Replicate
    * database, and to use this value as the source database. This correlates to the
    * `identifier` of another Amazon RDS Database to replicate. Note that if you are
    * creating a cross-region replica of an encrypted database you will also need to
    * specify a `kmsKeyId`. See [DB Instance Replication][1] and [Working with
    * PostgreSQL and MySQL Read Replicas](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html)
    * for more information on using Replication.
    */
  val replicateSourceDb: js.UndefOr[Input[String]] = js.native
  /**
    * Restore from a Percona Xtrabackup in S3.  See [Importing Data into an Amazon RDS MySQL DB Instance](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/MySQL.Procedural.Importing.html)
    */
  val s3Import: js.UndefOr[Input[InstanceS3Import]] = js.native
  /**
    * List of DB Security Groups to
    * associate. Only used for [DB Instances on the _EC2-Classic_
    * Platform](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.html#USER_VPC.FindDefaultVPC).
    */
  val securityGroupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Determines whether a final DB snapshot is
    * created before the DB instance is deleted. If true is specified, no DBSnapshot
    * is created. If false is specified, a DB snapshot is created before the DB
    * instance is deleted, using the value from `finalSnapshotIdentifier`. Default
    * is `false`.
    */
  val skipFinalSnapshot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether or not to create this
    * database from a snapshot. This correlates to the snapshot ID you'd find in the
    * RDS console, e.g: rds:production-2015-06-26-06-05.
    */
  val snapshotIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DB instance is
    * encrypted. Note that if you are creating a cross-region read replica this field
    * is ignored and you should instead declare `kmsKeyId` with a valid ARN. The
    * default is `false` if not specified.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * One of "standard" (magnetic), "gp2" (general
    * purpose SSD), or "io1" (provisioned IOPS SSD). The default is "io1" if `iops` is
    * specified, "gp2" if not.
    */
  val storageType: js.UndefOr[Input[String | StorageType]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Time zone of the DB instance. `timezone` is currently
    * only supported by Microsoft SQL Server. The `timezone` can only be set on
    * creation. See [MSSQL User
    * Guide](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone)
    * for more information.
    */
  val timezone: js.UndefOr[Input[String]] = js.native
  /**
    * (Required unless a `snapshotIdentifier` or `replicateSourceDb`
    * is provided) Username for the master DB user.
    */
  val username: js.UndefOr[Input[String]] = js.native
  /**
    * List of VPC security groups to
    * associate.
    */
  val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object InstanceArgs {
  @scala.inline
  def apply(instanceClass: Input[String | InstanceType]): InstanceArgs = {
    val __obj = js.Dynamic.literal(instanceClass = instanceClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceArgs]
  }
  @scala.inline
  implicit class InstanceArgsOps[Self <: InstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceClass(value: Input[String | InstanceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllocatedStorage(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMajorVersionUpgrade(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMajorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMajorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMajorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyImmediately(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyImmediately: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyImmediately")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoMinorVersionUpgrade(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoMinorVersionUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoMinorVersionUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupRetentionPeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withBackupWindow(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withCaCertIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaCertIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caCertIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterSetName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSetName")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTagsToSnapshot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsToSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withDbSubnetGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSubnetGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbSubnetGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbSubnetGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAutomatedBackups(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAutomatedBackups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAutomatedBackups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAutomatedBackups")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionProtection(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionProtection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionProtection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionProtection")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainIamRoleName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainIamRoleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainIamRoleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainIamRoleName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledCloudwatchLogsExports(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCloudwatchLogsExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledCloudwatchLogsExports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledCloudwatchLogsExports")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: Input[String]): Self = {
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
    def withEngineVersion(value: Input[String]): Self = {
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
    def withFinalSnapshotIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalSnapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIamDatabaseAuthenticationEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamDatabaseAuthenticationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamDatabaseAuthenticationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamDatabaseAuthenticationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iops")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLicenseModel(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseModel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaintenanceWindow(value: Input[String]): Self = {
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
    def withMaxAllocatedStorage(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllocatedStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllocatedStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllocatedStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringInterval(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoringRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoringRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoringRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAz(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiAz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiAz")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
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
    def withOptionGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceInsightsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceInsightsKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsKmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsKmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceInsightsRetentionPeriod(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsRetentionPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceInsightsRetentionPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceInsightsRetentionPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPubliclyAccessible(value: Input[Boolean]): Self = {
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
    def withReplicateSourceDb(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicateSourceDb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicateSourceDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicateSourceDb")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Import(value: Input[InstanceS3Import]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Import")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Import: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Import")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupNames(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFinalSnapshot(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageEncrypted(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: Input[String | StorageType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageType")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    @scala.inline
    def withTimezone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcSecurityGroupIds")(js.undefined)
        ret
    }
  }
  
}

