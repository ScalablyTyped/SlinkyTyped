package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`8000`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.G729
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channels extends StObject {
  
  var channels: typingsSlinky.rtpParser.rtpParserNumbers.`1` = js.native
  
  var clockRate: `8000` = js.native
  
  var mediaType: A = js.native
  
  var name: G729 = js.native
}
object Channels {
  
  @scala.inline
  def apply(
    channels: typingsSlinky.rtpParser.rtpParserNumbers.`1`,
    clockRate: `8000`,
    mediaType: A,
    name: G729
  ): Channels = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channels]
  }
  
  @scala.inline
  implicit class ChannelsMutableBuilder[Self <: Channels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: typingsSlinky.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: G729): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
