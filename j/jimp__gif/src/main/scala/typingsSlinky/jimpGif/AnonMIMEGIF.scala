package typingsSlinky.jimpGif

import typingsSlinky.jimpGif.jimpGifStrings.imageSlashgif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMIMEGIF extends js.Object {
  var MIME_GIF: imageSlashgif = js.native
}

object AnonMIMEGIF {
  @scala.inline
  def apply(MIME_GIF: imageSlashgif): AnonMIMEGIF = {
    val __obj = js.Dynamic.literal(MIME_GIF = MIME_GIF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMIMEGIF]
  }
  @scala.inline
  implicit class AnonMIMEGIFOps[Self <: AnonMIMEGIF] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMIME_GIF(value: imageSlashgif): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIME_GIF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

