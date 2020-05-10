package typingsSlinky.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMetadata extends js.Object {
  /** Range of report data. */
  var dataRange: js.UndefOr[String] = js.native
  /** Format of the generated report. */
  var format: js.UndefOr[String] = js.native
  /** The path to the location in Google Cloud Storage where the latest report is stored. */
  var googleCloudStoragePathForLatestReport: js.UndefOr[String] = js.native
  /** The path in Google Drive for the latest report. */
  var googleDrivePathForLatestReport: js.UndefOr[String] = js.native
  /** The time when the latest report started to run. */
  var latestReportRunTimeMs: js.UndefOr[String] = js.native
  /**
    * Locale of the generated reports. Valid values are cs CZECH de GERMAN en ENGLISH es SPANISH fr FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH pt-BR
    * BRAZILIAN_PORTUGUESE ru RUSSIAN tr TURKISH uk UKRAINIAN zh-CN CHINA_CHINESE zh-TW TAIWAN_CHINESE
    *
    * An locale string not in the list above will generate reports in English.
    */
  var locale: js.UndefOr[String] = js.native
  /** Number of reports that have been generated for the query. */
  var reportCount: js.UndefOr[Double] = js.native
  /** Whether the latest report is currently running. */
  var running: js.UndefOr[Boolean] = js.native
  /** Whether to send an email notification when a report is ready. Default to false. */
  var sendNotification: js.UndefOr[Boolean] = js.native
  /** List of email addresses which are sent email notifications when the report is finished. Separate from sendNotification. */
  var shareEmailAddress: js.UndefOr[js.Array[String]] = js.native
  /** Query title. It is used to name the reports generated from this query. */
  var title: js.UndefOr[String] = js.native
}

object QueryMetadata {
  @scala.inline
  def apply(): QueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryMetadata]
  }
  @scala.inline
  implicit class QueryMetadataOps[Self <: QueryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRange")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleCloudStoragePathForLatestReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStoragePathForLatestReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleCloudStoragePathForLatestReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleCloudStoragePathForLatestReport")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleDrivePathForLatestReport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDrivePathForLatestReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleDrivePathForLatestReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleDrivePathForLatestReport")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestReportRunTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestReportRunTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestReportRunTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latestReportRunTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withReportCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(js.undefined)
        ret
    }
    @scala.inline
    def withSendNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withShareEmailAddress(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareEmailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareEmailAddress")(js.undefined)
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

