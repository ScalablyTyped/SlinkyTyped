package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseQuotaResponse extends js.Object {
  /**
    * The same operation_id value used in the ReleaseQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota metrics to indicate the result of release. Depending on the
    * request, one or more of the following metrics will be included:
    *
    * 1. For rate quota, per quota group or per quota metric released amount
    * will be specified using the following delta metric:
    * "serviceruntime.googleapis.com/api/consumer/quota_refund_count"
    *
    * 2. For allocation quota, per quota metric total usage will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 3. For allocation quota, value for each quota limit associated with
    * the metrics will be specified using the following gauge metric:
    * "serviceruntime.googleapis.com/quota/limit"
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /** Indicates the decision of the release. */
  var releaseErrors: js.UndefOr[js.Array[QuotaError]] = js.native
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object ReleaseQuotaResponse {
  @scala.inline
  def apply(): ReleaseQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseQuotaResponse]
  }
  @scala.inline
  implicit class ReleaseQuotaResponseOps[Self <: ReleaseQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaMetrics(value: js.Array[MetricValueSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMetrics")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseErrors(value: js.Array[QuotaError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseErrors")(js.undefined)
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

