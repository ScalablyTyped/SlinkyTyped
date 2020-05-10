package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationAttributes extends js.Object {
  var `attributes-charset`: js.UndefOr[String] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `charge-info-message`: js.UndefOr[String] = js.native
  var compression: js.UndefOr[Compression] = js.native
  var `compression-accepted`: js.UndefOr[js.Array[Compression]] = js.native
  var `destination-accesses`: js.UndefOr[js.Array[DestionationAccesses]] = js.native
  var `detailed-status-message`: js.UndefOr[String] = js.native
  var `document-access`: js.UndefOr[DocumentAccess] = js.native
  var `document-access-error`: js.UndefOr[String] = js.native
  var `document-charset`: js.UndefOr[String] = js.native
  var `document-data-get-interval`: js.UndefOr[Double] = js.native
  var `document-data-wait`: js.UndefOr[Boolean] = js.native
  var `document-digital-signature`: js.UndefOr[DocumentDigitalSignature] = js.native
  var `document-format`: js.UndefOr[MimeMediaType] = js.native
  var `document-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `document-format-details`: js.UndefOr[DocumentFormatDetails] = js.native
  var `document-message`: js.UndefOr[String] = js.native
  var `document-metadata`: js.UndefOr[js.Array[String]] = js.native
  var `document-name`: js.UndefOr[String] = js.native
  var `document-natural-language`: js.UndefOr[String] = js.native
  var `document-number`: js.UndefOr[Double] = js.native
  var `document-password`: js.UndefOr[String] = js.native
  var `document-preprocessed`: js.UndefOr[Boolean] = js.native
  var `fetch-status-code`: js.UndefOr[StatusCode] = js.native
   // Except "successful-ok"
  var `fetch-status-message`: js.UndefOr[String] = js.native
  var `first-index`: js.UndefOr[Double] = js.native
  var `identify-actions`: js.UndefOr[js.Array[IdentifyActions]] = js.native
  var `input-attributes`: js.UndefOr[InputAttributes] = js.native
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-authorization-uri`: js.UndefOr[String] = js.native
  var `job-hold-until`: js.UndefOr[JobHoldUntil] = js.native
  var `job-hold-until-time`: js.UndefOr[String] = js.native
  var `job-id`: js.UndefOr[Double] = js.native
  var `job-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-impressions-col`: js.UndefOr[Impressions] = js.native
  var `job-impressions-estimated`: js.UndefOr[Double] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-mandatory-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-media-sheets-col`: js.UndefOr[MediaSheets] = js.native
  var `job-message-from-operator`: js.UndefOr[String] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `job-pages`: js.UndefOr[Double] = js.native
  var `job-pages-col`: js.UndefOr[Pages] = js.native
  var `job-password`: js.UndefOr[String] = js.native
  var `job-password-encryption`: js.UndefOr[JobPasswordEncryption] = js.native
  var `job-state`: js.UndefOr[JobState] = js.native
  var `job-state-message`: js.UndefOr[String] = js.native
  var `job-state-reasons`: js.UndefOr[js.Array[JobStateReasons]] = js.native
  var `job-uri`: js.UndefOr[String] = js.native
  var `last-document`: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
  var `my-jobs`: js.UndefOr[Boolean] = js.native
  var `notify-get-interval`: js.UndefOr[Double] = js.native
  var `notify-printer-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-resource-id`: js.UndefOr[Double] = js.native
  var `notify-sequence-numbers`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-subscription-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `notify-wait`: js.UndefOr[Boolean] = js.native
  var `original-requesting-user-name`: js.UndefOr[String] = js.native
  var `output-attributes`: js.UndefOr[OutputAttributes] = js.native
  var `output-device-job-states`: js.UndefOr[js.Array[String]] = js.native
  var `output-device-uuid`: js.UndefOr[String] = js.native
  var `preferred-attributes`: js.UndefOr[js.Object] = js.native
  var `printer-geo-location`: js.UndefOr[String] = js.native
  var `printer-id`: js.UndefOr[Double] = js.native
  var `printer-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `printer-location`: js.UndefOr[String] = js.native
  var `printer-message-from-operator`: js.UndefOr[String] = js.native
  var `printer-service-type`: js.UndefOr[js.Array[PrinterServiceType]] = js.native
  var `printer-up-time`: js.UndefOr[Double] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `printer-xri-requested`: js.UndefOr[js.Array[PrinterXri]] = js.native
  var `profile-uri-actual`: js.UndefOr[String] = js.native
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
    ]
  ] = js.native
  var `requesting-user-name`: js.UndefOr[String] = js.native
  var `requesting-user-uri`: js.UndefOr[String] = js.native
  var `resource-format`: js.UndefOr[MimeMediaType] = js.native
  var `resource-format-accepted`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `resource-formats`: js.UndefOr[js.Array[MimeMediaType]] = js.native
  var `resource-id`: js.UndefOr[Double] = js.native
  var `resource-ids`: js.UndefOr[js.Array[Double]] = js.native
  var `resource-k-octets`: js.UndefOr[Double] = js.native
  var `resource-natural-language`: js.UndefOr[String] = js.native
  var `resource-patches`: js.UndefOr[String] = js.native
  var `resource-signature`: js.UndefOr[js.Array[String]] = js.native
  var `resource-states`: js.UndefOr[js.Array[ResourceState]] = js.native
  var `resource-string-version`: js.UndefOr[String] = js.native
  var `resource-type`: js.UndefOr[ResourceType] = js.native
  var `resource-types`: js.UndefOr[js.Array[ResourceType]] = js.native
  var `resource-version`: js.UndefOr[String] = js.native
  var `restart-get-interval`: js.UndefOr[Double] = js.native
  var `status-message`: js.UndefOr[String] = js.native
  var `system-uri`: js.UndefOr[String] = js.native
  var `which-jobs`: js.UndefOr[WhichJobs] = js.native
  var `which-printers`: js.UndefOr[String] = js.native
}

