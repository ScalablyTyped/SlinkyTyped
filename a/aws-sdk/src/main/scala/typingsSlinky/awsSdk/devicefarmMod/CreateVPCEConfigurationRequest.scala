package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVPCEConfigurationRequest extends StObject {
  
  /**
    * The DNS name of the service running in your VPC that you want Device Farm to test.
    */
  var serviceDnsName: ServiceDnsName = js.native
  
  /**
    * An optional description that provides details about your VPC endpoint configuration.
    */
  var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.native
  
  /**
    * The friendly name you give to your VPC endpoint configuration, to manage your configurations more easily.
    */
  var vpceConfigurationName: VPCEConfigurationName = js.native
  
  /**
    * The name of the VPC endpoint service running in your AWS account that you want Device Farm to test.
    */
  var vpceServiceName: VPCEServiceName = js.native
}
object CreateVPCEConfigurationRequest {
  
  @scala.inline
  def apply(
    serviceDnsName: ServiceDnsName,
    vpceConfigurationName: VPCEConfigurationName,
    vpceServiceName: VPCEServiceName
  ): CreateVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(serviceDnsName = serviceDnsName.asInstanceOf[js.Any], vpceConfigurationName = vpceConfigurationName.asInstanceOf[js.Any], vpceServiceName = vpceServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCEConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateVPCEConfigurationRequestMutableBuilder[Self <: CreateVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceDnsName(value: ServiceDnsName): Self = StObject.set(x, "serviceDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = StObject.set(x, "vpceConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationDescriptionUndefined: Self = StObject.set(x, "vpceConfigurationDescription", js.undefined)
    
    @scala.inline
    def setVpceConfigurationName(value: VPCEConfigurationName): Self = StObject.set(x, "vpceConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceServiceName(value: VPCEServiceName): Self = StObject.set(x, "vpceServiceName", value.asInstanceOf[js.Any])
  }
}
