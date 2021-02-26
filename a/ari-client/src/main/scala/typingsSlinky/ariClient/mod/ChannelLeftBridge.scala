package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelLeftBridge extends Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge = js.native
  
  /**
    * Channel.
    */
  var channel: Channel = js.native
}
object ChannelLeftBridge {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, channel: Channel, timestamp: js.Date, `type`: String): ChannelLeftBridge = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelLeftBridge]
  }
  
  @scala.inline
  implicit class ChannelLeftBridgeMutableBuilder[Self <: ChannelLeftBridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
