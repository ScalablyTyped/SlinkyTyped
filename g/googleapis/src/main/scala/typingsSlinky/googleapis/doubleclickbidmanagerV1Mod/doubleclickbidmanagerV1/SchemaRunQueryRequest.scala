package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to run a stored query to generate a report.
  */
@js.native
trait SchemaRunQueryRequest extends js.Object {
  /**
    * Report data range used to generate the report.
    */
  var dataRange: js.UndefOr[String] = js.native
  /**
    * The ending time for the data that is shown in the report. Note,
    * reportDataEndTimeMs is required if dataRange is CUSTOM_DATES and ignored
    * otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /**
    * The starting time for the data that is shown in the report. Note,
    * reportDataStartTimeMs is required if dataRange is CUSTOM_DATES and
    * ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Canonical timezone code for report data time. Defaults to
    * America/New_York.
    */
  var timezoneCode: js.UndefOr[String] = js.native
}

object SchemaRunQueryRequest {
  @scala.inline
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  @scala.inline
  implicit class SchemaRunQueryRequestOps[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
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

