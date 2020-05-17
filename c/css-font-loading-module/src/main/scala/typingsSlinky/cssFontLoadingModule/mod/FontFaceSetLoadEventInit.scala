package typingsSlinky.cssFontLoadingModule.mod

import typingsSlinky.cssFontLoadingModule.mod.global.FontFace
import typingsSlinky.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceSetLoadEventInit extends EventInit {
  var fontfaces: js.UndefOr[js.Array[FontFace]] = js.native
}

object FontFaceSetLoadEventInit {
  @scala.inline
  def apply(): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
  @scala.inline
  implicit class FontFaceSetLoadEventInitOps[Self <: FontFaceSetLoadEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFontfaces(value: js.Array[FontFace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontfaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontfaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontfaces")(js.undefined)
        ret
    }
  }
  
}

