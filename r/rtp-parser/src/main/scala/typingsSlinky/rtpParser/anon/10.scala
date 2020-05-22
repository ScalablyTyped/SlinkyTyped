package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`44100`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.L16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  var channels: typingsSlinky.rtpParser.rtpParserNumbers.`2`
  var clockRate: `44100`
  var mediaType: A
  var name: L16
}

object `10` {
  @scala.inline
  def apply(
    channels: typingsSlinky.rtpParser.rtpParserNumbers.`2`,
    clockRate: `44100`,
    mediaType: A,
    name: L16
  ): `10` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
}

