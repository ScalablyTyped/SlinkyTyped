package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndReconciliationResponse extends js.Object {
  /**
    * The same operation_id value used in the EndReconciliationRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Metric values as tracked by One Platform before the adjustment was made.
    * The following metrics will be included:
    *
    * 1. Per quota metric total usage will be specified using the following gauge
    * metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 2. Value for each quota limit associated with the metrics will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/quota/limit"
    *
    * 3. Delta value of the usage after the reconciliation for limits associated
    * with the metrics will be specified using the following metric:
    * "serviceruntime.googleapis.com/allocation/reconciliation_delta"
    * The delta value is defined as:
    * new_usage_from_client - existing_value_in_spanner.
    * This metric is not defined in serviceruntime.yaml or in Cloud Monarch.
    * This metric is meant for callers' use only. Since this metric is not
    * defined in the monitoring backend, reporting on this metric will result in
    * an error.
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /** Indicates the decision of the reconciliation end. */
  var reconciliationErrors: js.UndefOr[js.Array[QuotaError]] = js.native
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object EndReconciliationResponse {
  @scala.inline
  def apply(): EndReconciliationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndReconciliationResponse]
  }
  @scala.inline
  implicit class EndReconciliationResponseOps[Self <: EndReconciliationResponse] (val x: Self) extends AnyVal {
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
    def withReconciliationErrors(value: js.Array[QuotaError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconciliationErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconciliationErrors")(js.undefined)
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

