package typingsSlinky.gapiClientBooks.anon

import typingsSlinky.gapiClientBooks.gapi.client.books.DownloadAccessRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessViewStatus extends js.Object {
  /**
    * Combines the access and viewability of this volume into a single status field for this user. Values can be FULL_PURCHASED, FULL_PUBLIC_DOMAIN, SAMPLE
    * or NONE. (In LITE projection.)
    */
  var accessViewStatus: js.UndefOr[String] = js.native
  /** The two-letter ISO_3166-1 country code for which this access information is valid. (In LITE projection.) */
  var country: js.UndefOr[String] = js.native
  /** Information about a volume's download license access restrictions. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.native
  /** URL to the Google Drive viewer if this volume is uploaded by the user by selecting the file from Google Drive. */
  var driveImportedContentLink: js.UndefOr[String] = js.native
  /** Whether this volume can be embedded in a viewport using the Embedded Viewer API. */
  var embeddable: js.UndefOr[Boolean] = js.native
  /** Information about epub content. (In LITE projection.) */
  var epub: js.UndefOr[AcsTokenLink] = js.native
  /**
    * Whether this volume requires that the client explicitly request offline download license rather than have it done automatically when loading the
    * content, if the client supports it.
    */
  var explicitOfflineLicenseManagement: js.UndefOr[Boolean] = js.native
  /** Information about pdf content. (In LITE projection.) */
  var pdf: js.UndefOr[AcsTokenLink] = js.native
  /** Whether or not this book is public domain in the country listed above. */
  var publicDomain: js.UndefOr[Boolean] = js.native
  /** Whether quote sharing is allowed for this volume. */
  var quoteSharingAllowed: js.UndefOr[Boolean] = js.native
  /** Whether text-to-speech is permitted for this volume. Values can be ALLOWED, ALLOWED_FOR_ACCESSIBILITY, or NOT_ALLOWED. */
  var textToSpeechPermission: js.UndefOr[String] = js.native
  /** For ordered but not yet processed orders, we give a URL that can be used to go to the appropriate Google Wallet page. */
  var viewOrderUrl: js.UndefOr[String] = js.native
  /**
    * The read access of a volume. Possible values are PARTIAL, ALL_PAGES, NO_PAGES or UNKNOWN. This value depends on the country listed above. A value of
    * PARTIAL means that the publisher has allowed some portion of the volume to be viewed publicly, without purchase. This can apply to eBooks as well as
    * non-eBooks. Public domain books will always have a value of ALL_PAGES.
    */
  var viewability: js.UndefOr[String] = js.native
  /** URL to read this volume on the Google Books site. Link will not allow users to read non-viewable volumes. */
  var webReaderLink: js.UndefOr[String] = js.native
}

object AccessViewStatus {
  @scala.inline
  def apply(): AccessViewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessViewStatus]
  }
  @scala.inline
  implicit class AccessViewStatusOps[Self <: AccessViewStatus] (val x: Self) extends AnyVal {
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
    def withDownloadAccess(value: DownloadAccessRestriction): Self = {
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
    def withEpub(value: AcsTokenLink): Self = {
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
    def withPdf(value: AcsTokenLink): Self = {
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

