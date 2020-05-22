package typingsSlinky.jimpTiff.mod

import typingsSlinky.jimpTiff.anon.Imagetiff
import typingsSlinky.jimpTiff.anon.ImagetiffDecoderFn
import typingsSlinky.jimpTiff.anon.ImagetiffEncoderFn
import typingsSlinky.jimpTiff.anon.MIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tiff extends js.Object {
  var constants: MIMETIFF
  var decoders: ImagetiffDecoderFn
  var encoders: ImagetiffEncoderFn
  var mime: Imagetiff
}

object Tiff {
  @scala.inline
  def apply(constants: MIMETIFF, decoders: ImagetiffDecoderFn, encoders: ImagetiffEncoderFn, mime: Imagetiff): Tiff = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiff]
  }
}

