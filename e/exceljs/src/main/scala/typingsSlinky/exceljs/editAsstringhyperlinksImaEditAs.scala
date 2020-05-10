package typingsSlinky.exceljs

import typingsSlinky.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs ? :string,   hyperlinks ? :exceljs.exceljs.ImageHyperlinkValue} & exceljs.exceljs.ImagePosition */
@js.native
trait editAsstringhyperlinksImaEditAs extends js.Object {
  var editAs: js.UndefOr[String] = js.native
  var ext: AnonHeight = js.native
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.native
  var tl: AnonCol = js.native
}

object editAsstringhyperlinksImaEditAs {
  @scala.inline
  def apply(ext: AnonHeight, tl: AnonCol): editAsstringhyperlinksImaEditAs = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringhyperlinksImaEditAs]
  }
  @scala.inline
  implicit class editAsstringhyperlinksImaEditAsOps[Self <: editAsstringhyperlinksImaEditAs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: AnonCol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editAs")(js.undefined)
        ret
    }
    @scala.inline
    def withHyperlinks(value: ImageHyperlinkValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyperlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinks")(js.undefined)
        ret
    }
  }
  
}

