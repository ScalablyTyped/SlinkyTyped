package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClientPropertiesRequest extends StObject {
  
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: typingsSlinky.awsSdk.workspacesMod.ClientProperties = js.native
  
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: NonEmptyString = js.native
}
object ModifyClientPropertiesRequest {
  
  @scala.inline
  def apply(ClientProperties: ClientProperties, ResourceId: NonEmptyString): ModifyClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ClientProperties = ClientProperties.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientPropertiesRequest]
  }
  
  @scala.inline
  implicit class ModifyClientPropertiesRequestMutableBuilder[Self <: ModifyClientPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientProperties(value: ClientProperties): Self = StObject.set(x, "ClientProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
