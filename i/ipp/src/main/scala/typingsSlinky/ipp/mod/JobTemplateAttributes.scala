package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobTemplateAttributes extends js.Object {
  var `chamber-humidity`: js.UndefOr[Double] = js.native
  var `chamber-temperature`: js.UndefOr[Double] = js.native
  var `confirmation-sheet-print`: js.UndefOr[Boolean] = js.native
  var copies: js.UndefOr[Double] = js.native
  var `cover-back`: js.UndefOr[Cover] = js.native
  var `cover-front`: js.UndefOr[Cover] = js.native
  var `cover-sheet-info`: js.UndefOr[CoverSheetInfo] = js.native
  var `destination-uris`: js.UndefOr[js.Array[DestinationUris]] = js.native
  var finishings: js.UndefOr[js.Array[Finishings]] = js.native
  var `finishings-col`: js.UndefOr[js.Array[FinishingsInterface]] = js.native
  var `font-name-requested`: js.UndefOr[String] = js.native
  var `font-size-requested`: js.UndefOr[Double] = js.native
  var `force-front-side`: js.UndefOr[js.Array[Double]] = js.native
  var `imposition-template`: js.UndefOr[ImpositionTemplate] = js.native
  var `insert-sheet`: js.UndefOr[js.Array[InsertSheet]] = js.native
  var `job-account-id`: js.UndefOr[String] = js.native
  var `job-account-type`: js.UndefOr[JobAccountType] = js.native
  var `job-accounting-sheets`: js.UndefOr[JobAccontingSheets] = js.native
  var `job-accounting-user-id`: js.UndefOr[String] = js.native
  var `job-cancel-after`: js.UndefOr[Double] = js.native
  var `job-copies`: js.UndefOr[Double] = js.native
  var `job-cover-back`: js.UndefOr[Cover] = js.native
  var `job-cover-front`: js.UndefOr[Cover] = js.native
  var `job-delay-output-until`: js.UndefOr[JobDelayOutputUntil] = js.native
  var `job-delay-output-until-time`: js.UndefOr[String] = js.native
  var `job-error-action`: js.UndefOr[JobErrorAction] = js.native
  var `job-error-sheet`: js.UndefOr[JobErrorSheet] = js.native
  var `job-finishings`: js.UndefOr[js.Array[Finishings]] = js.native
  var `job-finishings-col`: js.UndefOr[FinishingsInterface] = js.native
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.native
  var `job-hold-until-time`: js.UndefOr[String] = js.native
  var `job-message-to-operator`: js.UndefOr[String] = js.native
  var `job-pages-per-set`: js.UndefOr[Double] = js.native
  var `job-phone-number`: js.UndefOr[String] = js.native
  var `job-priority`: js.UndefOr[Double] = js.native
  var `job-recipient-name`: js.UndefOr[String] = js.native
  var `job-retain-until`: js.UndefOr[JobRetainUntil] = js.native
  var `job-retain-until-interval`: js.UndefOr[Double] = js.native
  var `job-retain-until-time`: js.UndefOr[String] = js.native
  var `job-save-disposition`: js.UndefOr[JobSaveDisposition] = js.native
  var `job-sheet-message`: js.UndefOr[String] = js.native
  var `job-sheets`: js.UndefOr[JobSheets] = js.native
  var `job-sheets-col`: js.UndefOr[JobSheetsInterface] = js.native
  var `materials-col`: js.UndefOr[js.Array[Materials]] = js.native
  var media: js.UndefOr[Media] = js.native
  var `media-col`: js.UndefOr[MediaInterface] = js.native
  var `media-input-tray-check`: js.UndefOr[MediaIntputTray] = js.native
  var `multiple-document-handling`: js.UndefOr[MultipleDocumentHandling] = js.native
  var `multiple-object-handling`: js.UndefOr[MultipleObjectHandling] = js.native
  var `number-of-retries`: js.UndefOr[Double] = js.native
  var `number-up`: js.UndefOr[Double] = js.native
  var `orientation-requested`: js.UndefOr[OrientationRequested] = js.native
  var `output-bin`: js.UndefOr[OutputBin] = js.native
  var `output-device`: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[js.Array[Overrides]] = js.native
  var `page-delivery`: js.UndefOr[PageDelivery] = js.native
  var `page-order-received`: js.UndefOr[PageOrder] = js.native
  var `page-ranges`: js.UndefOr[String] = js.native
  var `pages-per-subset`: js.UndefOr[js.Array[Double]] = js.native
  var `pclm-source-resolution`: js.UndefOr[Resolution] = js.native
  var `pdl-init-file`: js.UndefOr[PdlInitFile] = js.native
  var `platform-temperature`: js.UndefOr[Double] = js.native
  var `presentation-direction-number-up`: js.UndefOr[PresentationDirectionNumberUp] = js.native
  var `print-accuracy`: js.UndefOr[PrintAccuracy] = js.native
  var `print-base`: js.UndefOr[PrintBase] = js.native
  var `print-color-mode`: js.UndefOr[PrintColorMode] = js.native
  var `print-content-optimize`: js.UndefOr[PrintContentOptimize] = js.native
  var `print-objects`: js.UndefOr[js.Array[PrintObjects]] = js.native
  var `print-quality`: js.UndefOr[PrintQuality] = js.native
  var `print-rendering-intent`: js.UndefOr[PrintRenderingIntent] = js.native
  var `print-scaling`: js.UndefOr[PrintScaling] = js.native
  var `print-supports`: js.UndefOr[PrintSupports] = js.native
  var `printer-resolution`: js.UndefOr[Resolution] = js.native
  var `proof-print`: js.UndefOr[ProofPrint] = js.native
  var `retry-interval`: js.UndefOr[Double] = js.native
  var `retry-time-out`: js.UndefOr[Double] = js.native
  var `separator-sheets`: js.UndefOr[SeparatorSheets] = js.native
  var sides: js.UndefOr[Sides] = js.native
  var `x-image-position`: js.UndefOr[XImagePosition] = js.native
  var `x-image-shift`: js.UndefOr[Double] = js.native
  var `x-side1-image-shift`: js.UndefOr[Double] = js.native
  var `x-side2-image-shift`: js.UndefOr[Double] = js.native
  var `y-image-position`: js.UndefOr[YImagePosition] = js.native
  var `y-image-shift`: js.UndefOr[Double] = js.native
  var `y-side1-image-shift`: js.UndefOr[Double] = js.native
  var `y-side2-image-shift`: js.UndefOr[Double] = js.native
}

