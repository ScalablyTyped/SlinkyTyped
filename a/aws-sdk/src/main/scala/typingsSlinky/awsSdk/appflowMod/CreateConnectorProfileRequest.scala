package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectorProfileRequest extends StObject {
  
  /**
    *  Indicates the connection mode and specifies whether it is public or private. Private flows use AWS PrivateLink to route data over AWS infrastructure without exposing it to the public internet. 
    */
  var connectionMode: ConnectionMode = js.native
  
  /**
    *  Defines the connector-specific configuration and credentials. 
    */
  var connectorProfileConfig: ConnectorProfileConfig = js.native
  
  /**
    *  The name of the connector profile. The name is unique for each ConnectorProfile in your AWS account. 
    */
  var connectorProfileName: ConnectorProfileName = js.native
  
  /**
    *  The type of connector, such as Salesforce, Amplitude, and so on. 
    */
  var connectorType: ConnectorType = js.native
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.native
}
object CreateConnectorProfileRequest {
  
  @scala.inline
  def apply(
    connectionMode: ConnectionMode,
    connectorProfileConfig: ConnectorProfileConfig,
    connectorProfileName: ConnectorProfileName,
    connectorType: ConnectorType
  ): CreateConnectorProfileRequest = {
    val __obj = js.Dynamic.literal(connectionMode = connectionMode.asInstanceOf[js.Any], connectorProfileConfig = connectorProfileConfig.asInstanceOf[js.Any], connectorProfileName = connectorProfileName.asInstanceOf[js.Any], connectorType = connectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorProfileRequest]
  }
  
  @scala.inline
  implicit class CreateConnectorProfileRequestMutableBuilder[Self <: CreateConnectorProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionMode(value: ConnectionMode): Self = StObject.set(x, "connectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileConfig(value: ConnectorProfileConfig): Self = StObject.set(x, "connectorProfileConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileName(value: ConnectorProfileName): Self = StObject.set(x, "connectorProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorType(value: ConnectorType): Self = StObject.set(x, "connectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = StObject.set(x, "kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArnUndefined: Self = StObject.set(x, "kmsArn", js.undefined)
  }
}
