package typingsSlinky.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoBoolean extends js.Object {
  var h264: String = js.native
  var ogg: String = js.native
  var webm: String = js.native
}

object VideoBoolean {
  @scala.inline
  def apply(h264: String, ogg: String, webm: String): VideoBoolean = {
    val __obj = js.Dynamic.literal(h264 = h264.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoBoolean]
  }
  @scala.inline
  implicit class VideoBooleanOps[Self <: VideoBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH264(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h264")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ogg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

