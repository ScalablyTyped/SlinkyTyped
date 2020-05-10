package typingsSlinky.jimpPng.mod

import typingsSlinky.jimpPng.Anon0
import typingsSlinky.jimpPng.AnonImagepng
import typingsSlinky.jimpPng.AnonImagepngDecoderFn
import typingsSlinky.jimpPng.AnonImagepngEncoderFn
import typingsSlinky.jimpPng.AnonMIMEPNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNG extends js.Object {
  var `class`: PNGClass = js.native
  var constants: AnonMIMEPNG = js.native
  var decoders: AnonImagepngDecoderFn = js.native
  var encoders: AnonImagepngEncoderFn = js.native
  var hasAlpha: Anon0 = js.native
  var mime: AnonImagepng = js.native
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: AnonMIMEPNG,
    decoders: AnonImagepngDecoderFn,
    encoders: AnonImagepngEncoderFn,
    hasAlpha: Anon0,
    mime: AnonImagepng
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
    def withConstants(value: AnonMIMEPNG): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: AnonImagepngDecoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: AnonImagepngEncoderFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAlpha(value: Anon0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: AnonImagepng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

