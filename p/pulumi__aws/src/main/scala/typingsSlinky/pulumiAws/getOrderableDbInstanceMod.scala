package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOrderableDbInstanceMod {
  
  @JSImport("@pulumi/aws/docdb/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/docdb/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/docdb/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = js.native
  @JSImport("@pulumi/aws/docdb/getOrderableDbInstance", "getOrderableDbInstance")
  @js.native
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = js.native
  
  @js.native
  trait GetOrderableDbInstanceArgs extends StObject {
    
    /**
      * DB engine. Default: `docdb`
      */
    val engine: js.UndefOr[String] = js.native
    
    /**
      * Version of the DB engine.
      */
    val engineVersion: js.UndefOr[String] = js.native
    
    /**
      * DB instance class. Examples of classes are `db.r5.12xlarge`, `db.r5.24xlarge`, `db.r5.2xlarge`, `db.r5.4xlarge`, `db.r5.large`, `db.r5.xlarge`, and `db.t3.medium`. (Conflicts with `preferredInstanceClasses`.)
      */
    val instanceClass: js.UndefOr[String] = js.native
    
    /**
      * License model. Default: `na`
      */
    val licenseModel: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred DocumentDB DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. (Conflicts with `instanceClass`.)
      */
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Enable to show only VPC.
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
    
    val preferredInstanceClasses: js.UndefOr[js.Array[String]] = js.native
    
    val vpc: Boolean = js.native
  }
  object GetOrderableDbInstanceResult {
    
    @scala.inline
    def apply(
      availabilityZones: js.Array[String],
      engineVersion: String,
      id: String,
      instanceClass: String,
      vpc: Boolean
    ): GetOrderableDbInstanceResult = {
      val __obj = js.Dynamic.literal(availabilityZones = availabilityZones.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceClass = instanceClass.asInstanceOf[js.Any], vpc = vpc.asInstanceOf[js.Any])
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
      def setPreferredInstanceClasses(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceClassesUndefined: Self = StObject.set(x, "preferredInstanceClasses", js.undefined)
      
      @scala.inline
      def setPreferredInstanceClassesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceClasses", js.Array(value :_*))
      
      @scala.inline
      def setVpc(value: Boolean): Self = StObject.set(x, "vpc", value.asInstanceOf[js.Any])
    }
  }
}
