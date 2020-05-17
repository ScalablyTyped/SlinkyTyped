package typingsSlinky.rtpParser.anon

import typingsSlinky.rtpParser.rtpParserNumbers.`90000`
import typingsSlinky.rtpParser.rtpParserStrings.AV
import typingsSlinky.rtpParser.rtpParserStrings.MP2T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaType extends js.Object {
  var clockRate: `90000` = js.native
  var mediaType: AV = js.native
  var name: MP2T = js.native
}

object MediaType {
  @scala.inline
  def apply(clockRate: `90000`, mediaType: AV, name: MP2T): MediaType = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaType]
  }
  @scala.inline
  implicit class MediaTypeOps[Self <: MediaType] (val x: Self) extends AnyVal {
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
    def withMediaType(value: AV): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: MP2T): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

