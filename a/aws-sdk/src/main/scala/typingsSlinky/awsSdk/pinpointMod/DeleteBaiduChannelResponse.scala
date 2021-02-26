package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBaiduChannelResponse extends StObject {
  
  var BaiduChannelResponse: typingsSlinky.awsSdk.pinpointMod.BaiduChannelResponse = js.native
}
object DeleteBaiduChannelResponse {
  
  @scala.inline
  def apply(BaiduChannelResponse: BaiduChannelResponse): DeleteBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBaiduChannelResponse]
  }
  
  @scala.inline
  implicit class DeleteBaiduChannelResponseMutableBuilder[Self <: DeleteBaiduChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaiduChannelResponse(value: BaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
