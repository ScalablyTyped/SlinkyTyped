package typingsSlinky.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageCountsParameters extends StObject {
  
  var channelTimetokens: js.Array[Double | String] = js.native
  
  var channels: js.Array[String] = js.native
}
object MessageCountsParameters {
  
  @scala.inline
  def apply(channelTimetokens: js.Array[Double | String], channels: js.Array[String]): MessageCountsParameters = {
    val __obj = js.Dynamic.literal(channelTimetokens = channelTimetokens.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageCountsParameters]
  }
  
  @scala.inline
  implicit class MessageCountsParametersMutableBuilder[Self <: MessageCountsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelTimetokens(value: js.Array[Double | String]): Self = StObject.set(x, "channelTimetokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTimetokensVarargs(value: (Double | String)*): Self = StObject.set(x, "channelTimetokens", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
