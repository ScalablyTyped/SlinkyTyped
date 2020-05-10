package typingsSlinky.jimpBmp.mod

import typingsSlinky.jimpBmp.AnonImagebmp
import typingsSlinky.jimpBmp.AnonImagebmpImagexmsbmp
import typingsSlinky.jimpBmp.AnonImagexmsbmp
import typingsSlinky.jimpBmp.AnonMIMEBMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bmp extends js.Object {
  var constants: AnonMIMEBMP = js.native
  var decoders: AnonImagexmsbmp = js.native
  var encoders: AnonImagebmpImagexmsbmp = js.native
  var mime: AnonImagebmp = js.native
}

object Bmp {
  @scala.inline
  def apply(
    constants: AnonMIMEBMP,
    decoders: AnonImagexmsbmp,
    encoders: AnonImagebmpImagexmsbmp,
    mime: AnonImagebmp
  ): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bmp]
  }
  @scala.inline
  implicit class BmpOps[Self <: Bmp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstants(value: AnonMIMEBMP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoders(value: AnonImagexmsbmp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncoders(value: AnonImagebmpImagexmsbmp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: AnonImagebmp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

