package typingsSlinky.pdfkit.PDFKit

import typingsSlinky.pdfkit.anon.Bottom
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot3`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot4`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot5`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot6`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot7`
import typingsSlinky.pdfkit.pdfkitStrings.`1Dot7ext3`
import typingsSlinky.pdfkit.pdfkitStrings.landscape
import typingsSlinky.pdfkit.pdfkitStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocumentOptions extends js.Object {
  var autoFirstPage: js.UndefOr[Boolean] = js.native
  var bufferPages: js.UndefOr[Boolean] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var info: js.UndefOr[DocumentInfo] = js.native
  var layout: js.UndefOr[portrait | landscape] = js.native
  var margin: js.UndefOr[Double] = js.native
  var margins: js.UndefOr[Bottom] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.native
  var permissions: js.UndefOr[DocumentPermissions] = js.native
  var size: js.UndefOr[js.Array[Double] | String] = js.native
  var userPassword: js.UndefOr[String] = js.native
}

object PDFDocumentOptions {
  @scala.inline
  def apply(): PDFDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFDocumentOptions]
  }
  @scala.inline
  implicit class PDFDocumentOptionsOps[Self <: PDFDocumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFirstPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFirstPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFirstPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFirstPage")(js.undefined)
        ret
    }
    @scala.inline
    def withBufferPages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferPages")(js.undefined)
        ret
    }
    @scala.inline
    def withCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compress")(js.undefined)
        ret
    }
    @scala.inline
    def withInfo(value: DocumentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: portrait | landscape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMargins(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margins")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfVersion(value: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdfVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: DocumentPermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withUserPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userPassword")(js.undefined)
        ret
    }
  }
  
}

