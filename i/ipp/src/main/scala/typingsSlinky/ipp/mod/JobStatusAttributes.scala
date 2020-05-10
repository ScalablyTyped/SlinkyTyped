package typingsSlinky.ipp.mod

import typingsSlinky.ipp.ippStrings.collated
import typingsSlinky.ipp.ippStrings.uncollated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobStatusAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `chamber-humidity-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `chamber-temperature-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `compression-supplied`: js.UndefOr[Compression] = js.native
  var `copies-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `cover-back-actual`: js.UndefOr[js.Array[Cover]] = js.native
  var `cover-front-actual`: js.UndefOr[js.Array[Cover]] = js.native
  var `date-time-at-completed`: js.UndefOr[String] = js.native
  var `date-time-at-creation`: js.UndefOr[String] = js.native
  var `date-time-at-processing`: js.UndefOr[String] = js.native
  var `destination-statuses`: js.UndefOr[js.Array[DestinationStatuses]] = js.native
  var `document-charset-supplied`: js.UndefOr[String] = js.native
  var `document-digital-signature-supplied`: js.UndefOr[DocumentDigitalSignature] = js.native
  var `document-format-details-supplied`: js.UndefOr[DocumentFormatDetails] = js.native
  var `document-format-ready`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `document-format-supplied`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-version-supplied`: js.UndefOr[String] = js.native
  var `document-message-supplied`: js.UndefOr[String] = js.native
  var `document-name-supplied`: js.UndefOr[String] = js.native
  var `document-natural-language-supplied`: js.UndefOr[String] = js.native
  var `errors-count`: js.UndefOr[Double] = js.native
  var `finishings-actual`: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-col-actual`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `force-front-side-actual`: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var `imposition-template-actual`: js.UndefOr[js.Array[ImpositionTemplate]] = js.native
  var `input-attributes-actual`: js.UndefOr[InputAttributes] = js.native
  var `insert-sheet-actual`: js.UndefOr[js.Array[InsertSheet]] = js.native
  var `job-account-id-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-account-type-actual`: js.UndefOr[JobAccountType] = js.native
  var `job-accounting-sheets-actual`: js.UndefOr[js.Array[JobAccontingSheets]] = js.native
  var `job-accounting-user-id-actual`: js.UndefOr[js.Array[String]] = js.native
  var `job-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.native
  var `job-document-access-errors`: js.UndefOr[js.Array[String]] = js.native
  var `job-error-sheet-actual`: js.UndefOr[js.Array[JobErrorSheet]] = js.native
  var `job-hold-until-actual`: js.UndefOr[js.Array[JobHoldUntil]] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-impressions-col`: js.UndefOr[Impressions] = js.native
  var `job-impressions-completed`: js.UndefOr[Double] = js.native
  var `job-impressions-completed-col`: js.UndefOr[Impressions] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-k-octets-processed`: js.UndefOr[Double] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.native
  var `job-media-sheets-completed`: js.UndefOr[Double] = js.native
  var `job-media-sheets-completed-col`: js.UndefOr[Impressions] = js.native
  var `job-more-info`: js.UndefOr[String] = js.native
  var `job-originating-user-name`: js.UndefOr[String] = js.native
  var `job-originating-user-uri`: js.UndefOr[String] = js.native
  var `job-pages`: js.UndefOr[Double] = js.native
  var `job-pages-col`: js.UndefOr[Pages] = js.native
  var `job-pages-completed`: js.UndefOr[Double] = js.native
  var `job-pages-completed-col`: js.UndefOr[Pages] = js.native
  var `job-pages-completed-current-copy`: js.UndefOr[Double] = js.native
  var `job-printer-up-time`: js.UndefOr[Double] = js.native
  var `job-printer-uri`: js.UndefOr[String] = js.native
  var `job-priority-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `job-resource-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `job-sheet-message-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `job-sheets-actual`: js.UndefOr[js.Array[JobSheets]] = js.native
  var `job-sheets-col-actual`: js.UndefOr[js.Array[JobSheetsInterface]] = js.native
  var `job-state`: js.UndefOr[JobState] = js.native
  var `job-state-message`: js.UndefOr[String] = js.native
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `job-uuid`: js.UndefOr[String] = js.native
  var `materials-col-actual`: js.UndefOr[js.Array[Materials]] = js.native
  var `media-actual`: js.UndefOr[js.Array[String]] = js.native
  var `media-col-actual`: js.UndefOr[js.Array[MediaInterface]] = js.native
  var `media-input-tray-check-actual`: js.UndefOr[js.Array[String]] = js.native
  var `multiple-document-handling-actual`: js.UndefOr[js.Array[MultipleDocumentHandling]] = js.native
  var `multiple-object-handling-actual`: js.UndefOr[MultipleObjectHandling] = js.native
  var `number-of-documents`: js.UndefOr[Double] = js.native
  var `number-of-intervening-jobs`: js.UndefOr[Double] = js.native
  var `number-up-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `orientation-requested-actual`: js.UndefOr[js.Array[OrientationRequested]] = js.native
  var `original-requesting-user-name`: js.UndefOr[String] = js.native
  var `output-attributes-actual`: js.UndefOr[OutputAttributes] = js.native
  var `output-bin-actual`: js.UndefOr[js.Array[OutputBin]] = js.native
  var `output-device-actual`: js.UndefOr[js.Array[String]] = js.native
  var `output-device-assigned`: js.UndefOr[String] = js.native
  var `output-device-job-state`: js.UndefOr[JobState] = js.native
  var `output-device-job-state-message`: js.UndefOr[String] = js.native
  var `output-device-job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `output-device-uuid-assigned`: js.UndefOr[String] = js.native
  var `overrides-actual`: js.UndefOr[js.Array[Overrides]] = js.native
  var `page-delivery-actual`: js.UndefOr[js.Array[PageDelivery]] = js.native
  var `page-order-received-actual`: js.UndefOr[js.Array[PageOrder]] = js.native
  var `page-ranges-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `platform-temperature-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `presentation-direction-number-up-actual`: js.UndefOr[js.Array[PresentationDirectionNumberUp]] = js.native
  var `print-accuracy-actual`: js.UndefOr[PrintAccuracy] = js.native
  var `print-base-actual`: js.UndefOr[js.Array[PrintBase]] = js.native
  var `print-color-mode-actual`: js.UndefOr[js.Array[PrintColorMode]] = js.native
  var `print-content-optimize-actual`: js.UndefOr[js.Array[PrintContentOptimize]] = js.native
  var `print-objects-actual`: js.UndefOr[js.Array[PrintObjects]] = js.native
  var `print-quality-actual`: js.UndefOr[js.Array[PrintQuality]] = js.native
  var `print-rendering-intent-actual`: js.UndefOr[js.Array[PrintRenderingIntent]] = js.native
  var `print-supports-actual`: js.UndefOr[js.Array[PrintSupports]] = js.native
  var `printer-resolution-actual`: js.UndefOr[js.Array[Resolution]] = js.native
  var `separator-sheets-actual`: js.UndefOr[js.Array[SeparatorSheets]] = js.native
  var `sheet-collate-actual`: js.UndefOr[js.Array[collated | uncollated]] = js.native
  var `sides-actual`: js.UndefOr[js.Array[Sides]] = js.native
  var `time-at-completed`: js.UndefOr[Double] = js.native
  var `time-at-creation`: js.UndefOr[Double] = js.native
  var `time-at-processing`: js.UndefOr[Double] = js.native
  var `warnings-count`: js.UndefOr[Double] = js.native
  var `x-image-position-actual`: js.UndefOr[js.Array[XImagePosition]] = js.native
  var `x-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `x-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `x-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-image-position-actual`: js.UndefOr[js.Array[YImagePosition]] = js.native
  var `y-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-side1-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
  var `y-side2-image-shift-actual`: js.UndefOr[js.Array[Double]] = js.native
}

