package typingsSlinky.atJimpJpeg.atJimpJpegMod

import typingsSlinky.atJimpJpeg.Anon_Imagejpeg
import typingsSlinky.atJimpJpeg.Anon_ImagejpegDecoderFn
import typingsSlinky.atJimpJpeg.Anon_ImagejpegEncoderFn
import typingsSlinky.atJimpJpeg.Anon_ImagejpegString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jpeg extends js.Object {
  var `class`: JpegClass
  var constants: Anon_ImagejpegString
  var decoders: Anon_ImagejpegDecoderFn
  var encoders: Anon_ImagejpegEncoderFn
  var mime: Anon_Imagejpeg
}

object Jpeg {
  @scala.inline
  def apply(
    `class`: JpegClass,
    constants: Anon_ImagejpegString,
    decoders: Anon_ImagejpegDecoderFn,
    encoders: Anon_ImagejpegEncoderFn,
    mime: Anon_Imagejpeg
  ): Jpeg = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jpeg]
  }
}

