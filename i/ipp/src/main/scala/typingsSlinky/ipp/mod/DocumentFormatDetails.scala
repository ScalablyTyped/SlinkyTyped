package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFormatDetails extends js.Object {
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-device-id`: js.UndefOr[String] = js.native
  var `document-format-version`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[js.Array[String]] = js.native
  var `document-source-application-name`: js.UndefOr[String] = js.native
  var `document-source-application-version`: js.UndefOr[String] = js.native
  var `document-source-os-name`: js.UndefOr[String] = js.native
  var `document-source-os-version`: js.UndefOr[String] = js.native
}

object DocumentFormatDetails {
  @scala.inline
  def apply(): DocumentFormatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFormatDetails]
  }
  @scala.inline
  implicit class DocumentFormatDetailsOps[Self <: DocumentFormatDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withDocument-format`(value: MimeMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-device-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-device-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-device-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-device-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-version")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-natural-language`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-natural-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-natural-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-source-application-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-application-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-source-application-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-application-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-source-application-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-application-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-source-application-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-application-version")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-source-os-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-os-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-source-os-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-os-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-source-os-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-os-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-source-os-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-source-os-version")(js.undefined)
        ret
    }
  }
  
}

