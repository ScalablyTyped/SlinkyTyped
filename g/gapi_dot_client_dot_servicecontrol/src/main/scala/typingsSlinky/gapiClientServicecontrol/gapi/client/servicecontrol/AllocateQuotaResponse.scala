package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateQuotaResponse extends js.Object {
  /** Indicates the decision of the allocate. */
  var allocateErrors: js.UndefOr[js.Array[QuotaError]] = js.native
  /** WARNING: DO NOT use this field until this warning message is removed. */
  var allocateInfo: js.UndefOr[AllocateInfo] = js.native
  /**
    * The same operation_id value used in the AllocateQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota metrics to indicate the result of allocation. Depending on the
    * request, one or more of the following metrics will be included:
    *
    * 1. Per quota group or per quota metric incremental usage will be specified
    * using the following delta metric :
    * "serviceruntime.googleapis.com/api/consumer/quota_used_count"
    *
    * 2. The quota limit reached condition will be specified using the following
    * boolean metric :
    * "serviceruntime.googleapis.com/quota/exceeded"
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object AllocateQuotaResponse {
  @scala.inline
  def apply(): AllocateQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateQuotaResponse]
  }
  @scala.inline
  implicit class AllocateQuotaResponseOps[Self <: AllocateQuotaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocateErrors(value: js.Array[QuotaError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocateErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withAllocateInfo(value: AllocateInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateInfo")(js.undefined)
        ret
    }
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

