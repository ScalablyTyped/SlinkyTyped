package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointResponse extends StObject {
  
  /**
    * Describes information associated with the specific endpoint.
    */
  var EndpointProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.EndpointProperties] = js.native
}
object DescribeEndpointResponse {
  
  @scala.inline
  def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointResponseMutableBuilder[Self <: DescribeEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointProperties(value: EndpointProperties): Self = StObject.set(x, "EndpointProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPropertiesUndefined: Self = StObject.set(x, "EndpointProperties", js.undefined)
  }
}
