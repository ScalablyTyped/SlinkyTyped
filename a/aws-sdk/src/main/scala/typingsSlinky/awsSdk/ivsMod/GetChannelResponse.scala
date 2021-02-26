package typingsSlinky.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetChannelResponse extends StObject {
  
  var channel: js.UndefOr[Channel] = js.native
}
object GetChannelResponse {
  
  @scala.inline
  def apply(): GetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelResponse]
  }
  
  @scala.inline
  implicit class GetChannelResponseMutableBuilder[Self <: GetChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
