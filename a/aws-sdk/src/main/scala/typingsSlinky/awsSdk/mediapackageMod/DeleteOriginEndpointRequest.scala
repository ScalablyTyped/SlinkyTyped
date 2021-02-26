package typingsSlinky.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOriginEndpointRequest extends StObject {
  
  /**
    * The ID of the OriginEndpoint to delete.
    */
  var Id: string = js.native
}
object DeleteOriginEndpointRequest {
  
  @scala.inline
  def apply(Id: string): DeleteOriginEndpointRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOriginEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteOriginEndpointRequestMutableBuilder[Self <: DeleteOriginEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
