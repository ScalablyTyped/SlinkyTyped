package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelHold extends Event {
  
  /**
    * The channel that initiated the hold event.
    */
  var channel: Channel = js.native
  
  /**
    * The music on hold class that the initiator requested.
    */
  var musicclass: js.UndefOr[String] = js.native
}
object ChannelHold {
  
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: js.Date, `type`: String): ChannelHold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHold]
  }
  
  @scala.inline
  implicit class ChannelHoldMutableBuilder[Self <: ChannelHold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicclass(value: String): Self = StObject.set(x, "musicclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicclassUndefined: Self = StObject.set(x, "musicclass", js.undefined)
  }
}
