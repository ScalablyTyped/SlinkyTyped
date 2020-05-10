package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportResponse extends js.Object {
  /**
    * Partial failures, one for each `Operation` in the request that failed
    * processing. There are three possible combinations of the RPC status:
    *
    * 1. The combination of a successful RPC status and an empty `report_errors`
    * list indicates a complete success where all `Operations` in the
    * request are processed successfully.
    * 2. The combination of a successful RPC status and a non-empty
    * `report_errors` list indicates a partial success where some
    * `Operations` in the request succeeded. Each
    * `Operation` that failed processing has a corresponding item
    * in this list.
    * 3. A failed RPC status indicates a general non-deterministic failure.
    * When this happens, it's impossible to know which of the
    * 'Operations' in the request succeeded or failed.
    */
  var reportErrors: js.UndefOr[js.Array[ReportError]] = js.native
  /**
    * Quota usage for each quota release `Operation` request.
    *
    * Fully or partially failed quota release request may or may not be present
    * in `report_quota_info`. For example, a failed quota release request will
    * have the current quota usage info when precise quota library returns the
    * info. A deadline exceeded quota request will not have quota usage info.
    *
    * If there is no quota release request, report_quota_info will be empty.
    */
  var reportInfos: js.UndefOr[js.Array[ReportInfo]] = js.native
  /** The actual config id used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object ReportResponse {
  @scala.inline
  def apply(): ReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportResponse]
  }
  @scala.inline
  implicit class ReportResponseOps[Self <: ReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportErrors(value: js.Array[ReportError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withReportInfos(value: js.Array[ReportInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportInfos")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(js.undefined)
        ret
    }
  }
  
}

