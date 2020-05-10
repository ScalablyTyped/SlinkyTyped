package typingsSlinky.pdfFillForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.pdfFillForm.mod.Options because Already inherited */ @js.native
trait ImgPdfOptions extends PdfOptions {
  var endPage: js.UndefOr[Double] = js.native
  var startPage: js.UndefOr[Double] = js.native
}

object ImgPdfOptions {
  @scala.inline
  def apply(): ImgPdfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgPdfOptions]
  }
  @scala.inline
  implicit class ImgPdfOptionsOps[Self <: ImgPdfOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPage")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPage")(js.undefined)
        ret
    }
  }
  
}

