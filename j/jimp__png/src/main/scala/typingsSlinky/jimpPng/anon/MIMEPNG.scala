package typingsSlinky.jimpPng.anon

import typingsSlinky.jimpPng.jimpPngNumbers.`-1`
import typingsSlinky.jimpPng.jimpPngNumbers.`1`
import typingsSlinky.jimpPng.jimpPngNumbers.`2`
import typingsSlinky.jimpPng.jimpPngNumbers.`3`
import typingsSlinky.jimpPng.jimpPngNumbers.`4`
import typingsSlinky.jimpPng.jimpPngStrings.imageSlashpng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIMEPNG extends js.Object {
  var MIME_PNG: imageSlashpng = js.native
  // PNG filter types
  var PNG_FILTER_AUTO: `-1` = js.native
  var PNG_FILTER_AVERAGE: `3` = js.native
  var PNG_FILTER_NONE: typingsSlinky.jimpPng.jimpPngNumbers.`0` = js.native
  var PNG_FILTER_PATH: `4` = js.native
  var PNG_FILTER_SUB: `1` = js.native
  var PNG_FILTER_UP: `2` = js.native
}

object MIMEPNG {
  @scala.inline
  def apply(
    MIME_PNG: imageSlashpng,
    PNG_FILTER_AUTO: `-1`,
    PNG_FILTER_AVERAGE: `3`,
    PNG_FILTER_NONE: typingsSlinky.jimpPng.jimpPngNumbers.`0`,
    PNG_FILTER_PATH: `4`,
    PNG_FILTER_SUB: `1`,
    PNG_FILTER_UP: `2`
  ): MIMEPNG = {
    val __obj = js.Dynamic.literal(MIME_PNG = MIME_PNG.asInstanceOf[js.Any], PNG_FILTER_AUTO = PNG_FILTER_AUTO.asInstanceOf[js.Any], PNG_FILTER_AVERAGE = PNG_FILTER_AVERAGE.asInstanceOf[js.Any], PNG_FILTER_NONE = PNG_FILTER_NONE.asInstanceOf[js.Any], PNG_FILTER_PATH = PNG_FILTER_PATH.asInstanceOf[js.Any], PNG_FILTER_SUB = PNG_FILTER_SUB.asInstanceOf[js.Any], PNG_FILTER_UP = PNG_FILTER_UP.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMEPNG]
  }
  @scala.inline
  implicit class MIMEPNGOps[Self <: MIMEPNG] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMIME_PNG(value: imageSlashpng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIME_PNG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_AUTO(value: `-1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_AUTO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_AVERAGE(value: `3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_AVERAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_NONE(value: typingsSlinky.jimpPng.jimpPngNumbers.`0`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_PATH(value: `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_SUB(value: `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_SUB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNG_FILTER_UP(value: `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNG_FILTER_UP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

