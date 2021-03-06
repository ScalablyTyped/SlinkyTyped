package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information regarding a quota operation.
  */
@js.native
trait SchemaQuotaOperation extends StObject {
  
  /**
    * Identity of the consumer for whom this quota operation is being
    * performed.  This can be in one of the following formats:
    * project:&lt;project_id&gt;,   project_number:&lt;project_number&gt;,
    * api_key:&lt;api_key&gt;.
    */
  var consumerId: js.UndefOr[String] = js.native
  
  /**
    * Labels describing the operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Fully qualified name of the API method for which this quota operation is
    * requested. This name is used for matching quota rules or metric rules and
    * billing status rules defined in service configuration.  This field should
    * not be set if any of the following is true: (1) the quota operation is
    * performed on non-API resources. (2) quota_metrics is set because the
    * caller is doing quota override.  Example of an RPC method name:
    * google.example.library.v1.LibraryService.CreateShelf
    */
  var methodName: js.UndefOr[String] = js.native
  
  /**
    * Identity of the operation. This is expected to be unique within the scope
    * of the service that generated the operation, and guarantees idempotency
    * in case of retries.  UUID version 4 is recommended, though not required.
    * In scenarios where an operation is computed from existing information and
    * an idempotent id is desirable for deduplication purpose, UUID version 5
    * is recommended. See RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Represents information about this operation. Each MetricValueSet
    * corresponds to a metric defined in the service configuration. The data
    * type used in the MetricValueSet must agree with the data type specified
    * in the metric definition.  Within a single operation, it is not allowed
    * to have more than one MetricValue instances that have the same metric
    * names and identical label value combinations. If a request has such
    * duplicated MetricValue instances, the entire request is rejected with an
    * invalid argument error.  This field is mutually exclusive with
    * method_name.
    */
  var quotaMetrics: js.UndefOr[js.Array[SchemaMetricValueSet]] = js.native
  
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}
object SchemaQuotaOperation {
  
  @scala.inline
  def apply(): SchemaQuotaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaOperation]
  }
  
  @scala.inline
  implicit class SchemaQuotaOperationMutableBuilder[Self <: SchemaQuotaOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setQuotaMetrics(value: js.Array[SchemaMetricValueSet]): Self = StObject.set(x, "quotaMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaMetricsUndefined: Self = StObject.set(x, "quotaMetrics", js.undefined)
    
    @scala.inline
    def setQuotaMetricsVarargs(value: SchemaMetricValueSet*): Self = StObject.set(x, "quotaMetrics", js.Array(value :_*))
    
    @scala.inline
    def setQuotaMode(value: String): Self = StObject.set(x, "quotaMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaModeUndefined: Self = StObject.set(x, "quotaMode", js.undefined)
  }
}
