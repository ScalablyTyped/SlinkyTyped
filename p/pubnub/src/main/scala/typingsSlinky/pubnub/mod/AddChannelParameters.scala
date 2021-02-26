package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddChannelParameters extends StObject {
  
  var channelGroup: String = js.native
  
  var channels: js.Array[String] = js.native
}
object AddChannelParameters {
  
  @scala.inline
  def apply(channelGroup: String, channels: js.Array[String]): AddChannelParameters = {
    val __obj = js.Dynamic.literal(channelGroup = channelGroup.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddChannelParameters]
  }
  
  @scala.inline
  implicit class AddChannelParametersMutableBuilder[Self <: AddChannelParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGroup(value: String): Self = StObject.set(x, "channelGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