object JobStatusAttributes {
  @scala.inline
  def apply(): JobStatusAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStatusAttributes]
  }
  @scala.inline
  implicit class JobStatusAttributesOps[Self <: JobStatusAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAttributes-charset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAttributes-natural-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-natural-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withChamber-humidity-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-humidity-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withChamber-temperature-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-temperature-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withCompression-supplied`(value: Compression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCompression-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withCopies-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCopies-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withCover-back-actual`(value: js.Array[Cover]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-back-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-back-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-back-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withCover-front-actual`(value: js.Array[Cover]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-front-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-front-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-front-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withDate-time-at-completed`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDate-time-at-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withDate-time-at-creation`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-creation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDate-time-at-creation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-creation")(js.undefined)
        ret
    }
    @scala.inline
    def `withDate-time-at-processing`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDate-time-at-processing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date-time-at-processing")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-statuses`(value: js.Array[DestinationStatuses]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-statuses`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-statuses")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-charset-supplied`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-charset-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-charset-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-charset-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-digital-signature-supplied`(value: DocumentDigitalSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-digital-signature-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-digital-signature-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-digital-signature-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-details-supplied`(value: DocumentFormatDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-details-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-details-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-details-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-ready`(value: js.Array[MimeMediaType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-ready`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-ready")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-supplied`(value: MimeMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-version-supplied`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-version-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-version-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-version-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-message-supplied`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-message-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-message-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-message-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-name-supplied`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-name-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-name-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-name-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-natural-language-supplied`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-natural-language-supplied")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-natural-language-supplied`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-natural-language-supplied")(js.undefined)
        ret
    }
    @scala.inline
    def `withErrors-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutErrors-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withFinishings-actual`(value: js.Array[Finishings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFinishings-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withFinishings-col-actual`(value: js.Array[FinishingsInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-col-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFinishings-col-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-col-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withForce-front-side-actual`(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force-front-side-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutForce-front-side-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force-front-side-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withImposition-template-actual`(value: js.Array[ImpositionTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImposition-template-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-attributes-actual`(value: InputAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-attributes-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-attributes-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-attributes-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withInsert-sheet-actual`(value: js.Array[InsertSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-sheet-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInsert-sheet-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-sheet-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-account-id-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-id-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-account-id-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-id-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-account-type-actual`(value: JobAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-type-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-account-type-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-type-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-accounting-sheets-actual`(value: js.Array[JobAccontingSheets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-sheets-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-accounting-user-id-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-user-id-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-user-id-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-user-id-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-attribute-fidelity`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-attribute-fidelity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-attribute-fidelity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-attribute-fidelity")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-detailed-status-messages`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-detailed-status-messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-detailed-status-messages`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-detailed-status-messages")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-document-access-errors`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-document-access-errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-document-access-errors`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-document-access-errors")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-error-sheet-actual`(value: js.Array[JobErrorSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-error-sheet-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-hold-until-actual`(value: js.Array[JobHoldUntil]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-hold-until-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-impressions`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-impressions-col`(value: Impressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-impressions-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-impressions-completed-col`(value: Impressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-k-octets`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-k-octets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-k-octets-processed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets-processed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-k-octets-processed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets-processed")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-media-sheets`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-media-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-media-sheets-col`(value: MediaSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-media-sheets-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-media-sheets-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-media-sheets-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-media-sheets-completed-col`(value: Impressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-media-sheets-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-more-info`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-more-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-more-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-more-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-originating-user-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-originating-user-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-originating-user-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-originating-user-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-originating-user-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-originating-user-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-originating-user-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-originating-user-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages-col`(value: Pages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages-completed-col`(value: Pages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages-completed-current-copy`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed-current-copy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages-completed-current-copy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-completed-current-copy")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-printer-up-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-printer-up-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-printer-up-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-printer-up-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-printer-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-printer-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-printer-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-printer-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-priority-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-priority-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-priority-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-priority-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-resource-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-resource-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-resource-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-resource-ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheet-message-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheet-message-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheet-message-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheet-message-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheets-actual`(value: js.Array[JobSheets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheets-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheets-col-actual`(value: js.Array[JobSheetsInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-col-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheets-col-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-col-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-state`(value: JobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-state-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-state-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-state-reasons`(value: js.Array[JobStateReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-state-reasons`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-state-reasons")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-uuid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-uuid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-uuid")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterials-col-actual`(value: js.Array[Materials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials-col-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterials-col-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials-col-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-col-actual`(value: js.Array[MediaInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-col-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-input-tray-check-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-input-tray-check-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-input-tray-check-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-input-tray-check-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withMultiple-document-handling-actual`(value: js.Array[MultipleDocumentHandling]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-document-handling-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMultiple-document-handling-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-document-handling-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withMultiple-object-handling-actual`(value: MultipleObjectHandling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-object-handling-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMultiple-object-handling-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-object-handling-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-of-documents`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-of-documents`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-documents")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-of-intervening-jobs`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-intervening-jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-of-intervening-jobs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-intervening-jobs")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-up-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-up-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-up-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-up-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withOrientation-requested-actual`(value: js.Array[OrientationRequested]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation-requested-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOrientation-requested-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation-requested-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withOriginal-requesting-user-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original-requesting-user-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOriginal-requesting-user-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original-requesting-user-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-attributes-actual`(value: OutputAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-attributes-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-attributes-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-attributes-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-bin-actual`(value: js.Array[OutputBin]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-bin-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-bin-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-bin-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-actual`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-assigned`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-assigned`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-assigned")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-job-state`(value: JobState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-job-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-job-state-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-job-state-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-job-state-reasons`(value: js.Array[JobStateReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state-reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-job-state-reasons`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-state-reasons")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-uuid-assigned`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-uuid-assigned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-uuid-assigned`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-uuid-assigned")(js.undefined)
        ret
    }
    @scala.inline
    def `withOverrides-actual`(value: js.Array[Overrides]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOverrides-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-delivery-actual`(value: js.Array[PageDelivery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-delivery-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-delivery-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-delivery-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-order-received-actual`(value: js.Array[PageOrder]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-order-received-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-order-received-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-order-received-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-ranges-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-ranges-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-ranges-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-ranges-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPlatform-temperature-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-temperature-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPlatform-temperature-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-temperature-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPresentation-direction-number-up-actual`(value: js.Array[PresentationDirectionNumberUp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation-direction-number-up-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPresentation-direction-number-up-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation-direction-number-up-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-accuracy-actual`(value: PrintAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-accuracy-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-accuracy-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-accuracy-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-base-actual`(value: js.Array[PrintBase]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-base-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-base-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-base-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-color-mode-actual`(value: js.Array[PrintColorMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-color-mode-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-color-mode-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-color-mode-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-content-optimize-actual`(value: js.Array[PrintContentOptimize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-content-optimize-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-content-optimize-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-content-optimize-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-objects-actual`(value: js.Array[PrintObjects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-objects-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-objects-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-objects-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-quality-actual`(value: js.Array[PrintQuality]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-quality-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-quality-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-quality-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-rendering-intent-actual`(value: js.Array[PrintRenderingIntent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-rendering-intent-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-rendering-intent-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-rendering-intent-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-supports-actual`(value: js.Array[PrintSupports]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-supports-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-supports-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-supports-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-resolution-actual`(value: js.Array[Resolution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-resolution-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-resolution-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-resolution-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withSeparator-sheets-actual`(value: js.Array[SeparatorSheets]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSeparator-sheets-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withSheet-collate-actual`(value: js.Array[collated | uncollated]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet-collate-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSheet-collate-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet-collate-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withSides-actual`(value: js.Array[Sides]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSides-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withTime-at-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTime-at-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withTime-at-creation`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-creation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTime-at-creation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-creation")(js.undefined)
        ret
    }
    @scala.inline
    def `withTime-at-processing`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-processing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutTime-at-processing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time-at-processing")(js.undefined)
        ret
    }
    @scala.inline
    def `withWarnings-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWarnings-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-image-position-actual`(value: js.Array[XImagePosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-position-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-image-position-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-position-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-shift-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-side1-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side1-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-side1-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side1-image-shift-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-side2-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side2-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-side2-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side2-image-shift-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-image-position-actual`(value: js.Array[YImagePosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-position-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-image-position-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-position-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-shift-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-side1-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side1-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-side1-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side1-image-shift-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-side2-image-shift-actual`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side2-image-shift-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-side2-image-shift-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side2-image-shift-actual")(js.undefined)
        ret
    }
  }
  
}

