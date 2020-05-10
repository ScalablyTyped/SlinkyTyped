package typingsSlinky.pdfkit.PDFKit

import typingsSlinky.pdfkit.pdfkitStrings.highResolution
import typingsSlinky.pdfkit.pdfkitStrings.lowResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentPermissions extends js.Object {
  var annotating: js.UndefOr[Boolean] = js.native
  var contentAccessibility: js.UndefOr[Boolean] = js.native
  var copying: js.UndefOr[Boolean] = js.native
  var documentAssembly: js.UndefOr[Boolean] = js.native
  var fillingForms: js.UndefOr[Boolean] = js.native
  var modifying: js.UndefOr[Boolean] = js.native
  var printing: js.UndefOr[lowResolution | highResolution] = js.native
}

object DocumentPermissions {
  @scala.inline
  def apply(): DocumentPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPermissions]
  }
  @scala.inline
  implicit class DocumentPermissionsOps[Self <: DocumentPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotating")(js.undefined)
        ret
    }
    @scala.inline
    def withContentAccessibility(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAccessibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentAccessibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAccessibility")(js.undefined)
        ret
    }
    @scala.inline
    def withCopying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copying")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentAssembly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentAssembly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAssembly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentAssembly")(js.undefined)
        ret
    }
    @scala.inline
    def withFillingForms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillingForms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillingForms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillingForms")(js.undefined)
        ret
    }
    @scala.inline
    def withModifying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifying")(js.undefined)
        ret
    }
    @scala.inline
    def withPrinting(value: lowResolution | highResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrinting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printing")(js.undefined)
        ret
    }
  }
  
}

