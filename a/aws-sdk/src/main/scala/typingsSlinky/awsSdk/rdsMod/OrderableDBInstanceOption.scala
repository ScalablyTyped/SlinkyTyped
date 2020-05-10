package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * A list of the available processor features for the DB instance class of a DB instance.
    */
  var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.native
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance can have a Read Replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.native
  /**
    * Whether a DB instance supports Kerberos Authentication.
    */
  var SupportsKerberosAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * True if a DB instance supports Performance Insights, otherwise false.
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not Amazon RDS can automatically scale storage for DB instances that use the specified instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.native
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.native
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  @scala.inline
  implicit class OrderableDBInstanceOptionOps[Self <: OrderableDBInstanceOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailabilityZones(value: AvailabilityZoneList): Self = {
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
    def withAvailableProcessorFeatures(value: AvailableProcessorFeatureList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableProcessorFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailableProcessorFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailableProcessorFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withDBInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBInstanceClass")(js.undefined)
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
    def withMaxIopsPerDbInstance(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIopsPerDbInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIopsPerDbInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIopsPerDbInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIopsPerGib(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIopsPerGib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIopsPerGib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxIopsPerGib")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStorageSize(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxStorageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStorageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxStorageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIopsPerDbInstance(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIopsPerDbInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIopsPerDbInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIopsPerDbInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withMinIopsPerGib(value: DoubleOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIopsPerGib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinIopsPerGib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinIopsPerGib")(js.undefined)
        ret
    }
    @scala.inline
    def withMinStorageSize(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinStorageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinStorageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinStorageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiAZCapable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiAZCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiAZCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withReadReplicaCapable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaCapable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadReplicaCapable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadReplicaCapable")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageType")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedEngineModes(value: EngineModeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngineModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedEngineModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportedEngineModes")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsEnhancedMonitoring(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsEnhancedMonitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsEnhancedMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsEnhancedMonitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsIAMDatabaseAuthentication(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsIAMDatabaseAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsIAMDatabaseAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsIAMDatabaseAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsIops(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsIops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsIops")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsKerberosAuthentication(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsKerberosAuthentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsKerberosAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsKerberosAuthentication")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsPerformanceInsights(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsPerformanceInsights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsPerformanceInsights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsPerformanceInsights")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsStorageAutoscaling(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsStorageAutoscaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsStorageAutoscaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsStorageAutoscaling")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsStorageEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsStorageEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsStorageEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsStorageEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withVpc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vpc")(js.undefined)
        ret
    }
  }
  
}

