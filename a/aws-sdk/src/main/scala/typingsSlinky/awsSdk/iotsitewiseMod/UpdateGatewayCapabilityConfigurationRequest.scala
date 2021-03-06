package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGatewayCapabilityConfigurationRequest extends StObject {
  
  /**
    * The JSON document that defines the configuration for the gateway capability. For more information, see Configuring data sources (CLI) in the AWS IoT SiteWise User Guide.
    */
  var capabilityConfiguration: CapabilityConfiguration = js.native
  
  /**
    * The namespace of the gateway capability configuration to be updated. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  
  /**
    * The ID of the gateway to be updated.
    */
  var gatewayId: ID = js.native
}
object UpdateGatewayCapabilityConfigurationRequest {
  
  @scala.inline
  def apply(
    capabilityConfiguration: CapabilityConfiguration,
    capabilityNamespace: CapabilityNamespace,
    gatewayId: ID
  ): UpdateGatewayCapabilityConfigurationRequest = {
    val __obj = js.Dynamic.literal(capabilityConfiguration = capabilityConfiguration.asInstanceOf[js.Any], capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayCapabilityConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateGatewayCapabilityConfigurationRequestMutableBuilder[Self <: UpdateGatewayCapabilityConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilityConfiguration(value: CapabilityConfiguration): Self = StObject.set(x, "capabilityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = StObject.set(x, "capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
  }
}
