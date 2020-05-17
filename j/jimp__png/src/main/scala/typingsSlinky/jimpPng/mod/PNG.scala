package typingsSlinky.jimpPng.mod

import typingsSlinky.jimpPng.anon.Imagepng
import typingsSlinky.jimpPng.anon.ImagepngDecoderFn
import typingsSlinky.jimpPng.anon.ImagepngEncoderFn
import typingsSlinky.jimpPng.anon.MIMEPNG
import typingsSlinky.jimpPng.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNG extends js.Object {
  var `class`: PNGClass = js.native
  var constants: MIMEPNG = js.native
  var decoders: ImagepngDecoderFn = js.native
  var encoders: ImagepngEncoderFn = js.native
  var hasAlpha: `0` = js.native
  var mime: Imagepng = js.native
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: MIMEPNG,
    decoders: ImagepngDecoderFn,
    encoders: ImagepngEncoderFn,
    hasAlpha: `0`,
    mime: Imagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNG]
  }
  @scala.inline
  implicit class PNGOps[Self <: PNG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: PNGClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: MIMEPNG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: ImagepngDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: ImagepngEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAlpha(value: `0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: Imagepng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

