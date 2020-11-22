package typingsSlinky.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  /**
    * A list of API interfaces exported by this service. Only the `name` field of the google.protobuf.Api needs to be provided by the configuration author, as the remaining fields will be
    * derived from the IDL during the normalization process. It is an error to specify an API interface here which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[Api]] = js.native
  
  /** Auth configuration. */
  var authentication: js.UndefOr[Authentication] = js.native
  
  /** API backend configuration. */
  var backend: js.UndefOr[Backend] = js.native
  
  /** Billing configuration. */
  var billing: js.UndefOr[Billing] = js.native
  
  /** This field is obsolete. Its value must be set to `3`. */
  var configVersion: js.UndefOr[Double] = js.native
  
  /** Context configuration. */
  var context: js.UndefOr[Context] = js.native
  
  /** Configuration for the service control plane. */
  var control: js.UndefOr[Control] = js.native
  
  /** Custom error configuration. */
  var customError: js.UndefOr[CustomError] = js.native
  
  /** Additional API documentation. */
  var documentation: js.UndefOr[Documentation] = js.native
  
  /** Configuration for network endpoints. If this is empty, then an endpoint with the same name as the service is automatically generated to service all defined APIs. */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.native
  
  /**
    * A list of all enum types included in this API service. Enums referenced directly or indirectly by the `apis` are automatically included. Enums which are not referenced but shall be
    * included should be listed here by name. Example: enums: - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[Enum]] = js.native
  
  /** HTTP configuration. */
  var http: js.UndefOr[Http] = js.native
  
  /**
    * A unique ID for a specific instance of this message, typically assigned by the client for tracking purpose. Must be no longer than 63 characters and only lower case letters, digits,
    * '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
    */
  var id: js.UndefOr[String] = js.native
  
  /** Logging configuration. */
  var logging: js.UndefOr[Logging] = js.native
  
  /** Defines the logs used by this service. */
  var logs: js.UndefOr[js.Array[LogDescriptor]] = js.native
  
  /** Defines the metrics used by this service. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.native
  
  /** Defines the monitored resources used by this service. This is required by the Service.monitoring and Service.logging configurations. */
  var monitoredResources: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.native
  
  /** Monitoring configuration. */
  var monitoring: js.UndefOr[Monitoring] = js.native
  
  /**
    * The service name, which is a DNS-like logical identifier for the service, such as `calendar.googleapis.com`. The service name typically goes through DNS verification to make sure
    * the owner of the service also owns the DNS name.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The Google project that owns this service. */
  var producerProjectId: js.UndefOr[String] = js.native
  
  /** Quota configuration. */
  var quota: js.UndefOr[Quota] = js.native
  
  /** Output only. The source information for this configuration if available. */
  var sourceInfo: js.UndefOr[SourceInfo] = js.native
  
  /** System parameter configuration. */
  var systemParameters: js.UndefOr[SystemParameters] = js.native
  
  /**
    * A list of all proto message types included in this API service. It serves similar purpose as [google.api.Service.types], except that these types are not needed by user-defined APIs.
    * Therefore, they will not show up in the generated discovery doc. This field should only be used to define system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[Type]] = js.native
  
  /** The product title for this service. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A list of all proto message types included in this API service. Types referenced directly or indirectly by the `apis` are automatically included. Messages which are not referenced
    * but shall be included, such as types used by the `google.protobuf.Any` type, should be listed here by name. Example: types: - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[Type]] = js.native
  
  /** Configuration controlling usage of this service. */
  var usage: js.UndefOr[Usage] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApisVarargs(value: Api*): Self = this.set("apis", js.Array(value :_*))
    
    @scala.inline
    def setApis(value: js.Array[Api]): Self = this.set("apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApis: Self = this.set("apis", js.undefined)
    
    @scala.inline
    def setAuthentication(value: Authentication): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    
    @scala.inline
    def setBackend(value: Backend): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setBilling(value: Billing): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setConfigVersion(value: Double): Self = this.set("configVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigVersion: Self = this.set("configVersion", js.undefined)
    
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setControl(value: Control): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    
    @scala.inline
    def setCustomError(value: CustomError): Self = this.set("customError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomError: Self = this.set("customError", js.undefined)
    
    @scala.inline
    def setDocumentation(value: Documentation): Self = this.set("documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setEnumsVarargs(value: Enum*): Self = this.set("enums", js.Array(value :_*))
    
    @scala.inline
    def setEnums(value: js.Array[Enum]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setHttp(value: Http): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setLogsVarargs(value: LogDescriptor*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[LogDescriptor]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricDescriptor*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[MetricDescriptor]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setMonitoredResourcesVarargs(value: MonitoredResourceDescriptor*): Self = this.set("monitoredResources", js.Array(value :_*))
    
    @scala.inline
    def setMonitoredResources(value: js.Array[MonitoredResourceDescriptor]): Self = this.set("monitoredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResources: Self = this.set("monitoredResources", js.undefined)
    
    @scala.inline
    def setMonitoring(value: Monitoring): Self = this.set("monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoring: Self = this.set("monitoring", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProducerProjectId(value: String): Self = this.set("producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducerProjectId: Self = this.set("producerProjectId", js.undefined)
    
    @scala.inline
    def setQuota(value: Quota): Self = this.set("quota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: SourceInfo): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    
    @scala.inline
    def setSystemParameters(value: SystemParameters): Self = this.set("systemParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemParameters: Self = this.set("systemParameters", js.undefined)
    
    @scala.inline
    def setSystemTypesVarargs(value: Type*): Self = this.set("systemTypes", js.Array(value :_*))
    
    @scala.inline
    def setSystemTypes(value: js.Array[Type]): Self = this.set("systemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemTypes: Self = this.set("systemTypes", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Type*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUsage(value: Usage): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
}
