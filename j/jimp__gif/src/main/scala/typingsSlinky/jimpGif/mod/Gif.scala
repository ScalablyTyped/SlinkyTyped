package typingsSlinky.jimpGif.mod

import typingsSlinky.jimpGif.AnonImagegif
import typingsSlinky.jimpGif.AnonImagegifDecoderFn
import typingsSlinky.jimpGif.AnonMIMEGIF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gif extends js.Object {
  var constants: AnonMIMEGIF = js.native
  var decoders: AnonImagegifDecoderFn = js.native
  var mime: AnonImagegif = js.native
}

object Gif {
  @scala.inline
  def apply(constants: AnonMIMEGIF, decoders: AnonImagegifDecoderFn, mime: AnonImagegif): Gif = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gif]
  }
  @scala.inline
  implicit class GifOps[Self <: Gif] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstants(value: AnonMIMEGIF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: AnonImagegifDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: AnonImagegif): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

