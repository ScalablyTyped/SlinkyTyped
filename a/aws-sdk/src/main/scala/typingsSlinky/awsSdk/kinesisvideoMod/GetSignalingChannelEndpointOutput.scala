package typingsSlinky.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSignalingChannelEndpointOutput extends StObject {
  
  /**
    * A list of endpoints for the specified signaling channel.
    */
  var ResourceEndpointList: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoMod.ResourceEndpointList] = js.native
}
object GetSignalingChannelEndpointOutput {
  
  @scala.inline
  def apply(): GetSignalingChannelEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
  }
  
  @scala.inline
  implicit class GetSignalingChannelEndpointOutputMutableBuilder[Self <: GetSignalingChannelEndpointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceEndpointList(value: ResourceEndpointList): Self = StObject.set(x, "ResourceEndpointList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceEndpointListUndefined: Self = StObject.set(x, "ResourceEndpointList", js.undefined)
    
    @scala.inline
    def setResourceEndpointListVarargs(value: ResourceEndpointListItem*): Self = StObject.set(x, "ResourceEndpointList", js.Array(value :_*))
  }
}
