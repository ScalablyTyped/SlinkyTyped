package typingsSlinky.pdfImage.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFInfo extends /* key */ StringDictionary[String] {
  var CreationDate: String = js.native
  var Creator: String = js.native
  var Encrypted: String = js.native
  var `File size`: String = js.native
  var Form: String = js.native
  var JavaScript: String = js.native
  var Optimized: String = js.native
  var `PDF version`: String = js.native
  var `Page rot`: String = js.native
  var `Page size`: String = js.native
  var Pages: String = js.native
  var Producer: String = js.native
  var Suspects: String = js.native
  var Tagged: String = js.native
  var UserProperties: String = js.native
}

object PDFInfo {
  @scala.inline
  def apply(
    CreationDate: String,
    Creator: String,
    Encrypted: String,
    `File size`: String,
    Form: String,
    JavaScript: String,
    Optimized: String,
    `PDF version`: String,
    `Page rot`: String,
    `Page size`: String,
    Pages: String,
    Producer: String,
    Suspects: String,
    Tagged: String,
    UserProperties: String
  ): PDFInfo = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Encrypted = Encrypted.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], JavaScript = JavaScript.asInstanceOf[js.Any], Optimized = Optimized.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], Producer = Producer.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], Tagged = Tagged.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("File size")((`File size`).asInstanceOf[js.Any])
    __obj.updateDynamic("PDF version")((`PDF version`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page rot")((`Page rot`).asInstanceOf[js.Any])
    __obj.updateDynamic("Page size")((`Page size`).asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFInfo]
  }
  @scala.inline
  implicit class PDFInfoOps[Self <: PDFInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withFile size`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("File size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJavaScript(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JavaScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Optimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPDF version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDF version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage rot`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page rot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withPage size`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Page size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProducer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Producer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuspects(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Suspects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTagged(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProperties(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProperties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

