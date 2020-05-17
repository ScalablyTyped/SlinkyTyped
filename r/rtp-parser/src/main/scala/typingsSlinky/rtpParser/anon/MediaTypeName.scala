package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserStrings.H261
import typingsSlinky.rtpParser.rtpParserStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTypeName extends js.Object {
  var clockRate: `90000` = js.native
  var mediaType: V = js.native
  var name: H261 = js.native
}

object MediaTypeName {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: V, name: H261): MediaTypeName = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTypeName]
  }
  @scala.inline
  implicit class MediaTypeNameOps[Self <: MediaTypeName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClockRate(value: `90000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: V): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: H261): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

