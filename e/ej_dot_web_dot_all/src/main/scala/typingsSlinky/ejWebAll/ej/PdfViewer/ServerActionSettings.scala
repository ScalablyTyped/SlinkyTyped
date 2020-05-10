package typingsSlinky.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerActionSettings extends js.Object {
  /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
    */
  var download: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
    */
  var fileUpload: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for loading the PDF document.
    */
  var load: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
    */
  var print: js.UndefOr[String] = js.native
}

object ServerActionSettings {
  @scala.inline
  def apply(): ServerActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerActionSettings]
  }
  @scala.inline
  implicit class ServerActionSettingsOps[Self <: ServerActionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withFileUpload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
  }
  
}

