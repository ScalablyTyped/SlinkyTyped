package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftWebTwainAddon extends js.Object {
  var OCR: typingsSlinky.dwt.OCR
  var OCRPro: typingsSlinky.dwt.OCRPro
  var PDF: typingsSlinky.dwt.PDF
  var Webcam: typingsSlinky.dwt.Webcam
}

object DynamsoftWebTwainAddon {
  @scala.inline
  def apply(OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): DynamsoftWebTwainAddon = {
    val __obj = js.Dynamic.literal(OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamsoftWebTwainAddon]
  }
}

