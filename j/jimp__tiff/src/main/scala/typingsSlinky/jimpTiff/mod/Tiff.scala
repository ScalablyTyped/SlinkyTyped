package typingsSlinky.jimpTiff.mod

import typingsSlinky.jimpTiff.AnonImagetiff
import typingsSlinky.jimpTiff.AnonImagetiffDecoderFn
import typingsSlinky.jimpTiff.AnonImagetiffEncoderFn
import typingsSlinky.jimpTiff.AnonMIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tiff extends js.Object {
  var constants: AnonMIMETIFF = js.native
  var decoders: AnonImagetiffDecoderFn = js.native
  var encoders: AnonImagetiffEncoderFn = js.native
  var mime: AnonImagetiff = js.native
}

object Tiff {
  @scala.inline
  def apply(
    constants: AnonMIMETIFF,
    decoders: AnonImagetiffDecoderFn,
    encoders: AnonImagetiffEncoderFn,
    mime: AnonImagetiff
  ): Tiff = {
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
    def withConstants(value: AnonMIMETIFF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: AnonImagetiffDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: AnonImagetiffEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: AnonImagetiff): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

