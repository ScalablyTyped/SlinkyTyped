package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var Languages: String = js.native
  var LicenseChecker: String = js.native
  var OutputFormat: EnumDWTOCRProOutputFormat = js.native
  var PDFAVersion: EnumDWTOCRProPDFAVersion = js.native
  var PDFVersion: EnumDWTOCRProPDFVersion = js.native
  var RecognitionModule: String = js.native
  var Redaction: typingsSlinky.dwt.Redaction = js.native
}

object Settings {
  @scala.inline
  def apply(
    Languages: String,
    LicenseChecker: String,
    OutputFormat: EnumDWTOCRProOutputFormat,
    PDFAVersion: EnumDWTOCRProPDFAVersion,
    PDFVersion: EnumDWTOCRProPDFVersion,
    RecognitionModule: String,
    Redaction: Redaction
  ): Settings = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], LicenseChecker = LicenseChecker.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], PDFAVersion = PDFAVersion.asInstanceOf[js.Any], PDFVersion = PDFVersion.asInstanceOf[js.Any], RecognitionModule = RecognitionModule.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseChecker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseChecker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputFormat(value: EnumDWTOCRProOutputFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDFAVersion(value: EnumDWTOCRProPDFAVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDFAVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPDFVersion(value: EnumDWTOCRProPDFVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PDFVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecognitionModule(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecognitionModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedaction(value: Redaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Redaction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

