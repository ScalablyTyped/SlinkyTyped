package typingsSlinky.cssFontLoadingModule.mod.global

import typingsSlinky.cssFontLoadingModule.mod.FontFaceSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  var fonts: FontFaceSet = js.native
}

object Document {
  @scala.inline
  def apply(fonts: FontFaceSet): Document = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFonts(value: FontFaceSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

