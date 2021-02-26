package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.inputMod.ec2.GetInstanceTypeOfferingFilter
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstanceTypeOfferingMod {
  
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOffering", "getInstanceTypeOffering")
  @js.native
  def getInstanceTypeOffering(): js.Promise[GetInstanceTypeOfferingResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOffering", "getInstanceTypeOffering")
  @js.native
  def getInstanceTypeOffering(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOffering", "getInstanceTypeOffering")
  @js.native
  def getInstanceTypeOffering(args: GetInstanceTypeOfferingArgs): js.Promise[GetInstanceTypeOfferingResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstanceTypeOffering", "getInstanceTypeOffering")
  @js.native
  def getInstanceTypeOffering(args: GetInstanceTypeOfferingArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] = js.native
  
  @js.native
  trait GetInstanceTypeOfferingArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypeOfferings.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetInstanceTypeOfferingFilter]] = js.native
    
    /**
      * Location type. Defaults to `region`. Valid values: `availability-zone`, `availability-zone-id`, and `region`.
      */
    val locationType: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred EC2 Instance Types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
      */
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetInstanceTypeOfferingArgs {
    
    @scala.inline
    def apply(): GetInstanceTypeOfferingArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstanceTypeOfferingArgs]
    }
    
    @scala.inline
    implicit class GetInstanceTypeOfferingArgsMutableBuilder[Self <: GetInstanceTypeOfferingArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetInstanceTypeOfferingFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetInstanceTypeOfferingFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetInstanceTypeOfferingResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * EC2 Instance Type.
      */
    val instanceType: String = js.native
    
    val locationType: js.UndefOr[String] = js.native
    
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetInstanceTypeOfferingResult {
    
    @scala.inline
    def apply(id: String, instanceType: String): GetInstanceTypeOfferingResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstanceTypeOfferingResult]
    }
    
    @scala.inline
    implicit class GetInstanceTypeOfferingResultMutableBuilder[Self <: GetInstanceTypeOfferingResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typingsSlinky.pulumiAws.outputMod.ec2.GetInstanceTypeOfferingFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
}
