package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevEndpointResponse extends StObject {
  
  /**
    * A DevEndpoint definition.
    */
  var DevEndpoint: js.UndefOr[typingsSlinky.awsSdk.glueMod.DevEndpoint] = js.native
}
object GetDevEndpointResponse {
  
  @scala.inline
  def apply(): GetDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointResponse]
  }
  
  @scala.inline
  implicit class GetDevEndpointResponseMutableBuilder[Self <: GetDevEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevEndpoint(value: DevEndpoint): Self = StObject.set(x, "DevEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevEndpointUndefined: Self = StObject.set(x, "DevEndpoint", js.undefined)
  }
}
