package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaOperation extends js.Object {
  /**
    * Identity of the consumer for whom this quota operation is being performed.
    *
    * This can be in one of the following formats:
    * project:<project_id>,
    * project_number:<project_number>,
    * api_key:<api_key>.
    */
  var consumerId: js.UndefOr[String] = js.native
  /** Labels describing the operation. */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Fully qualified name of the API method for which this quota operation is
    * requested. This name is used for matching quota rules or metric rules and
    * billing status rules defined in service configuration. This field is not
    * required if the quota operation is performed on non-API resources.
    *
    * Example of an RPC method name:
    * google.example.library.v1.LibraryService.CreateShelf
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * Identity of the operation. This is expected to be unique within the scope
    * of the service that generated the operation, and guarantees idempotency in
    * case of retries.
    *
    * UUID version 4 is recommended, though not required. In scenarios where an
    * operation is computed from existing information and an idempotent id is
    * desirable for deduplication purpose, UUID version 5 is recommended. See
    * RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Represents information about this operation. Each MetricValueSet
    * corresponds to a metric defined in the service configuration.
    * The data type used in the MetricValueSet must agree with
    * the data type specified in the metric definition.
    *
    * Within a single operation, it is not allowed to have more than one
    * MetricValue instances that have the same metric names and identical
    * label value combinations. If a request has such duplicated MetricValue
    * instances, the entire request is rejected with
    * an invalid argument error.
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /** Quota mode for this operation. */
  var quotaMode: js.UndefOr[String] = js.native
}

object QuotaOperation {
  @scala.inline
  def apply(): QuotaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaOperation]
  }
  @scala.inline
  implicit class QuotaOperationOps[Self <: QuotaOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerId")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodName")(js.undefined)
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
    def withQuotaMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaMode")(js.undefined)
        ret
    }
  }
  
}

