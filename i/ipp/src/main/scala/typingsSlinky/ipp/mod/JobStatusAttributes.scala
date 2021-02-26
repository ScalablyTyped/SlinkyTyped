package typingsSlinky.ipp.mod

import typingsSlinky.ipp.ippStrings.collated
import typingsSlinky.ipp.ippStrings.uncollated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobStatusAttributes extends StObject {
  
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
  implicit class JobStatusAttributesMutableBuilder[Self <: JobStatusAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAttributes-charset`(value: String): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    @scala.inline
    def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    @scala.inline
    def `setChamber-humidity-actual`(value: js.Array[Double]): Self = StObject.set(x, "chamber-humidity-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChamber-humidity-actualUndefined`: Self = StObject.set(x, "chamber-humidity-actual", js.undefined)
    
    @scala.inline
    def `setChamber-humidity-actualVarargs`(value: Double*): Self = StObject.set(x, "chamber-humidity-actual", js.Array(value :_*))
    
    @scala.inline
    def `setChamber-temperature-actual`(value: js.Array[Double]): Self = StObject.set(x, "chamber-temperature-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setChamber-temperature-actualUndefined`: Self = StObject.set(x, "chamber-temperature-actual", js.undefined)
    
    @scala.inline
    def `setChamber-temperature-actualVarargs`(value: Double*): Self = StObject.set(x, "chamber-temperature-actual", js.Array(value :_*))
    
    @scala.inline
    def `setCompression-supplied`(value: Compression): Self = StObject.set(x, "compression-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCompression-suppliedUndefined`: Self = StObject.set(x, "compression-supplied", js.undefined)
    
    @scala.inline
    def `setCopies-actual`(value: js.Array[Double]): Self = StObject.set(x, "copies-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCopies-actualUndefined`: Self = StObject.set(x, "copies-actual", js.undefined)
    
    @scala.inline
    def `setCopies-actualVarargs`(value: Double*): Self = StObject.set(x, "copies-actual", js.Array(value :_*))
    
    @scala.inline
    def `setCover-back-actual`(value: js.Array[Cover]): Self = StObject.set(x, "cover-back-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCover-back-actualUndefined`: Self = StObject.set(x, "cover-back-actual", js.undefined)
    
    @scala.inline
    def `setCover-back-actualVarargs`(value: Cover*): Self = StObject.set(x, "cover-back-actual", js.Array(value :_*))
    
    @scala.inline
    def `setCover-front-actual`(value: js.Array[Cover]): Self = StObject.set(x, "cover-front-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCover-front-actualUndefined`: Self = StObject.set(x, "cover-front-actual", js.undefined)
    
    @scala.inline
    def `setCover-front-actualVarargs`(value: Cover*): Self = StObject.set(x, "cover-front-actual", js.Array(value :_*))
    
    @scala.inline
    def `setDate-time-at-completed`(value: String): Self = StObject.set(x, "date-time-at-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDate-time-at-completedUndefined`: Self = StObject.set(x, "date-time-at-completed", js.undefined)
    
    @scala.inline
    def `setDate-time-at-creation`(value: String): Self = StObject.set(x, "date-time-at-creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDate-time-at-creationUndefined`: Self = StObject.set(x, "date-time-at-creation", js.undefined)
    
    @scala.inline
    def `setDate-time-at-processing`(value: String): Self = StObject.set(x, "date-time-at-processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDate-time-at-processingUndefined`: Self = StObject.set(x, "date-time-at-processing", js.undefined)
    
    @scala.inline
    def `setDestination-statuses`(value: js.Array[DestinationStatuses]): Self = StObject.set(x, "destination-statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDestination-statusesUndefined`: Self = StObject.set(x, "destination-statuses", js.undefined)
    
    @scala.inline
    def `setDestination-statusesVarargs`(value: DestinationStatuses*): Self = StObject.set(x, "destination-statuses", js.Array(value :_*))
    
    @scala.inline
    def `setDocument-charset-supplied`(value: String): Self = StObject.set(x, "document-charset-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-charset-suppliedUndefined`: Self = StObject.set(x, "document-charset-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-digital-signature-supplied`(value: DocumentDigitalSignature): Self = StObject.set(x, "document-digital-signature-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-digital-signature-suppliedUndefined`: Self = StObject.set(x, "document-digital-signature-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-format-details-supplied`(value: DocumentFormatDetails): Self = StObject.set(x, "document-format-details-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-format-details-suppliedUndefined`: Self = StObject.set(x, "document-format-details-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-format-ready`(value: js.Array[MimeMediaType]): Self = StObject.set(x, "document-format-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-format-readyUndefined`: Self = StObject.set(x, "document-format-ready", js.undefined)
    
    @scala.inline
    def `setDocument-format-readyVarargs`(value: MimeMediaType*): Self = StObject.set(x, "document-format-ready", js.Array(value :_*))
    
    @scala.inline
    def `setDocument-format-supplied`(value: MimeMediaType): Self = StObject.set(x, "document-format-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-format-suppliedUndefined`: Self = StObject.set(x, "document-format-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-format-version-supplied`(value: String): Self = StObject.set(x, "document-format-version-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-format-version-suppliedUndefined`: Self = StObject.set(x, "document-format-version-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-message-supplied`(value: String): Self = StObject.set(x, "document-message-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-message-suppliedUndefined`: Self = StObject.set(x, "document-message-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-name-supplied`(value: String): Self = StObject.set(x, "document-name-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-name-suppliedUndefined`: Self = StObject.set(x, "document-name-supplied", js.undefined)
    
    @scala.inline
    def `setDocument-natural-language-supplied`(value: String): Self = StObject.set(x, "document-natural-language-supplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDocument-natural-language-suppliedUndefined`: Self = StObject.set(x, "document-natural-language-supplied", js.undefined)
    
    @scala.inline
    def `setErrors-count`(value: Double): Self = StObject.set(x, "errors-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setErrors-countUndefined`: Self = StObject.set(x, "errors-count", js.undefined)
    
    @scala.inline
    def `setFinishings-actual`(value: js.Array[Finishings]): Self = StObject.set(x, "finishings-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFinishings-actualUndefined`: Self = StObject.set(x, "finishings-actual", js.undefined)
    
    @scala.inline
    def `setFinishings-actualVarargs`(value: Finishings*): Self = StObject.set(x, "finishings-actual", js.Array(value :_*))
    
    @scala.inline
    def `setFinishings-col-actual`(value: js.Array[FinishingsInterface]): Self = StObject.set(x, "finishings-col-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFinishings-col-actualUndefined`: Self = StObject.set(x, "finishings-col-actual", js.undefined)
    
    @scala.inline
    def `setFinishings-col-actualVarargs`(value: FinishingsInterface*): Self = StObject.set(x, "finishings-col-actual", js.Array(value :_*))
    
    @scala.inline
    def `setForce-front-side-actual`(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "force-front-side-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setForce-front-side-actualUndefined`: Self = StObject.set(x, "force-front-side-actual", js.undefined)
    
    @scala.inline
    def `setForce-front-side-actualVarargs`(value: js.Array[Double]*): Self = StObject.set(x, "force-front-side-actual", js.Array(value :_*))
    
    @scala.inline
    def `setImposition-template-actual`(value: js.Array[ImpositionTemplate]): Self = StObject.set(x, "imposition-template-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImposition-template-actualUndefined`: Self = StObject.set(x, "imposition-template-actual", js.undefined)
    
    @scala.inline
    def `setImposition-template-actualVarargs`(value: ImpositionTemplate*): Self = StObject.set(x, "imposition-template-actual", js.Array(value :_*))
    
    @scala.inline
    def `setInput-attributes-actual`(value: InputAttributes): Self = StObject.set(x, "input-attributes-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInput-attributes-actualUndefined`: Self = StObject.set(x, "input-attributes-actual", js.undefined)
    
    @scala.inline
    def `setInsert-sheet-actual`(value: js.Array[InsertSheet]): Self = StObject.set(x, "insert-sheet-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInsert-sheet-actualUndefined`: Self = StObject.set(x, "insert-sheet-actual", js.undefined)
    
    @scala.inline
    def `setInsert-sheet-actualVarargs`(value: InsertSheet*): Self = StObject.set(x, "insert-sheet-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-account-id-actual`(value: js.Array[String]): Self = StObject.set(x, "job-account-id-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-account-id-actualUndefined`: Self = StObject.set(x, "job-account-id-actual", js.undefined)
    
    @scala.inline
    def `setJob-account-id-actualVarargs`(value: String*): Self = StObject.set(x, "job-account-id-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-account-type-actual`(value: JobAccountType): Self = StObject.set(x, "job-account-type-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-account-type-actualUndefined`: Self = StObject.set(x, "job-account-type-actual", js.undefined)
    
    @scala.inline
    def `setJob-accounting-sheets-actual`(value: js.Array[JobAccontingSheets]): Self = StObject.set(x, "job-accounting-sheets-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-accounting-sheets-actualUndefined`: Self = StObject.set(x, "job-accounting-sheets-actual", js.undefined)
    
    @scala.inline
    def `setJob-accounting-sheets-actualVarargs`(value: JobAccontingSheets*): Self = StObject.set(x, "job-accounting-sheets-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-accounting-user-id-actual`(value: js.Array[String]): Self = StObject.set(x, "job-accounting-user-id-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-accounting-user-id-actualUndefined`: Self = StObject.set(x, "job-accounting-user-id-actual", js.undefined)
    
    @scala.inline
    def `setJob-accounting-user-id-actualVarargs`(value: String*): Self = StObject.set(x, "job-accounting-user-id-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-attribute-fidelity`(value: Boolean): Self = StObject.set(x, "job-attribute-fidelity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attribute-fidelityUndefined`: Self = StObject.set(x, "job-attribute-fidelity", js.undefined)
    
    @scala.inline
    def `setJob-detailed-status-messages`(value: js.Array[String]): Self = StObject.set(x, "job-detailed-status-messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-detailed-status-messagesUndefined`: Self = StObject.set(x, "job-detailed-status-messages", js.undefined)
    
    @scala.inline
    def `setJob-detailed-status-messagesVarargs`(value: String*): Self = StObject.set(x, "job-detailed-status-messages", js.Array(value :_*))
    
    @scala.inline
    def `setJob-document-access-errors`(value: js.Array[String]): Self = StObject.set(x, "job-document-access-errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-document-access-errorsUndefined`: Self = StObject.set(x, "job-document-access-errors", js.undefined)
    
    @scala.inline
    def `setJob-document-access-errorsVarargs`(value: String*): Self = StObject.set(x, "job-document-access-errors", js.Array(value :_*))
    
    @scala.inline
    def `setJob-error-sheet-actual`(value: js.Array[JobErrorSheet]): Self = StObject.set(x, "job-error-sheet-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-error-sheet-actualUndefined`: Self = StObject.set(x, "job-error-sheet-actual", js.undefined)
    
    @scala.inline
    def `setJob-error-sheet-actualVarargs`(value: JobErrorSheet*): Self = StObject.set(x, "job-error-sheet-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-hold-until-actual`(value: js.Array[JobHoldUntil]): Self = StObject.set(x, "job-hold-until-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-hold-until-actualUndefined`: Self = StObject.set(x, "job-hold-until-actual", js.undefined)
    
    @scala.inline
    def `setJob-hold-until-actualVarargs`(value: JobHoldUntil*): Self = StObject.set(x, "job-hold-until-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-id`(value: Double): Self = StObject.set(x, "job-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-idUndefined`: Self = StObject.set(x, "job-id", js.undefined)
    
    @scala.inline
    def `setJob-impressions`(value: Double): Self = StObject.set(x, "job-impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-impressions-col`(value: Impressions): Self = StObject.set(x, "job-impressions-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-impressions-colUndefined`: Self = StObject.set(x, "job-impressions-col", js.undefined)
    
    @scala.inline
    def `setJob-impressions-completed`(value: Double): Self = StObject.set(x, "job-impressions-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-impressions-completed-col`(value: Impressions): Self = StObject.set(x, "job-impressions-completed-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-impressions-completed-colUndefined`: Self = StObject.set(x, "job-impressions-completed-col", js.undefined)
    
    @scala.inline
    def `setJob-impressions-completedUndefined`: Self = StObject.set(x, "job-impressions-completed", js.undefined)
    
    @scala.inline
    def `setJob-impressionsUndefined`: Self = StObject.set(x, "job-impressions", js.undefined)
    
    @scala.inline
    def `setJob-k-octets`(value: Double): Self = StObject.set(x, "job-k-octets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-k-octets-processed`(value: Double): Self = StObject.set(x, "job-k-octets-processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-k-octets-processedUndefined`: Self = StObject.set(x, "job-k-octets-processed", js.undefined)
    
    @scala.inline
    def `setJob-k-octetsUndefined`: Self = StObject.set(x, "job-k-octets", js.undefined)
    
    @scala.inline
    def `setJob-media-sheets`(value: Double): Self = StObject.set(x, "job-media-sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-media-sheets-col`(value: MediaSheets): Self = StObject.set(x, "job-media-sheets-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-media-sheets-colUndefined`: Self = StObject.set(x, "job-media-sheets-col", js.undefined)
    
    @scala.inline
    def `setJob-media-sheets-completed`(value: Double): Self = StObject.set(x, "job-media-sheets-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-media-sheets-completed-col`(value: Impressions): Self = StObject.set(x, "job-media-sheets-completed-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-media-sheets-completed-colUndefined`: Self = StObject.set(x, "job-media-sheets-completed-col", js.undefined)
    
    @scala.inline
    def `setJob-media-sheets-completedUndefined`: Self = StObject.set(x, "job-media-sheets-completed", js.undefined)
    
    @scala.inline
    def `setJob-media-sheetsUndefined`: Self = StObject.set(x, "job-media-sheets", js.undefined)
    
    @scala.inline
    def `setJob-more-info`(value: String): Self = StObject.set(x, "job-more-info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-more-infoUndefined`: Self = StObject.set(x, "job-more-info", js.undefined)
    
    @scala.inline
    def `setJob-originating-user-name`(value: String): Self = StObject.set(x, "job-originating-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-originating-user-nameUndefined`: Self = StObject.set(x, "job-originating-user-name", js.undefined)
    
    @scala.inline
    def `setJob-originating-user-uri`(value: String): Self = StObject.set(x, "job-originating-user-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-originating-user-uriUndefined`: Self = StObject.set(x, "job-originating-user-uri", js.undefined)
    
    @scala.inline
    def `setJob-pages`(value: Double): Self = StObject.set(x, "job-pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-pages-col`(value: Pages): Self = StObject.set(x, "job-pages-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-pages-colUndefined`: Self = StObject.set(x, "job-pages-col", js.undefined)
    
    @scala.inline
    def `setJob-pages-completed`(value: Double): Self = StObject.set(x, "job-pages-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-pages-completed-col`(value: Pages): Self = StObject.set(x, "job-pages-completed-col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-pages-completed-colUndefined`: Self = StObject.set(x, "job-pages-completed-col", js.undefined)
    
    @scala.inline
    def `setJob-pages-completed-current-copy`(value: Double): Self = StObject.set(x, "job-pages-completed-current-copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-pages-completed-current-copyUndefined`: Self = StObject.set(x, "job-pages-completed-current-copy", js.undefined)
    
    @scala.inline
    def `setJob-pages-completedUndefined`: Self = StObject.set(x, "job-pages-completed", js.undefined)
    
    @scala.inline
    def `setJob-pagesUndefined`: Self = StObject.set(x, "job-pages", js.undefined)
    
    @scala.inline
    def `setJob-printer-up-time`(value: Double): Self = StObject.set(x, "job-printer-up-time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-printer-up-timeUndefined`: Self = StObject.set(x, "job-printer-up-time", js.undefined)
    
    @scala.inline
    def `setJob-printer-uri`(value: String): Self = StObject.set(x, "job-printer-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-printer-uriUndefined`: Self = StObject.set(x, "job-printer-uri", js.undefined)
    
    @scala.inline
    def `setJob-priority-actual`(value: js.Array[Double]): Self = StObject.set(x, "job-priority-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-priority-actualUndefined`: Self = StObject.set(x, "job-priority-actual", js.undefined)
    
    @scala.inline
    def `setJob-priority-actualVarargs`(value: Double*): Self = StObject.set(x, "job-priority-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-resource-ids`(value: js.Array[Double]): Self = StObject.set(x, "job-resource-ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-resource-idsUndefined`: Self = StObject.set(x, "job-resource-ids", js.undefined)
    
    @scala.inline
    def `setJob-resource-idsVarargs`(value: Double*): Self = StObject.set(x, "job-resource-ids", js.Array(value :_*))
    
    @scala.inline
    def `setJob-sheet-message-actual`(value: js.Array[Double]): Self = StObject.set(x, "job-sheet-message-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-sheet-message-actualUndefined`: Self = StObject.set(x, "job-sheet-message-actual", js.undefined)
    
    @scala.inline
    def `setJob-sheet-message-actualVarargs`(value: Double*): Self = StObject.set(x, "job-sheet-message-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-sheets-actual`(value: js.Array[JobSheets]): Self = StObject.set(x, "job-sheets-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-sheets-actualUndefined`: Self = StObject.set(x, "job-sheets-actual", js.undefined)
    
    @scala.inline
    def `setJob-sheets-actualVarargs`(value: JobSheets*): Self = StObject.set(x, "job-sheets-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-sheets-col-actual`(value: js.Array[JobSheetsInterface]): Self = StObject.set(x, "job-sheets-col-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-sheets-col-actualUndefined`: Self = StObject.set(x, "job-sheets-col-actual", js.undefined)
    
    @scala.inline
    def `setJob-sheets-col-actualVarargs`(value: JobSheetsInterface*): Self = StObject.set(x, "job-sheets-col-actual", js.Array(value :_*))
    
    @scala.inline
    def `setJob-state`(value: JobState): Self = StObject.set(x, "job-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-message`(value: String): Self = StObject.set(x, "job-state-message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-messageUndefined`: Self = StObject.set(x, "job-state-message", js.undefined)
    
    @scala.inline
    def `setJob-state-reasons`(value: js.Array[JobStateReasons]): Self = StObject.set(x, "job-state-reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-state-reasonsUndefined`: Self = StObject.set(x, "job-state-reasons", js.undefined)
    
    @scala.inline
    def `setJob-state-reasonsVarargs`(value: JobStateReasons*): Self = StObject.set(x, "job-state-reasons", js.Array(value :_*))
    
    @scala.inline
    def `setJob-stateUndefined`: Self = StObject.set(x, "job-state", js.undefined)
    
    @scala.inline
    def `setJob-uri`(value: String): Self = StObject.set(x, "job-uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uriUndefined`: Self = StObject.set(x, "job-uri", js.undefined)
    
    @scala.inline
    def `setJob-uuid`(value: String): Self = StObject.set(x, "job-uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-uuidUndefined`: Self = StObject.set(x, "job-uuid", js.undefined)
    
    @scala.inline
    def `setMaterials-col-actual`(value: js.Array[Materials]): Self = StObject.set(x, "materials-col-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMaterials-col-actualUndefined`: Self = StObject.set(x, "materials-col-actual", js.undefined)
    
    @scala.inline
    def `setMaterials-col-actualVarargs`(value: Materials*): Self = StObject.set(x, "materials-col-actual", js.Array(value :_*))
    
    @scala.inline
    def `setMedia-actual`(value: js.Array[String]): Self = StObject.set(x, "media-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-actualUndefined`: Self = StObject.set(x, "media-actual", js.undefined)
    
    @scala.inline
    def `setMedia-actualVarargs`(value: String*): Self = StObject.set(x, "media-actual", js.Array(value :_*))
    
    @scala.inline
    def `setMedia-col-actual`(value: js.Array[MediaInterface]): Self = StObject.set(x, "media-col-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-col-actualUndefined`: Self = StObject.set(x, "media-col-actual", js.undefined)
    
    @scala.inline
    def `setMedia-col-actualVarargs`(value: MediaInterface*): Self = StObject.set(x, "media-col-actual", js.Array(value :_*))
    
    @scala.inline
    def `setMedia-input-tray-check-actual`(value: js.Array[String]): Self = StObject.set(x, "media-input-tray-check-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMedia-input-tray-check-actualUndefined`: Self = StObject.set(x, "media-input-tray-check-actual", js.undefined)
    
    @scala.inline
    def `setMedia-input-tray-check-actualVarargs`(value: String*): Self = StObject.set(x, "media-input-tray-check-actual", js.Array(value :_*))
    
    @scala.inline
    def `setMultiple-document-handling-actual`(value: js.Array[MultipleDocumentHandling]): Self = StObject.set(x, "multiple-document-handling-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMultiple-document-handling-actualUndefined`: Self = StObject.set(x, "multiple-document-handling-actual", js.undefined)
    
    @scala.inline
    def `setMultiple-document-handling-actualVarargs`(value: MultipleDocumentHandling*): Self = StObject.set(x, "multiple-document-handling-actual", js.Array(value :_*))
    
    @scala.inline
    def `setMultiple-object-handling-actual`(value: MultipleObjectHandling): Self = StObject.set(x, "multiple-object-handling-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMultiple-object-handling-actualUndefined`: Self = StObject.set(x, "multiple-object-handling-actual", js.undefined)
    
    @scala.inline
    def `setNumber-of-documents`(value: Double): Self = StObject.set(x, "number-of-documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNumber-of-documentsUndefined`: Self = StObject.set(x, "number-of-documents", js.undefined)
    
    @scala.inline
    def `setNumber-of-intervening-jobs`(value: Double): Self = StObject.set(x, "number-of-intervening-jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNumber-of-intervening-jobsUndefined`: Self = StObject.set(x, "number-of-intervening-jobs", js.undefined)
    
    @scala.inline
    def `setNumber-up-actual`(value: js.Array[Double]): Self = StObject.set(x, "number-up-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNumber-up-actualUndefined`: Self = StObject.set(x, "number-up-actual", js.undefined)
    
    @scala.inline
    def `setNumber-up-actualVarargs`(value: Double*): Self = StObject.set(x, "number-up-actual", js.Array(value :_*))
    
    @scala.inline
    def `setOrientation-requested-actual`(value: js.Array[OrientationRequested]): Self = StObject.set(x, "orientation-requested-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOrientation-requested-actualUndefined`: Self = StObject.set(x, "orientation-requested-actual", js.undefined)
    
    @scala.inline
    def `setOrientation-requested-actualVarargs`(value: OrientationRequested*): Self = StObject.set(x, "orientation-requested-actual", js.Array(value :_*))
    
    @scala.inline
    def `setOriginal-requesting-user-name`(value: String): Self = StObject.set(x, "original-requesting-user-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOriginal-requesting-user-nameUndefined`: Self = StObject.set(x, "original-requesting-user-name", js.undefined)
    
    @scala.inline
    def `setOutput-attributes-actual`(value: OutputAttributes): Self = StObject.set(x, "output-attributes-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-attributes-actualUndefined`: Self = StObject.set(x, "output-attributes-actual", js.undefined)
    
    @scala.inline
    def `setOutput-bin-actual`(value: js.Array[OutputBin]): Self = StObject.set(x, "output-bin-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-bin-actualUndefined`: Self = StObject.set(x, "output-bin-actual", js.undefined)
    
    @scala.inline
    def `setOutput-bin-actualVarargs`(value: OutputBin*): Self = StObject.set(x, "output-bin-actual", js.Array(value :_*))
    
    @scala.inline
    def `setOutput-device-actual`(value: js.Array[String]): Self = StObject.set(x, "output-device-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-actualUndefined`: Self = StObject.set(x, "output-device-actual", js.undefined)
    
    @scala.inline
    def `setOutput-device-actualVarargs`(value: String*): Self = StObject.set(x, "output-device-actual", js.Array(value :_*))
    
    @scala.inline
    def `setOutput-device-assigned`(value: String): Self = StObject.set(x, "output-device-assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-assignedUndefined`: Self = StObject.set(x, "output-device-assigned", js.undefined)
    
    @scala.inline
    def `setOutput-device-job-state`(value: JobState): Self = StObject.set(x, "output-device-job-state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-job-state-message`(value: String): Self = StObject.set(x, "output-device-job-state-message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-job-state-messageUndefined`: Self = StObject.set(x, "output-device-job-state-message", js.undefined)
    
    @scala.inline
    def `setOutput-device-job-state-reasons`(value: js.Array[JobStateReasons]): Self = StObject.set(x, "output-device-job-state-reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-job-state-reasonsUndefined`: Self = StObject.set(x, "output-device-job-state-reasons", js.undefined)
    
    @scala.inline
    def `setOutput-device-job-state-reasonsVarargs`(value: JobStateReasons*): Self = StObject.set(x, "output-device-job-state-reasons", js.Array(value :_*))
    
    @scala.inline
    def `setOutput-device-job-stateUndefined`: Self = StObject.set(x, "output-device-job-state", js.undefined)
    
    @scala.inline
    def `setOutput-device-uuid-assigned`(value: String): Self = StObject.set(x, "output-device-uuid-assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOutput-device-uuid-assignedUndefined`: Self = StObject.set(x, "output-device-uuid-assigned", js.undefined)
    
    @scala.inline
    def `setOverrides-actual`(value: js.Array[Overrides]): Self = StObject.set(x, "overrides-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverrides-actualUndefined`: Self = StObject.set(x, "overrides-actual", js.undefined)
    
    @scala.inline
    def `setOverrides-actualVarargs`(value: Overrides*): Self = StObject.set(x, "overrides-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPage-delivery-actual`(value: js.Array[PageDelivery]): Self = StObject.set(x, "page-delivery-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-delivery-actualUndefined`: Self = StObject.set(x, "page-delivery-actual", js.undefined)
    
    @scala.inline
    def `setPage-delivery-actualVarargs`(value: PageDelivery*): Self = StObject.set(x, "page-delivery-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPage-order-received-actual`(value: js.Array[PageOrder]): Self = StObject.set(x, "page-order-received-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-order-received-actualUndefined`: Self = StObject.set(x, "page-order-received-actual", js.undefined)
    
    @scala.inline
    def `setPage-order-received-actualVarargs`(value: PageOrder*): Self = StObject.set(x, "page-order-received-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPage-ranges-actual`(value: js.Array[Double]): Self = StObject.set(x, "page-ranges-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPage-ranges-actualUndefined`: Self = StObject.set(x, "page-ranges-actual", js.undefined)
    
    @scala.inline
    def `setPage-ranges-actualVarargs`(value: Double*): Self = StObject.set(x, "page-ranges-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPlatform-temperature-actual`(value: js.Array[Double]): Self = StObject.set(x, "platform-temperature-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlatform-temperature-actualUndefined`: Self = StObject.set(x, "platform-temperature-actual", js.undefined)
    
    @scala.inline
    def `setPlatform-temperature-actualVarargs`(value: Double*): Self = StObject.set(x, "platform-temperature-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPresentation-direction-number-up-actual`(value: js.Array[PresentationDirectionNumberUp]): Self = StObject.set(x, "presentation-direction-number-up-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPresentation-direction-number-up-actualUndefined`: Self = StObject.set(x, "presentation-direction-number-up-actual", js.undefined)
    
    @scala.inline
    def `setPresentation-direction-number-up-actualVarargs`(value: PresentationDirectionNumberUp*): Self = StObject.set(x, "presentation-direction-number-up-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-accuracy-actual`(value: PrintAccuracy): Self = StObject.set(x, "print-accuracy-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-accuracy-actualUndefined`: Self = StObject.set(x, "print-accuracy-actual", js.undefined)
    
    @scala.inline
    def `setPrint-base-actual`(value: js.Array[PrintBase]): Self = StObject.set(x, "print-base-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-base-actualUndefined`: Self = StObject.set(x, "print-base-actual", js.undefined)
    
    @scala.inline
    def `setPrint-base-actualVarargs`(value: PrintBase*): Self = StObject.set(x, "print-base-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-color-mode-actual`(value: js.Array[PrintColorMode]): Self = StObject.set(x, "print-color-mode-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-color-mode-actualUndefined`: Self = StObject.set(x, "print-color-mode-actual", js.undefined)
    
    @scala.inline
    def `setPrint-color-mode-actualVarargs`(value: PrintColorMode*): Self = StObject.set(x, "print-color-mode-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-content-optimize-actual`(value: js.Array[PrintContentOptimize]): Self = StObject.set(x, "print-content-optimize-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-content-optimize-actualUndefined`: Self = StObject.set(x, "print-content-optimize-actual", js.undefined)
    
    @scala.inline
    def `setPrint-content-optimize-actualVarargs`(value: PrintContentOptimize*): Self = StObject.set(x, "print-content-optimize-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-objects-actual`(value: js.Array[PrintObjects]): Self = StObject.set(x, "print-objects-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-objects-actualUndefined`: Self = StObject.set(x, "print-objects-actual", js.undefined)
    
    @scala.inline
    def `setPrint-objects-actualVarargs`(value: PrintObjects*): Self = StObject.set(x, "print-objects-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-quality-actual`(value: js.Array[PrintQuality]): Self = StObject.set(x, "print-quality-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-quality-actualUndefined`: Self = StObject.set(x, "print-quality-actual", js.undefined)
    
    @scala.inline
    def `setPrint-quality-actualVarargs`(value: PrintQuality*): Self = StObject.set(x, "print-quality-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-rendering-intent-actual`(value: js.Array[PrintRenderingIntent]): Self = StObject.set(x, "print-rendering-intent-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-rendering-intent-actualUndefined`: Self = StObject.set(x, "print-rendering-intent-actual", js.undefined)
    
    @scala.inline
    def `setPrint-rendering-intent-actualVarargs`(value: PrintRenderingIntent*): Self = StObject.set(x, "print-rendering-intent-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrint-supports-actual`(value: js.Array[PrintSupports]): Self = StObject.set(x, "print-supports-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrint-supports-actualUndefined`: Self = StObject.set(x, "print-supports-actual", js.undefined)
    
    @scala.inline
    def `setPrint-supports-actualVarargs`(value: PrintSupports*): Self = StObject.set(x, "print-supports-actual", js.Array(value :_*))
    
    @scala.inline
    def `setPrinter-resolution-actual`(value: js.Array[Resolution]): Self = StObject.set(x, "printer-resolution-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPrinter-resolution-actualUndefined`: Self = StObject.set(x, "printer-resolution-actual", js.undefined)
    
    @scala.inline
    def `setPrinter-resolution-actualVarargs`(value: Resolution*): Self = StObject.set(x, "printer-resolution-actual", js.Array(value :_*))
    
    @scala.inline
    def `setSeparator-sheets-actual`(value: js.Array[SeparatorSheets]): Self = StObject.set(x, "separator-sheets-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSeparator-sheets-actualUndefined`: Self = StObject.set(x, "separator-sheets-actual", js.undefined)
    
    @scala.inline
    def `setSeparator-sheets-actualVarargs`(value: SeparatorSheets*): Self = StObject.set(x, "separator-sheets-actual", js.Array(value :_*))
    
    @scala.inline
    def `setSheet-collate-actual`(value: js.Array[collated | uncollated]): Self = StObject.set(x, "sheet-collate-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSheet-collate-actualUndefined`: Self = StObject.set(x, "sheet-collate-actual", js.undefined)
    
    @scala.inline
    def `setSheet-collate-actualVarargs`(value: (collated | uncollated)*): Self = StObject.set(x, "sheet-collate-actual", js.Array(value :_*))
    
    @scala.inline
    def `setSides-actual`(value: js.Array[Sides]): Self = StObject.set(x, "sides-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSides-actualUndefined`: Self = StObject.set(x, "sides-actual", js.undefined)
    
    @scala.inline
    def `setSides-actualVarargs`(value: Sides*): Self = StObject.set(x, "sides-actual", js.Array(value :_*))
    
    @scala.inline
    def `setTime-at-completed`(value: Double): Self = StObject.set(x, "time-at-completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTime-at-completedUndefined`: Self = StObject.set(x, "time-at-completed", js.undefined)
    
    @scala.inline
    def `setTime-at-creation`(value: Double): Self = StObject.set(x, "time-at-creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTime-at-creationUndefined`: Self = StObject.set(x, "time-at-creation", js.undefined)
    
    @scala.inline
    def `setTime-at-processing`(value: Double): Self = StObject.set(x, "time-at-processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTime-at-processingUndefined`: Self = StObject.set(x, "time-at-processing", js.undefined)
    
    @scala.inline
    def `setWarnings-count`(value: Double): Self = StObject.set(x, "warnings-count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWarnings-countUndefined`: Self = StObject.set(x, "warnings-count", js.undefined)
    
    @scala.inline
    def `setX-image-position-actual`(value: js.Array[XImagePosition]): Self = StObject.set(x, "x-image-position-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-image-position-actualUndefined`: Self = StObject.set(x, "x-image-position-actual", js.undefined)
    
    @scala.inline
    def `setX-image-position-actualVarargs`(value: XImagePosition*): Self = StObject.set(x, "x-image-position-actual", js.Array(value :_*))
    
    @scala.inline
    def `setX-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "x-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-image-shift-actualUndefined`: Self = StObject.set(x, "x-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setX-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "x-image-shift-actual", js.Array(value :_*))
    
    @scala.inline
    def `setX-side1-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "x-side1-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-side1-image-shift-actualUndefined`: Self = StObject.set(x, "x-side1-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setX-side1-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "x-side1-image-shift-actual", js.Array(value :_*))
    
    @scala.inline
    def `setX-side2-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "x-side2-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-side2-image-shift-actualUndefined`: Self = StObject.set(x, "x-side2-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setX-side2-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "x-side2-image-shift-actual", js.Array(value :_*))
    
    @scala.inline
    def `setY-image-position-actual`(value: js.Array[YImagePosition]): Self = StObject.set(x, "y-image-position-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-image-position-actualUndefined`: Self = StObject.set(x, "y-image-position-actual", js.undefined)
    
    @scala.inline
    def `setY-image-position-actualVarargs`(value: YImagePosition*): Self = StObject.set(x, "y-image-position-actual", js.Array(value :_*))
    
    @scala.inline
    def `setY-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "y-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-image-shift-actualUndefined`: Self = StObject.set(x, "y-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setY-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "y-image-shift-actual", js.Array(value :_*))
    
    @scala.inline
    def `setY-side1-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "y-side1-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-side1-image-shift-actualUndefined`: Self = StObject.set(x, "y-side1-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setY-side1-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "y-side1-image-shift-actual", js.Array(value :_*))
    
    @scala.inline
    def `setY-side2-image-shift-actual`(value: js.Array[Double]): Self = StObject.set(x, "y-side2-image-shift-actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setY-side2-image-shift-actualUndefined`: Self = StObject.set(x, "y-side2-image-shift-actual", js.undefined)
    
    @scala.inline
    def `setY-side2-image-shift-actualVarargs`(value: Double*): Self = StObject.set(x, "y-side2-image-shift-actual", js.Array(value :_*))
  }
}
