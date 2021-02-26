package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicequotasGetServiceMod {
  
  @JSImport("@pulumi/aws/servicequotas/getService", "getService")
  @js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = js.native
  @JSImport("@pulumi/aws/servicequotas/getService", "getService")
  @js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = js.native
  
  @js.native
  trait GetServiceArgs extends StObject {
    
    /**
      * Service name to lookup within Service Quotas. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceName: String = js.native
  }
  object GetServiceArgs {
    
    @scala.inline
    def apply(serviceName: String): GetServiceArgs = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceArgs]
    }
    
    @scala.inline
    implicit class GetServiceArgsMutableBuilder[Self <: GetServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetServiceResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Code of the service.
      */
    val serviceCode: String = js.native
    
    val serviceName: String = js.native
  }
  object GetServiceResult {
    
    @scala.inline
    def apply(id: String, serviceCode: String, serviceName: String): GetServiceResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceResult]
    }
    
    @scala.inline
    implicit class GetServiceResultMutableBuilder[Self <: GetServiceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
}
