package typingsSlinky.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnectorProfileResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the connector profile. 
    */
  var connectorProfileArn: js.UndefOr[ConnectorProfileArn] = js.native
}
object CreateConnectorProfileResponse {
  
  @scala.inline
  def apply(): CreateConnectorProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectorProfileResponse]
  }
  
  @scala.inline
  implicit class CreateConnectorProfileResponseMutableBuilder[Self <: CreateConnectorProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorProfileArn(value: ConnectorProfileArn): Self = StObject.set(x, "connectorProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorProfileArnUndefined: Self = StObject.set(x, "connectorProfileArn", js.undefined)
  }
}
