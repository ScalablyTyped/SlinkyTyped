package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewaySummary extends StObject {
  
  /**
    * The date the gateway was created, in Unix epoch time.
    */
  var creationDate: js.Date = js.native
  
  /**
    * A list of gateway capability summaries that each contain a namespace and status. Each gateway capability defines data sources for the gateway. To retrieve a capability configuration's definition, use DescribeGatewayCapabilityConfiguration.
    */
  var gatewayCapabilitySummaries: js.UndefOr[GatewayCapabilitySummaries] = js.native
  
  /**
    * The ID of the gateway device.
    */
  var gatewayId: ID = js.native
  
  /**
    * The name of the asset.
    */
  var gatewayName: Name = js.native
  
  /**
    * The date the gateway was last updated, in Unix epoch time.
    */
  var lastUpdateDate: js.Date = js.native
}
object GatewaySummary {
  
  @scala.inline
  def apply(creationDate: js.Date, gatewayId: ID, gatewayName: Name, lastUpdateDate: js.Date): GatewaySummary = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], gatewayName = gatewayName.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewaySummary]
  }
  
  @scala.inline
  implicit class GatewaySummaryMutableBuilder[Self <: GatewaySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayCapabilitySummaries(value: GatewayCapabilitySummaries): Self = StObject.set(x, "gatewayCapabilitySummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayCapabilitySummariesUndefined: Self = StObject.set(x, "gatewayCapabilitySummaries", js.undefined)
    
    @scala.inline
    def setGatewayCapabilitySummariesVarargs(value: GatewayCapabilitySummary*): Self = StObject.set(x, "gatewayCapabilitySummaries", js.Array(value :_*))
    
    @scala.inline
    def setGatewayId(value: ID): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayName(value: Name): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateDate(value: js.Date): Self = StObject.set(x, "lastUpdateDate", value.asInstanceOf[js.Any])
  }
}
