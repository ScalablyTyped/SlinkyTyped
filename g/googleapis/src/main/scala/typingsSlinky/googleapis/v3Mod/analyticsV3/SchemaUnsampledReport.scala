package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonBucketId
import typingsSlinky.googleapis.AnonDocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics unsampled report resource.
  */
@js.native
trait SchemaUnsampledReport extends js.Object {
  /**
    * Account ID to which this unsampled report belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Download details for a file stored in Google Cloud Storage.
    */
  var cloudStorageDownloadDetails: js.UndefOr[AnonBucketId] = js.native
  /**
    * Time this unsampled report was created.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The dimensions for the unsampled report.
    */
  var dimensions: js.UndefOr[String] = js.native
  /**
    * The type of download you need to use for the report data file. Possible
    * values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is
    * `GOOGLE_DRIVE`, see the `driveDownloadDetails` field. If the value is
    * `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[String] = js.native
  /**
    * Download details for a file stored in Google Drive.
    */
  var driveDownloadDetails: js.UndefOr[AnonDocumentId] = js.native
  /**
    * The end date for the unsampled report.
    */
  var `end-date`: js.UndefOr[String] = js.native
  /**
    * The filters for the unsampled report.
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Unsampled report ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for an Analytics unsampled report.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The metrics for the unsampled report.
    */
  var metrics: js.UndefOr[String] = js.native
  /**
    * View (Profile) ID to which this unsampled report belongs.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The segment for the unsampled report.
    */
  var segment: js.UndefOr[String] = js.native
  /**
    * Link for this unsampled report.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The start date for the unsampled report.
    */
  var `start-date`: js.UndefOr[String] = js.native
  /**
    * Status of this unsampled report. Possible values are PENDING, COMPLETED,
    * or FAILED.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Title of the unsampled report.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Time this unsampled report was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Web property ID to which this unsampled report belongs. The web property
    * ID is of the form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaUnsampledReport {
  @scala.inline
  def apply(): SchemaUnsampledReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnsampledReport]
  }
  @scala.inline
  implicit class SchemaUnsampledReportOps[Self <: SchemaUnsampledReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCloudStorageDownloadDetails(value: AnonBucketId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageDownloadDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudStorageDownloadDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageDownloadDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: String): Self = {
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
    def withDownloadType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadType")(js.undefined)
        ret
    }
    @scala.inline
    def withDriveDownloadDetails(value: AnonDocumentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveDownloadDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveDownloadDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveDownloadDetails")(js.undefined)
        ret
    }
    @scala.inline
    def `withEnd-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnd-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileId")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def `withStart-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStart-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

