package typingsSlinky.gapiClientBooks.anon

import typingsSlinky.gapiClientBooks.gapi.client.books.Volumeseriesinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowAnonLogging extends js.Object {
  /** Whether anonymous logging should be allowed. */
  var allowAnonLogging: js.UndefOr[Boolean] = js.native
  /** The names of the authors and/or editors for this volume. (In LITE projection) */
  var authors: js.UndefOr[js.Array[String]] = js.native
  /** The mean review rating for this volume. (min = 1.0, max = 5.0) */
  var averageRating: js.UndefOr[Double] = js.native
  /** Canonical URL for a volume. (In LITE projection.) */
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  /** A list of subject categories, such as "Fiction", "Suspense", etc. */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /** An identifier for the version of the volume content (text & images). (In LITE projection) */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (In LITE
    * projection.)
    */
  var description: js.UndefOr[String] = js.native
  /** Physical dimensions of this volume. */
  var dimensions: js.UndefOr[Height] = js.native
  /** A list of image links for all the sizes that are available. (In LITE projection.) */
  var imageLinks: js.UndefOr[ExtraLarge] = js.native
  /** Industry standard identifiers for this volume. */
  var industryIdentifiers: js.UndefOr[js.Array[Identifier]] = js.native
  /** URL to view information about this volume on the Google Books site. (In LITE projection) */
  var infoLink: js.UndefOr[String] = js.native
  /** Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc. */
  var language: js.UndefOr[String] = js.native
  /** The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight. */
  var mainCategory: js.UndefOr[String] = js.native
  var maturityRating: js.UndefOr[String] = js.native
  /** Total number of pages as per publisher metadata. */
  var pageCount: js.UndefOr[Double] = js.native
  /** A top-level summary of the panelization info in this volume. */
  var panelizationSummary: js.UndefOr[ContainsEpubBubbles] = js.native
  /** URL to preview this volume on the Google Books site. */
  var previewLink: js.UndefOr[String] = js.native
  /** Type of publication of this volume. Possible values are BOOK or MAGAZINE. */
  var printType: js.UndefOr[String] = js.native
  /** Total number of printed pages in generated pdf representation. */
  var printedPageCount: js.UndefOr[Double] = js.native
  /** Date of publication. (In LITE projection.) */
  var publishedDate: js.UndefOr[String] = js.native
  /** Publisher of this volume. (In LITE projection.) */
  var publisher: js.UndefOr[String] = js.native
  /** The number of review ratings for this volume. */
  var ratingsCount: js.UndefOr[Double] = js.native
  /** The reading modes available for this volume. */
  var readingModes: js.UndefOr[js.Any] = js.native
  /** Total number of sample pages as per publisher metadata. */
  var samplePageCount: js.UndefOr[Double] = js.native
  var seriesInfo: js.UndefOr[Volumeseriesinfo] = js.native
  /** Volume subtitle. (In LITE projection.) */
  var subtitle: js.UndefOr[String] = js.native
  /** Volume title. (In LITE projection.) */
  var title: js.UndefOr[String] = js.native
}

object AllowAnonLogging {
  @scala.inline
  def apply(): AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAnonLogging]
  }
  @scala.inline
  implicit class AllowAnonLoggingOps[Self <: AllowAnonLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowAnonLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnonLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowAnonLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowAnonLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authors")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageRating")(js.undefined)
        ret
    }
    @scala.inline
    def withCanonicalVolumeLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalVolumeLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalVolumeLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalVolumeLink")(js.undefined)
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withContentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLinks(value: ExtraLarge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLinks")(js.undefined)
        ret
    }
    @scala.inline
    def withIndustryIdentifiers(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndustryIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("industryIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoLink")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withMainCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainCategory")(js.undefined)
        ret
    }
    @scala.inline
    def withMaturityRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maturityRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaturityRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maturityRating")(js.undefined)
        ret
    }
    @scala.inline
    def withPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelizationSummary(value: ContainsEpubBubbles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelizationSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelizationSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelizationSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewLink")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printType")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintedPageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printedPageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintedPageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printedPageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withReadingModes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadingModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readingModes")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplePageCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplePageCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplePageCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesInfo(value: Volumeseriesinfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

