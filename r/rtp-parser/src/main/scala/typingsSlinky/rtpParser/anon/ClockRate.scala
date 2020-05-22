package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserStrings.H263
import typingsSlinky.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockRate extends js.Object {
  var clockRate: `90000`
  var mediaType: V
  var name: H263
}

object ClockRate {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: H263): ClockRate = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockRate]
  }
}

