package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a query.
  */
@js.native
trait SchemaQuery extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#query&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Query metadata.
    */
  var metadata: js.UndefOr[SchemaQueryMetadata] = js.native
  /**
    * Query parameters.
    */
  var params: js.UndefOr[SchemaParameters] = js.native
  /**
    * Query ID.
    */
  var queryId: js.UndefOr[String] = js.native
  /**
    * The ending time for the data that is shown in the report. Note,
    * reportDataEndTimeMs is required if metadata.dataRange is CUSTOM_DATES and
    * ignored otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /**
    * The starting time for the data that is shown in the report. Note,
    * reportDataStartTimeMs is required if metadata.dataRange is CUSTOM_DATES
    * and ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Information on how often and when to run a query.
    */
  var schedule: js.UndefOr[SchemaQuerySchedule] = js.native
  /**
    * Canonical timezone code for report data time. Defaults to
    * America/New_York.
    */
  var timezoneCode: js.UndefOr[String] = js.native
}

object SchemaQuery {
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMetadata(value: SchemaQueryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: SchemaParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDataEndTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataEndTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDataEndTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataEndTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withReportDataStartTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataStartTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportDataStartTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportDataStartTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withSchedule(value: SchemaQuerySchedule): Self = {
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
    def withTimezoneCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneCode")(js.undefined)
        ret
    }
  }
  
}

