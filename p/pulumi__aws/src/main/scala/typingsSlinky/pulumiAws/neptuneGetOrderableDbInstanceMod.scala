package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object neptuneGetOrderableDbInstanceMod {
  
  @JSImport("@pulumi/aws/neptune/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/neptune/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  
  @js.native
  trait GetOrderableDbInstanceArgs extends StObject {
    
    /**
      * DB engine. (Default: `neptune`)
      */
    val engine: js.UndefOr[String] = js.native
    
    /**
      * Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
      */
    val engineVersion: js.UndefOr[String] = js.native
    
    /**
      * DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
      */
    val instanceClass: js.UndefOr[String] = js.native
    
    /**
      * License model. (Default: `amazon-license`)
      */
    val licenseModel: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Enable to show only VPC offerings.
      */
    val vpc: js.UndefOr[Boolean] = js.native
  }
  object GetOrderableDbInstanceArgs {
    
    @scala.inline
    def apply(): GetOrderableDbInstanceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOrderableDbInstanceArgs]
    }
    
    @scala.inline
    implicit class GetOrderableDbInstanceArgsMutableBuilder[Self <: GetOrderableDbInstanceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      @scala.inline
      def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcUndefined: Self = StObject.set(x, "vpc", js.undefined)
    }
  }
  
  @js.native
  trait GetOrderableDbInstanceResult extends StObject {
    
    /**
      * Availability zones where the instance is available.
      */
    val availabilityZones: js.Array[String] = js.native
    
    val engine: js.UndefOr[String] = js.native
    
    val engineVersion: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val instanceClass: String = js.native
    
    val licenseModel: js.UndefOr[String] = js.native
    
    /**
      * Maximum total provisioned IOPS for a DB instance.
      */
    val maxIopsPerDbInstance: Double = js.native
    
    /**
      * Maximum provisioned IOPS per GiB for a DB instance.
      */
    val maxIopsPerGib: Double = js.native
    
    /**
      * Maximum storage size for a DB instance.
      */
    val maxStorageSize: Double = js.native
    
    /**
      * Minimum total provisioned IOPS for a DB instance.
      */
    val minIopsPerDbInstance: Double = js.native
    
    /**
      * Minimum provisioned IOPS per GiB for a DB instance.
      */
    val minIopsPerGib: Double = js.native
    
    /**
      * Minimum storage size for a DB instance.
      */
    val minStorageSize: Double = js.native
    
    /**
      * Whether a DB instance is Multi-AZ capable.
      */
    val multiAzCapable: Boolean = js.native
    
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether a DB instance can have a read replica.
      */
    val readReplicaCapable: Boolean = js.native
    
    /**
      * The storage type for a DB instance.
      */
    val storageType: String = js.native
    
    /**
      * Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
      */
    val supportsEnhancedMonitoring: Boolean = js.native
    
    /**
      * Whether a DB instance supports IAM database authentication.
      */
    val supportsIamDatabaseAuthentication: Boolean = js.native
    
    /**
      * Whether a DB instance supports provisioned IOPS.
      */
    val supportsIops: Boolean = js.native
    
    /**
      * Whether a DB instance supports Performance Insights.
      */
    val supportsPerformanceInsights: Boolean = js.native
    
    /**
      * Whether a DB instance supports encrypted storage.
      */
    val supportsStorageEncryption: Boolean = js.native
    
    val vpc: Boolean = js.native
  }
  object GetOrderableDbInstanceResult {
    
    @scala.inline
    def apply(
      availabilityZones: js.Array[String],
      engineVersion: String,
      id: String,
      instanceClass: String,
      maxIopsPerDbInstance: Double,
      maxIopsPerGib: Double,
      maxStorageSize: Double,
      minIopsPerDbInstance: Double,
      minIopsPerGib: Double,
      minStorageSize: Double,
      multiAzCapable: Boolean,
      readReplicaCapable: Boolean,
      storageType: String,
      supportsEnhancedMonitoring: Boolean,
      supportsIamDatabaseAuthentication: Boolean,
      supportsIops: Boolean,
      supportsPerformanceInsights: Boolean,
      supportsStorageEncryption: Boolean,
      vpc: Boolean
    ): GetOrderableDbInstanceResult = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any], maxIopsPerDbInstance = maxIopsPerDbInstance.asInstanceOf[js.Any], maxIopsPerGib = maxIopsPerGib.asInstanceOf[js.Any], maxStorageSize = maxStorageSize.asInstanceOf[js.Any], minIopsPerDbInstance = minIopsPerDbInstance.asInstanceOf[js.Any], minIopsPerGib = minIopsPerGib.asInstanceOf[js.Any], minStorageSize = minStorageSize.asInstanceOf[js.Any], multiAzCapable = multiAzCapable.asInstanceOf[js.Any], readReplicaCapable = readReplicaCapable.asInstanceOf[js.Any], storageType = storageType.asInstanceOf[js.Any], supportsEnhancedMonitoring = supportsEnhancedMonitoring.asInstanceOf[js.Any], supportsIamDatabaseAuthentication = supportsIamDatabaseAuthentication.asInstanceOf[js.Any], supportsIops = supportsIops.asInstanceOf[js.Any], supportsPerformanceInsights = supportsPerformanceInsights.asInstanceOf[js.Any], supportsStorageEncryption = supportsStorageEncryption.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOrderableDbInstanceResult]
    }
    
    @scala.inline
    implicit class GetOrderableDbInstanceResultMutableBuilder[Self <: GetOrderableDbInstanceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModel(value: String): Self = StObject.set(x, "licenseModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseModelUndefined: Self = StObject.set(x, "licenseModel", js.undefined)
      
      @scala.inline
      def setMaxIopsPerDbInstance(value: Double): Self = StObject.set(x, "maxIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIopsPerGib(value: Double): Self = StObject.set(x, "maxIopsPerGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStorageSize(value: Double): Self = StObject.set(x, "maxStorageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIopsPerDbInstance(value: Double): Self = StObject.set(x, "minIopsPerDbInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIopsPerGib(value: Double): Self = StObject.set(x, "minIopsPerGib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinStorageSize(value: Double): Self = StObject.set(x, "minStorageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiAzCapable(value: Boolean): Self = StObject.set(x, "multiAzCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      @scala.inline
      def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "readReplicaCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageType(value: String): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "supportsEnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIamDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "supportsIamDatabaseAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsIops(value: Boolean): Self = StObject.set(x, "supportsIops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "supportsPerformanceInsights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "supportsStorageEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    }
  }
}
