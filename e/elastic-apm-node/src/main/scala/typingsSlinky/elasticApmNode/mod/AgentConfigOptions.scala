package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfigOptions extends js.Object {
  var abortedErrorThreshold: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var active: js.UndefOr[Boolean] = js.native
  var addPatch: js.UndefOr[KeyValueConfig] = js.native
  var apiRequestSize: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var apiRequestTime: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var asyncHooks: js.UndefOr[Boolean] = js.native
  var captureBody: js.UndefOr[CaptureBody] = js.native
  var captureErrorLogStackTraces: js.UndefOr[CaptureErrorLogStackTraces] = js.native
  var captureExceptions: js.UndefOr[Boolean] = js.native
  var captureHeaders: js.UndefOr[Boolean] = js.native
  var captureSpanStackTraces: js.UndefOr[Boolean] = js.native
  var centralConfig: js.UndefOr[Boolean] = js.native
  var containerId: js.UndefOr[String] = js.native
  var disableInstrumentations: js.UndefOr[String | js.Array[String]] = js.native
  var environment: js.UndefOr[String] = js.native
  var errorMessageMaxLength: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var errorOnAbortedRequests: js.UndefOr[Boolean] = js.native
  var filterHttpHeaders: js.UndefOr[Boolean] = js.native
  var frameworkName: js.UndefOr[String] = js.native
  var frameworkVersion: js.UndefOr[String] = js.native
  var globalLabels: js.UndefOr[KeyValueConfig] = js.native
  var hostname: js.UndefOr[String] = js.native
  var ignoreUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var ignoreUserAgents: js.UndefOr[js.Array[String | js.RegExp]] = js.native
  var instrument: js.UndefOr[Boolean] = js.native
  var instrumentIncomingHTTPRequests: js.UndefOr[Boolean] = js.native
  var kubernetesNamespace: js.UndefOr[String] = js.native
  var kubernetesNodeName: js.UndefOr[String] = js.native
  var kubernetesPodName: js.UndefOr[String] = js.native
  var kubernetesPodUID: js.UndefOr[String] = js.native
  var logLevel: js.UndefOr[LogLevel] = js.native
  var logUncaughtExceptions: js.UndefOr[Boolean] = js.native
  var logger: js.UndefOr[Logger] = js.native
  var metricsInterval: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var payloadLogFile: js.UndefOr[String] = js.native
  var secretToken: js.UndefOr[String] = js.native
  var serverCaCertFile: js.UndefOr[String] = js.native
  var serverTimeout: js.UndefOr[String] = js.native
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var serverUrl: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var serviceVersion: js.UndefOr[String] = js.native
  var sourceLinesErrorAppFrames: js.UndefOr[Double] = js.native
  var sourceLinesErrorLibraryFrames: js.UndefOr[Double] = js.native
  var sourceLinesSpanAppFrames: js.UndefOr[Double] = js.native
  var sourceLinesSpanLibraryFrames: js.UndefOr[Double] = js.native
  var stackTraceLimit: js.UndefOr[Double] = js.native
  var transactionMaxSpans: js.UndefOr[Double] = js.native
  var transactionSampleRate: js.UndefOr[Double] = js.native
  var usePathAsTransactionName: js.UndefOr[Boolean] = js.native
  var verifyServerCert: js.UndefOr[Boolean] = js.native
}

object AgentConfigOptions {
  @scala.inline
  def apply(): AgentConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigOptions]
  }
  @scala.inline
  implicit class AgentConfigOptionsOps[Self <: AgentConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortedErrorThreshold(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedErrorThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortedErrorThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortedErrorThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAddPatch(value: KeyValueConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddPatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPatch")(js.undefined)
        ret
    }
    @scala.inline
    def withApiRequestSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiRequestSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiRequestSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiRequestSize")(js.undefined)
        ret
    }
    @scala.inline
    def withApiRequestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiRequestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiRequestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAsyncHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncHooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncHooks")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureBody(value: CaptureBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureBody")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureErrorLogStackTraces(value: CaptureErrorLogStackTraces): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureErrorLogStackTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureErrorLogStackTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureErrorLogStackTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureSpanStackTraces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureSpanStackTraces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureSpanStackTraces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureSpanStackTraces")(js.undefined)
        ret
    }
    @scala.inline
    def withCentralConfig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centralConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentralConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centralConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableInstrumentations(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInstrumentations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInstrumentations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInstrumentations")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessageMaxLength(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessageMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessageMaxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorOnAbortedRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnAbortedRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorOnAbortedRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorOnAbortedRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterHttpHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHttpHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterHttpHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterHttpHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkName")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalLabels(value: KeyValueConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUrls(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUrls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUrls")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreUserAgents(value: js.Array[String | js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUserAgents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreUserAgents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreUserAgents")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrument(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrument")(js.undefined)
        ret
    }
    @scala.inline
    def withInstrumentIncomingHTTPRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentIncomingHTTPRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstrumentIncomingHTTPRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instrumentIncomingHTTPRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withKubernetesNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubernetesNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withKubernetesNodeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesNodeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubernetesNodeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesNodeName")(js.undefined)
        ret
    }
    @scala.inline
    def withKubernetesPodName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesPodName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubernetesPodName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesPodName")(js.undefined)
        ret
    }
    @scala.inline
    def withKubernetesPodUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesPodUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKubernetesPodUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kubernetesPodUID")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: LogLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withLogUncaughtExceptions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUncaughtExceptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogUncaughtExceptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logUncaughtExceptions")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: Logger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricsInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadLogFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadLogFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadLogFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadLogFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServerCaCertFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCaCertFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerCaCertFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverCaCertFile")(js.undefined)
        ret
    }
    @scala.inline
    def withServerTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLinesErrorAppFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesErrorAppFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLinesErrorAppFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesErrorAppFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLinesErrorLibraryFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesErrorLibraryFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLinesErrorLibraryFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesErrorLibraryFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLinesSpanAppFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesSpanAppFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLinesSpanAppFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesSpanAppFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLinesSpanLibraryFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesSpanLibraryFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLinesSpanLibraryFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLinesSpanLibraryFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTraceLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTraceLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTraceLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionMaxSpans(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionMaxSpans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionMaxSpans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionMaxSpans")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionSampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionSampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePathAsTransactionName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePathAsTransactionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePathAsTransactionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePathAsTransactionName")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyServerCert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyServerCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyServerCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyServerCert")(js.undefined)
        ret
    }
  }
  
}

