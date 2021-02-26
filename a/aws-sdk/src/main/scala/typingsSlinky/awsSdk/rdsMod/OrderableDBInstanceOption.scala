package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderableDBInstanceOption extends StObject {
  
  /**
    * The Availability Zone group for a DB instance.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  
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
    * Whether a DB instance supports RDS on Outposts. For more information about RDS on Outposts, see Amazon RDS on AWS Outposts in the Amazon RDS User Guide. 
    */
  var OutpostCapable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether a DB instance can have a read replica.
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
    * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine attributes.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.native
  
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
    * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
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
  implicit class OrderableDBInstanceOptionMutableBuilder[Self <: OrderableDBInstanceOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "AvailabilityZoneGroup", js.undefined)
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailableProcessorFeatures(value: AvailableProcessorFeatureList): Self = StObject.set(x, "AvailableProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableProcessorFeaturesUndefined: Self = StObject.set(x, "AvailableProcessorFeatures", js.undefined)
    
    @scala.inline
    def setAvailableProcessorFeaturesVarargs(value: AvailableProcessorFeature*): Self = StObject.set(x, "AvailableProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMaxIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MaxIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIopsPerDbInstanceUndefined: Self = StObject.set(x, "MaxIopsPerDbInstance", js.undefined)
    
    @scala.inline
    def setMaxIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MaxIopsPerGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIopsPerGibUndefined: Self = StObject.set(x, "MaxIopsPerGib", js.undefined)
    
    @scala.inline
    def setMaxStorageSize(value: IntegerOptional): Self = StObject.set(x, "MaxStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxStorageSizeUndefined: Self = StObject.set(x, "MaxStorageSize", js.undefined)
    
    @scala.inline
    def setMinIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MinIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIopsPerDbInstanceUndefined: Self = StObject.set(x, "MinIopsPerDbInstance", js.undefined)
    
    @scala.inline
    def setMinIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MinIopsPerGib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIopsPerGibUndefined: Self = StObject.set(x, "MinIopsPerGib", js.undefined)
    
    @scala.inline
    def setMinStorageSize(value: IntegerOptional): Self = StObject.set(x, "MinStorageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinStorageSizeUndefined: Self = StObject.set(x, "MinStorageSize", js.undefined)
    
    @scala.inline
    def setMultiAZCapable(value: Boolean): Self = StObject.set(x, "MultiAZCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZCapableUndefined: Self = StObject.set(x, "MultiAZCapable", js.undefined)
    
    @scala.inline
    def setOutpostCapable(value: Boolean): Self = StObject.set(x, "OutpostCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostCapableUndefined: Self = StObject.set(x, "OutpostCapable", js.undefined)
    
    @scala.inline
    def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "ReadReplicaCapable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaCapableUndefined: Self = StObject.set(x, "ReadReplicaCapable", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    @scala.inline
    def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value :_*))
    
    @scala.inline
    def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "SupportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsEnhancedMonitoringUndefined: Self = StObject.set(x, "SupportsEnhancedMonitoring", js.undefined)
    
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    @scala.inline
    def setSupportsIAMDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", js.undefined)
    
    @scala.inline
    def setSupportsIops(value: Boolean): Self = StObject.set(x, "SupportsIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsIopsUndefined: Self = StObject.set(x, "SupportsIops", js.undefined)
    
    @scala.inline
    def setSupportsKerberosAuthentication(value: BooleanOptional): Self = StObject.set(x, "SupportsKerberosAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsKerberosAuthenticationUndefined: Self = StObject.set(x, "SupportsKerberosAuthentication", js.undefined)
    
    @scala.inline
    def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "SupportsPerformanceInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPerformanceInsightsUndefined: Self = StObject.set(x, "SupportsPerformanceInsights", js.undefined)
    
    @scala.inline
    def setSupportsStorageAutoscaling(value: BooleanOptional): Self = StObject.set(x, "SupportsStorageAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "SupportsStorageAutoscaling", js.undefined)
    
    @scala.inline
    def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "SupportsStorageEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStorageEncryptionUndefined: Self = StObject.set(x, "SupportsStorageEncryption", js.undefined)
    
    @scala.inline
    def setVpc(value: Boolean): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
