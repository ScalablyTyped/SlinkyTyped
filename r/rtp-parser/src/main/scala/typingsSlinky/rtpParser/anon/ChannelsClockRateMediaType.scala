package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`11025`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.DVI4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsClockRateMediaType extends js.Object {
  
  var channels: typingsSlinky.rtpParser.rtpParserNumbers.`1` = js.native
  
  var clockRate: `11025` = js.native
  
  var mediaType: A = js.native
  
  var name: DVI4 = js.native
}
object ChannelsClockRateMediaType {
  
  @scala.inline
  def apply(
    channels: typingsSlinky.rtpParser.rtpParserNumbers.`1`,
    clockRate: `11025`,
    mediaType: A,
    name: DVI4
  ): ChannelsClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsClockRateMediaType]
  }
  
  @scala.inline
  implicit class ChannelsClockRateMediaTypeOps[Self <: ChannelsClockRateMediaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannels(value: typingsSlinky.rtpParser.rtpParserNumbers.`1`): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `11025`): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DVI4): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
