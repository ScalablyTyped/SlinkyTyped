package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`11025`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.DVI4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsClockRateMediaType extends js.Object {
  var channels: typingsSlinky.rtpParser.rtpParserNumbers.`1`
  var clockRate: `11025`
  var mediaType: A
  var name: DVI4
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
}

