package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayCapabilitySummary extends StObject {
  
  /**
    * The namespace of the capability configuration. For example, if you configure OPC-UA sources from the AWS IoT SiteWise console, your OPC-UA capability configuration has the namespace iotsitewise:opcuacollector:version, where version is a number such as 1.
    */
  var capabilityNamespace: CapabilityNamespace = js.native
  
  /**
    * The synchronization status of the capability configuration. The sync status can be one of the following:    IN_SYNC – The gateway is running the capability configuration.    OUT_OF_SYNC – The gateway hasn't received the capability configuration.    SYNC_FAILED – The gateway rejected the capability configuration.  
    */
  var capabilitySyncStatus: CapabilitySyncStatus = js.native
}
object GatewayCapabilitySummary {
  
  @scala.inline
  def apply(capabilityNamespace: CapabilityNamespace, capabilitySyncStatus: CapabilitySyncStatus): GatewayCapabilitySummary = {
    val __obj = js.Dynamic.literal(capabilityNamespace = capabilityNamespace.asInstanceOf[js.Any], capabilitySyncStatus = capabilitySyncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayCapabilitySummary]
  }
  
  @scala.inline
  implicit class GatewayCapabilitySummaryMutableBuilder[Self <: GatewayCapabilitySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilityNamespace(value: CapabilityNamespace): Self = StObject.set(x, "capabilityNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitySyncStatus(value: CapabilitySyncStatus): Self = StObject.set(x, "capabilitySyncStatus", value.asInstanceOf[js.Any])
  }
}
