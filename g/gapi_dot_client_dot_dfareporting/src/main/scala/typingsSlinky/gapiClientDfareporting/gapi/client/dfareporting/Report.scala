package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClientDfareporting.AnonActive
import typingsSlinky.gapiClientDfareporting.AnonActivities
import typingsSlinky.gapiClientDfareporting.AnonActivityFilters
import typingsSlinky.gapiClientDfareporting.AnonBreakdown
import typingsSlinky.gapiClientDfareporting.AnonCustomRichMediaEvents
import typingsSlinky.gapiClientDfareporting.AnonDateRange
import typingsSlinky.gapiClientDfareporting.AnonEmailOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  /** The account ID to which this report belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "STANDARD". */
  var criteria: js.UndefOr[AnonActivities] = js.native
  /** The report criteria for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachCriteria: js.UndefOr[AnonBreakdown] = js.native
  /** The report's email delivery settings. */
  var delivery: js.UndefOr[AnonEmailOwner] = js.native
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The filename used when generating report files for this report. */
  var fileName: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "FLOODLIGHT". */
  var floodlightCriteria: js.UndefOr[AnonCustomRichMediaEvents] = js.native
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if
    * for instance the report's size exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[String] = js.native
  /** The unique ID identifying this report resource. */
  var id: js.UndefOr[String] = js.native
  /** The kind of resource this is, in this case dfareporting#report. */
  var kind: js.UndefOr[String] = js.native
  /** The timestamp (in milliseconds since epoch) of when this report was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** The name of the report. */
  var name: js.UndefOr[String] = js.native
  /** The user profile id of the owner of this report. */
  var ownerProfileId: js.UndefOr[String] = js.native
  /** The report criteria for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionCriteria: js.UndefOr[AnonActivityFilters] = js.native
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[AnonDateRange] = js.native
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[AnonActive] = js.native
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[String] = js.native
  /** The type of the report. */
  var `type`: js.UndefOr[String] = js.native
}

object Report {
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
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
    def withCriteria(value: AnonActivities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossDimensionReachCriteria(value: AnonBreakdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDimensionReachCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDimensionReachCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withDelivery(value: AnonEmailOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delivery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelivery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delivery")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightCriteria(value: AnonCustomRichMediaEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightCriteria")(js.undefined)
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
    def withLastModifiedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withPathToConversionCriteria(value: AnonActivityFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathToConversionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToConversionCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withReachCriteria(value: AnonDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReachCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reachCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: AnonActive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchedule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schedule")(js.undefined)
        ret
    }
    @scala.inline
    def withSubAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

