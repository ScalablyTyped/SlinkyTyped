package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPCEConfiguration extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * The DNS name that maps to the private IP address of the service you want to access.
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
object VPCEConfiguration {
  
  @scala.inline
  def apply(): VPCEConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPCEConfiguration]
  }
  
  @scala.inline
  implicit class VPCEConfigurationOps[Self <: VPCEConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setServiceDnsName(value: ServiceDnsName): Self = this.set("serviceDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceDnsName: Self = this.set("serviceDnsName", js.undefined)
    
    @scala.inline
    def setVpceConfigurationDescription(value: VPCEConfigurationDescription): Self = this.set("vpceConfigurationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpceConfigurationDescription: Self = this.set("vpceConfigurationDescription", js.undefined)
    
    @scala.inline
    def setVpceConfigurationName(value: VPCEConfigurationName): Self = this.set("vpceConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpceConfigurationName: Self = this.set("vpceConfigurationName", js.undefined)
    
    @scala.inline
    def setVpceServiceName(value: VPCEServiceName): Self = this.set("vpceServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpceServiceName: Self = this.set("vpceServiceName", js.undefined)
  }
}
