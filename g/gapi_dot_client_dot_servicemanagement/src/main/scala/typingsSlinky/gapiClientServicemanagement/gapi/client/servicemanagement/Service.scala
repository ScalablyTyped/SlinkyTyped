package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[Api]] = js.native
  /** Auth configuration. */
  var authentication: js.UndefOr[Authentication] = js.native
  /** API backend configuration. */
  var backend: js.UndefOr[Backend] = js.native
  /** Billing configuration. */
  var billing: js.UndefOr[Billing] = js.native
  /**
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions.
    * The latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.native
  /** Context configuration. */
  var context: js.UndefOr[Context] = js.native
  /** Configuration for the service control plane. */
  var control: js.UndefOr[Control] = js.native
  /** Custom error configuration. */
  var customError: js.UndefOr[CustomError] = js.native
  /** Additional API documentation. */
  var documentation: js.UndefOr[Documentation] = js.native
  /**
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service all
    * defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.native
  /**
    * A list of all enum types included in this API service.  Enums
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Enums which are not referenced but shall be included
    * should be listed here by name. Example:
    *
    * enums:
    * - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[Enum]] = js.native
  /** Experimental configuration. */
  var experimental: js.UndefOr[Experimental] = js.native
  /** HTTP configuration. */
  var http: js.UndefOr[Http] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.native
  /** Logging configuration. */
  var logging: js.UndefOr[Logging] = js.native
  /** Defines the logs used by this service. */
  var logs: js.UndefOr[js.Array[LogDescriptor]] = js.native
  /** Defines the metrics used by this service. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.native
  /**
    * Defines the monitored resources used by this service. This is required
    * by the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.native
  /** Monitoring configuration. */
  var monitoring: js.UndefOr[Monitoring] = js.native
  /**
    * The DNS address at which this service is available,
    * e.g. `calendar.googleapis.com`.
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
    * A list of all proto message types included in this API service.
    * It serves similar purpose as [google.api.Service.types], except that
    * these types are not needed by user-defined APIs. Therefore, they will not
    * show up in the generated discovery doc. This field should only be used
    * to define system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[Type]] = js.native
  /** The product title for this service. */
  var title: js.UndefOr[String] = js.native
  /**
    * A list of all proto message types included in this API service.
    * Types referenced directly or indirectly by the `apis` are
    * automatically included.  Messages which are not referenced but
    * shall be included, such as types used by the `google.protobuf.Any` type,
    * should be listed here by name. Example:
    *
    * types:
    * - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[Type]] = js.native
  /** Configuration controlling usage of this service. */
  var usage: js.UndefOr[Usage] = js.native
  /** API visibility configuration. */
  var visibility: js.UndefOr[Visibility] = js.native
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
    def withApis(value: js.Array[Api]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apis")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthentication(value: Authentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authentication")(js.undefined)
        ret
    }
    @scala.inline
    def withBackend(value: Backend): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling(value: Billing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withControl(value: Control): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomError(value: CustomError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customError")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: Documentation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: js.Array[Endpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEnums(value: js.Array[Enum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnums: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enums")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental(value: Experimental): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: Http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: Logging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: js.Array[LogDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[MetricDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResources(value: js.Array[MonitoredResourceDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResources")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoring(value: Monitoring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoring: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoring")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerProjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerProjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuota(value: Quota): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceInfo(value: SourceInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemParameters(value: SystemParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: Usage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: Visibility): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

