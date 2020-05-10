package typingsSlinky.officeJsPreview.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents data obtained by OCR (optical character recognition) of an image.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait ImageOcrData extends js.Object {
  /**
    *
    * Represents the OCR language, with values such as EN-US
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrLanguageId: String = js.native
  /**
    *
    * Represents the text obtained by OCR of the image
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ocrText: String = js.native
}

object ImageOcrData {
  @scala.inline
  def apply(ocrLanguageId: String, ocrText: String): ImageOcrData = {
    val __obj = js.Dynamic.literal(ocrLanguageId = ocrLanguageId.asInstanceOf[js.Any], ocrText = ocrText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOcrData]
  }
  @scala.inline
  implicit class ImageOcrDataOps[Self <: ImageOcrData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOcrLanguageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocrLanguageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOcrText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ocrText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

