package typingsSlinky.jimpJpeg.mod

import typingsSlinky.jimpJpeg.AnonImagejpeg
import typingsSlinky.jimpJpeg.AnonImagejpegDecoderFn
import typingsSlinky.jimpJpeg.AnonImagejpegEncoderFn
import typingsSlinky.jimpJpeg.AnonImagejpegString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jpeg extends js.Object {
  var `class`: JpegClass = js.native
  var constants: AnonImagejpegString = js.native
  var decoders: AnonImagejpegDecoderFn = js.native
  var encoders: AnonImagejpegEncoderFn = js.native
  var mime: AnonImagejpeg = js.native
}

object Jpeg {
  @scala.inline
  def apply(
    `class`: JpegClass,
    constants: AnonImagejpegString,
    decoders: AnonImagejpegDecoderFn,
    encoders: AnonImagejpegEncoderFn,
    mime: AnonImagejpeg
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
    def withConstants(value: AnonImagejpegString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: AnonImagejpegDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: AnonImagejpegEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: AnonImagejpeg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

