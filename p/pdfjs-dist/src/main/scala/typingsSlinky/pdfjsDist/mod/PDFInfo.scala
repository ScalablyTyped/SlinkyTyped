package typingsSlinky.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFInfo
  extends /* key */ StringDictionary[js.Any] {
  var IsAcroFormPresent: Boolean = js.native
  var IsXFAPresent: Boolean = js.native
  var PDFFormatVersion: String = js.native
}

object PDFInfo {
  @scala.inline
  def apply(IsAcroFormPresent: Boolean, IsXFAPresent: Boolean, PDFFormatVersion: String): PDFInfo = {
    val __obj = js.Dynamic.literal(IsAcroFormPresent = IsAcroFormPresent.asInstanceOf[js.Any], IsXFAPresent = IsXFAPresent.asInstanceOf[js.Any], PDFFormatVersion = PDFFormatVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFInfo]
  }
  @scala.inline
  implicit class PDFInfoOps[Self <: PDFInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAcroFormPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsAcroFormPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsXFAPresent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsXFAPresent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDFFormatVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDFFormatVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

