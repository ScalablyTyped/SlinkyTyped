package typingsSlinky.googleapis

import typingsSlinky.googleapis.booksV1Mod.booksV1.SchemaVolumeseriesinfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowAnonLogging extends js.Object {
  var allowAnonLogging: js.UndefOr[Boolean] = js.native
  var authors: js.UndefOr[js.Array[String]] = js.native
  var averageRating: js.UndefOr[Double] = js.native
  var canonicalVolumeLink: js.UndefOr[String] = js.native
  var categories: js.UndefOr[js.Array[String]] = js.native
  var comicsContent: js.UndefOr[Boolean] = js.native
  var contentVersion: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[AnonThickness] = js.native
  var imageLinks: js.UndefOr[AnonExtraLarge] = js.native
  var industryIdentifiers: js.UndefOr[js.Array[AnonIdentifier]] = js.native
  var infoLink: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var mainCategory: js.UndefOr[String] = js.native
  var maturityRating: js.UndefOr[String] = js.native
  var pageCount: js.UndefOr[Double] = js.native
  var panelizationSummary: js.UndefOr[AnonContainsEpubBubbles] = js.native
  var previewLink: js.UndefOr[String] = js.native
  var printType: js.UndefOr[String] = js.native
  var printedPageCount: js.UndefOr[Double] = js.native
  var publishedDate: js.UndefOr[String] = js.native
  var publisher: js.UndefOr[String] = js.native
  var ratingsCount: js.UndefOr[Double] = js.native
  var readingModes: js.UndefOr[js.Any] = js.native
  var samplePageCount: js.UndefOr[Double] = js.native
  var seriesInfo: js.UndefOr[SchemaVolumeseriesinfo] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AnonAllowAnonLogging {
  @scala.inline
  def apply(): AnonAllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowAnonLogging]
  }
  @scala.inline
  implicit class AnonAllowAnonLoggingOps[Self <: AnonAllowAnonLogging] (val x: Self) extends AnyVal {
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
    def withComicsContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comicsContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComicsContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comicsContent")(js.undefined)
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
    def withDimensions(value: AnonThickness): Self = {
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
    def withImageLinks(value: AnonExtraLarge): Self = {
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
    def withIndustryIdentifiers(value: js.Array[AnonIdentifier]): Self = {
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
    def withPanelizationSummary(value: AnonContainsEpubBubbles): Self = {
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
    def withSeriesInfo(value: SchemaVolumeseriesinfo): Self = {
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

