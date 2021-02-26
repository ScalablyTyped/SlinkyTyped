package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationFlowConfig extends StObject {
  
  /**
    *  The name of the connector profile. This name must be unique for each connector profile in the AWS account. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType = js.native
  
  /**
    *  This stores the information that is required to query a particular connector. 
    */
  var destinationConnectorProperties: DestinationConnectorProperties = js.native
}
object DestinationFlowConfig {
  
  @scala.inline
  def apply(connectorType: ConnectorType, destinationConnectorProperties: DestinationConnectorProperties): DestinationFlowConfig = {
    val __obj = js.Dynamic.literal(connectorType = connectorType.asInstanceOf[js.Any], destinationConnectorProperties = destinationConnectorProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFlowConfig]
  }
  
  @scala.inline
  implicit class DestinationFlowConfigMutableBuilder[Self <: DestinationFlowConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConnectorProperties(value: DestinationConnectorProperties): Self = StObject.set(x, "destinationConnectorProperties", value.asInstanceOf[js.Any])
  }
}
