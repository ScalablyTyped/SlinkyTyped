package typingsSlinky.googleapis

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaDownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessViewStatus extends js.Object {
  var accessViewStatus: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.native
  var driveImportedContentLink: js.UndefOr[String] = js.native
  var embeddable: js.UndefOr[Boolean] = js.native
  var epub: js.UndefOr[AnonAcsTokenLink] = js.native
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.native
  var pdf: js.UndefOr[AnonAcsTokenLink] = js.native
  var publicDomain: js.UndefOr[Boolean] = js.native
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.native
  var textToSpeechPermission: js.UndefOr[String] = js.native
  var viewOrderUrl: js.UndefOr[String] = js.native
  var viewability: js.UndefOr[String] = js.native
  var webReaderLink: js.UndefOr[String] = js.native
}

object AnonAccessViewStatus {
  @scala.inline
  def apply(): AnonAccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAccessViewStatus]
  }
  @scala.inline
  implicit class AnonAccessViewStatusOps[Self <: AnonAccessViewStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessViewStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessViewStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessViewStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessViewStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadAccess(value: SchemaDownloadAccessRestriction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveImportedContentLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveImportedContentLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveImportedContentLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveImportedContentLink")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddable")(js.undefined)
        ret
    }
    @scala.inline
    def withEpub(value: AnonAcsTokenLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epub")(js.undefined)
        ret
    }
    @scala.inline
    def withExplicitOfflineLicenseManagement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitOfflineLicenseManagement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicitOfflineLicenseManagement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicitOfflineLicenseManagement")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: AnonAcsTokenLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteSharingAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteSharingAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteSharingAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteSharingAllowed")(js.undefined)
        ret
    }
    @scala.inline
    def withTextToSpeechPermission(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeechPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextToSpeechPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToSpeechPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withViewOrderUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOrderUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewOrderUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewOrderUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withViewability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewability")(js.undefined)
        ret
    }
    @scala.inline
    def withWebReaderLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webReaderLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebReaderLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webReaderLink")(js.undefined)
        ret
    }
  }
  
}

