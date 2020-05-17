package typingsSlinky.jimpTiff.mod

import typingsSlinky.jimpTiff.anon.Imagetiff
import typingsSlinky.jimpTiff.anon.ImagetiffDecoderFn
import typingsSlinky.jimpTiff.anon.ImagetiffEncoderFn
import typingsSlinky.jimpTiff.anon.MIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tiff extends js.Object {
  var constants: MIMETIFF = js.native
  var decoders: ImagetiffDecoderFn = js.native
  var encoders: ImagetiffEncoderFn = js.native
  var mime: Imagetiff = js.native
}

object Tiff {
  @scala.inline
  def apply(constants: MIMETIFF, decoders: ImagetiffDecoderFn, encoders: ImagetiffEncoderFn, mime: Imagetiff): Tiff = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tiff]
  }
  @scala.inline
  implicit class TiffOps[Self <: Tiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstants(value: MIMETIFF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: ImagetiffDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: ImagetiffEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: Imagetiff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

