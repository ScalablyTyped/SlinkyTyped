package typingsSlinky.googleapis.v32Mod.dfareportingV32

import typingsSlinky.googleapis.AnonActive
import typingsSlinky.googleapis.AnonConversionDimensions
import typingsSlinky.googleapis.AnonDimension
import typingsSlinky.googleapis.AnonDimensionFilters
import typingsSlinky.googleapis.AnonEmailOwnerDeliveryType
import typingsSlinky.googleapis.AnonEnableAllDimensionCombinations
import typingsSlinky.googleapis.AnonFloodlightConfigId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Report resource.
  */
@js.native
trait SchemaReport extends js.Object {
  /**
    * The account ID to which this report belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;STANDARD&quot;.
    */
  var criteria: js.UndefOr[AnonDimensionFilters] = js.native
  /**
    * The report criteria for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachCriteria: js.UndefOr[AnonDimension] = js.native
  /**
    * The report&#39;s email delivery settings.
    */
  var delivery: js.UndefOr[AnonEmailOwnerDeliveryType] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The filename used when generating report files for this report.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;FLOODLIGHT&quot;.
    */
  var floodlightCriteria: js.UndefOr[AnonFloodlightConfigId] = js.native
  /**
    * The output format of the report. If not specified, default format is
    * &quot;CSV&quot;. Note that the actual format in the completed report file
    * might differ if for instance the report&#39;s size exceeds the
    * format&#39;s capabilities. &quot;CSV&quot; will then be the fallback
    * format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The unique ID identifying this report resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#report.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp (in milliseconds since epoch) of when this report was last
    * modified.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * The name of the report.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user profile id of the owner of this report.
    */
  var ownerProfileId: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionCriteria: js.UndefOr[AnonConversionDimensions] = js.native
  /**
    * The report criteria for a report of type &quot;REACH&quot;.
    */
  var reachCriteria: js.UndefOr[AnonEnableAllDimensionCombinations] = js.native
  /**
    * The report&#39;s schedule. Can only be set if the report&#39;s
    * &#39;dateRange&#39; is a relative date range and the relative date range
    * is not &quot;TODAY&quot;.
    */
  var schedule: js.UndefOr[AnonActive] = js.native
  /**
    * The subaccount ID to which this report belongs if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  /**
    * The type of the report.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaReport {
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  @scala.inline
  implicit class SchemaReportOps[Self <: SchemaReport] (val x: Self) extends AnyVal {
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
    def withCriteria(value: AnonDimensionFilters): Self = {
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
    def withCrossDimensionReachCriteria(value: AnonDimension): Self = {
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
    def withDelivery(value: AnonEmailOwnerDeliveryType): Self = {
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
    def withFloodlightCriteria(value: AnonFloodlightConfigId): Self = {
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
    def withPathToConversionCriteria(value: AnonConversionDimensions): Self = {
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
    def withReachCriteria(value: AnonEnableAllDimensionCombinations): Self = {
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

