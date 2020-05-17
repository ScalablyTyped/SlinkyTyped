package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`8000`
import typingsSlinky.rtpParser.rtpParserStrings.A
import typingsSlinky.rtpParser.rtpParserStrings.G722
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `11` extends js.Object {
  var channels: typingsSlinky.rtpParser.rtpParserNumbers.`1` = js.native
  var clockRate: `8000` = js.native
  var mediaType: A = js.native
  var name: G722 = js.native
}

object `11` {
  @scala.inline
  def apply(
    channels: typingsSlinky.rtpParser.rtpParserNumbers.`1`,
    clockRate: `8000`,
    mediaType: A,
    name: G722
  ): `11` = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannels(value: typingsSlinky.rtpParser.rtpParserNumbers.`1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClockRate(value: `8000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: A): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: G722): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

