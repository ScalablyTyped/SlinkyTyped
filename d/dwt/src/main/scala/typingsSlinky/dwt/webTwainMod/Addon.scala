package typingsSlinky.dwt.webTwainMod

import typingsSlinky.dwt.addonBarcodeReaderMod.BarcodeReader
import typingsSlinky.dwt.addonCameraMod.Camera
import typingsSlinky.dwt.addonOCRMod.OCR
import typingsSlinky.dwt.addonOCRProMod.OCRPro
import typingsSlinky.dwt.addonPDFMod.PDF
import typingsSlinky.dwt.addonWebcamMod.Webcam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Addon extends js.Object {
  
  var BarcodeReader: typingsSlinky.dwt.addonBarcodeReaderMod.BarcodeReader = js.native
  
  var Camera: typingsSlinky.dwt.addonCameraMod.Camera = js.native
  
  var OCR: typingsSlinky.dwt.addonOCRMod.OCR = js.native
  
  var OCRPro: typingsSlinky.dwt.addonOCRProMod.OCRPro = js.native
  
  var PDF: typingsSlinky.dwt.addonPDFMod.PDF = js.native
  
  var Webcam: typingsSlinky.dwt.addonWebcamMod.Webcam = js.native
}
object Addon {
  
  @scala.inline
  def apply(BarcodeReader: BarcodeReader, Camera: Camera, OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): Addon = {
    val __obj = js.Dynamic.literal(BarcodeReader = BarcodeReader.asInstanceOf[js.Any], Camera = Camera.asInstanceOf[js.Any], OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
  
  @scala.inline
  implicit class AddonOps[Self <: Addon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBarcodeReader(value: BarcodeReader): Self = this.set("BarcodeReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: Camera): Self = this.set("Camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOCR(value: OCR): Self = this.set("OCR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOCRPro(value: OCRPro): Self = this.set("OCRPro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDF(value: PDF): Self = this.set("PDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebcam(value: Webcam): Self = this.set("Webcam", value.asInstanceOf[js.Any])
  }
}