object OperationAttributes {
  @scala.inline
  def apply(): OperationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationAttributes]
  }
  @scala.inline
  implicit class OperationAttributesOps[Self <: OperationAttributes] (val x: Self) extends AnyVal {
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
    def `withCharge-info-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge-info-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCharge-info-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charge-info-message")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Compression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def `withCompression-accepted`(value: js.Array[Compression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression-accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCompression-accepted`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression-accepted")(js.undefined)
        ret
    }
    @scala.inline
    def `withDestination-accesses`(value: js.Array[DestionationAccesses]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-accesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDestination-accesses`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination-accesses")(js.undefined)
        ret
    }
    @scala.inline
    def `withDetailed-status-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed-status-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDetailed-status-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailed-status-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-access`(value: DocumentAccess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-access`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-access")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-access-error`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-access-error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-access-error`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-access-error")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-charset`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-charset")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-data-get-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-data-get-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-data-get-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-data-get-interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-data-wait`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-data-wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-data-wait`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-data-wait")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-digital-signature`(value: DocumentDigitalSignature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-digital-signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-digital-signature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-digital-signature")(js.undefined)
        ret
    }
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
    def `withDocument-format-accepted`(value: js.Array[MimeMediaType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-accepted`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-accepted")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-details`(value: DocumentFormatDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-details`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-details")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-metadata`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-metadata`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-metadata")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-natural-language`(value: String): Self = {
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
    def `withDocument-number`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-number`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-number")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-password`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-password`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-password")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-preprocessed`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-preprocessed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-preprocessed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-preprocessed")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-status-code`(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-status-code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-status-code`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-status-code")(js.undefined)
        ret
    }
    @scala.inline
    def `withFetch-status-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-status-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFetch-status-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch-status-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withFirst-index`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-index")(js.undefined)
        ret
    }
    @scala.inline
    def `withIdentify-actions`(value: js.Array[IdentifyActions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify-actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIdentify-actions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identify-actions")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-attributes`(value: InputAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withIpp-attribute-fidelity`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipp-attribute-fidelity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIpp-attribute-fidelity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipp-attribute-fidelity")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-authorization-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-authorization-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-authorization-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-authorization-uri")(js.undefined)
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
    def `withJob-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-ids")(js.undefined)
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
    def `withJob-impressions-estimated`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-estimated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions-estimated`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions-estimated")(js.undefined)
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
    def `withJob-mandatory-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-mandatory-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-mandatory-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-mandatory-attributes")(js.undefined)
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
    def `withJob-message-from-operator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-from-operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-message-from-operator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-message-from-operator")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(js.undefined)
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
    def `withJob-password`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-password`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-password")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-password-encryption`(value: JobPasswordEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-password-encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-password-encryption`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-password-encryption")(js.undefined)
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
    def `withLast-document`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLast-document`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last-document")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def `withMy-jobs`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my-jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMy-jobs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my-jobs")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-get-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-get-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-get-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-get-interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-printer-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-printer-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-printer-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-printer-ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-resource-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-resource-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-resource-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-resource-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-sequence-numbers`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-sequence-numbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-sequence-numbers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-sequence-numbers")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-subscription-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-subscription-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-subscription-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-subscription-ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withNotify-wait`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNotify-wait`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify-wait")(js.undefined)
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
    def `withOutput-attributes`(value: OutputAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-job-states`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-job-states`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-job-states")(js.undefined)
        ret
    }
    @scala.inline
    def `withOutput-device-uuid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOutput-device-uuid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output-device-uuid")(js.undefined)
        ret
    }
    @scala.inline
    def `withPreferred-attributes`(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPreferred-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-geo-location`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-geo-location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-geo-location`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-geo-location")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-location`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-location`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-location")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-message-from-operator`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-from-operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-message-from-operator`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-from-operator")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-service-type`(value: js.Array[PrinterServiceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-service-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-service-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-service-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-up-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-up-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-up-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-up-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-xri-requested`(value: js.Array[PrinterXri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-xri-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-xri-requested`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-xri-requested")(js.undefined)
        ret
    }
    @scala.inline
    def `withProfile-uri-actual`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-uri-actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutProfile-uri-actual`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile-uri-actual")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 589 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequested-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requested-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequesting-user-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesting-user-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequesting-user-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesting-user-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withRequesting-user-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesting-user-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRequesting-user-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesting-user-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-format`(value: MimeMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-format`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-format")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-format-accepted`(value: js.Array[MimeMediaType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-format-accepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-format-accepted`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-format-accepted")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-formats`(value: js.Array[MimeMediaType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-formats`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-formats")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-id`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-id`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-id")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-ids`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-ids`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-k-octets`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-k-octets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-k-octets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-k-octets")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-natural-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-natural-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-natural-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-patches`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-patches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-patches`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-patches")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-signature`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-signature`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-signature")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-states`(value: js.Array[ResourceState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-states`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-states")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-string-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-string-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-string-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-string-version")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-type`(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-types`(value: js.Array[ResourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-types`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-types")(js.undefined)
        ret
    }
    @scala.inline
    def `withResource-version`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutResource-version`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource-version")(js.undefined)
        ret
    }
    @scala.inline
    def `withRestart-get-interval`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart-get-interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutRestart-get-interval`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restart-get-interval")(js.undefined)
        ret
    }
    @scala.inline
    def `withStatus-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStatus-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withSystem-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSystem-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withWhich-jobs`(value: WhichJobs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which-jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWhich-jobs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which-jobs")(js.undefined)
        ret
    }
    @scala.inline
    def `withWhich-printers`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which-printers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutWhich-printers`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("which-printers")(js.undefined)
        ret
    }
  }
  
}

