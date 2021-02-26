package typingsSlinky.googleapis.loggingV2beta1Mod.loggingV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual entry in a log.
  */
@js.native
trait SchemaLogEntry extends StObject {
  
  /**
    * Optional. Information about the HTTP request associated with this log
    * entry, if applicable.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequest] = js.native
  
  /**
    * Optional. A unique identifier for the log entry. If you provide a value,
    * then Logging considers other log entries in the same project, with the
    * same timestamp, and with the same insert_id to be duplicates which can be
    * removed. If omitted in new log entries, then Logging assigns its own
    * unique identifier. The insert_id is also used to order log entries that
    * have the same timestamp value.
    */
  var insertId: js.UndefOr[String] = js.native
  
  /**
    * The log entry payload, represented as a structure that is expressed as a
    * JSON object.
    */
  var jsonPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Optional. A set of user-defined (key, value) data that provides
    * additional information about the log entry.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Required. The resource name of the log to which this log entry belongs:
    * &quot;projects/[PROJECT_ID]/logs/[LOG_ID]&quot;
    * &quot;organizations/[ORGANIZATION_ID]/logs/[LOG_ID]&quot;
    * &quot;billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]&quot;
    * &quot;folders/[FOLDER_ID]/logs/[LOG_ID]&quot; A project number may
    * optionally be used in place of PROJECT_ID. The project number is
    * translated to its corresponding PROJECT_ID internally and the log_name
    * field will contain PROJECT_ID in queries and exports.[LOG_ID] must be
    * URL-encoded within log_name. Example:
    * &quot;organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity&quot;.
    * [LOG_ID] must be less than 512 characters long and can only include the
    * following characters: upper and lower case alphanumeric characters,
    * forward-slash, underscore, hyphen, and period.For backward compatibility,
    * if log_name begins with a forward-slash, such as /projects/..., then the
    * log entry is ingested as usual but the forward-slash is removed. Listing
    * the log entry will not show the leading slash and filtering for a log
    * name with a leading slash will never return any results.
    */
  var logName: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Output only. Additional metadata about the monitored
    * resource.Only k8s_container, k8s_pod, and k8s_node MonitoredResources
    * have this field populated for GKE versions older than 1.12.6. For GKE
    * versions 1.12.6 and above, the metadata field has been deprecated. The
    * Kubernetes pod labels that used to be in metadata.userLabels will now be
    * present in the labels field with a key prefix of k8s-pod/. The
    * Stackdriver system labels that were present in the metadata.systemLabels
    * field will no longer be available in the LogEntry.
    */
  var metadata: js.UndefOr[SchemaMonitoredResourceMetadata] = js.native
  
  /**
    * Optional. Information about an operation associated with the log entry,
    * if applicable.
    */
  var operation: js.UndefOr[SchemaLogEntryOperation] = js.native
  
  /**
    * The log entry payload, represented as a protocol buffer. Some Google
    * Cloud Platform services use this field for their log entry payloads.
    */
  var protoPayload: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Output only. The time the log entry was received by Logging.
    */
  var receiveTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Required. The primary monitored resource associated with this log
    * entry.Example: a log entry that reports a database error would be
    * associated with the monitored resource designating the particular
    * database that reported the error.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
  
  /**
    * Optional. The severity of the log entry. The default value is
    * LogSeverity.DEFAULT.
    */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Optional. Source code location information associated with the log entry,
    * if any.
    */
  var sourceLocation: js.UndefOr[SchemaLogEntrySourceLocation] = js.native
  
  /**
    * Optional. The span ID within the trace associated with the log entry.For
    * Trace spans, this is the same format that the Trace API v2 uses: a
    * 16-character hexadecimal encoding of an 8-byte array, such as
    * &lt;code&gt;&quot;000000000000004a&quot;&lt;/code&gt;.
    */
  var spanId: js.UndefOr[String] = js.native
  
  /**
    * The log entry payload, represented as a Unicode string (UTF-8).
    */
  var textPayload: js.UndefOr[String] = js.native
  
  /**
    * Optional. The time the event described by the log entry occurred. This
    * time is used to compute the log entry&#39;s age and to enforce the logs
    * retention period. If this field is omitted in a new log entry, then
    * Logging assigns it the current time. Timestamps have nanosecond accuracy,
    * but trailing zeros in the fractional seconds might be omitted when the
    * timestamp is displayed.Incoming log entries should have timestamps that
    * are no more than the logs retention period in the past, and no more than
    * 24 hours in the future. Log entries outside those time boundaries will
    * not be available when calling entries.list, but those log entries can
    * still be exported with LogSinks.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Optional. Resource name of the trace associated with the log entry, if
    * any. If it contains a relative resource name, the name is assumed to be
    * relative to //tracing.googleapis.com. Example:
    * projects/my-projectid/traces/06796866738c859f2f19b7cfb3214824
    */
  var trace: js.UndefOr[String] = js.native
  
  /**
    * Optional. The sampling decision of the trace associated with the log
    * entry.True means that the trace resource name in the trace field was
    * sampled for storage in a trace backend. False means that the trace was
    * not sampled for storage when this log entry was written, or the sampling
    * decision was unknown at the time. A non-sampled trace value is still
    * useful as a request correlation identifier. The default is False.
    */
  var traceSampled: js.UndefOr[Boolean] = js.native
}
object SchemaLogEntry {
  
  @scala.inline
  def apply(): SchemaLogEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogEntry]
  }
  
  @scala.inline
  implicit class SchemaLogEntryMutableBuilder[Self <: SchemaLogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpRequest(value: SchemaHttpRequest): Self = StObject.set(x, "httpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpRequestUndefined: Self = StObject.set(x, "httpRequest", js.undefined)
    
    @scala.inline
    def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
    
    @scala.inline
    def setJsonPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "jsonPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPayloadUndefined: Self = StObject.set(x, "jsonPayload", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaMonitoredResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOperation(value: SchemaLogEntryOperation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    @scala.inline
    def setProtoPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "protoPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtoPayloadUndefined: Self = StObject.set(x, "protoPayload", js.undefined)
    
    @scala.inline
    def setReceiveTimestamp(value: String): Self = StObject.set(x, "receiveTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTimestampUndefined: Self = StObject.set(x, "receiveTimestamp", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaMonitoredResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setSourceLocation(value: SchemaLogEntrySourceLocation): Self = StObject.set(x, "sourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocationUndefined: Self = StObject.set(x, "sourceLocation", js.undefined)
    
    @scala.inline
    def setSpanId(value: String): Self = StObject.set(x, "spanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanIdUndefined: Self = StObject.set(x, "spanId", js.undefined)
    
    @scala.inline
    def setTextPayload(value: String): Self = StObject.set(x, "textPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPayloadUndefined: Self = StObject.set(x, "textPayload", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTrace(value: String): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSampled(value: Boolean): Self = StObject.set(x, "traceSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceSampledUndefined: Self = StObject.set(x, "traceSampled", js.undefined)
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
