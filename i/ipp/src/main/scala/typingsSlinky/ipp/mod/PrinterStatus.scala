package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterStatus extends js.Object {
  var `chamber-humidity-current`: js.UndefOr[Double] = js.native
  var `chamber-temperature-current`: js.UndefOr[Double] = js.native
  var `device-service-count`: js.UndefOr[Double] = js.native
  var `device-uuid`: js.UndefOr[String] = js.native
  var `document-format-varying-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
    ]
  ] = js.native
  var `job-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
    ]
  ] = js.native
  var `pages-per-minute`: js.UndefOr[Double] = js.native
  var `pages-per-minute-color`: js.UndefOr[Double] = js.native
  var `printer-alert`: js.UndefOr[js.Array[String]] = js.native
  var `printer-alert-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-camera-image-uri`: js.UndefOr[js.Array[String]] = js.native
  var `printer-config-change-date-time`: js.UndefOr[String] = js.native
  var `printer-config-change-time`: js.UndefOr[Double] = js.native
  var `printer-config-changes`: js.UndefOr[Double] = js.native
  var `printer-detailed-status-messages`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-supplies`: js.UndefOr[js.Array[String]] = js.native
  var `printer-finisher-supplies-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-id`: js.UndefOr[Double] = js.native
  var `printer-impressions-completed`: js.UndefOr[Double] = js.native
  var `printer-impressions-completed-col`: js.UndefOr[Impressions] = js.native
  var `printer-input-tray`: js.UndefOr[js.Array[String]] = js.native
  var `printer-is-accepting-jobs`: js.UndefOr[Boolean] = js.native
  var `printer-media-sheets-completed`: js.UndefOr[Double] = js.native
  var `printer-media-sheets-completed-col`: js.UndefOr[MediaSheets] = js.native
  var `printer-message-date-time`: js.UndefOr[String] = js.native
  var `printer-message-from-operator`: js.UndefOr[String] = js.native
  var `printer-message-time`: js.UndefOr[Double] = js.native
  var `printer-more-info`: js.UndefOr[String] = js.native
  var `printer-output-tray`: js.UndefOr[js.Array[String]] = js.native
  var `printer-pages-completed`: js.UndefOr[Double] = js.native
  var `printer-pages-completed-col`: js.UndefOr[Pages] = js.native
  var `printer-service-type`: js.UndefOr[PrinterServiceType] = js.native
  var `printer-settable-attributes-supported`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
    ]
  ] = js.native
  var `printer-state`: js.UndefOr[PrinterState] = js.native
  var `printer-state-change-date-time`: js.UndefOr[String] = js.native
  var `printer-state-change-time`: js.UndefOr[Double] = js.native
  var `printer-state-message`: js.UndefOr[String] = js.native
  var `printer-state-reasons`: js.UndefOr[js.Array[PrinterStateReasons]] = js.native
  var `printer-static-resource-k-octets-free`: js.UndefOr[Double] = js.native
  var `printer-supply`: js.UndefOr[js.Array[String]] = js.native
  var `printer-supply-description`: js.UndefOr[js.Array[String]] = js.native
  var `printer-supply-info-uri`: js.UndefOr[String] = js.native
  var `printer-up-time`: js.UndefOr[Double] = js.native
  var `printer-uri-supported`: js.UndefOr[js.Array[String]] = js.native
  var `printer-uuid`: js.UndefOr[String] = js.native
  var `queued-job-count`: js.UndefOr[Double] = js.native
  var `xri-authentication-supported`: js.UndefOr[js.Array[XriAuthentication]] = js.native
  var `xri-security-supported`: js.UndefOr[js.Array[XriSecurity]] = js.native
  var `xri-uri-scheme-supported`: js.UndefOr[js.Array[UriSchemes]] = js.native
}

object PrinterStatus {
  @scala.inline
  def apply(): PrinterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterStatus]
  }
  @scala.inline
  implicit class PrinterStatusOps[Self <: PrinterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withChamber-humidity-current`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-humidity-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-humidity-current")(js.undefined)
        ret
    }
    @scala.inline
    def `withChamber-temperature-current`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature-current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutChamber-temperature-current`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chamber-temperature-current")(js.undefined)
        ret
    }
    @scala.inline
    def `withDevice-service-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-service-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDevice-service-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-service-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withDevice-uuid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDevice-uuid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-uuid")(js.undefined)
        ret
    }
    @scala.inline
    def `withDocument-format-varying-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-varying-attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDocument-format-varying-attributes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document-format-varying-attributes")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 86 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-settable-attributes-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-settable-attributes-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-settable-attributes-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withPages-per-minute`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPages-per-minute`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-minute")(js.undefined)
        ret
    }
    @scala.inline
    def `withPages-per-minute-color`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-minute-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPages-per-minute-color`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages-per-minute-color")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-alert`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-alert`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-alert")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-alert-description`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-alert-description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-alert-description`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-alert-description")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-camera-image-uri`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-camera-image-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-camera-image-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-camera-image-uri")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-config-change-date-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-change-date-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-config-change-date-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-change-date-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-config-change-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-change-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-config-change-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-change-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-config-changes`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-config-changes`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-config-changes")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-detailed-status-messages`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-detailed-status-messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-detailed-status-messages`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-detailed-status-messages")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-finisher`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-finisher`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-finisher-description`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-finisher-description`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-description")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-finisher-supplies`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-supplies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-finisher-supplies`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-supplies")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-finisher-supplies-description`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-supplies-description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-finisher-supplies-description`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-finisher-supplies-description")(js.undefined)
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
    def `withPrinter-impressions-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-impressions-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-impressions-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-impressions-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-impressions-completed-col`(value: Impressions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-impressions-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-impressions-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-impressions-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-input-tray`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-input-tray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-input-tray`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-input-tray")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-is-accepting-jobs`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-is-accepting-jobs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-is-accepting-jobs`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-is-accepting-jobs")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-media-sheets-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-media-sheets-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-media-sheets-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-media-sheets-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-media-sheets-completed-col`(value: MediaSheets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-media-sheets-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-media-sheets-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-media-sheets-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-message-date-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-date-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-message-date-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-date-time")(js.undefined)
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
    def `withPrinter-message-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-message-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-message-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-more-info`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-more-info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-more-info`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-more-info")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-output-tray`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-output-tray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-output-tray`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-output-tray")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-pages-completed`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-pages-completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-pages-completed`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-pages-completed")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-pages-completed-col`(value: Pages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-pages-completed-col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-pages-completed-col`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-pages-completed-col")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-service-type`(value: PrinterServiceType): Self = {
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
    def `withPrinter-settable-attributes-supported`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 87 */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-settable-attributes-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-settable-attributes-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-settable-attributes-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-state`(value: PrinterState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-state`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-state-change-date-time`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-change-date-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-state-change-date-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-change-date-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-state-change-time`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-change-time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-state-change-time`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-change-time")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-state-message`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-state-message`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-message")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-state-reasons`(value: js.Array[PrinterStateReasons]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-state-reasons`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-state-reasons")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-static-resource-k-octets-free`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-static-resource-k-octets-free")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-static-resource-k-octets-free`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-static-resource-k-octets-free")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-supply`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-supply`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-supply-description`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply-description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-supply-description`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply-description")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-supply-info-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply-info-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-supply-info-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-supply-info-uri")(js.undefined)
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
    def `withPrinter-uri-supported`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-uri-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-uuid`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-uuid`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uuid")(js.undefined)
        ret
    }
    @scala.inline
    def `withQueued-job-count`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued-job-count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutQueued-job-count`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queued-job-count")(js.undefined)
        ret
    }
    @scala.inline
    def `withXri-authentication-supported`(value: js.Array[XriAuthentication]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-authentication-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-authentication-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-authentication-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withXri-security-supported`(value: js.Array[XriSecurity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-security-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-security-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-security-supported")(js.undefined)
        ret
    }
    @scala.inline
    def `withXri-uri-scheme-supported`(value: js.Array[UriSchemes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-uri-scheme-supported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutXri-uri-scheme-supported`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xri-uri-scheme-supported")(js.undefined)
        ret
    }
  }
  
}

