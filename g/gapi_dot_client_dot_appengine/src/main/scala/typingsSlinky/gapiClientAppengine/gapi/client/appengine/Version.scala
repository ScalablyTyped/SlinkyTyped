package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  /**
    * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL
    * is set.
    */
  var apiConfig: js.UndefOr[ApiConfigHandler] = js.native
  /** Automatic scaling is based on request rate, response latencies, and other application metrics. */
  var automaticScaling: js.UndefOr[AutomaticScaling] = js.native
  /**
    * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes
    * idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
    */
  var basicScaling: js.UndefOr[BasicScaling] = js.native
  /** Metadata settings that are supplied to this version to enable beta runtime features. */
  var betaSettings: js.UndefOr[Record[String, String]] = js.native
  /** Time that this version was created.@OutputOnly */
  var createTime: js.UndefOr[String] = js.native
  /** Email address of the user who created this version.@OutputOnly */
  var createdBy: js.UndefOr[String] = js.native
  /**
    * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#staticfileshandler) does not specify its own expiration
    * time.Only returned in GET requests if view=FULL is set.
    */
  var defaultExpiration: js.UndefOr[String] = js.native
  /** Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set. */
  var deployment: js.UndefOr[Deployment] = js.native
  /** Total size in bytes of all the files that are included in this version and curerntly hosted on the App Engine disk.@OutputOnly */
  var diskUsageBytes: js.UndefOr[String] = js.native
  /**
    * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API
    * implemented by the app.
    */
  var endpointsApiService: js.UndefOr[EndpointsApiService] = js.native
  /** App Engine execution environment for this version.Defaults to standard. */
  var env: js.UndefOr[String] = js.native
  /** Environment variables available to the application.Only returned in GET requests if view=FULL is set. */
  var envVariables: js.UndefOr[Record[String, String]] = js.native
  /** Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set. */
  var errorHandlers: js.UndefOr[js.Array[ErrorHandler]] = js.native
  /**
    * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request
    * handlers are not attempted.Only returned in GET requests if view=FULL is set.
    */
  var handlers: js.UndefOr[js.Array[UrlMap]] = js.native
  /**
    * Configures health checking for VM instances. Unhealthy instances are stopped and replaced with new instances. Only applicable for VM runtimes.Only
    * returned in GET requests if view=FULL is set.
    */
  var healthCheck: js.UndefOr[HealthCheck] = js.native
  /**
    * Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names:
    * "default", "latest", and any name with the prefix "ah-".
    */
  var id: js.UndefOr[String] = js.native
  /** Before an application can receive email or XMPP messages, the application must be configured to enable the service. */
  var inboundServices: js.UndefOr[js.Array[String]] = js.native
  /**
    * Instance class that is used to run this version. Valid values are:
    * AutomaticScaling: F1, F2, F4, F4_1G
    * ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
    */
  var instanceClass: js.UndefOr[String] = js.native
  /** Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set. */
  var libraries: js.UndefOr[js.Array[Library]] = js.native
  /**
    * Configures liveness health checking for VM instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if
    * view=FULL is set.
    */
  var livenessCheck: js.UndefOr[LivenessCheck] = js.native
  /** A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. */
  var manualScaling: js.UndefOr[ManualScaling] = js.native
  /** Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly */
  var name: js.UndefOr[String] = js.native
  /** Extra network settings. Only applicable for App Engine flexible environment versions. */
  var network: js.UndefOr[Network] = js.native
  /** Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set. */
  var nobuildFilesRegex: js.UndefOr[String] = js.native
  /**
    * Configures readiness health checking for VM instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests
    * if view=FULL is set.
    */
  var readinessCheck: js.UndefOr[ReadinessCheck] = js.native
  /** Machine resources for this version. Only applicable for VM runtimes. */
  var resources: js.UndefOr[Resources] = js.native
  /** Desired runtime. Example: python27. */
  var runtime: js.UndefOr[String] = js.native
  /**
    * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at
    * https://cloud.google.com/appengine/docs/standard/<language>/config/appref
    */
  var runtimeApiVersion: js.UndefOr[String] = js.native
  /**
    * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an
    * invalid value. Defaults to SERVING.
    */
  var servingStatus: js.UndefOr[String] = js.native
  /** Whether multiple requests can be dispatched to this version at once. */
  var threadsafe: js.UndefOr[Boolean] = js.native
  /** Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly */
  var versionUrl: js.UndefOr[String] = js.native
  /** Whether to deploy this version in a container on a virtual machine. */
  var vm: js.UndefOr[Boolean] = js.native
}

object Version {
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiConfig(value: ApiConfigHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticScaling(value: AutomaticScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withBasicScaling(value: BasicScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasicScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basicScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withBetaSettings(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBetaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("betaSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultExpiration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeployment(value: Deployment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskUsageBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUsageBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskUsageBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskUsageBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointsApiService(value: EndpointsApiService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointsApiService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointsApiService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpointsApiService")(js.undefined)
        ret
    }
    @scala.inline
    def withEnv(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvVariables(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandlers(value: js.Array[ErrorHandler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlers(value: js.Array[UrlMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheck(value: HealthCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
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
    def withInboundServices(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInboundServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inboundServices")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLibraries(value: js.Array[Library]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLibraries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraries")(js.undefined)
        ret
    }
    @scala.inline
    def withLivenessCheck(value: LivenessCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livenessCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLivenessCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("livenessCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withManualScaling(value: ManualScaling): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualScaling")(js.undefined)
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
    def withNetwork(value: Network): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withNobuildFilesRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobuildFilesRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobuildFilesRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobuildFilesRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withReadinessCheck(value: ReadinessCheck): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadinessCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readinessCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Resources): Self = {
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
    def withRuntime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeApiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeApiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withServingStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServingStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("servingStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadsafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadsafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadsafe")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withVm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vm")(js.undefined)
        ret
    }
  }
  
}

