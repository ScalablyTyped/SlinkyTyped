package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Service` is the root object of Google service configuration schema. It
  * describes basic information about a service, such as the name and the
  * title, and delegates other aspects to sub-sections. Each sub-section is
  * either a proto message or a repeated proto message that configures a
  * specific aspect, such as auth. See each proto message definition for
  * details.  Example:      type: google.api.Service     config_version: 3
  * name: calendar.googleapis.com     title: Google Calendar API     apis: -
  * name: google.calendar.v3.Calendar     authentication:       providers: -
  * id: google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
@js.native
trait SchemaService extends js.Object {
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[SchemaApi]] = js.native
  /**
    * Auth configuration.
    */
  var authentication: js.UndefOr[SchemaAuthentication] = js.native
  /**
    * API backend configuration.
    */
  var backend: js.UndefOr[SchemaBackend] = js.native
  /**
    * Billing configuration.
    */
  var billing: js.UndefOr[SchemaBilling] = js.native
  /**
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions. The
    * latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.native
  /**
    * Context configuration.
    */
  var context: js.UndefOr[SchemaContext] = js.native
  /**
    * Configuration for the service control plane.
    */
  var control: js.UndefOr[SchemaControl] = js.native
  /**
    * Custom error configuration.
    */
  var customError: js.UndefOr[SchemaCustomError] = js.native
  /**
    * Additional API documentation.
    */
  var documentation: js.UndefOr[SchemaDocumentation] = js.native
  /**
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service
    * all defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[SchemaEndpoint]] = js.native
  /**
    * A list of all enum types included in this API service.  Enums referenced
    * directly or indirectly by the `apis` are automatically included.  Enums
    * which are not referenced but shall be included should be listed here by
    * name. Example:      enums:     - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[SchemaEnum]] = js.native
  /**
    * Experimental configuration.
    */
  var experimental: js.UndefOr[SchemaExperimental] = js.native
  /**
    * HTTP configuration.
    */
  var http: js.UndefOr[SchemaHttp] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead. Must be no longer than 60 characters.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Logging configuration.
    */
  var logging: js.UndefOr[SchemaLogging] = js.native
  /**
    * Defines the logs used by this service.
    */
  var logs: js.UndefOr[js.Array[SchemaLogDescriptor]] = js.native
  /**
    * Defines the metrics used by this service.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricDescriptor]] = js.native
  /**
    * Defines the monitored resources used by this service. This is required by
    * the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[SchemaMonitoredResourceDescriptor]] = js.native
  /**
    * Monitoring configuration.
    */
  var monitoring: js.UndefOr[SchemaMonitoring] = js.native
  /**
    * The service name, which is a DNS-like logical identifier for the service,
    * such as `calendar.googleapis.com`. The service name typically goes
    * through DNS verification to make sure the owner of the service also owns
    * the DNS name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google project that owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.native
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[SchemaQuota] = js.native
  /**
    * Output only. The source information for this configuration if available.
    */
  var sourceInfo: js.UndefOr[SchemaSourceInfo] = js.native
  /**
    * System parameter configuration.
    */
  var systemParameters: js.UndefOr[SchemaSystemParameters] = js.native
  /**
    * A list of all proto message types included in this API service. It serves
    * similar purpose as [google.api.Service.types], except that these types
    * are not needed by user-defined APIs. Therefore, they will not show up in
    * the generated discovery doc. This field should only be used to define
    * system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[SchemaType]] = js.native
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A list of all proto message types included in this API service. Types
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Messages which are not referenced but shall be included, such
    * as types used by the `google.protobuf.Any` type, should be listed here by
    * name. Example:      types:     - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[SchemaType]] = js.native
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[SchemaUsage] = js.native
}

object SchemaService {
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApis(value: js.Array[SchemaApi]): Self = {
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
    def withAuthentication(value: SchemaAuthentication): Self = {
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
    def withBackend(value: SchemaBackend): Self = {
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
    def withBilling(value: SchemaBilling): Self = {
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
    def withContext(value: SchemaContext): Self = {
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
    def withControl(value: SchemaControl): Self = {
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
    def withCustomError(value: SchemaCustomError): Self = {
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
    def withDocumentation(value: SchemaDocumentation): Self = {
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
    def withEndpoints(value: js.Array[SchemaEndpoint]): Self = {
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
    def withEnums(value: js.Array[SchemaEnum]): Self = {
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
    def withExperimental(value: SchemaExperimental): Self = {
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
    def withHttp(value: SchemaHttp): Self = {
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
    def withLogging(value: SchemaLogging): Self = {
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
    def withLogs(value: js.Array[SchemaLogDescriptor]): Self = {
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
    def withMetrics(value: js.Array[SchemaMetricDescriptor]): Self = {
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
    def withMonitoredResources(value: js.Array[SchemaMonitoredResourceDescriptor]): Self = {
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
    def withMonitoring(value: SchemaMonitoring): Self = {
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
    def withQuota(value: SchemaQuota): Self = {
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
    def withSourceInfo(value: SchemaSourceInfo): Self = {
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
    def withSystemParameters(value: SchemaSystemParameters): Self = {
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
    def withSystemTypes(value: js.Array[SchemaType]): Self = {
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
    def withTypes(value: js.Array[SchemaType]): Self = {
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
    def withUsage(value: SchemaUsage): Self = {
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
  }
  
}

