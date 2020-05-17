package typingsSlinky.jimpJpeg.mod

import typingsSlinky.jimpJpeg.anon.Imagejpeg
import typingsSlinky.jimpJpeg.anon.ImagejpegDecoderFn
import typingsSlinky.jimpJpeg.anon.ImagejpegEncoderFn
import typingsSlinky.jimpJpeg.anon.ImagejpegString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jpeg extends js.Object {
  var `class`: JpegClass = js.native
  var constants: ImagejpegString = js.native
  var decoders: ImagejpegDecoderFn = js.native
  var encoders: ImagejpegEncoderFn = js.native
  var mime: Imagejpeg = js.native
}

object Jpeg {
  @scala.inline
  def apply(
    `class`: JpegClass,
    constants: ImagejpegString,
    decoders: ImagejpegDecoderFn,
    encoders: ImagejpegEncoderFn,
    mime: Imagejpeg
  ): Jpeg = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jpeg]
  }
  @scala.inline
  implicit class JpegOps[Self <: Jpeg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: JpegClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: ImagejpegString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: ImagejpegDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: ImagejpegEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: Imagejpeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

