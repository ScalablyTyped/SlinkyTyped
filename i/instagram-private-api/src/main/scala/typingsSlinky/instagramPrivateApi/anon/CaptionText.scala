package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionText extends js.Object {
  var captionText: String = js.native
  var mediaId: String = js.native
}

object CaptionText {
  @scala.inline
  def apply(captionText: String, mediaId: String): CaptionText = {
    val __obj = js.Dynamic.literal(captionText = captionText.asInstanceOf[js.Any], mediaId = mediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionText]
  }
  @scala.inline
  implicit class CaptionTextOps[Self <: CaptionText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