object JobTemplateAttributes {
  @scala.inline
  def apply(): JobTemplateAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobTemplateAttributes]
  }
  @scala.inline
  implicit class JobTemplateAttributesOps[Self <: JobTemplateAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withChamber-humidity`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-humidity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity")(js.undefined)
        ret
    }
    @scala.inline
    def `withChamber-temperature`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-temperature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature")(js.undefined)
        ret
    }
    @scala.inline
    def `withConfirmation-sheet-print`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation-sheet-print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutConfirmation-sheet-print`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmation-sheet-print")(js.undefined)
        ret
    }
    @scala.inline
    def withCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(js.undefined)
        ret
    }
    @scala.inline
    def `withCover-back`(value: Cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-back`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-back")(js.undefined)
        ret
    }
    @scala.inline
    def `withCover-front`(value: Cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-front`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-front")(js.undefined)
        ret
    }
    @scala.inline
    def `withCover-sheet-info`(value: CoverSheetInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-sheet-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCover-sheet-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cover-sheet-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-uris`(value: js.Array[DestinationUris]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-uris`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-uris")(js.undefined)
        ret
    }
    @scala.inline
    def withFinishings(value: js.Array[Finishings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinishings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings")(js.undefined)
        ret
    }
    @scala.inline
    def `withFinishings-col`(value: js.Array[FinishingsInterface]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFinishings-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishings-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-name-requested`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-name-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-name-requested`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-name-requested")(js.undefined)
        ret
    }
    @scala.inline
    def `withFont-size-requested`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFont-size-requested`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font-size-requested")(js.undefined)
        ret
    }
    @scala.inline
    def `withForce-front-side`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force-front-side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutForce-front-side`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force-front-side")(js.undefined)
        ret
    }
    @scala.inline
    def `withImposition-template`(value: ImpositionTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutImposition-template`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imposition-template")(js.undefined)
        ret
    }
    @scala.inline
    def `withInsert-sheet`(value: js.Array[InsertSheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInsert-sheet`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert-sheet")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-account-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-account-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-account-type`(value: JobAccountType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-account-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-account-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-accounting-sheets`(value: JobAccontingSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-sheets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-accounting-user-id`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-user-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-accounting-user-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-accounting-user-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-cancel-after`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cancel-after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-cancel-after`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cancel-after")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-copies`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-copies`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-copies")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-cover-back`(value: Cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cover-back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-cover-back`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cover-back")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-cover-front`(value: Cover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cover-front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-cover-front`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-cover-front")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-delay-output-until`(value: JobDelayOutputUntil): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-delay-output-until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-delay-output-until`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-delay-output-until")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-delay-output-until-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-delay-output-until-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-delay-output-until-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-delay-output-until-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-error-action`(value: JobErrorAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-error-action`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-action")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-error-sheet`(value: JobErrorSheet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-error-sheet`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-error-sheet")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-finishings`(value: js.Array[Finishings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-finishings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-finishings`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-finishings")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-finishings-col`(value: FinishingsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-finishings-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-finishings-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-finishings-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-hold-until`(value: JobHoldUntil): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-hold-until`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-hold-until-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-hold-until-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-hold-until-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-message-to-operator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-to-operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-message-to-operator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-to-operator")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-pages-per-set`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-per-set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-pages-per-set`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-pages-per-set")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-phone-number`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-phone-number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-phone-number`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-phone-number")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-priority`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-priority`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-priority")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-recipient-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-recipient-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-recipient-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-recipient-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-retain-until`(value: JobRetainUntil): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-retain-until`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-retain-until-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-retain-until-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until-interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-retain-until-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-retain-until-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-retain-until-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-save-disposition`(value: JobSaveDisposition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-save-disposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-save-disposition`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-save-disposition")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheet-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheet-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheet-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheet-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheets`(value: JobSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-sheets-col`(value: JobSheetsInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-sheets-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-sheets-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withMaterials-col`(value: js.Array[Materials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMaterials-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("materials-col")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: Media): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-col`(value: MediaInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withMedia-input-tray-check`(value: MediaIntputTray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-input-tray-check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMedia-input-tray-check`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media-input-tray-check")(js.undefined)
        ret
    }
    @scala.inline
    def `withMultiple-document-handling`(value: MultipleDocumentHandling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-document-handling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMultiple-document-handling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-document-handling")(js.undefined)
        ret
    }
    @scala.inline
    def `withMultiple-object-handling`(value: MultipleObjectHandling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-object-handling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMultiple-object-handling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple-object-handling")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-of-retries`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-retries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-of-retries`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-of-retries")(js.undefined)
        ret
    }
    @scala.inline
    def `withNumber-up`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNumber-up`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number-up")(js.undefined)
        ret
    }
    @scala.inline
    def `withOrientation-requested`(value: OrientationRequested): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOrientation-requested`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation-requested")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-bin`(value: OutputBin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-bin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-bin`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-bin")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: js.Array[Overrides]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-delivery`(value: PageDelivery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-delivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-delivery`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-delivery")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-order-received`(value: PageOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-order-received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-order-received`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-order-received")(js.undefined)
        ret
    }
    @scala.inline
    def `withPage-ranges`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPage-ranges`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page-ranges")(js.undefined)
        ret
    }
    @scala.inline
    def `withPages-per-subset`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-subset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPages-per-subset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-subset")(js.undefined)
        ret
    }
    @scala.inline
    def `withPclm-source-resolution`(value: Resolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pclm-source-resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPclm-source-resolution`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pclm-source-resolution")(js.undefined)
        ret
    }
    @scala.inline
    def `withPdl-init-file`(value: PdlInitFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPdl-init-file`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdl-init-file")(js.undefined)
        ret
    }
    @scala.inline
    def `withPlatform-temperature`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-temperature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPlatform-temperature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform-temperature")(js.undefined)
        ret
    }
    @scala.inline
    def `withPresentation-direction-number-up`(value: PresentationDirectionNumberUp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation-direction-number-up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPresentation-direction-number-up`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentation-direction-number-up")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-accuracy`(value: PrintAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-accuracy`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-accuracy")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-base`(value: PrintBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-base`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-base")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-color-mode`(value: PrintColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-color-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-color-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-color-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-content-optimize`(value: PrintContentOptimize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-content-optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-content-optimize`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-content-optimize")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-objects`(value: js.Array[PrintObjects]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-objects`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-objects")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-quality`(value: PrintQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-quality`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-quality")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-rendering-intent`(value: PrintRenderingIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-rendering-intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-rendering-intent`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-rendering-intent")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-scaling`(value: PrintScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-scaling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-scaling")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrint-supports`(value: PrintSupports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-supports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrint-supports`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print-supports")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-resolution`(value: Resolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-resolution`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-resolution")(js.undefined)
        ret
    }
    @scala.inline
    def `withProof-print`(value: ProofPrint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proof-print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProof-print`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proof-print")(js.undefined)
        ret
    }
    @scala.inline
    def `withRetry-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRetry-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withRetry-time-out`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-time-out")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRetry-time-out`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry-time-out")(js.undefined)
        ret
    }
    @scala.inline
    def `withSeparator-sheets`(value: SeparatorSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSeparator-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator-sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withSides(value: Sides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-image-position`(value: XImagePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-image-position`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-image-shift")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-side1-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side1-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-side1-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side1-image-shift")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-side2-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side2-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-side2-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-side2-image-shift")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-image-position`(value: YImagePosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-image-position`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-position")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-image-shift")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-side1-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side1-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-side1-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side1-image-shift")(js.undefined)
        ret
    }
    @scala.inline
    def `withY-side2-image-shift`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side2-image-shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutY-side2-image-shift`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y-side2-image-shift")(js.undefined)
        ret
    }
  }
  
}

