package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListConnectorEntitiesRequest extends StObject {
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in the AWS account, and is used to query the downstream connector. 
    */
  var connectorProfileName: js.UndefOr[ConnectorProfileName] = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: js.UndefOr[ConnectorType] = js.native
  
  /**
    *  This optional parameter is specific to connector implementation. Some connectors support multiple levels or categories of entities. You can find out the list of roots for such providers by sending a request without the entitiesPath parameter. If the connector supports entities at different roots, this initial request returns the list of roots. Otherwise, this request returns all entities supported by the provider. 
    */
  var entitiesPath: js.UndefOr[EntitiesPath] = js.native
}
object ListConnectorEntitiesRequest {
  
  @scala.inline
  def apply(): ListConnectorEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectorEntitiesRequest]
  }
  
  @scala.inline
  implicit class ListConnectorEntitiesRequestMutableBuilder[Self <: ListConnectorEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileNameUndefined: Self = StObject.set(x, "connectorProfileName", js.undefined)
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorTypeUndefined: Self = StObject.set(x, "connectorType", js.undefined)
    
    @scala.inline
    def setEntitiesPath(value: EntitiesPath): Self = StObject.set(x, "entitiesPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesPathUndefined: Self = StObject.set(x, "entitiesPath", js.undefined)
  }
}
