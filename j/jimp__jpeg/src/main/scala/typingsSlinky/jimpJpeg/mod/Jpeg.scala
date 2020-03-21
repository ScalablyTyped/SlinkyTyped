package typingsSlinky.jimpJpeg.mod

import typingsSlinky.jimpJpeg.AnonImagejpeg
import typingsSlinky.jimpJpeg.AnonImagejpegDecoderFn
import typingsSlinky.jimpJpeg.AnonImagejpegEncoderFn
import typingsSlinky.jimpJpeg.AnonImagejpegString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jpeg extends js.Object {
  var `class`: JpegClass
  var constants: AnonImagejpegString
  var decoders: AnonImagejpegDecoderFn
  var encoders: AnonImagejpegEncoderFn
  var mime: AnonImagejpeg
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
}

