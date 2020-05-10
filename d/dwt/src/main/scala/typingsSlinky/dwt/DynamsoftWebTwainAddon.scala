package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamsoftWebTwainAddon extends js.Object {
  var OCR: typingsSlinky.dwt.OCR = js.native
  var OCRPro: typingsSlinky.dwt.OCRPro = js.native
  var PDF: typingsSlinky.dwt.PDF = js.native
  var Webcam: typingsSlinky.dwt.Webcam = js.native
}

object DynamsoftWebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): DynamsoftWebTwainAddon = {
    val __obj = js.Dynamic.literal(OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamsoftWebTwainAddon]
  }
  @scala.inline
  implicit class DynamsoftWebTwainAddonOps[Self <: DynamsoftWebTwainAddon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOCR(value: OCR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOCRPro(value: OCRPro): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OCRPro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDF(value: PDF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebcam(value: Webcam): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Webcam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

