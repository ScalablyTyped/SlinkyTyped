package typingsSlinky.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEndpointGroupResponse extends StObject {
  
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}
object DescribeEndpointGroupResponse {
  
  @scala.inline
  def apply(): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeEndpointGroupResponseMutableBuilder[Self <: DescribeEndpointGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
