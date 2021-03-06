package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelTalkingStarted extends Event {
  
  /**
    * The channel on which talking started.
    */
  var channel: Channel = js.native
}
object ChannelTalkingStarted {
  
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: js.Date, `type`: String): ChannelTalkingStarted = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTalkingStarted]
  }
  
  @scala.inline
  implicit class ChannelTalkingStartedMutableBuilder[Self <: ChannelTalkingStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
