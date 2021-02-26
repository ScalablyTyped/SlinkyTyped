package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to update.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * The DNS (domain) name used to connect to your private service in your VPC. The DNS name must not already be in use on the internet.
    */
  var serviceDnsName: js.UndefOr[ServiceDnsName] = js.native
  
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  
  /**
    * The friendly name you give to your VPC endpoint configuration to manage your configurations more easily.
    */
  var vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.native
  
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: js.UndefOr[VPCEServiceName] = js.native
}
object UpdateVPCEConfigurationRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateVPCEConfigurationRequestMutableBuilder[Self <: UpdateVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDnsName(value: ServiceDnsName): Self = StObject.set(x, "serviceDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceDnsNameUndefined: Self = StObject.set(x, "serviceDnsName", js.undefined)
    
    @scala.inline
    def setVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = StObject.set(x, "vpceConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationDescriptionUndefined: Self = StObject.set(x, "vpceConfigurationDescription", js.undefined)
    
    @scala.inline
    def setVpceConfigurationName(value: VPCEConfigurationName): Self = StObject.set(x, "vpceConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationNameUndefined: Self = StObject.set(x, "vpceConfigurationName", js.undefined)
    
    @scala.inline
    def setVpceServiceName(value: VPCEServiceName): Self = StObject.set(x, "vpceServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceServiceNameUndefined: Self = StObject.set(x, "vpceServiceName", js.undefined)
  }
}
