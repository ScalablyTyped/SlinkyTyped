package typingsSlinky.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelCallerId extends Event {
  
  /**
    * The integer representation of the Caller Presentation value.
    */
  var caller_presentation: Double = js.native
  
  /**
    * The text representation of the Caller Presentation value.
    */
  var caller_presentation_txt: String = js.native
  
  /**
    * The channel that changed Caller ID.
    */
  var channel: Channel = js.native
}
object ChannelCallerId {
  
  @scala.inline
  def apply(
    application: String,
    caller_presentation: Double,
    caller_presentation_txt: String,
    channel: Channel,
    timestamp: js.Date,
    `type`: String
  ): ChannelCallerId = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], caller_presentation = caller_presentation.asInstanceOf[js.Any], caller_presentation_txt = caller_presentation_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCallerId]
  }
  
  @scala.inline
  implicit class ChannelCallerIdMutableBuilder[Self <: ChannelCallerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaller_presentation(value: Double): Self = StObject.set(x, "caller_presentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaller_presentation_txt(value: String): Self = StObject.set(x, "caller_presentation_txt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}
