package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyEndpointResponse extends StObject {
  
  /**
    * The modified endpoint.
    */
  var Endpoint: js.UndefOr[typingsSlinky.awsSdk.dmsMod.Endpoint] = js.native
}
object ModifyEndpointResponse {
  
  @scala.inline
  def apply(): ModifyEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEndpointResponse]
  }
  
  @scala.inline
  implicit class ModifyEndpointResponseMutableBuilder[Self <: ModifyEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
