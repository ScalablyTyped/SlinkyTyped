package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The batch request containing multiple report request.
  */
@js.native
trait SchemaGetReportsRequest extends js.Object {
  /**
    * Requests, each request will have a separate response. There can be a
    * maximum of 5 requests. All requests should have the same `dateRanges`,
    * `viewId`, `segments`, `samplingLevel`, and `cohortGroup`.
    */
  var reportRequests: js.UndefOr[js.Array[SchemaReportRequest]] = js.native
  /**
    * Enables [resource based
    * quotas](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4),
    * (defaults to `False`). If this field is set to `True` the per view
    * (profile) quotas are governed by the computational cost of the request.
    * Note that using cost based quotas will higher enable sampling rates. (10
    * Million for `SMALL`, 100M for `LARGE`. See the [limits and quotas
    * documentation](/analytics/devguides/reporting/core/v4/limits-quotas#analytics_reporting_api_v4)
    * for details.
    */
  var useResourceQuotas: js.UndefOr[Boolean] = js.native
}

object SchemaGetReportsRequest {
  @scala.inline
  def apply(): SchemaGetReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetReportsRequest]
  }
  @scala.inline
  implicit class SchemaGetReportsRequestOps[Self <: SchemaGetReportsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReportRequests(value: js.Array[SchemaReportRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withUseResourceQuotas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResourceQuotas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseResourceQuotas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useResourceQuotas")(js.undefined)
        ret
    }
  }
  
}

