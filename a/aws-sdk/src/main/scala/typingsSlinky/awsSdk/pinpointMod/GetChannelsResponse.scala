package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelsResponse extends StObject {
  
  var ChannelsResponse: typingsSlinky.awsSdk.pinpointMod.ChannelsResponse = js.native
}
object GetChannelsResponse {
  
  @scala.inline
  def apply(ChannelsResponse: ChannelsResponse): GetChannelsResponse = {
    val __obj = js.Dynamic.literal(ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsResponse]
  }
  
  @scala.inline
  implicit class GetChannelsResponseMutableBuilder[Self <: GetChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelsResponse(value: ChannelsResponse): Self = StObject.set(x, "ChannelsResponse", value.asInstanceOf[js.Any])
  }
}
