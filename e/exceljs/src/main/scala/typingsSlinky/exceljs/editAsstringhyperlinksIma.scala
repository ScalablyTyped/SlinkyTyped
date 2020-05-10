package typingsSlinky.exceljs

import typingsSlinky.exceljs.mod.Anchor
import typingsSlinky.exceljs.mod.ImageHyperlinkValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  editAs ? :string,   hyperlinks ? :exceljs.exceljs.ImageHyperlinkValue} & exceljs.exceljs.ImageRange */
@js.native
trait editAsstringhyperlinksIma extends js.Object {
  var br: AnonCol | Anchor = js.native
  var editAs: js.UndefOr[String] = js.native
  var hyperlinks: js.UndefOr[ImageHyperlinkValue] = js.native
  var tl: AnonCol | Anchor = js.native
}

object editAsstringhyperlinksIma {
  @scala.inline
  def apply(br: AnonCol | Anchor, tl: AnonCol | Anchor): editAsstringhyperlinksIma = {
    val __obj = js.Dynamic.literal(br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any])
    __obj.asInstanceOf[editAsstringhyperlinksIma]
  }
  @scala.inline
  implicit class editAsstringhyperlinksImaOps[Self <: editAsstringhyperlinksIma] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBr(value: AnonCol | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTl(value: AnonCol | Anchor): Self = {
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

