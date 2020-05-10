package typingsSlinky.gapiClientServicecontrol.gapi.client.servicecontrol

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends js.Object {
  /**
    * Identity of the consumer who is using the service.
    * This field should be filled in for the operations initiated by a
    * consumer, but not for service-initiated operations that are
    * not related to a specific consumer.
    *
    * This can be in one of the following formats:
    * project:<project_id>,
    * project_number:<project_number>,
    * api_key:<api_key>.
    */
  var consumerId: js.UndefOr[String] = js.native
  /**
    * End time of the operation.
    * Required when the operation is used in ServiceController.Report,
    * but optional when the operation is used in ServiceController.Check.
    */
  var endTime: js.UndefOr[String] = js.native
  /** DO NOT USE. This is an experimental field. */
  var importance: js.UndefOr[String] = js.native
  /**
    * Labels describing the operation. Only the following labels are allowed:
    *
    * - Labels describing monitored resources as defined in
    * the service configuration.
    * - Default labels of metric values. When specified, labels defined in the
    * metric value override these default.
    * - The following labels defined by Google Cloud Platform:
    * - `cloud.googleapis.com/location` describing the location where the
    * operation happened,
    * - `servicecontrol.googleapis.com/user_agent` describing the user agent
    * of the API request,
    * - `servicecontrol.googleapis.com/service_agent` describing the service
    * used to handle the API request (e.g. ESP),
    * - `servicecontrol.googleapis.com/platform` describing the platform
    * where the API is served (e.g. GAE, GCE, GKE).
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /** Represents information to be logged. */
  var logEntries: js.UndefOr[js.Array[LogEntry]] = js.native
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
  var metricValueSets: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /**
    * Identity of the operation. This must be unique within the scope of the
    * service that generated the operation. If the service calls
    * Check() and Report() on the same operation, the two calls should carry
    * the same id.
    *
    * UUID version 4 is recommended, though not required.
    * In scenarios where an operation is computed from existing information
    * and an idempotent id is desirable for deduplication purpose, UUID version 5
    * is recommended. See RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.native
  /** Fully qualified name of the operation. Reserved for future use. */
  var operationName: js.UndefOr[String] = js.native
  /**
    * Represents the properties needed for quota check. Applicable only if this
    * operation is for a quota check request. If this is not specified, no quota
    * check will be performed.
    */
  var quotaProperties: js.UndefOr[QuotaProperties] = js.native
  /**
    * DO NOT USE. This field is deprecated, use "resources" field instead.
    * The resource name of the parent of a resource in the resource hierarchy.
    *
    * This can be in one of the following formats:
    * - “projects/<project-id or project-number>”
    * - “folders/<folder-id>”
    * - “organizations/<organization-id>”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  /** The resources that are involved in the operation. */
  var resources: js.UndefOr[js.Array[ResourceInfo]] = js.native
  /** Required. Start time of the operation. */
  var startTime: js.UndefOr[String] = js.native
  /**
    * User defined labels for the resource that this operation is associated
    * with. Only a combination of 1000 user labels per consumer project are
    * allowed.
    */
  var userLabels: js.UndefOr[Record[String, String]] = js.native
}

object Operation {
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withImportance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(js.undefined)
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
    def withLogEntries(value: js.Array[LogEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricValueSets(value: js.Array[MetricValueSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValueSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricValueSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricValueSets")(js.undefined)
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
    def withOperationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationName")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaProperties(value: QuotaProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[ResourceInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLabels(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLabels")(js.undefined)
        ret
    }
  }
  
}

